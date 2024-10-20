package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.90u, reason: invalid class name */
/* loaded from: 90u.class */
public final class C90u extends 2Lg {
    public final C00i A00 = 1BQ.A02(49968);

    public static void A00(1Qb r301, String str, int i, int i2) {
        r301.AxQ().A02(str, i - i2);
    }

    public /* bridge */ /* synthetic */ Object A02() {
        ROU rou = new ROU();
        C00i c00i = this.A00;
        rou.A02 = ((69F) c00i.get()).A02.get();
        rou.A01 = ((69F) c00i.get()).A01.get();
        rou.A00 = ((69F) c00i.get()).A00.get();
        rou.A06 = ((69F) c00i.get()).A06.get();
        rou.A04 = ((69F) c00i.get()).A04.get();
        rou.A05 = ((69F) c00i.get()).A05.get();
        rou.A03 = ((69F) c00i.get()).A03.get();
        return rou;
    }

    public /* bridge */ /* synthetic */ ListenableFuture AMK(1Qb r302, Object obj, Object obj2) {
        ROU rou = (ROU) obj;
        ROU rou2 = (ROU) obj2;
        if (rou != null && rou2 != null) {
            A00(r302, "total_ct", rou2.A02, rou.A02);
            A00(r302, "outlier_ct", rou2.A01, rou.A01);
            A00(r302, "fail_ct", rou2.A00, rou.A00);
            A00(r302, "500_ct", rou2.A06, rou.A06);
            A00(r302, "slow_ct", rou2.A04, rou.A04);
            A00(r302, "3k_ct", rou2.A05, rou.A05);
            A00(r302, "10k_ct", rou2.A03, rou.A03);
        }
        return 1hM.A01;
    }

    public String B5Q() {
        return "image_stats";
    }

    public int B5R() {
        return 53;
    }

    public Class BBP() {
        return ROU.class;
    }

    public boolean BS6(2Lc r302) {
        return r302.A02;
    }
}
