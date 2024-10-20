package X;

import java.util.List;

/* loaded from: Dxr.class */
public final class Dxr extends C1rj {
    public GFE A00;
    public FyG A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public Dxr() {
        super("NTContainerComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, Boolean.valueOf(this.A02), Boolean.valueOf(this.A03), Boolean.valueOf(this.A04), null, this.A00};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        E0F A0P = 4YU.A0P(r302);
        FyG fyG = this.A01;
        boolean z = this.A03;
        boolean z2 = this.A04;
        boolean z3 = this.A02;
        List list = A0P.A01;
        A0P.A00.A00 = r302;
        return FI5.A00(r302, fyG, list, z, z2, z3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [X.Fka, java.lang.Object, X.GFF] */
    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        List A03;
        E0F e0f = (E0F) r303;
        Fka fka = null;
        List list = null;
        FyG fyG = this.A01;
        GFE gfe = this.A00;
        try {
            if (fyG == null) {
                0fH.A0k("NTContainerComponentSpec", "bloksContext is null in onCreateInitialState");
                if (gfe != null) {
                    gfe.BM7(AnonymousClass001.A0N("component is PreInitialized but initialTemplateContext is null"), (String) null);
                }
            } else {
                ?? obj = new Object();
                obj.A00 = r302;
                Ezu A032 = FJ3.A03(fyG);
                FxY A02 = FJ3.A02(fyG);
                synchronized (A032.A02) {
                    A02.A00 = obj;
                    A03 = A032.A03();
                }
                list = A03;
                fka = obj;
            }
        } catch (Exception e) {
            if (fyG != null) {
                FAo.A00(fyG, e);
            } else {
                0fH.A0r("NTContainerComponentSpec", "initialTemplateContext is null when trying to handle infra exception", e);
                if (gfe != null) {
                    gfe.BM7(e, (String) null);
                }
            }
        }
        e0f.A00 = fka;
        e0f.A01 = list;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
