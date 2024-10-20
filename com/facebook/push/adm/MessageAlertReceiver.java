package com.facebook.push.adm;

import X.0fH;
import X.1uD;
import com.amazon.device.messaging.ADMMessageReceiver;

/* loaded from: MessageAlertReceiver.class */
public class MessageAlertReceiver extends ADMMessageReceiver {
    public static boolean A00;

    static {
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
            A00 = true;
        } catch (ClassNotFoundException e) {
            0fH.A0H(MessageAlertReceiver.class, "ADMMessageHandlerJobBase is not available. Need to fall back to legacy implementation", e);
        }
    }

    public MessageAlertReceiver() {
        super(ADMBroadcastReceiver.class);
        if (A00) {
            registerJobServiceClass(ADMBroadcastReceiverJobBase.class, 8734);
        }
        1uD.A02();
    }
}
