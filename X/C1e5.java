package X;

import java.util.HashMap;

/* renamed from: X.1e5, reason: invalid class name */
/* loaded from: 1e5.class */
public final class C1e5 {
    public static C1e5 A04;
    public C01s A00;
    public boolean A03;
    public java.util.Map A02 = new HashMap();
    public java.util.Map A01 = new HashMap();

    /* JADX WARN: Type inference failed for: r0v10, types: [X.01s, java.lang.Object] */
    public C1e5(C01s c01s) {
        this.A03 = false;
        if (c01s == null) {
            this.A00 = new Object();
        } else {
            this.A00 = c01s;
            this.A03 = true;
        }
    }

    public static String A00(String str, String str2, int i) {
        if (str2 == null) {
            str2 = "No Message supplied by the error";
        }
        return 0Pz.A10("MobileBoost | ", str, " | ", C1fq.A00(i), " | ", str2);
    }

    public static void A01(1fB r301, java.util.Map map) {
        if (r301.A02() != -1) {
            int i = 1;
            if (map.containsKey(r301) && map.get(r301) != null) {
                i = AnonymousClass001.A03(map.get(r301)) + 1;
            }
            1BK.A1P(r301, map, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.1hk, java.lang.Object] */
    public void A02(1fB r302) {
        int i;
        if (r302 == null || r302.A02() == -1) {
            return;
        }
        synchronized (r302) {
            i = r302.A00;
        }
        if (i != 0) {
            if (r302.A01 == null) {
                r302.A01 = new Object();
            }
            java.util.Map map = this.A01;
            if (map.containsKey(r302) && map.get(r302) != null && 5 < AnonymousClass001.A03(map.get(r302))) {
                map.get(r302);
                synchronized (r302) {
                }
            }
            java.util.Map map2 = this.A02;
            if (!map2.containsKey(r302) || map2.get(r302) == null || 5 >= AnonymousClass001.A03(map2.get(r302))) {
                return;
            }
            map2.get(r302);
            synchronized (r302) {
            }
        }
    }

    public void A03(1fB r302, Throwable th) {
        int i;
        if (r302 != null) {
            i = r302.A02();
            if (i != -1) {
                A01(r302, this.A01);
            }
        } else {
            1fA r0 = 1fA.A00;
            i = -1;
        }
        this.A00.softReport(A00("BoosterFailsReleaseWithException", th.getMessage(), i), th);
    }
}
