package com.facebook.messenger.intents;

import X.1BK;
import X.1Bi;
import X.6Pl;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: SmsShareIntentHandler.class */
public class SmsShareIntentHandler extends ShareIntentHandler {
    public 6Pl A00;

    @Override // com.facebook.messenger.intents.ShareIntentHandler, com.facebook.base.activity.FbFragmentActivity
    public void A2z(Bundle bundle) {
        super.A2z(bundle);
        this.A00 = (6Pl) 1Bi.A03(50090);
    }

    @Override // com.facebook.messenger.intents.ShareIntentHandler
    public Intent A3B(Intent intent) {
        Intent A3B = super.A3B(intent);
        6Pl r0 = this.A00;
        if (r0 != null) {
            6Pl.A01(r0, 1BK.A0c().build(), "sms_takeover_share_intent_handler");
        }
        return A3B;
    }
}
