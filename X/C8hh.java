package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8hh, reason: invalid class name */
/* loaded from: 8hh.class */
public final class C8hh extends 1LH {
    public static final CallerContext A03 = CallerContext.A0B("MdsImmersiveProfileComponent");
    public final C9N1 A00;
    public final 9TG A01;
    public final MigColorScheme A02;

    public C8hh(C9N1 c9n1, 9TG r303, MigColorScheme migColorScheme) {
        11T.A0F(migColorScheme, 1);
        this.A02 = migColorScheme;
        this.A01 = r303;
        this.A00 = c9n1;
    }

    private final 2cL A01(C2k6 c2k6, 95A r303, boolean z) {
        2lQ r0 = 2lO.A02;
        2lO A0g = 7zS.A0g(0S2.A04, 4YV.A06(2RH.A04));
        C2sn A0L = 7zS.A0L(c2k6);
        1Iw AeS = A0L.AeS();
        2KD A01 = 2K3.A01(AeS, 0);
        9TG r02 = this.A01;
        A01.A2z(r02.A03);
        A01.A2y(2KE.A06);
        11T.A0F(r303, 0);
        A01.A2w(z ? C1u7.A0B : r303 == 95A.A03 ? C1u7.A0D : C1u7.A03);
        MigColorScheme migColorScheme = this.A02;
        A01.A2x(migColorScheme);
        A01.A2a();
        if (!z) {
            A01.A2p(20.0f);
            A01.A01.A07 = migColorScheme.Chx(r303 == 95A.A03 ? C1u7.A03 : C1u7.A0D);
        }
        2KD A0d = 7zR.A0d(AeS, A0L, A01, 0);
        A0d.A2z(r02.A02);
        A0d.A2i();
        A0d.A2w(z ? C1u7.A0B : r303 == 95A.A03 ? C1u7.A0D : C1u7.A03);
        A0d.A2x(migColorScheme);
        A0d.A2p(20.0f);
        A0d.A2a();
        if (!z) {
            A0d.A01.A07 = migColorScheme.Chx(r303 == 95A.A03 ? C1u7.A03 : C1u7.A0D);
            4YU.A1N(A0d, 2RH.A07);
        }
        7zN.A1Q(A0L, A0d);
        return C2so.A03(A0L, c2k6, A0g);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x06f2  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, X.7Lm] */
    /* JADX WARN: Type inference failed for: r0v153, types: [X.23P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.7p9] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 1808
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8hh.A0s(X.2k5):X.1LI");
    }
}
