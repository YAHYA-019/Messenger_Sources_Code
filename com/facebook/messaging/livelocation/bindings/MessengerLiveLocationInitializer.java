package com.facebook.messaging.livelocation.bindings;

import X.0FI;
import X.0Fc;
import X.0fH;
import X.1Xc;
import X.C00i;
import android.content.Context;
import android.content.Intent;
import com.facebook.inject.FbInjector;

/* loaded from: MessengerLiveLocationInitializer.class */
public final class MessengerLiveLocationInitializer implements 1Xc {
    public final C00i A00 = FbInjector.A00;

    public void A00() {
        C00i c00i = this.A00;
        Intent intent = new Intent((Context) c00i.get(), (Class<?>) MessengerLiveLocationInitializer.class);
        intent.setAction("MAYBE_START_LIVE_LOCATION_SHARING_INTENT_ACTION");
        0Fc.A00((Context) c00i.get(), intent, MessengerLiveLocationBooterService.class);
    }

    public String BB2() {
        return "MessengerLiveLocationInitializer";
    }

    public void init() {
        int A03 = 0FI.A03(458481991);
        0fH.A0A(MessengerLiveLocationInitializer.class, "init");
        A00();
        0FI.A09(-1241449463, A03);
    }
}
