package X;

import android.text.Html;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.8Wx, reason: invalid class name */
/* loaded from: 8Wx.class */
public final class C8Wx extends 1LH {
    public final ClickableSpan A00;
    public final 9Im A01;
    public final MigColorScheme A02;

    public C8Wx(ClickableSpan clickableSpan, 9Im r303, MigColorScheme migColorScheme) {
        this.A02 = migColorScheme;
        this.A01 = r303;
        this.A00 = clickableSpan;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        MigColorScheme migColorScheme = this.A02;
        2lO A0g = 7zL.A0g((2lO) null, 7zL.A0u(0S2.A00, 7zL.A0j(migColorScheme.BDl()), 1));
        Integer num = 0S2.A01;
        2lO A0X = 7zQ.A0X(A0g, num, 1.0f);
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        C5yw A0l = 7zS.A0l(AeS, migColorScheme, A1W);
        C9zj.A04(A0l, this, 58);
        A0l.A2Y();
        7zM.A1W(migColorScheme, A0l);
        C9lC A00 = C9lC.A00();
        C9lC.A01(A00, A0L, 2131964245);
        A00.A01 = migColorScheme;
        9zQ.A02(A0l, A00, this, 13);
        7zN.A1R(A0L, A0l);
        8Tn A09 = 8Tn.A09(AeS, migColorScheme);
        String A092 = 3yH.A09(A0L, 2131957714);
        C8xf A01 = 9Di.A01(migColorScheme);
        C1ro c1ro = C1ro.FLEX_START;
        2lO A0X2 = 7zQ.A0X((2lO) null, num, 0.0f);
        2RH r0 = 2RH.A03;
        2lO A0O = 7zT.A0O(A0X2, 7zL.A00(r0));
        C2sn A0U = 7zQ.A0U(AeS);
        String A093 = 3yH.A09(A0U, 2131957709);
        SpannableString A002 = 9C7.A00(7zQ.A0J(A0U.A00), this.A00, 3yH.A09(A0U, 2131957708), 3yH.A09(A0U, 2131957711), "[[learn-more-backups]]");
        long A06 = 4YV.A06(r0);
        2RH r02 = 2RH.A04;
        long A062 = 4YV.A06(r02);
        Integer num2 = 0S2.A04;
        2lO A0K = 4YV.A0K((2lO) null, num2, A06);
        Integer num3 = 0S2.A05;
        2lO A0K2 = 4YV.A0K(A0K, num3, A062);
        1Iw AeS2 = A0U.AeS();
        C2sn A0U2 = 7zQ.A0U(AeS2);
        1Iw r03 = A0U2.A00;
        2KD A13 = 7zM.A13(r03, A093, A1W ? 1 : 0);
        7zU.A1T(migColorScheme, A13);
        2RH r04 = 2RH.A07;
        4YU.A1N(A13, r04);
        2KD A0d = 7zR.A0d(r03, A0U2, A13, A1W ? 1 : 0);
        A0d.A2z(A002);
        7zQ.A1M(migColorScheme, A0d);
        4YU.A1N(A0d, r04);
        7zS.A1O(A0U2, A0U, A0K2, A0d);
        String A094 = 3yH.A09(A0U, 2131957710);
        String A0W = 0Pz.A0W(7zT.A0w(AeS2.A0D, A0U, 2131957706), 3yH.A09(A0U, 2131957707));
        11T.A0F(A0W, A1W ? 1 : 0);
        SpannableString spannableString = new SpannableString(Html.fromHtml(A0W));
        long A063 = 4YV.A06(r0);
        2lO A0V = 7zS.A0V((2lO) null, 7zL.A0i(num2, A063), num3, 4YV.A06(r02));
        C2sn A0U3 = 7zQ.A0U(AeS2);
        1Iw r05 = A0U3.A00;
        2KD A132 = 7zM.A13(r05, A094, A1W ? 1 : 0);
        7zU.A1T(migColorScheme, A132);
        4YU.A1N(A132, r04);
        2KD A0d2 = 7zR.A0d(r05, A0U3, A132, A1W ? 1 : 0);
        A0d2.A2z(spannableString);
        7zQ.A1M(migColorScheme, A0d2);
        4YU.A1N(A0d2, r04);
        7zU.A1D(A0d2, r04);
        7zS.A1O(A0U3, A0U, A0V, A0d2);
        A09.A2Z(new 8NK(C9py.A01(C9py.A03(this, ActionId.QUERY_READY), 3yH.A09(A0L, 2131957712), 3yH.A09(A0L, 2131957713), this, ActionId.RTMP_PACKET_RECEIVED), C2so.A09(A0U, A0L, A0O, c1ro), A01, A092, (CharSequence) null, (CharSequence) null, (Integer) null, (Integer) null, (List) null, A1W, true));
        return 8Tn.A06(A0L, c2k5, A0X, A09);
    }
}
