package X;

import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;

/* renamed from: X.8bk, reason: invalid class name */
/* loaded from: 8bk.class */
public final class C8bk extends 1LH {
    public final long A00;
    public final FbUserSession A01;
    public final Bcr A02;
    public final MigColorScheme A03;
    public final ImmutableList A04;
    public final String A05;

    public C8bk(FbUserSession fbUserSession, Bcr bcr, MigColorScheme migColorScheme, ImmutableList immutableList, String str, long j) {
        1BL.A1F(migColorScheme, bcr);
        this.A03 = migColorScheme;
        this.A02 = bcr;
        this.A04 = immutableList;
        this.A00 = j;
        this.A05 = str;
        this.A01 = fbUserSession;
    }

    public 1LI A0s(C2k5 c2k5) {
        C1rh A0I;
        11T.A0F(c2k5, 0);
        ImmutableList immutableList = this.A04;
        if (immutableList == null) {
            2lQ r0 = 2lO.A02;
            MigColorScheme migColorScheme = this.A03;
            2lO A0R = 7zS.A0R(7zT.A0g((2lO) null, 0S2.A00, migColorScheme.BDl()), 1.0f);
            C2sn A0L = 7zR.A0L(c2k5);
            8TA A00 = C8nk.A00(A0L.A00);
            A00.A2Y(migColorScheme);
            A00.A0j(1.0f);
            A00.A2X(48.0f);
            return 7zM.A0l(A00.A2W(), A0L, c2k5, A0R);
        }
        if (immutableList.isEmpty()) {
            C1ro c1ro = C1ro.CENTER;
            2lQ r02 = 2lO.A02;
            MigColorScheme migColorScheme2 = this.A03;
            int BDl = migColorScheme2.BDl();
            Integer num = 0S2.A00;
            2lO A0W = 7zS.A0W(7zS.A0a((2lO) null, num, BDl), 7zL.A0k(0S2.A01, 1.0f), num, c1ro, 0);
            C2sn A0L2 = 7zR.A0L(c2k5);
            C2sn A0K = 7zS.A0K(A0L2);
            Drawable A08 = 3yH.A08(A0K, 2132411112);
            1Iw r03 = A0K.A00;
            7zV.A0j(A08, r03, A0K);
            2KD A0X = 7zN.A0X(r03, migColorScheme2, 0);
            7zP.A1K(A0X, 2131962116);
            A0X.A2a();
            C26z c26z = C26z.ALL;
            A0X.A24(c26z, 16.0f);
            7zN.A1Q(A0K, A0X);
            String str = this.A05;
            if (str != null) {
                2KD A0X2 = 7zN.A0X(r03, migColorScheme2, 0);
                7zQ.A1T(A0X2, str);
                A0X2.A2a();
                A0X2.A24(c26z, 16.0f);
                7zN.A1Q(A0K, A0X2);
            }
            return 7zM.A0o(C2so.A01(A0K), A0L2, c2k5, A0W);
        }
        2lQ r04 = 2lO.A02;
        MigColorScheme migColorScheme3 = this.A03;
        int BDl2 = migColorScheme3.BDl();
        Integer num2 = 0S2.A00;
        2lO A0R2 = 7zS.A0R(7zS.A0a((2lO) null, num2, BDl2), 1.0f);
        long A082 = 7zP.A08();
        1Iw r05 = c2k5.A05;
        Dud A01 = Dzc.A01(r05);
        2lO A0M = 7zT.A0M((2lO) null, 7zM.A01());
        C2sn A0U = 7zQ.A0U(r05);
        1Iw AeS = A0U.AeS();
        C2sn A0U2 = 7zQ.A0U(AeS);
        8TR A002 = C5z5.A00(A0U2.A00);
        A002.A2a(3yH.A09(A0U2, 2131959379));
        A002.A2Z(migColorScheme3);
        A002.A01.A00 = 2;
        7zQ.A1D(A002.A2W(), A0U2, A0U);
        Iterator it = immutableList.iterator();
        while (it.hasNext()) {
            AeZ aeZ = (DEC) it.next();
            if (aeZ instanceof C1791At0) {
                C1791At0 c1791At0 = (C1791At0) aeZ;
                2lO A0L3 = 4YV.A0L((2lO) null, num2, C1ro.FLEX_START, 0);
                C2sn A0U3 = 7zQ.A0U(AeS);
                2KD A0Y = 7zN.A0Y(A0U3.A00, false);
                7zQ.A1V(A0Y, c1791At0.A01);
                A0Y.A2q(1);
                A0Y.A2x(migColorScheme3);
                A0Y.A17(16.0f);
                7zN.A1Q(A0U3, A0Y);
                A0I = C2so.A0I(A0U3, A0U, A0L3);
            } else if (aeZ instanceof AeZ) {
                ThreadSummary threadSummary = aeZ.A00;
                long A0r = threadSummary.A0n.A0r();
                boolean A1O = AnonymousClass001.A1O((A0r > this.A00 ? 1 : (A0r == this.A00 ? 0 : -1)));
                2fZ r06 = (2fZ) 7zP.A0h(this.A01, AeS, 17067);
                2lO A0R3 = 7zR.A0R((2lO) null, new AR7(threadSummary, this, 5), 1);
                C2sn A0U4 = 7zQ.A0U(AeS);
                1Iw r07 = A0U4.A00;
                DuY A003 = Dyo.A00(r07);
                A003.A2X(migColorScheme3);
                A003.A2Y(A1O);
                7zR.A1A(A003, new AR7(threadSummary, this, 6));
                A0U4.A00(A003.A2W());
                55N A004 = 55M.A00(r07);
                AnonymousClass557 A0p = 7zL.A0p();
                A0p.A00 = A0r;
                A0p.A0C = true;
                A0p.A08(threadSummary.A20);
                A0p.A05(migColorScheme3);
                LightColorScheme.A00();
                C2q1 c2q1 = C2q0.A07;
                c2q1.getClass();
                A0p.A05 = 55C.A02(c2q1, migColorScheme3, r06.A0E(threadSummary, 0, false, false));
                7zU.A1I(A0U4, A0p.A00(), A004);
                A0I = C2so.A0I(A0U4, A0U, A0R3);
            }
            A0U.A00(A0I);
        }
        A01.A2c(C2so.A02(A0U, c2k5, A0M));
        c2k5.B7k();
        7zV.A12(A01, false);
        7zU.A1M(A01, c2k5.B7k(), A082, false);
        A01.A2d(null);
        C5z7.A00(A01, A0R2);
        Dzc A2V = A01.A2V();
        11T.A0D(A2V);
        return A2V;
    }
}
