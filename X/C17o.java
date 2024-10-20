package X;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.rti.mqtt.manager.MqttBackgroundServiceDelegate;

/* renamed from: X.17o, reason: invalid class name */
/* loaded from: 17o.class */
public class C17o extends Handler {
    public volatile boolean A00;
    public final /* synthetic */ MqttBackgroundServiceDelegate A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17o(Looper looper, MqttBackgroundServiceDelegate mqttBackgroundServiceDelegate) {
        super(looper);
        this.A01 = mqttBackgroundServiceDelegate;
    }

    public void A00() {
        if (sendMessage(obtainMessage(3))) {
            synchronized (this) {
                while (!this.A00) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public void A01() {
        sendMessage(obtainMessage(1));
    }

    public void A02(int i, int i2, Intent intent) {
        sendMessage(obtainMessage(2, i, i2, intent));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        0fH.A0g(message, "MqttBackgroundService", "handleMessage %s");
        if (message == null) {
            throw AnonymousClass001.A0N("Message is null");
        }
        int i = message.what;
        if (i == 1) {
            this.A01.A0M();
            return;
        }
        if (i == 2) {
            if (this.A00) {
                return;
            }
            this.A01.A0P(message.arg1, message.arg2, (Intent) message.obj);
            return;
        }
        if (i != 3) {
            throw AnonymousClass001.A0N("Unsupported message");
        }
        this.A01.A0N();
        synchronized (this) {
            this.A00 = true;
            notifyAll();
        }
    }
}
