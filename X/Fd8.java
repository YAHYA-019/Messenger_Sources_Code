package X;

import com.facebook.inject.FbInjector;
import com.facebook.litho.LithoView;
import java.util.regex.Pattern;

/* loaded from: Fd8.class */
public final class Fd8 implements C1cg {
    public RNV A00;
    public final 1BP A01 = FbInjector.A00;
    public volatile EcX A02 = new EcX(04R.A0G());
    public volatile Pattern A03;
    public volatile boolean A04;

    public static final void A00(EcX ecX, Fd8 fd8) {
        fd8.A02 = ecX;
        RNV rnv = fd8.A00;
        if (rnv != null) {
            LithoView lithoView = rnv.A04;
            if (lithoView.A00 != null) {
                lithoView.A0y(new Duu(ecX, rnv.A00));
            }
        }
    }

    private final void A01(C03b c03b) {
        if (this.A04 && 3GB.A00(this.A03, c03b.getMarkerId())) {
            A00(new EcX(04R.A0E(this.A02.A00, 1BK.A1G(Integer.valueOf(c03b.BHz()), new F7y(c03b, false)))), this);
        }
    }

    @Override // X.C1cg
    public void C5a(C03b c03b, String str, String str2) {
        A01(c03b);
    }

    @Override // X.C1cg
    public void C5c(C03b c03b) {
        if (this.A04 && 3GB.A00(this.A03, c03b.getMarkerId())) {
            A00(new EcX(04R.A0E(this.A02.A00, 1BK.A1G(Integer.valueOf(c03b.BHz()), new F7y(c03b, true)))), this);
        }
    }

    @Override // X.C1cg
    public void C5f(AnonymousClass045 anonymousClass045, C03b c03b, String str, int i, long j, boolean z) {
        11T.A0F(c03b, 0);
        A01(c03b);
    }

    @Override // X.C1cg
    public void C5g(C03b c03b) {
        11T.A0F(c03b, 0);
        A01(c03b);
    }

    @Override // X.C1cg
    public void C5h(C03b c03b) {
        A01(c03b);
    }

    @Override // X.C1cg
    public void C5i(C03b c03b) {
        11T.A0F(c03b, 0);
        A01(c03b);
    }

    @Override // X.C1cg
    public void CoT(boolean z) {
        this.A04 = z;
        if (!z) {
            RNV rnv = this.A00;
            if (rnv != null) {
                DKE.A0K(rnv.A01).post(new S75(rnv));
                return;
            }
            return;
        }
        RNV rnv2 = new RNV(7zL.A09(), new EcY(this));
        EcX ecX = this.A02;
        11T.A0F(ecX, 0);
        DKE.A0K(rnv2.A01).post(new SAs(ecX, rnv2));
        this.A00 = rnv2;
    }

    @Override // X.C1cg
    public void CqW(Integer num) {
        11T.A0F(num, 0);
    }

    @Override // X.C1cg
    public void CsN(Pattern pattern) {
        this.A03 = pattern;
    }
}
