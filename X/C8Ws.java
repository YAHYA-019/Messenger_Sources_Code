package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8Ws, reason: invalid class name */
/* loaded from: 8Ws.class */
public final class C8Ws extends 1LH {
    public final 8LD A00;
    public final MigColorScheme A01;
    public final C00m A02;

    public C8Ws(8LD r302, MigColorScheme migColorScheme, C00m c00m) {
        1BL.A1F(migColorScheme, r302);
        this.A01 = migColorScheme;
        this.A00 = r302;
        this.A02 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        1Iw r0 = c2k5.A05;
        Context context = r0.A0D;
        2fZ r02 = (2fZ) 1Lm.A05(context, 1Fw.A01(context), 17067);
        2lQ r03 = 2lO.A02;
        2RH r04 = 2RH.A03;
        2lO A0L = 4YV.A0L(4YV.A0K((2lO) null, 0S2.A04, 4YV.A06(r04)), 0S2.A1G, new DD4(this, 40), 1);
        C2sn A0U = 7zQ.A0U(r0);
        1Iw AeS = A0U.AeS();
        C2pz A00 = C2px.A00(AeS);
        A00.A2X(C2q0.A08);
        C1zm c1zm = new C1zm();
        8LD r05 = this.A00;
        c1zm.A03(ThreadKey.A03(r05.A05));
        String str = r05.A09;
        c1zm.A20 = str;
        Uri uri = null;
        try {
            uri = C0A2.A03(r05.A08);
        } catch (SecurityException unused) {
        }
        c1zm.A0R = uri;
        Uri uri2 = null;
        try {
            uri2 = C0A2.A03(r05.A0A);
        } catch (SecurityException unused2) {
        }
        c1zm.A0V = uri2;
        c1zm.A0g = 1F9.A0B;
        A00.A2Z(r02.A0F(new ThreadSummary(c1zm), C2fd.A0T, "inbox_subtab", 0, false, true, false));
        A00.A0F("android.view.View");
        C2px c2px = A00.A01;
        c2px.A09 = "SuggestedCommunityThreadComponent";
        MigColorScheme migColorScheme = this.A01;
        A00.A2Y(migColorScheme);
        c2px.A06 = C2py.ROUND_RECT;
        7zO.A1I(A00, 2RH.A05);
        7zO.A1L(A00, r04);
        A00.A0S();
        A0U.A00(A00.A2W());
        C2p8 c2p8 = C2p6.A00;
        C2sn A0U2 = 7zQ.A0U(AeS);
        1Iw r06 = A0U2.A00;
        2KD A01 = 2K3.A01(r06, 0);
        A01.A32(true);
        A01.A2z(str);
        2KE r07 = c2p8.A07;
        A01.A2y(r07);
        C1u7 c1u7 = c2p8.A03;
        7zU.A1R(c1u7, migColorScheme, A01, 1);
        2KD A0d = 7zR.A0d(r06, A0U2, A01, 0);
        A0d.A32(true);
        1Wl r08 = (1Wl) 1Bi.A03(68669);
        1X6 r09 = (1X6) 1Bi.A03(67984);
        int i = 2131966724;
        if (1Wl.A01(r08).AZk(36321795394781986L)) {
            i = 2131963785;
        }
        A0d.A2z(9BB.A00(r05, 0Pz.A0W(" • ", 3yH.A09(A0U2, i)), 0Pz.A0W(" • ", 3yH.A0A(A0U2, Long.valueOf(r05.A01), 2131962314)), r09.A07()));
        A0d.A2y(r07);
        7zU.A1R(c1u7, migColorScheme, A0d, 1);
        7zN.A1Q(A0U2, A0d);
        A0U.A00(new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U2.A01, false));
        return C2so.A0K(A0U, c2k5, A0L);
    }
}
