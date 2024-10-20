package com.facebook.advancedcryptotransport.api.impl.service;

import X.C6M;
import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: AdvancedCryptoTransportDefaultNotificationServiceLauncher$launchService$1$receiver$1.class */
public final class AdvancedCryptoTransportDefaultNotificationServiceLauncher$launchService$1$receiver$1 extends ResultReceiver {
    public final /* synthetic */ C6M A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedCryptoTransportDefaultNotificationServiceLauncher$launchService$1$receiver$1(C6M c6m) {
        super(null);
        this.A00 = c6m;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (i != 1 || bundle == null) {
            return;
        }
        this.A00.A0A.A0o("reason", bundle.getString("reason"));
    }
}
