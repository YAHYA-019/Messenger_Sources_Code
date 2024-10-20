package com.facebook.mqtt.service;

import X.05P;
import X.0fH;
import X.AnonymousClass001;
import X.C0qy;

/* loaded from: MqttServiceV2.class */
public final class MqttServiceV2 extends 05P {
    public final String A00;

    public MqttServiceV2() {
        String str;
        if (C0qy.A07 != null) {
            str = "com.facebook.push.mqtt.service.xplat.MqttXplatServiceDelegate";
        } else {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("No xplat service delegate for ");
            A0k.append((Object) null);
            0fH.A0k("MqttServiceV2", AnonymousClass001.A0d(". Mqtt will not run without a delegate", A0k));
            str = "com.facebook.mqtt.service.NoOpDelegate";
        }
        this.A00 = str;
    }

    public String A01() {
        return this.A00;
    }
}
