package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1e9, reason: invalid class name */
/* loaded from: 1e9.class */
public final class C1e9 {
    public static volatile boolean A09 = true;
    public static C1dr A0A;
    public static final C1dx A0B = C1dx.A01;
    public final int A01;
    public final 1hW A03;
    public final C1f7 A04;
    public final C1e5 A05;
    public final C1dy A08;
    public 1fD A00 = null;
    public final List A06 = new ArrayList();
    public final SparseArray A02 = new SparseArray();
    public final AtomicInteger A07 = new AtomicInteger(0);

    public C1e9(C1dy c1dy, 1hW r303, C1f7 c1f7, C1e5 c1e5, int i) {
        this.A01 = i;
        this.A04 = c1f7;
        this.A05 = c1e5;
        this.A08 = c1dy;
        this.A03 = r303;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v118, types: [X.1fL] */
    public static 1fB A00(C1e9 c1e9, C1fq c1fq) {
        int i;
        C1hg c1hg;
        1fB r303;
        C1hk c1hk;
        1fB r0 = c1fq.A00;
        if (r0 != null) {
            return r0;
        }
        try {
            C1dx c1dx = A0B;
            i = c1fq.A04;
            synchronized (c1dx) {
                SparseArray sparseArray = c1dx.A00;
                c1hg = (1fL) sparseArray.get(i);
                if (c1hg == null) {
                    c1hg = C1hg.A00;
                    sparseArray.put(i, c1hg);
                }
            }
        } catch (Error | Exception e) {
            C1e5 c1e5 = c1e9.A05;
            i = c1fq.A04;
            c1e5.A00.softReport(C1e5.A00("BoosterBuilderInitializationWithException", e.getMessage(), i), e);
            c1hg = C1hg.A00;
        }
        try {
            int i2 = c1fq.A03;
            C1hi c1hi = c1fq.A05;
            r303 = c1hg.A01(c1hi, i2);
            if (c1hi != null) {
                c1hk = c1hi.A03;
            } else {
                new Object();
            }
            r303.A01 = c1hk;
            if (r303 instanceof 1fA) {
                C1f7 c1f7 = c1e9.A04;
                String A00 = C1fq.A00(i);
                String str = ((1fL) c1hg).A00;
                C1dz c1dz = c1f7.A00;
                if (c1dz.A00) {
                    C1f3 c1f3 = new C1f3(null, 35, true);
                    c1f3.A02("booster", A00);
                    c1f3.A02("event", "no_op_booster");
                    if (str != null) {
                        c1f3.A02("reason", str);
                    }
                    c1f3.A00(2);
                    c1dz.Ba6(c1f3);
                }
            }
        } catch (Error | Exception e2) {
            c1e9.A05.A00.softReport(C1e5.A00("BoosterInitializationWithException", e2.getMessage(), i), e2);
            r303 = 1fA.A00;
        }
        synchronized (c1e9) {
            1fB r02 = c1fq.A00;
            if (r02 == null) {
                1iK r03 = new 1iK();
                c1e9.A00 = r03;
                List list = r303.A08;
                synchronized (list) {
                    if (!list.contains(r03)) {
                        list.add(r03);
                        r303.A04 = (1fD[]) list.toArray(new 1fD[list.size()]);
                        r303.A09 = true;
                    }
                }
                c1fq.A01 = c1e9.A00;
                c1fq.A00 = r303;
            } else {
                r303 = r02;
            }
        }
        return r303;
    }

    public void A01(int i) {
        int i2;
        int i3;
        Set set;
        for (C1fq c1fq : this.A06) {
            if (i == 0 || (set = c1fq.A02) == null || !set.contains(Integer.valueOf(i))) {
                if (!C1fq.A06.contains(Integer.valueOf(c1fq.A04)) || A09) {
                    1fB A00 = A00(this, c1fq);
                    try {
                        i3 = A00.A03(Integer.valueOf(i), this.A01);
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                        C1e5 c1e5 = this.A05;
                        if (A00 != null) {
                            i2 = A00.A02();
                            if (i2 != -1) {
                                C1e5.A01(A00, c1e5.A01);
                            }
                        } else {
                            1fA r0 = 1fA.A00;
                            i2 = -1;
                        }
                        c1e5.A00.softReport(C1e5.A00("BoosterFailsRequestWithException", th.getMessage(), i2), th);
                        i3 = 3;
                    }
                    this.A05.A02(A00);
                    C1f7 c1f7 = this.A04;
                    int i4 = this.A01;
                    C1dz c1dz = c1f7.A00;
                    if (c1dz.A00 && !(A00 instanceof 1fA)) {
                        if (A00 != null) {
                            String A002 = C1fq.A00(A00.A02());
                            if ("".equals(A002)) {
                                A002 = AnonymousClass001.A0X(A00);
                            }
                            if (i3 == 1) {
                                Integer valueOf = Integer.valueOf(i);
                                C1f3 c1f3 = new C1f3(null, 25, false);
                                c1f3.A02("event", "boosting_request");
                                c1f3.A01("trigger_source_id", i4);
                                c1f3.A02("booster", A002);
                                if (valueOf != null) {
                                    c1f3.A01("trigger_source_key", valueOf.intValue());
                                }
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append(A002);
                                stringBuffer.append("_");
                                stringBuffer.append(i4);
                                stringBuffer.append("_");
                                stringBuffer.append(valueOf != null ? valueOf.intValue() : 0);
                                String obj = stringBuffer.toString();
                                java.util.Map map = c1dz.A01.A00;
                                if (!map.containsKey(obj)) {
                                    map.put(obj, c1f3);
                                }
                                if (!c1f3.A03) {
                                    C1dz.A01(c1f3, C1fv.A01);
                                }
                            } else {
                                Integer valueOf2 = Integer.valueOf(i);
                                if (i3 == 2) {
                                    C1f3 c1f32 = new C1f3(null, 25, true);
                                    c1f32.A02("event", "boosting_request");
                                    c1f32.A02("booster", A002);
                                    c1f32.A01("trigger_source_id", i4);
                                    c1f32.A00(3);
                                    if (valueOf2 != null) {
                                        c1f32.A01("trigger_source_key", valueOf2.intValue());
                                    }
                                    c1dz.Ba6(c1f32);
                                } else {
                                    C1f3 c1f33 = new C1f3(valueOf2, 25, false);
                                    c1f33.A02("event", "boosting_request");
                                    c1f33.A01("trigger_source_id", i4);
                                    c1f33.A02("booster", A002);
                                    c1f33.A00(87);
                                    if (valueOf2 != null) {
                                        c1f33.A01("trigger_source_key", valueOf2.intValue());
                                    }
                                    if (th != null && th.getMessage() != null) {
                                        c1f33.A02("error", th.getMessage());
                                    }
                                    c1dz.Ba6(c1f33);
                                    0fH.A0g(A002, "MBLog", "Ended boosting %s reason: Error");
                                }
                            }
                        } else {
                            0fH.A0j("MBLog", "Not Tracking because booster doesn't implement TrackableBooster");
                        }
                    }
                }
            }
        }
    }

    public void A02(C1fq c1fq) {
        C1dr c1dr = A0A;
        if (c1dr != null) {
            C1dv c1dv = c1dr.A0J;
            int i = c1fq.A04;
            if (c1dv.A00(i)) {
                this.A06.add(c1fq);
                this.A02.put(i, c1fq);
            }
        }
    }
}
