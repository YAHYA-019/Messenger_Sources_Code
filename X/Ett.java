package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.business.informationidentify.activity.PIIActivity;

/* loaded from: Ett.class */
public final class Ett {
    public final /* synthetic */ LithoView A00;
    public final /* synthetic */ PIIActivity A01;
    public final /* synthetic */ DYx A02;

    public Ett(LithoView lithoView, PIIActivity pIIActivity, DYx dYx) {
        this.A01 = pIIActivity;
        this.A02 = dYx;
        this.A00 = lithoView;
    }

    public void A00() {
        boolean A1Y = this.A02.A1Y();
        boolean z = false;
        PIIActivity pIIActivity = this.A01;
        if (A1Y) {
            pIIActivity.A0R = true;
        } else {
            pIIActivity.A0R = false;
        }
        LithoView lithoView = this.A00;
        1Iw r0 = pIIActivity.A0A.A09;
        if (pIIActivity.A01 >= pIIActivity.A02 - 1) {
            z = true;
        }
        lithoView.A0x(pIIActivity.A3B(r0, z));
    }
}
