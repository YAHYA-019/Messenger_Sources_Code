package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.63n, reason: invalid class name */
/* loaded from: 63n.class */
public final class C63n {
    public final C00i A03 = new 1BQ(16772);
    public final C00i A01 = new 1BQ(16431);
    public final Context A00 = FbInjector.A00();
    public final C00i A02 = new 1BQ(16432);

    public static void A00(C63n c63n, String str, String str2) {
        2Jy A0H = 4YU.A0H(str);
        A0H.A0D("app_id", str2);
        A0H.A0D(GOm.A00(230), "platform_app");
        GYo.A00(1BK.A06(c63n.A03)).A03(A0H);
    }

    public static void A01(C63n c63n, String str, String str2, String str3) {
        2Jy A0H = 4YU.A0H(str);
        A0H.A0D("app_id", str2);
        A0H.A0D("message_id", str3);
        GYo.A00(1BK.A06(c63n.A03)).A03(A0H);
    }

    public void A02(String str, String str2, String str3) {
        str.getClass();
        ListenableFuture D3C = ((1ED) this.A01.get()).D3C(new J4w(this, 2));
        1Kd.A0D(this.A02, new InI(this, str, str2, str3), D3C);
    }
}
