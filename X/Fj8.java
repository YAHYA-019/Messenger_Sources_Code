package X;

import android.content.Context;
import com.facebook.messaging.business.common.calltoaction.CallToActionContextParams;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;

/* loaded from: Fj8.class */
public final class Fj8 implements DGe {
    @Override // X.DGe
    public C4Nc Aav() {
        return C4Nc.A0J;
    }

    @Override // X.DGe
    public boolean BLp(Context context, CallToActionContextParams callToActionContextParams, CallToAction callToAction) {
        boolean z = true;
        11T.A0F(callToAction, 1);
        if (callToAction.A04 == null) {
            z = false;
        }
        return z;
    }
}
