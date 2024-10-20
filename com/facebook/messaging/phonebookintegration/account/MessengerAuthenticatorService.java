package com.facebook.messaging.phonebookintegration.account;

import X.0FI;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.C2rm;
import X.DMD;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: MessengerAuthenticatorService.class */
public final class MessengerAuthenticatorService extends C2rm {
    public DMD A00;

    public IBinder A10(Intent intent) {
        11T.A0F(intent, 0);
        if (!"android.accounts.AccountAuthenticator".equals(intent.getAction())) {
            0fH.A0h(intent, "messenger_account", "Bound with unknown intent: %s");
            return null;
        }
        DMD dmd = this.A00;
        if (dmd != null) {
            return dmd.getIBinder();
        }
        throw 1BK.A0h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C2rm
    public void A12() {
        int A04 = 0FI.A04(1973936627);
        this.A00 = (DMD) 1Bn.A0E(this, (1BY) null, 100235);
        0FI.A0A(896284138, A04);
    }
}
