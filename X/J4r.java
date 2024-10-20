package X;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

/* loaded from: J4r.class */
public final class J4r implements Comparator, 5MT {
    public long A00;
    public long A01;
    public NavigableSet A02;
    public SortedSet A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final long A07;
    public final java.util.Map A08;
    public final int A09;
    public final java.util.Map A0A;
    public final boolean A0B;

    public J4r(double d, double d2, int i, int i2, long j, boolean z, boolean z2) {
        j = j <= 0 ? 104857600L : j;
        d = d <= 0.0d ? 0.10000000149011612d : d;
        d2 = d2 <= 0.0d ? 0.30000001192092896d : d2;
        this.A08 = AnonymousClass001.A0u();
        this.A0A = AnonymousClass001.A0u();
        this.A07 = j;
        this.A09 = i;
        this.A05 = (float) d;
        this.A06 = i2;
        this.A04 = (float) d2;
        this.A0B = z2;
        this.A01 = 0L;
        this.A00 = 0L;
        this.A02 = new TreeSet(this);
        this.A03 = !z ? new TreeSet(this) : new ConcurrentSkipListSet(this);
    }

    private void A00(5Mi r302, 5N6 r303, String str, boolean z) {
        5Mk r3022;
        if (!this.A0B) {
            if (z && (r302 instanceof 5Mh)) {
                ((5Mh) r302).A04(r303, str);
                return;
            } else {
                r302.CfB(r303);
                return;
            }
        }
        if (r302 instanceof 5Mh) {
            r3022 = ((5Mh) r302).A01;
        } else if (!(r302 instanceof 5Mj) && !(r302 instanceof H1A)) {
            return;
        } else {
            r3022 = (5Mk) r302;
        }
        r3022.CfB(r303);
        5Mh.A00(r3022, r303, str);
    }

    private void A01(5Mi r302, String str, long j) {
        try {
            5LG.A01("preVideoLruProtectPrefetchEvict");
            String A00 = 5N8.A00(str);
            if (A00 != null) {
                NavigableSet navigableSet = (NavigableSet) this.A0A.get(A00);
                if (navigableSet != null) {
                    while (true) {
                        Long l = (Long) this.A08.get(A00);
                        if (l == null) {
                            break;
                        }
                        if (((float) l.longValue()) / ((float) this.A07) < this.A05 || navigableSet.isEmpty()) {
                            break;
                        } else {
                            A00(r302, (5N6) navigableSet.first(), "lru_policy", true);
                        }
                    }
                }
            }
            while (true) {
                long j2 = this.A00;
                long j3 = this.A01;
                long j4 = j2 + j3 + j;
                long j5 = this.A07;
                if (j4 > j5) {
                    if (((float) j3) > ((float) j5) * this.A04 || this.A03.isEmpty()) {
                        NavigableSet navigableSet2 = this.A02;
                        if (!navigableSet2.isEmpty()) {
                            A00(r302, (5N6) navigableSet2.first(), "lru_protect_prefetch", false);
                        }
                    }
                    SortedSet sortedSet = this.A03;
                    if (sortedSet.isEmpty()) {
                        break;
                    } else {
                        A00(r302, (5N6) sortedSet.first(), "lru_protect_prefetch_playback", false);
                    }
                } else {
                    break;
                }
            }
        } finally {
            5LG.A00();
        }
    }

    public void BwV(String str, String str2, int i, int i2) {
    }

    public void CMJ(5Mi r302, 5N6 r303) {
        new SBy(this, r303).run();
        String str = r303.A06;
        String A00 = 5N8.A00(str);
        if (A00 != null) {
            java.util.Map map = this.A08;
            Number A0o = 1BK.A0o(A00, map);
            AnonymousClass001.A18(A00, A0o != null ? A0o.longValue() + r303.A03 : r303.A03, map);
            if (r303.A04 > this.A09) {
                java.util.Map map2 = this.A0A;
                Set set = (Set) map2.get(A00);
                if (set != null) {
                    set.add(r303);
                } else {
                    TreeSet treeSet = new TreeSet(this);
                    treeSet.add(r303);
                    map2.put(A00, treeSet);
                }
            }
        }
        A01(r302, str, 0L);
    }

    public void CMK(5Mi r302, 5N6 r303) {
        String A00 = 5N8.A00(r303.A06);
        if (A00 != null) {
            java.util.Map map = this.A08;
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
            AbstractC2327GOs.A0y(A00, r303, this.A0A);
        }
        new SBz(this, r303).run();
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
        A01(r302, str, j2);
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
