package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.communitymessaging.model.GenAIChatSuggestion;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8bm, reason: invalid class name */
/* loaded from: 8bm.class */
public final class C8bm extends 1LH {
    public final int A00;
    public final GenAIChatSuggestion A01;
    public final C4Z A02;
    public final MigColorScheme A03;
    public final String A04;
    public final boolean A05;

    public C8bm(GenAIChatSuggestion genAIChatSuggestion, C4Z c4z, MigColorScheme migColorScheme, String str, int i, boolean z) {
        11T.A0F(str, 2);
        this.A01 = genAIChatSuggestion;
        this.A04 = str;
        this.A00 = i;
        this.A05 = z;
        this.A03 = migColorScheme;
        this.A02 = c4z;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Context context = r0.A0D;
        2fZ r02 = (2fZ) 1Lm.A05(context, 1Fw.A01(context), 17067);
        C1ro c1ro = C1ro.CENTER;
        C1rp c1rp = C1rp.SPACE_BETWEEN;
        2lQ r03 = 2lO.A02;
        2RH r04 = 2RH.A03;
        2lO A0L = 4YV.A0L(4YV.A0L(4YV.A0K((2lO) null, 0S2.A04, 4YV.A06(r04)), 0S2.A1G, new DD3(this, 40), 1), 0S2.A03, new DD3(this, 41), 1);
        C2sn A0U = 7zQ.A0U(r0);
        C2sn A0K = 7zS.A0K(A0U);
        1Iw AeS = A0K.AeS();
        C2pz A00 = C2px.A00(AeS);
        A00.A2X(C2q0.A08);
        GenAIChatSuggestion genAIChatSuggestion = this.A01;
        String str = genAIChatSuggestion.A05;
        if (str == null) {
            str = "";
        }
        Uri uri = null;
        try {
            uri = C0A2.A03(str);
        } catch (SecurityException unused) {
        }
        A00.A2Z(r02.A0B(uri, C2fd.A0T));
        A00.A0F("android.view.View");
        MigColorScheme migColorScheme = this.A03;
        A00.A2Y(migColorScheme);
        A00.A01.A06 = C2py.ROUND_RECT;
        7zO.A1I(A00, 2RH.A05);
        7zO.A1L(A00, r04);
        A00.A0k(0.0f);
        A0K.A00(A00.A2W());
        C2p8 c2p8 = C2p6.A00;
        2lO A0S = 7zR.A0S((2lO) null, c1ro, 0);
        C2sn A0U2 = 7zQ.A0U(AeS);
        2KD A0r = 7zL.A0r(A0U2, 0);
        A0r.A32(true);
        A0r.A2z(genAIChatSuggestion.A06);
        A0r.A2y(c2p8.A05);
        7zU.A1R(c2p8.A01, migColorScheme, A0r, 1);
        A0r.A1m(7zO.A0U(new AR7(A0U2, this, 16)));
        7zS.A1O(A0U2, A0K, A0S, A0r);
        A0U.A00(C2so.A0G(A0K, A0U));
        2lO A0X = 7zQ.A0X((2lO) null, 0S2.A0C, 0.0f);
        C2sn A0J = 7zS.A0J(A0U);
        5fH A002 = 5fG.A00(A0J.A00);
        int i = 2131957222;
        if (this.A05) {
            i = 2131957221;
        }
        A002.A2Z(3yH.A09(A0J, i));
        A002.A2Y(migColorScheme);
        A002.A01.A02 = new CZD(this, 61);
        7zQ.A1E(A002.A2W(), A0J, A0U, A0X);
        return C2so.A0T(A0U, c2k5, A0L, c1ro, c1ro, c1rp);
    }
}
