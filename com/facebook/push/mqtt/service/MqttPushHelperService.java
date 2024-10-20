package com.facebook.push.mqtt.service;

import X.0fH;
import X.1BQ;
import X.1Bt;
import X.1Xc;
import X.AbstractC02263un;
import X.C00i;
import android.content.Intent;

/* loaded from: MqttPushHelperService.class */
public class MqttPushHelperService extends AbstractC02263un {
    public final C00i A00;
    public final C00i A01;

    public MqttPushHelperService() {
        super(MqttPushHelperService.class.getSimpleName());
        this.A01 = 1BQ.A02(16713);
        this.A00 = 1BQ.A02(66185);
    }

    @Override // X.AbstractC02263un
    public void A03() {
    }

    @Override // X.AbstractC02263un
    public void A04(Intent intent) {
        0fH.A09(MqttPushHelperService.class, intent, "Received intent=%s");
        ((1Bt) this.A00.get()).A02();
        ((1Xc) this.A01.get()).init();
    }
}
