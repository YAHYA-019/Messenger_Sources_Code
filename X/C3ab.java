package X;

import com.facebook.mqtt.service.MqttPublishListener;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.3ab, reason: invalid class name */
/* loaded from: 3ab.class */
public final class C3ab implements MqttPublishListener {
    public int A00 = -1;
    public final /* synthetic */ CountDownLatch A01;

    public C3ab(CountDownLatch countDownLatch) {
        this.A01 = countDownLatch;
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public void onFailure(int i, int i2) {
        this.A01.countDown();
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public void onSuccess(int i) {
        this.A00 = i;
        this.A01.countDown();
    }

    @Override // com.facebook.mqtt.service.MqttPublishListener
    public void onTimeout(int i, boolean z) {
        this.A01.countDown();
    }
}
