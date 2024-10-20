package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.ArrayList;

/* renamed from: X.Ay0, reason: case insensitive filesystem */
/* loaded from: Ay0.class */
public final class C1971Ay0 extends 1LH {
    public static final int A05 = 7zL.A02();
    public final FbUserSession A00;
    public final ThreadSummary A01;
    public final MigColorScheme A02;
    public final C5xv A03;
    public final String A04;

    public C1971Ay0(FbUserSession fbUserSession, ThreadSummary threadSummary, MigColorScheme migColorScheme, C5xv c5xv, String str) {
        this.A00 = fbUserSession;
        this.A01 = threadSummary;
        this.A03 = c5xv;
        this.A04 = str;
        this.A02 = migColorScheme;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C2fr A0N = ((2fZ) 1Lm.A05(3vP.A00(c2k5), this.A00, 17067)).A0N(this.A01);
        C83r A00 = C5yy.A00(c2k5.A05);
        C5yy c5yy = A00.A01;
        c5yy.A0H = false;
        MigColorScheme migColorScheme = this.A02;
        A00.A2Y(migColorScheme);
        11T.A0D(A0N);
        String str = this.A04;
        C1ro c1ro = C1ro.CENTER;
        1Iw AeS = c2k5.AeS();
        ArrayList A0s = AnonymousClass001.A0s();
        11T.A0F(AeS, 1);
        C2pz A002 = C2px.A00(AeS);
        A002.A2Y(migColorScheme);
        A002.A2X(C2q0.A05);
        A002.A2Z(A0N);
        A0s.add(A002.A2W());
        2KD A13 = 7zM.A13(AeS, str, 0);
        A13.A2x(migColorScheme);
        A13.A32(true);
        A13.A11(A05);
        A13.A2h();
        A13.A2b();
        A0s.add(A13.A2W());
        A00.A2X(new C1rh(null, c1ro, null, null, A0s, false));
        A00.A2Z(this.A03);
        c5yy.A08 = 2MG.A03;
        c5yy.A0E = true;
        return A00.A2V();
    }
}
