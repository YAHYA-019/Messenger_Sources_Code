package X;

import com.facebook.mqtt.service.MqttPublishListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.4Eh, reason: invalid class name */
/* loaded from: 4Eh.class */
public final class C4Eh implements MqttPublishListener {
    public final int A01;
    public final C1nm A02;
    public final String A03;
    public final byte[] A05;
    public final MqttPublishListener A06;
    public final /* synthetic */ C1lj A07;
    public final AtomicBoolean A04 = new AtomicBoolean(false);
    public AtomicBoolean A00 = new AtomicBoolean(false);

    public C4Eh(MqttPublishListener mqttPublishListener, C1lj c1lj, C1nm c1nm, String str, byte[] bArr, int i) {
        this.A07 = c1lj;
        this.A03 = str;
        this.A05 = bArr;
        this.A02 = c1nm;
        this.A06 = mqttPublishListener;
        this.A01 = i;
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public void onFailure(int i, int i2) {
        MqttPublishListener mqttPublishListener;
        if (!this.A04.compareAndSet(false, true) || (mqttPublishListener = this.A06) == null) {
            return;
        }
        mqttPublishListener.onFailure(this.A01, i2);
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public void onSuccess(int i) {
        MqttPublishListener mqttPublishListener;
        if (!this.A04.compareAndSet(false, true) || (mqttPublishListener = this.A06) == null) {
            return;
        }
        mqttPublishListener.onSuccess(this.A01);
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public void onTimeout(int i, boolean z) {
        MqttPublishListener mqttPublishListener;
        if (!this.A04.compareAndSet(false, true) || (mqttPublishListener = this.A06) == null) {
            return;
        }
        mqttPublishListener.onTimeout(this.A01, z);
    }
}
