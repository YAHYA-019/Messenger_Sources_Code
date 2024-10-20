package com.facebook.mqttlite;

import X.05P;
import X.0FI;
import X.0Mj;
import X.0fH;
import X.C08o;
import android.content.Intent;

/* loaded from: MqttService.class */
public class MqttService extends 05P {
    public String A01() {
        return "com.facebook.mqttlite.MqttServiceDelegate";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int i4;
        int A01 = C08o.A01(this, -2102351232);
        int A04 = 0FI.A04(-1774946580);
        super.onStartCommand(intent, i, i2);
        if (0Mj.A01(getApplicationContext())) {
            0fH.A0j("MqttService", "onStartCommand: START_NOT_STICKY");
            i3 = 3;
            0FI.A0A(2077879395, A04);
            i4 = -1045700754;
        } else {
            0fH.A0j("MqttService", "onStartCommand: START_STICKY");
            i3 = 1;
            0FI.A0A(1040487802, A04);
            i4 = 1314168836;
        }
        C08o.A03(i4, A01);
        return i3;
    }
}
