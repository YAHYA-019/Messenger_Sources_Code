package X;

import android.content.Context;
import android.graphics.Color;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.mapbox.mapboxsdk.R;
import java.util.List;

/* renamed from: X.8gz, reason: invalid class name */
/* loaded from: 8gz.class */
public final class C8gz extends 1LH {
    public static final CallerContext A07 = CallerContext.A0B("PeopleYouMayKnowHscrollItemComponent");
    public final C37c A00;
    public final 85T A01;
    public final AaK A02;
    public final 9Ta A03;
    public final 2YH A04;
    public final MigColorScheme A05;
    public final boolean A06;

    public C8gz(C37c c37c, AaK aaK, 9Ta r304, 2YH r305, MigColorScheme migColorScheme, boolean z) {
        11T.A0F(migColorScheme, 2);
        this.A00 = c37c;
        this.A05 = migColorScheme;
        this.A06 = z;
        this.A04 = r305;
        this.A03 = r304;
        this.A02 = aaK;
        this.A01 = c37c.A00;
    }

    public 1LI A0s(C2k5 c2k5) {
        1LI A2W;
        11T.A0F(c2k5, 0);
        2YH r0 = this.A04;
        if (r0 != null) {
            r0.A03(this.A00);
        }
        2lQ r02 = 2lO.A02;
        2RH r03 = 2RH.A04;
        2lO A0Z = 7zQ.A0Z(7zQ.A0Z(4YV.A0K((2lO) null, 0S2.A06, 4YV.A06(r03)), 0S2.A00, AVJ.A01(this, 48)), 0S2.A01, AVJ.A01(this, 49));
        C1rp c1rp = C1rp.FLEX_START;
        1Iw AeS = c2k5.AeS();
        C2sn A0U = 7zQ.A0U(AeS);
        1Iw AeS2 = A0U.AeS();
        5BH A01 = 5BG.A01(AeS2);
        A01.A1M(2132279378);
        A01.A1W(2132279378);
        85T r04 = this.A01;
        7zN.A1A(A01, r04.A04);
        C07004ik A0I = 7zR.A0I();
        ((C07014il) A0I).A04 = 5BK.A05;
        C06984ii.A01(A01, A0I);
        A01.A2b(A07);
        A01.A0L();
        7zU.A1A(A01, A0U);
        2KD A012 = 2K3.A01(AeS2, 0);
        A012.A2z(r04.A03);
        7zN.A1Y(A012);
        A012.A2q(1);
        A012.A1Y(R.dimen.mapbox_eight_dp);
        MigColorScheme migColorScheme = this.A05;
        A012.A2x(migColorScheme);
        A012.A0L();
        7zN.A1Q(A0U, A012);
        2RH r05 = 2RH.A09;
        2lO A0R = 7zT.A0R((2lO) null, 4YV.A06(r05), 4YV.A06(r03));
        C2sn A0U2 = 7zQ.A0U(AeS2);
        if (this.A06) {
            2rQ r06 = new 2rQ(r04.A07, (List) null);
            2rS A00 = 2rR.A00(A0U2.AeS());
            A00.A0S();
            A00.A2c(r06);
            A00.A2b(migColorScheme);
            A00.A2a(2);
            A00.A2Z(16.0f);
            A00.A1Y(2132279309);
            4YU.A1O(A00, r05, C26z.RIGHT);
            A00.A0L();
            A00.A2d(false);
            A00.A2Q(false);
            2rR r07 = A00.A01;
            r07.A09 = false;
            r07.A01 = Color.argb(1, 0, 0, 0);
            A2W = A00.A2W();
        } else {
            A2W = null;
        }
        A0U2.A00(A2W);
        1Iw AeS3 = A0U2.AeS();
        2KD A013 = 2K3.A01(AeS3, 0);
        A013.A32(true);
        7zQ.A1S(A013, C9gn.A00.A00(7zL.A0A(AeS3), r04));
        A013.A2q(1);
        A013.A2x(migColorScheme);
        A013.A0L();
        7zN.A1Q(A0U2, A013);
        7zM.A1R(A0U2, A0U, A0R);
        AnonymousClass860 A002 = C85z.A00(AeS2);
        A002.A2X(migColorScheme);
        Context A0A = 7zL.A0A(AeS2);
        int i = 2131963185;
        if (r04.A01 == 1Kn.A05) {
            i = 2131963186;
        }
        A002.A2Y(1BK.A0u(A0A, i));
        7zO.A1N(A002, AVJ.A01(this, 47));
        A0U.A00(A002.A2V());
        C83g A003 = C02413v4.A00(AeS2);
        A003.A2Z(2MQ.A0z);
        A003.A2X();
        A003.A2e(migColorScheme);
        A003.A2c(C83o.A04);
        A003.A2b(7zL.A0a(AVC.A01(this, 0)));
        A003.A0M();
        A003.A0c();
        A0U.A00(A003.A2V());
        2cL A0C = C2so.A0C(A0U, c2k5, A0Z, c1rp);
        8Tk A004 = C8mn.A00(AeS);
        A004.A2e(A0C);
        A004.A2b(2132279314);
        A004.A01.A03 = migColorScheme.Awo();
        A004.A2Z(0);
        A004.A2f(true);
        A004.A1W(R.dimen.mapbox_minimum_scale_velocity);
        7zO.A1N(A004, AVC.A01(this, 1));
        A004.A2Y(0.0f);
        return A004.A2W();
    }
}
