package com.facebook.messaging.publicchats.plugins.threadview.messageaspagevoiceswitchtoast;

import X.0S2;
import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1LH;
import X.5zD;
import X.6Fy;
import X.6Fz;
import X.6G3;
import X.C3Q0;
import X.IKb;
import X.KuH;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.TypefaceSpan;
import android.view.View;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mobileconfig.init.MobileConfigSessionlessInit;

/* loaded from: MessageAsPageVoiceSwitchToastImplementation.class */
public final class MessageAsPageVoiceSwitchToastImplementation {
    public View A00;
    public boolean A01;
    public final Context A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 6G3 A09;
    public final 6Fz A0A;
    public final 6Fy A0B;

    public MessageAsPageVoiceSwitchToastImplementation(Context context, 6G3 r303, 6Fz r304, 6Fy r305) {
        11T.A0F(context, 1);
        11T.A0F(r305, 2);
        11T.A0F(r303, 3);
        11T.A0F(r304, 4);
        this.A02 = context;
        this.A0B = r305;
        this.A09 = r303;
        this.A0A = r304;
        this.A07 = 1Bu.A01(context, 67784);
        this.A05 = 1Bu.A00(82380);
        this.A06 = 1Bu.A00(83430);
        this.A03 = 1Bu.A00(82268);
        this.A04 = 1Bq.A00(68470);
        this.A08 = 1Bq.A00(67709);
    }

