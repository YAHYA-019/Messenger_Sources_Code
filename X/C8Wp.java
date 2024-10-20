package X;

import com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel.CommunityTemplate;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8Wp, reason: invalid class name */
/* loaded from: 8Wp.class */
public final class C8Wp extends 1LH {
    public final CommunityTemplate A00;
    public final C1569Alo A01;
    public final MigColorScheme A02;

    public C8Wp(CommunityTemplate communityTemplate, C1569Alo c1569Alo, MigColorScheme migColorScheme) {
        7zR.A1O(migColorScheme, c1569Alo);
        this.A00 = communityTemplate;
        this.A02 = migColorScheme;
        this.A01 = c1569Alo;
    }

    public 1LI A0s(C2k5 c2k5) {
        boolean A1W = 7zL.A1W(c2k5);
        2lO A0g = 7zL.A0g((2lO) null, 7zR.A0k(new DD3(this, 16)));
        C2sn A0L = 7zR.A0L(c2k5);
        1Iw AeS = A0L.AeS();
        8Tk A00 = C8mn.A00(AeS);
        MigColorScheme migColorScheme = this.A02;
        int Abp = migColorScheme.Abp();
        C8mn c8mn = A00.A01;
        c8mn.A03 = Abp;
        C1ro c1ro = C1ro.CENTER;
        C2sn A0U = 7zQ.A0U(AeS);
        2lO A0X = 7zQ.A0X((2lO) null, 0S2.A0C, 0.0f);
        Integer num = 0S2.A00;
        2lO A0L2 = 4YV.A0L(A0X, num, c1ro, A1W ? 1 : 0);
        1Iw r0 = A0U.A00;
        C2sn A0U2 = 7zQ.A0U(r0);
        1Iw r02 = A0U2.A00;
        C1u2 A0I = 4YV.A0I();
        CommunityTemplate communityTemplate = this.A00;
        C2cq A0u = 7zM.A0u(A0I.A08(communityTemplate.A01, communityTemplate.A00), r02, A1W ? 1 : 0);
        A0u.A1W(2132279333);
        A0u.A1M(2132279333);
        C26z c26z = C26z.START;
        A0u.A21(c26z);
        C26z c26z2 = C26z.END;
        A0u.A22(c26z2);
        A0u.A2B(C26z.VERTICAL, 2132279311);
        7zQ.A1E(A0u.A2W(), A0U2, A0U, A0L2);
        2lO A0W = 7zS.A0W((2lO) null, 7zL.A0k(0S2.A01, 1.0f), num, c1ro, A1W ? 1 : 0);
        C2sn A0U3 = 7zQ.A0U(r0);
        1Iw r03 = A0U3.A00;
        2KD A01 = 2K3.A01(r03, A1W ? 1 : 0);
        7zQ.A1V(A01, communityTemplate.A04);
        7zQ.A1K(A0U3, migColorScheme, A01);
        2KD A012 = 2K3.A01(r03, A1W ? 1 : 0);
        7zQ.A1S(A012, communityTemplate.A03);
        A012.A2x(migColorScheme);
        7zS.A1O(A0U3, A0U, A0W, A012);
        A00.A2e(new C1rh(c1ro, c1ro, null, null, A0U.A01, A1W));
        A00.A21(c26z);
        A00.A21(c26z2);
        A00.A1Y(2132279309);
        A00.A2b(2132279314);
        A00.A01.A01 = 7zL.A05(A00, 2132279305);
        c8mn.A07 = migColorScheme.AYv();
        8Tk.A07(A00, migColorScheme);
        A00.A2c(migColorScheme.BDl());
        return 7zM.A0l(A00.A2W(), A0L, c2k5, A0g);
    }
}
