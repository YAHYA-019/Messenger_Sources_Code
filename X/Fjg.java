package X;

import android.content.Context;
import com.facebook.drawee.fbpipeline.FbDraweeView;

/* loaded from: Fjg.class */
public final class Fjg implements C69a {
    public final FbDraweeView A00;

    public Fjg(FbDraweeView fbDraweeView) {
        this.A00 = fbDraweeView;
    }

    @Override // X.C69a
    public C69f Ap5() {
        C69f c69f = this.A00.A00.A00;
        c69f.getClass();
        return c69f;
    }

    @Override // X.C69a
    public boolean BN3() {
        return AnonymousClass001.A1T(this.A00.A00.A00);
    }

    @Override // X.C69a
    public void ChV() {
        this.A00.A06(null);
    }

    @Override // X.C69a
    public void CnT(C69w c69w) {
        this.A00.A06(c69w);
    }

    @Override // X.C69a
    public void CpU(C69f c69f) {
        this.A00.A05(c69f);
    }

    @Override // X.C69a
    public Context getContext() {
        return this.A00.getContext();
    }
}
