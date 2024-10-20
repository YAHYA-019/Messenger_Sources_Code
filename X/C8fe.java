package X;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.animation.AccelerateInterpolator;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.avatar.style2.ui.AutoMigrationBannerFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8fe, reason: invalid class name */
/* loaded from: 8fe.class */
public final class C8fe extends 1LH {
    public static final int[] A03 = {Color.parseColor("#EAD0D3"), Color.parseColor("#85E3E0E6"), Color.parseColor("#E1E4ED")};
    public final AutoMigrationBannerFragment A00;
    public final MigColorScheme A01;
    public final String A02;

    public C8fe(AutoMigrationBannerFragment autoMigrationBannerFragment, MigColorScheme migColorScheme, String str) {
        11T.A0F(migColorScheme, 1);
        this.A01 = migColorScheme;
        this.A02 = str;
        this.A00 = autoMigrationBannerFragment;
    }

    /* JADX WARN: Type inference failed for: r0v154, types: [X.0w6, java.lang.Object] */
    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        4FL.A00(c2k5, new DCx(this, 43), 7zL.A1Y());
        5X3 A0h = 7zL.A0h("key_image_transition");
        7zP.A1B(A0h, C2jm.A00);
        7zN.A12(new AccelerateInterpolator(), A0h, 200);
        5XC.A00(c2k5, A0h);
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.FLEX_START;
        2lQ r0 = 2lO.A02;
        2RH r02 = 2RH.A03;
        2lO A0K = 4YV.A0K((2lO) null, 0S2.A04, 4YV.A06(r02));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C83g A00 = C02413v4.A00(AeS);
        MigColorScheme migColorScheme = this.A01;
        A00.A2e(migColorScheme);
        A00.A2Z(2MQ.A0z);
        A00.A2d(C1ut.A0A);
        A00.A2X();
        C1ro c1ro2 = C1ro.FLEX_END;
        Integer num = 0S2.A00;
        7zS.A1M(A00, (2lO) null, num, c1ro2, 0);
        C83g.A06(A0L, A00, new AeI(this, 23));
        String str = this.A02;
        Uri A002 = str != null ? C0A2.A00(new Object(), str) : null;
        GradientDrawable A0G = 7zO.A0G(1);
        A0G.setColors(A03);
        A0G.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        5BH A01 = 5BG.A01(AeS);
        A01.A1y(c1ro);
        A01.A2X(A002);
        A01.A0l(176.0f);
        A01.A0z(176.0f);
        A01.A0D(A0G);
        Class<?> cls = A0L.getClass();
        java.util.Map map = 0BY.A03;
        11T.A0F(cls, 1);
        A01.A2b(CallerContext.A0B(C0Bx.A01(cls)));
        C07004ik A003 = C06984ii.A00();
        ((C07014il) A003).A09 = new Q9P(true);
        C06984ii.A01(A01, A003);
        long A04 = 7zU.A04();
        Integer num2 = 0S2.A08;
        C5z7.A00(A01, 7zS.A0O(AeS, 7zT.A0k(4YV.A0K((2lO) null, num2, A04), 0S2.A01, num, Double.doubleToRawLongBits(176.0d)), "key_image_transition"));
        7zU.A1A(A01, A0L);
        2KD A012 = 2K3.A01(AeS, 0);
        A012.A2r(2131966475);
        A012.A2m();
        A012.A2b();
        A012.A2M(true);
        A012.A2x(migColorScheme);
        A012.A2X();
        C5z7.A00(A012, 7zT.A0d((2lO) null, 2RH.A06, num2));
        2KD A0d = 7zR.A0d(AeS, A0L, A012, 0);
        A0d.A2r(2131966474);
        A0d.A2l();
        7zQ.A1O(migColorScheme, A0d);
        C5z7.A00(A0d, 7zT.A0d((2lO) null, r02, num2));
        7zN.A1Q(A0L, A0d);
        AutoMigrationBannerFragment autoMigrationBannerFragment = this.A00;
        AK5 A0t = 7zU.A0t(autoMigrationBannerFragment, 6);
        8Th A004 = C8nq.A00(AeS);
        A004.A2X(2131966472);
        A004.A2Z(migColorScheme);
        A004.A0e();
        A004.A0l(44.0f);
        2lO A0Z = 7zS.A0Z((2lO) null, num2, 32.0d);
        AeI aeI = new AeI(A0t, 24);
        Integer num3 = 0S2.A1G;
        7zS.A1M(A004, A0Z, num3, aeI, 1);
        8Th.A06(A0L, A004);
        AK5 A0t2 = 7zU.A0t(autoMigrationBannerFragment, 7);
        8TX A005 = C8nl.A00(AeS);
        A005.A2X(2131966473);
        A005.A2Z(migColorScheme);
        7zS.A1M(A005, 7zT.A0c((2lO) null, 2RH.A05), num3, new AeI(A0t2, 25), 1);
        A0L.A00(A005.A2W());
        return C2so.A0A(A0L, c2k5, A0K, c1ro, c1ro, c1rp, null, false);
    }
}
