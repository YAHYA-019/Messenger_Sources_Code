package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.highlightstab.immersivecolorschemes.HTImmersiveColorScheme;
import com.facebook.messaging.highlightstab.model.HighlightsFeedContent;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8e4, reason: invalid class name */
/* loaded from: 8e4.class */
public final class C8e4 extends 1LH {
    public final 06Z A00;
    public final FbUserSession A01;
    public final HTImmersiveColorScheme A02;
    public final 9SW A03;
    public final HighlightsFeedContent A04;
    public final String A05;
    public final int A06;
    public final View A07;
    public final LifecycleOwner A08;
    public final 95J A09;

    public C8e4(View view, 06Z r303, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, HTImmersiveColorScheme hTImmersiveColorScheme, 95J r307, 9SW r308, HighlightsFeedContent highlightsFeedContent, String str, int i) {
        7zS.A18(3, lifecycleOwner, str, hTImmersiveColorScheme);
        this.A04 = highlightsFeedContent;
        this.A00 = r303;
        this.A08 = lifecycleOwner;
        this.A03 = r308;
        this.A01 = fbUserSession;
        this.A09 = r307;
        this.A06 = i;
        this.A05 = str;
        this.A02 = hTImmersiveColorScheme;
        this.A07 = view;
    }

    public 1LI A0s(C2k5 c2k5) {
        9SV r0 = (9SV) 2rO.A00(c2k5, AQl.A01(this, 28), 7zL.A1Z(c2k5));
        C2lh A00 = C2lc.A00(c2k5, AMZ.A00);
        2lO A002 = 9CJ.A00(2lO.A02, this.A09, 7zU.A05(c2k5, C9mV.A03));
        Integer num = 0S2.A01;
        2lO A0g = 7zL.A0g(A002, 7zL.A0k(num, 1.0f));
        Integer num2 = 0S2.A00;
        2lO A04 = C82m.A04(A0g, num2, 100.0f, 0);
        9SW r02 = this.A03;
        2lO A0g2 = 7zT.A0g(A04, num2, 0);
        C2sn A0L = 7zR.A0L(c2k5);
        2lO A0X = 7zQ.A0X((2lO) null, num, 1.0f);
        C2sn A0K = 7zS.A0K(A0L);
        final HighlightsFeedContent highlightsFeedContent = this.A04;
        final 06Z r03 = this.A00;
        int i = this.A06;
        String str = this.A05;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.A08);
        int i2 = r02.A01;
        final FbUserSession fbUserSession = this.A01;
        7zQ.A1E(new C8is(this.A07, r03, fbUserSession, r0, highlightsFeedContent, str, AQl.A01(A00, 27), lifecycleScope, i, i2), A0K, A0L, A0X);
        if (7zP.A1V(A00)) {
            long A042 = 3yH.A04(A0L);
            1Iw AeS = A0L.AeS();
            long A01 = C9mV.A01(AeS, r02.A00, 1.0f, 7zM.A08(A0L));
            Context A003 = 3vP.A00(A0L);
            C1F6 c1f6 = (C1F6) 1Bn.A0A(1133);
            Context A004 = 3vP.A00(A0L);
            AQl A012 = AQl.A01(this, 25);
            Context A005 = 1Bf.A00(c1f6);
            try {
                AZN rqF = new RqF(A004, highlightsFeedContent, A012);
                1Bn.A0K();
                FbInjector.A04(A005);
                C1F6 c1f62 = (C1F6) 1Bn.A0A(1132);
                Context A006 = 3vP.A00(A0L);
                AQl A013 = AQl.A01(this, 26);
                A005 = 1Bf.A00(c1f62);
                AZN rqE = new RqE(A006, highlightsFeedContent, A013);
                1Bn.A0K();
                FbInjector.A04(A005);
                final 8KI A007 = R0i.A00(A003, fbUserSession, highlightsFeedContent, C0s8.A14(rqF, rqE));
                1Br A008 = 1Bu.A00(16430);
                2dP r04 = 2dP.A01;
                Integer num3 = 0S2.A0Y;
                2lO A0K2 = 4YV.A0K(7zS.A0X(4YV.A0K(C82m.A02(7zQ.A0X(7zQ.A0Y(4YV.A0L((2lO) null, num3, r04, 0), 0S2.A0N, 7zP.A08()), num, 1.0f), 7zL.A0k(0S2.A0C, 0.0f), num2, 100.0f, 0), 0S2.A04, A042), A0L, num3, 2132279321), 0S2.A08, A01);
                C2sn A0U = 7zQ.A0U(AeS);
                final HTImmersiveColorScheme hTImmersiveColorScheme = this.A02;
                final 9O6 r05 = new 9O6(A008, this);
                A0U.A00(new 1LH(r03, fbUserSession, r05, A007, highlightsFeedContent, hTImmersiveColorScheme) { // from class: X.8c0
                    public final 06Z A00;
                    public final FbUserSession A01;
                    public final 9O6 A02;
                    public final 8KI A03;
                    public final HighlightsFeedContent A04;
                    public final MigColorScheme A05;

                    {
                        7zT.A1U(hTImmersiveColorScheme, r03, highlightsFeedContent);
                        11T.A0F(fbUserSession, 5);
                        this.A03 = A007;
                        this.A05 = hTImmersiveColorScheme;
                        this.A00 = r03;
                        this.A04 = highlightsFeedContent;
                        this.A01 = fbUserSession;
                        this.A02 = r05;
                    }

                    public 1LI A0s(C2k5 c2k52) {
                        11T.A0F(c2k52, 0);
                        return new 1LH(C1u3.A2N, 7zO.A0U(AVH.A00(c2k52, this, 3)), this.A05) { // from class: X.8X5
                            public final C1u3 A00;
                            public final 1Im A01;
                            public final MigColorScheme A02;

                            {
                                11T.A0F(r304, 2);
                                this.A00 = r302;
                                this.A02 = r304;
                                this.A01 = r303;
                            }

                            public 1LI A0s(C2k5 c2k53) {
                                C1u2 A0G = 7zS.A0G(c2k53, 0);
                                2lQ r06 = 2lO.A02;
                                2lO A0U2 = 7zT.A0U(7zS.A0g(0S2.A01, 3yH.A06(c2k53, 2132279321)), 7zM.A0q(3yH.A01(c2k53)));
                                C2sn A0L2 = 7zR.A0L(c2k53);
                                C2cq A0n = 7zL.A0n(A0L2, 0);
                                7zM.A1I(this.A00, A0G, A0n, this.A02.B4h());
                                7zP.A10(A0n);
                                7zN.A1E(A0n, A0L2, 2131957803);
                                A0n.A2T(this.A01);
                                7zN.A1O(A0L2, A0n);
                                return C2so.A07(A0L2, c2k53, A0U2);
                            }
                        };
                    }
                });
                A0L.A00(C2so.A0L(A0U, A0L, A0K2));
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A005);
                throw th;
            }
        }
        4FL.A00(c2k5, AMY.A00, new Object[]{A00});
        return C2so.A02(A0L, c2k5, A0g2);
    }
}
