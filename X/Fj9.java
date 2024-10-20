package X;

import android.content.Context;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;

/* loaded from: Fj9.class */
public final class Fj9 implements DGe {
    public final Context A00;
    public final C15h A01;

    public Fj9() {
        Context A0J = 7zP.A0J();
        G7K A01 = G7K.A01(this, 58);
        this.A00 = A0J;
        this.A01 = A01;
    }

    @Override // X.DGe
    public C4Nc Aav() {
        return C4Nc.A04;
    }

    @Override // X.DGe
    public boolean BLp(Context context, CallToActionContextParams callToActionContextParams, CallToAction callToAction) {
        5TL r0 = (5TL) this.A01.get();
        ExU exU = new ExU();
        exU.A00(this.A00);
        exU.A01(EPO.A0N);
        r0.A0C(new F6w(exU));
        return true;
    }
}
