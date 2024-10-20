package com.facebook.secure.intentswitchoff;

import X.0fH;
import X.1Bi;
import X.AnonymousClass001;
import X.AnonymousClass030;
import X.C02w;
import android.content.Intent;

/* loaded from: FbReceiverSwitchOffDI.class */
public final class FbReceiverSwitchOffDI extends C02w {
    public FbReceiverSwitchOffDI() {
        super((AnonymousClass030) 1Bi.A03(1));
    }

    @Override // X.C02w
    public /* bridge */ /* synthetic */ void A05(Intent intent, Object obj) {
        0fH.A0g(AnonymousClass001.A0Y(obj), "com.facebook.secure.intentswitchoff.FbReceiverSwitchOffDI", "Cancelling (FB) receiver intent because of server-configured switch-off: %s");
    }
}
