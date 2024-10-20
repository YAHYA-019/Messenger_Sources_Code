package X;

import android.os.SystemClock;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5ho, reason: invalid class name */
/* loaded from: 5ho.class */
public final class C5ho {
    public static final C5ho A06 = new C5ho();
    public 5LA A01;
    public Boolean A02;
    public volatile java.util.Map A05 = new HashMap();
    public final C5hp A03 = new C5hp(this);
    public int A00 = 0;
    public volatile long A04 = -1;

    public static boolean A00(6Vz r301, C5ho c5ho, boolean z) {
        if (!r301.A0A || c5ho.A04 == -1 || SystemClock.elapsedRealtime() - c5ho.A04 <= 5000) {
            return z ? r301.A0J : r301.A0I;
        }
        return false;
    }

    public 6bI A01(5LA r302, 6Vz r303, Integer num, String str, boolean z) {
        Set set;
        if (this.A01 == null) {
            this.A01 = r302;
        }
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    boolean z2 = r303.A0N;
                    this.A02 = Boolean.valueOf(z2);
                    if (z2) {
                        this.A05 = new ConcurrentHashMap();
                    }
                }
            }
        }
        if (!r303.A0G) {
            if (A00(r303, this, z) && (!str.equals("meta.dav1d.av1.decoder") || !r303.A08)) {
                synchronized (this) {
                    Set set2 = (Set) this.A05.get(str);
                    if (set2 != null && !set2.isEmpty()) {
                        this.A00--;
                        Iterator it = set2.iterator();
                        6bI r0 = (6bI) it.next();
                        it.remove();
                        5LA r314 = this.A01;
                        if (r314 == null) {
                            r314 = C7gg.A00;
                        }
                        r314.A03(num, str, r0.hashCode(), z);
                        return r0;
                    }
                }
            }
            try {
                11T.A0F(str, 1);
                6bG r02 = new 6bG(num, str, RealtimeSinceBootClock.A00.now(), z);
                6bI A00 = C5hp.A00(str, z);
                5LA r3142 = this.A01;
                if (r3142 == null) {
                    r3142 = C7gg.A00;
                }
                r3142.A02(r02, A00.hashCode());
                return A00;
            } catch (Exception e) {
                throw new KQe(str, e);
            }
        }
        C5ho c5ho = this.A03.A02;
        if (A00(r303, c5ho, z) && (!str.equals("meta.dav1d.av1.decoder") || !r303.A08)) {
            synchronized (c5ho.A05) {
                set = (Set) c5ho.A05.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        c5ho.A00--;
                        Iterator it2 = set.iterator();
                        6bI r03 = (6bI) it2.next();
                        it2.remove();
                        5LA r3143 = c5ho.A01;
                        if (r3143 == null) {
                            r3143 = C7gg.A00;
                        }
                        r3143.A03(num, str, r03.hashCode(), z);
                        return r03;
                    }
                }
            }
        }
        try {
            11T.A0F(str, 1);
            6bG r04 = new 6bG(num, str, RealtimeSinceBootClock.A00.now(), z);
            6bI A002 = C5hp.A00(str, z);
            5LA r3144 = c5ho.A01;
            if (r3144 == null) {
                r3144 = C7gg.A00;
            }
            r3144.A02(r04, A002.hashCode());
            return A002;
        } catch (Exception e2) {
            throw new KQe(str, e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v174, types: [X.KSy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v256, types: [X.KSy, java.lang.Object] */
    public void A02(5LA r302, 6Vz r303, 6bI r304, Integer num, String str, boolean z) {
        Throwable th;
        boolean z2;
        if (this.A01 == null) {
            this.A01 = r302;
        }
        if (!r303.A0G) {
            if (A00(r303, this, z) && (!str.equals("meta.dav1d.av1.decoder") || !r303.A08)) {
                synchronized (this) {
                    if (this.A00 < r303.A03) {
                        Set set = (Set) this.A05.get(str);
                        if (set == null) {
                            Boolean bool = this.A02;
                            if (bool == null || !bool.booleanValue()) {
                                new HashSet();
                            } else {
                                new CopyOnWriteArraySet();
                            }
                            this.A05.put(str, set);
                        }
                        if (!th.contains(r304)) {
                            if (z) {
                            }
                            if (th.size() < r303.A02) {
                                th.add(r304);
                                this.A00++;
                            }
                        }
                        long j = -1;
                        try {
                            try {
                                this.A04 = SystemClock.elapsedRealtime();
                                r304.reset();
                                5L9 r315 = this.A01;
                                if (r315 == null) {
                                    r315 = C7gg.A00;
                                }
                                int hashCode = r304.hashCode();
                                if (r315 instanceof 5L9) {
                                    r315.A00.ADT(new 6bL(6bJ.A07, num.intValue() != 1 ? C6bK.A02 : C6bK.A03, (Boolean) null, (String) null, hashCode, RealtimeSinceBootClock.A00.now()));
                                }
                                return;
                            } finally {
                                this.A04 = j;
                            }
                        } catch (IllegalStateException unused) {
                            Set set2 = (Set) this.A05.get(str);
                            if (set2 != null && set2.remove(r304)) {
                                this.A00--;
                            }
                            this.A04 = j;
                        }
                    }
                }
            }
            try {
                if (!r303.A0M || (!z && !r303.A0L)) {
                    r304.stop();
                }
                return;
            } finally {
                5LA r310 = this.A01;
                if (r310 == null) {
                    r310 = C7gg.A00;
                }
                r310.A01(r304.hashCode());
                r304.release();
                5LA r3102 = this.A01;
                if (r3102 == null) {
                    r3102 = C7gg.A00;
                }
                r3102.A00(r304.hashCode());
            }
        }
        C5hp c5hp = this.A03;
        C5ho c5ho = c5hp.A02;
        if (A00(r303, c5ho, z) && (!str.equals("meta.dav1d.av1.decoder") || !r303.A08)) {
            boolean z3 = r303.A0H;
            if (z3 && !c5hp.A00) {
                c5hp.A00 = true;
                Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new LoQ(c5hp, num), 5, Math.max(1000, r303.A04), TimeUnit.MILLISECONDS);
            }
            boolean z4 = false;
            if (c5ho.A00 < r303.A03) {
                synchronized (c5ho.A05) {
                    th = (Set) c5ho.A05.get(str);
                    if (th == null) {
                        Boolean bool2 = c5ho.A02;
                        if (bool2 == null || !bool2.booleanValue()) {
                            th = AnonymousClass001.A0v();
                        } else {
                            new CopyOnWriteArraySet();
                        }
                        c5ho.A05.put(str, th);
                    }
                }
                synchronized (th) {
                    try {
                        if (th.contains(r304)) {
                            z2 = false;
                        } else {
                            if (!z ? r303.A0I : r303.A0J) {
                                if (th.size() < r303.A02) {
                                    z2 = false;
                                    z4 = true;
                                }
                            }
                            z2 = true;
                        }
                    } finally {
                        Throwable th2 = th;
                    }
                }
                if (!z2) {
                    try {
                        try {
                            if (!z3) {
                                c5ho.A04 = SystemClock.elapsedRealtime();
                                r304.reset();
                                if (z4) {
                                    synchronized (th) {
                                        try {
                                            th.add(r304);
                                            c5ho.A00++;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            Set set3 = th;
                                        }
                                    }
                                }
                                c5ho.A04 = -1;
                                return;
                            }
                            ?? obj = new Object();
                            ((KSy) obj).A01 = r304;
                            ((KSy) obj).A00 = r303;
                            ((KSy) obj).A02 = str;
                            ((KSy) obj).A04 = z;
                            ((KSy) obj).A03 = z4;
                            ((KSy) obj).A05 = true;
                            ConcurrentLinkedQueue concurrentLinkedQueue = c5hp.A01;
                            synchronized (concurrentLinkedQueue) {
                                try {
                                    concurrentLinkedQueue.add(obj);
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            return;
                            throw th;
                        } catch (Throwable th5) {
                            if (!z3) {
                                c5ho.A04 = -1;
                            }
                            throw th5;
                        }
                    } catch (IllegalStateException unused2) {
                        C5hp.A02(r304, c5hp, str);
                        if (!z3) {
                            c5ho.A04 = -1;
                        }
                    }
                }
            }
        }
        if (!r303.A0H) {
            C5hp.A01(r303, r304, c5hp, Boolean.valueOf(z));
            return;
        }
        ?? obj2 = new Object();
        ((KSy) obj2).A01 = r304;
        ((KSy) obj2).A00 = r303;
        ((KSy) obj2).A02 = str;
        ((KSy) obj2).A04 = z;
        ((KSy) obj2).A03 = false;
        ((KSy) obj2).A05 = false;
        ConcurrentLinkedQueue concurrentLinkedQueue2 = c5hp.A01;
        synchronized (concurrentLinkedQueue2) {
            concurrentLinkedQueue2.add(obj2);
        }
    }

    public void A03(boolean z) {
        AbstractCollection abstractCollection;
        if (!z) {
            synchronized (this) {
                abstractCollection = null;
                for (Set<6bI> set : this.A05.values()) {
                    for (6bI r0 : set) {
                        if (abstractCollection == null) {
                            new LinkedList();
                        }
                        abstractCollection.add(r0);
                    }
                    set.clear();
                }
                this.A05.clear();
                this.A00 = 0;
            }
            if (abstractCollection == null) {
                return;
            }
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                6bI r02 = (6bI) it.next();
                try {
                    r02.stop();
                    try {
                        r02.release();
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    r02.release();
                    throw th;
                    break;
                }
            }
        } else {
            C5ho c5ho = this.A03.A02;
            synchronized (c5ho.A05) {
                Iterator A1A = 1BK.A1A(c5ho.A05);
                abstractCollection = null;
                while (A1A.hasNext()) {
                    Set<6bI> set2 = (Set) A1A.next();
                    for (6bI r03 : set2) {
                        if (abstractCollection == null) {
                            new LinkedList();
                        }
                        abstractCollection.add(r03);
                    }
                    set2.clear();
                }
                c5ho.A05.clear();
                c5ho.A00 = 0;
            }
            if (abstractCollection == null) {
                return;
            }
            Iterator it2 = abstractCollection.iterator();
            while (it2.hasNext()) {
                6bI r04 = (6bI) it2.next();
                try {
                    r04.stop();
                    try {
                        r04.release();
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th2) {
                    r04.release();
                    throw th2;
                    break;
                }
            }
        }
        abstractCollection.clear();
    }
}
