package X;

import android.content.Context;
import android.graphics.Typeface;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.8h5, reason: invalid class name */
/* loaded from: 8h5.class */
public final class C8h5 extends 1LH {
    public final FbSharedPreferences A00;
    public final 7Ij A01;
    public final C5fv A02;
    public final 1LI A03;
    public final 7Ij A04;
    public final 6yV A05;
    public final 5vW A06;
    public final C1ro A07;

    public C8h5(1LI r302, FbSharedPreferences fbSharedPreferences, 7Ij r304, 7Ij r305, 6yV r306, C5fv c5fv, 5vW r308, C1ro c1ro) {
        11T.A0F(fbSharedPreferences, 8);
        this.A07 = c1ro;
        this.A02 = c5fv;
        this.A03 = r302;
        this.A06 = r308;
        this.A04 = r304;
        this.A01 = r305;
        this.A05 = r306;
        this.A00 = fbSharedPreferences;
    }

    public static final boolean A01(C8h5 c8h5, C5fv c5fv, boolean z) {
        C5fu c5fu = (C5fu) c5fv;
        String str = c5fu.A09;
        String BD0 = c8h5.A00.BD0(1NK.A4f);
        if (BD0 == null) {
            BD0 = "";
        }
        boolean z2 = false;
        if (11T.A0O(str, BD0) || C65h.A04.A0B(c5fu.A0H, z, false)) {
            z2 = true;
        }
        return z2;
    }

    public 1LI A0s(C2k5 c2k5) {
        1Iw r323;
        2KZ A0L;
        11T.A0F(c2k5, 0);
        C65h c65h = C65h.A04;
        5gC r0 = this.A02;
        11T.A0I(r0, "null cannot be cast to non-null type com.facebook.xapp.messaging.threadview.model.text.TextMessage");
        boolean A0A = c65h.A0A(r0.A03);
        C2lh A00 = C2lc.A00(c2k5, new AKV(4, this, A0A));
        C5fu c5fu = (C5fu) r0;
        4FL.A00(c2k5, new 84Q(4, this, A00, A0A), new Object[]{c5fu.A09});
        if (!7zP.A1V(A00)) {
            return this.A03;
        }
        if (A0A) {
            String A09 = 3yH.A09(c2k5, 2131956378);
            2lQ r02 = 2lO.A02;
            2lO A0L2 = 7zT.A0L((2lO) null, 8.0d);
            int A002 = 7MH.A00(3vP.A00(c2k5), this.A04, this.A05, r0);
            long A06 = 3yH.A06(c2k5, 2132279337);
            Typeface typeface = Typeface.DEFAULT;
            long A08 = 7zP.A08();
            1Iw r03 = c2k5.A05;
            r323 = r03;
            3yF A0v = 7zM.A0v(r03, A09, 0);
            7zS.A1N(c2k5, A0v, A002, A06);
            A0v.A33(0);
            7zU.A0y(typeface, c2k5, A0v, A08);
            A0v.A2Z();
            7zS.A1W(A0v, false);
            7zS.A1T(A0v);
            A0v.A2a();
            A0v.A1w(null);
            A0L = 7zQ.A0c(A0L2, A0v);
        } else {
            2lQ r04 = 2lO.A02;
            2lO A0K = 4YV.A0K(4YV.A0K((2lO) null, 0S2.A15, 3yH.A05(c2k5)), 0S2.A09, c5fu.A0H ? 7zP.A0F() : 7zP.A08());
            1Iw r05 = c2k5.A05;
            r323 = r05;
            C2sn A0U = 7zQ.A0U(r05);
            7Ij r06 = this.A04;
            5vW r07 = this.A06;
            String Azs = r06.Azs(r07);
            2lO A0J = 7zT.A0J((2lO) null, 4.0d);
            Context A003 = 3vP.A00(A0U);
            6yV r08 = this.A05;
            int A004 = 7MH.A00(A003, r06, r08, r0);
            long A062 = 3yH.A06(A0U, 2132279337);
            Typeface typeface2 = Typeface.DEFAULT;
            long A082 = 7zP.A08();
            1Iw r09 = A0U.A00;
            3yF A0v2 = 7zM.A0v(r09, Azs, 0);
            7zS.A1Q(A0U, A0v2, A004, A062);
            A0v2.A33(0);
            A0v2.A34(typeface2);
            7zU.A1H(A0U, A0v2, 0, A082);
            7zP.A1D(A0v2);
            7zS.A1T(A0v2);
            A0v2.A2a();
            A0v2.A1w(null);
            7zS.A1B((2K8) null, A0U, A0J, A0v2);
            7Ij r010 = this.A01;
            String Azs2 = r010.Azs(r07);
            2lO A0R = 7zR.A0R((2lO) null, AVC.A01(this, 4), 1);
            int A005 = 7MH.A00(3vP.A00(A0U), r010, r08, r0);
            long A063 = 3yH.A06(A0U, 2132279337);
            3yF A0v3 = 7zM.A0v(r09, Azs2, 0);
            7zS.A1Q(A0U, A0v3, A005, A063);
            A0v3.A33(1);
            A0v3.A34(typeface2);
            7zU.A1H(A0U, A0v3, 0, A082);
            7zP.A1D(A0v3);
            7zS.A1T(A0v3);
            A0v3.A2a();
            A0v3.A1w(null);
            7zS.A1B((2K8) null, A0U, A0R, A0v3);
            A0L = C2so.A0L(A0U, c2k5, A0K);
        }
        C1ro c1ro = this.A07;
        C2sn A0U2 = 7zQ.A0U(r323);
        A0U2.A00(this.A03);
        return new 2cL((C1ro) null, c1ro, (C1rp) null, (EnumC00743oh) null, 7zL.A16(A0L, A0U2), false);
    }
}
