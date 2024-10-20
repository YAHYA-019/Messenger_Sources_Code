package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: Dzg.class */
public final class Dzg extends C1rj {
    public static final F2H A02 = new Object();
    public ThreadKey A00;
    public 9eY A01;

    public Dzg() {
        super("AirbenderStickerKeyboardTabNuxComponent");
    }

    public static final void A00(1Iw r301, ThreadKey threadKey) {
        11T.A0F(r301, 0);
        FHv fHv = (FHv) 1Bn.A0A(99843);
        Context A0A = 7zL.A0A(r301);
        FIl fIl = (FIl) 1Hv.A02(A0A, 99848);
        ((C2j0) 1Bi.A03(17085)).A01(new Object());
        String A01 = F0Y.A01(A0A.getApplicationContext().getPackageName(), 0, false);
        fIl.A04.A00 = 1BK.A0t();
        EqJ A00 = F0Y.A00(A0A, fIl, A01, "create_button");
        A00.A00 = threadKey;
        fHv.A05(A0A, new ExJ(A00));
    }

    public static final void A01(1Iw r301, String str, boolean z) {
        Context A0A = 7zL.A0A(r301);
        ((FIl) 1Hv.A02(A0A, 99848)).A0C(F0Y.A01(A0A.getApplicationContext().getPackageName(), 1, true), str, z);
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        1LI dum;
        EnL enL = 4YU.A0P(r302).A01;
        11T.A0F(enL, 1);
        2yD A0c = DKE.A0c();
        float f = 12.0f;
        if (1BK.A0L(16385).AZk(36321559170073070L)) {
            f = 0.0f;
        }
        float f2 = 14.0f;
        if (1BK.A0L(16385).AZk(36321559170073070L)) {
            f2 = 0.0f;
        }
        Integer num = 1BK.A0L(16385).AZk(36321559170597365L) ? 0S2.A00 : 1BK.A0L(16385).AZk(36321559170073070L) ? 0S2.A01 : null;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A1v(1LI.A05(r302, Dzg.class, "AirbenderStickerKeyboardTabNuxComponent"));
        A01.A1p(1LI.A08(r302, Dzg.class, "AirbenderStickerKeyboardTabNuxComponent"));
        A01.A1H(1Br.A0B(enL.A02) == C0et.A0P ? 7zQ.A0m(enL.A01).BDl() : 2Me.A02.A00(enL.A00));
        A01.A2c();
        A01.A1C(f);
        A01.A1B(f2);
        A01.A0R();
        if (num != null) {
            dum = new Dw6(0S2.A00, num, new J9o(r302, 1), new J9o(r302, 4), new J9o(r302, 5), new J9o(r302, 6));
        } else if (A0c.AZk(72339107670917203L)) {
            CallerContext callerContext = Dw4.A03;
            dum = new Dw4(F0Y.A01(r302.A0D.getApplicationContext().getPackageName(), 0, false), new J9o(r302, 7), G9n.A00);
        } else {
            dum = new Dum(new J9o(r302, 8));
        }
        return 7zL.A0V(A01, dum);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        C1qp A00 = 1sK.A00(c1qp);
        7zO.A1Q(A00, 946709759111584L);
        return A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1932591986:
                C6fH c6fH = 4YU.A0P(r302.A00.A00).A00;
                11T.A0F(c6fH, 1);
                ((67L) 1Bi.A03(115909)).A04(c6fH);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -750597020:
                1Iv r0 = r302.A00;
                A00(r0.A00, ((Dzg) r0.A01).A00);
                return null;
            case 1803022739:
                1Iw r02 = r302.A00.A00;
                C6fH c6fH2 = 4YU.A0P(r02).A00;
                11T.A0F(c6fH2, 1);
                1Bn.A0A(99843);
                Context A0A = 7zL.A0A(r02);
                FHv.A03(A0A, F0Y.A01(A0A.getApplicationContext().getPackageName(), 0, false));
                ((67L) 1Bi.A03(115909)).A05(c6fH2);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E0I e0i = (E0I) r303;
        9eY r0 = this.A01;
        11T.A0F(r302, 0);
        Context A0A = 7zL.A0A(r302);
        1BV A0R = 7zL.A0R(A0A, 364);
        DeC deC = new DeC(r0, 4);
        C1F6 c1f6 = (C1F6) A0R.get();
        Context A01 = FbInjector.A01();
        AbL.A0y(c1f6);
        try {
            EnL enL = new EnL(A0A, AbG.A0H(c1f6));
            1Bn.A0K();
            FbInjector.A04(A01);
            e0i.A00 = deC;
            e0i.A01 = enL;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