    public static final void A00(Context context, MessageAsPageVoiceSwitchToastImplementation messageAsPageVoiceSwitchToastImplementation, final String str, final String str2) {
        LithoView lithoView = new LithoView(context);
        final MigColorScheme A00 = 5zD.A00(messageAsPageVoiceSwitchToastImplementation.A09.BFT());
        lithoView.A0x(new 1LH(A00, str, str2) { // from class: X.8Xh
            public final MigColorScheme A00;
            public final String A01;
            public final String A02;

            {
                11T.A0F(str, 2);
                this.A00 = A00;
                this.A01 = str;
                this.A02 = str2;
            }

            public 1LI A0s(C2k5 c2k5) {
                C2fc c2fc;
                Uri A03;
                boolean A1W = 7zL.A1W(c2k5);
                long doubleToRawLongBits = Double.doubleToRawLongBits(66.0d);
                Integer num = 0S2.A01;
                2lO A0K = 4YV.A0K((2lO) null, num, doubleToRawLongBits);
                C2sn A0L = 7zR.A0L(c2k5);
                1Iw r0 = A0L.A00;
                8Tk A002 = C8mn.A00(r0);
                A002.A10(100.0f);
                C8mn c8mn = A002.A01;
                c8mn.A08 = 7zL.A04(A002, 0.0f);
                MigColorScheme migColorScheme = this.A00;
                8Tk.A07(A002, migColorScheme);
                c8mn.A03 = migColorScheme.BDl();
                c8mn.A07 = 419430400;
                A002.A1C(8.0f);
                A002.A2Y(8.0f);
                A002.A2X(10.0f);
                A002.A0R();
                String str3 = this.A01;
                String str4 = this.A02;
                long A0B = 7zQ.A0B();
                long A0A = 7zP.A0A();
                2lO A0R = 7zT.A0R((2lO) null, A0B, A0A);
                C1ro c1ro = C1ro.CENTER;
                C2sn A0J = 7zS.A0J(A0L);
                int BDl = migColorScheme.BDl();
                Integer num2 = 0S2.A00;
                2lO A02 = C82m.A02(null, 7zL.A0u(num2, 7zL.A0j(BDl), 1), num2, 100.0f, A1W ? 1 : 0);
                C2sn A0K2 = 7zS.A0K(A0J);
                1Iw AeS = A0K2.AeS();
                C2sn A0U = 7zQ.A0U(AeS);
                C2pz A003 = C2px.A00(r0);
                A003.A2X(C2q0.A05);
                A003.A2Y(migColorScheme);
                if (str4 == null) {
                    str4 = "";
                }
                try {
                    A03 = C0A2.A03(str4);
                } catch (SecurityException unused) {
                }
                if (A03 != null) {
                    c2fc = new C2fc();
                    c2fc.A02 = A03;
                    A003.A2Z(c2fc.A00());
                    A003.A0k(0.0f);
                    A003.A2C(C26z.START, 7zL.A02());
                    A0K2.A00(new C1rh(null, c1ro, null, null, 7zL.A16(A003.A2W(), A0U), A1W));
                    0Dc A0P = 7zP.A0P(r0.A0D);
                    TypefaceSpan typefaceSpan = new TypefaceSpan("sans-serif-medium");
                    A0P.A01(2131959560);
                    A0P.A03(str3, "%1$s", new Object[]{typefaceSpan}, A1W ? 1 : 0);
                    SpannableString A0E = 7zM.A0E(A0P);
                    2lO A022 = C82m.A02(null, 7zL.A0i(0S2.A0u, A0A), num, 100.0f, A1W ? 1 : 0);
                    C2sn A0U2 = 7zQ.A0U(AeS);
                    2KD A0f = 7zR.A0f(r0, A0E, A1W);
                    A0f.A2x(migColorScheme);
                    A0f.A0k(0.0f);
                    A0f.A2q(1);
                    A0f.A0R();
                    A0f.A2n();
                    A0f.A2b();
                    7zN.A1Q(A0U2, A0f);
                    7zM.A1Q(A0U2, A0K2, A022);
                    7zM.A1Q(A0K2, A0J, A02);
                    A002.A2e(C2so.A0P(A0J, A0L, A0R));
                    A0L.A00(A002.A2W());
                    return C2so.A0N(A0L, c2k5, A0K);
                }
                c2fc = new C2fc();
                c2fc.A0A = true;
                A003.A2Z(c2fc.A00());
                A003.A0k(0.0f);
                A003.A2C(C26z.START, 7zL.A02());
                A0K2.A00(new C1rh(null, c1ro, null, null, 7zL.A16(A003.A2W(), A0U), A1W));
                0Dc A0P2 = 7zP.A0P(r0.A0D);
                TypefaceSpan typefaceSpan2 = new TypefaceSpan("sans-serif-medium");
                A0P2.A01(2131959560);
                A0P2.A03(str3, "%1$s", new Object[]{typefaceSpan2}, A1W ? 1 : 0);
                SpannableString A0E2 = 7zM.A0E(A0P2);
                2lO A0222 = C82m.A02(null, 7zL.A0i(0S2.A0u, A0A), num, 100.0f, A1W ? 1 : 0);
                C2sn A0U22 = 7zQ.A0U(AeS);
                2KD A0f2 = 7zR.A0f(r0, A0E2, A1W);
                A0f2.A2x(migColorScheme);
                A0f2.A0k(0.0f);
                A0f2.A2q(1);
                A0f2.A0R();
                A0f2.A2n();
                A0f2.A2b();
                7zN.A1Q(A0U22, A0f2);
                7zM.A1Q(A0U22, A0K2, A0222);
                7zM.A1Q(A0K2, A0J, A02);
                A002.A2e(C2so.A0P(A0J, A0L, A0R));
                A0L.A00(A002.A2W());
                return C2so.A0N(A0L, c2k5, A0K);
            }
        });
        C3Q0 c3q0 = (C3Q0) 1Br.A0B(messageAsPageVoiceSwitchToastImplementation.A03);
        KuH kuH = new KuH(1BK.A09(c3q0.A00), c3q0.A01, 0S2.A0C);
        kuH.A04 = lithoView;
        kuH.A01 = MobileConfigSessionlessInit.SYNC_UPDATE_WAIT_TIME_MS;
        kuH.A00 = 2132607204;
        kuH.A02 = new IKb(kuH, 0);
        kuH.A03();
    }
}
