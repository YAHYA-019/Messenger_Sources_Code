package X;

import com.facebook.mqttlite.MqttServiceDelegate;
import java.util.List;

/* loaded from: Lpb.class */
public final class Lpb implements Runnable {
    public static final String __redex_internal_original_name = "MqttServiceDelegate$MqttServiceStub$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ MqttServiceDelegate.MqttServiceStub A01;
    public final /* synthetic */ List A02;

    public Lpb(MqttServiceDelegate.MqttServiceStub mqttServiceStub, List list, int i) {
        this.A01 = mqttServiceStub;
        this.A02 = list;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.A02;
        0fH.A0g(list, "MqttService", "subscribe: %s");
        MqttServiceDelegate mqttServiceDelegate = MqttServiceDelegate.this;
        mqttServiceDelegate.A0P(0, 0, 4YU.A0A("Orca.PERSISTENT_KICK"));
        mqttServiceDelegate.A05.A0d(this.A00, list);
    }
}
