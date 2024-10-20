package X;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: J4q.class */
public final class J4q implements Comparator, 5MT {
    public AtomicLong A00 = new AtomicLong(0);
    public final float A01;
    public final long A02;
    public final java.util.Map A03;
    public final int A04;
    public final java.util.Map A05;
    public final NavigableSet A06;

    public J4q(double d, int i, long j) {
        j = j <= 0 ? 104857600L : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        this.A03 = AnonymousClass001.A0u();
        this.A05 = AnonymousClass001.A0u();
        this.A06 = new TreeSet(this);
        this.A02 = j;
        this.A04 = i;
        this.A01 = (float) d;
    }

    private void A00(5Mi r302, String str, long j) {
        try {
            5LG.A01("perVideoLRUEvict");
            String A00 = 5N8.A00(str);
            if (A00 != null) {
                NavigableSet navigableSet = (NavigableSet) this.A05.get(A00);
                if (navigableSet != null) {
                    while (true) {
                        Long l = (Long) this.A03.get(A00);
                        if (l == null) {
                            break;
                        }
                        if (((float) l.longValue()) / ((float) this.A02) < this.A01 || navigableSet.isEmpty()) {
                            break;
                        }
                        if (r302 instanceof 5Mh) {
                            ((5Mh) r302).A04((5N6) navigableSet.first(), "lru_policy");
                        } else {
                            r302.CfB((5N6) navigableSet.first());
                        }
                    }
                }
            }
            while (this.A00.get() + j > this.A02) {
                try {
                    5N6 r0 = (5N6) this.A06.first();
                    if (r0 != null) {
                        r302.CfB(r0);
                    }
                } catch (NoSuchElementException unused) {
                    C51f.A01("PerVideoLruCacheEvictor", "mLeastRecentlyUsed is empty while trying global eviction", AnonymousClass001.A1Z());
                }
            }
        } finally {
            5LG.A00();
        }
    }

    public void BwV(String str, String str2, int i, int i2) {
    }

    public void CMJ(5Mi r302, 5N6 r303) {
        this.A06.add(r303);
        AtomicLong atomicLong = this.A00;
        long j = r303.A03;
        atomicLong.addAndGet(j);
        String str = r303.A06;
        String A00 = 5N8.A00(str);
        java.util.Map map = this.A03;
        Number A0o = 1BK.A0o(A00, map);
        map.put(A00, A0o != null ? Long.valueOf(A0o.longValue() + j) : Long.valueOf(j));
        if (r303.A04 > this.A04) {
            java.util.Map map2 = this.A05;
            Set set = (Set) map2.get(A00);
            if (set != null) {
                set.add(r303);
            } else {
                TreeSet treeSet = new TreeSet(this);
                treeSet.add(r303);
                map2.put(A00, treeSet);
            }
        }
        if (str != null) {
            A00(r302, str, 0L);
        }
    }

    public void CMK(5Mi r302, 5N6 r303) {
        String A00 = 5N8.A00(r303.A06);
        if (A00 != null) {
            java.util.Map map = this.A03;
            Number A0o = 1BK.A0o(A00, map);
            if (A0o != null) {
                long longValue = A0o.longValue() - r303.A03;
                Long valueOf = Long.valueOf(longValue);
                if (longValue <= 0) {
                    map.remove(A00);
                } else {
                    map.put(A00, valueOf);
                }
            }
            AbstractC2327GOs.A0y(A00, r303, this.A05);
        }
        this.A06.remove(r303);
        this.A00.addAndGet(-r303.A03);
    }

    public void CML(5Mi r302, 5N6 r303, 5N6 r304) {
        CMK(r302, r303);
        CMJ(r302, r304);
    }

    public void CMM(5Mi r302, 5N6 r303, 5N6 r304, Integer num) {
        CMK(r302, r303);
        CMJ(r302, r304);
    }

    public void CMp(5Mi r302, String str, long j, long j2) {
        A00(r302, str, j2);
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        5N6 r0 = (5N6) obj;
        5N6 r02 = (5N6) obj2;
        long j = r0.A02;
        long j2 = r02.A02;
        if (j - j2 == 0) {
            i = r0.A02(r02);
        } else {
            i = 1;
            if (j < j2) {
                return -1;
            }
        }
        return i;
    }
}
