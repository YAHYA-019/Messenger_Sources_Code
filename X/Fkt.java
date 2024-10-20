package X;

import com.facebook.pando.PandoError;
import com.facebook.pando.Summary;
import java.lang.ref.WeakReference;

/* loaded from: Fkt.class */
public final class Fkt implements GI4 {
    public final String A00;
    public final WeakReference A01;

    public Fkt(FxZ fxZ, String str) {
        this.A01 = 7zL.A14(fxZ);
        this.A00 = str;
    }

    @Override // X.GI4
    public void BwM(PandoError pandoError) {
    }

    @Override // X.GI4
    public /* bridge */ /* synthetic */ void CSa(Summary summary, Object obj) {
        FxZ fxZ = (FxZ) this.A01.get();
        if (fxZ != null) {
            FxZ.A05(new G4k(fxZ, obj, this.A00));
        }
    }
}
