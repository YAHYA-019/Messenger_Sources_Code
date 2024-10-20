package X;

import com.facebook.mqtt.service.MqttPublishListener;

/* renamed from: X.1uJ, reason: invalid class name */
/* loaded from: 1uJ.class */
public final class C1uJ extends C00q implements C00m {
    public final /* synthetic */ boolean $isInForeground;
    public final /* synthetic */ MqttPublishListener $listener;
    public final /* synthetic */ byte[] $notifyPayload;
    public final /* synthetic */ 1nT this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1uJ(1nT r302, MqttPublishListener mqttPublishListener, byte[] bArr, boolean z) {
        super(0);
        this.this$0 = r302;
        this.$isInForeground = z;
        this.$notifyPayload = bArr;
        this.$listener = mqttPublishListener;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        1nK r0 = this.this$0.A0C;
        if (r0 != null) {
            r0.setForeground(this.$isInForeground, this.$notifyPayload, this.$listener);
        }
        return 04S.A00;
    }
}
