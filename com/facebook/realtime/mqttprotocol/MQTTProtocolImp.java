package com.facebook.realtime.mqttprotocol;

import X.0fH;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1ED;
import X.1I7;
import X.1K9;
import X.1Kd;
import X.1P9;
import X.4mA;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C00i;
import X.C0il;
import X.C1lw;
import X.C1m1;
import X.C1me;
import X.C4Om;
import X.C4Xd;
import android.os.RemoteException;
import com.facebook.realtime.mqttprotocol.MQTTProtocolImp;
import com.facebook.realtime.mqttprotocol.PublishCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: MQTTProtocolImp.class */
public class MQTTProtocolImp {
    public static final MQTTProtocolImp $redex_init_class = null;
    public final C00i mExecutorService = new 1BV(16480);
    public final C00i mMqttConnectionConfigManager = new 1BQ(16779);
    public final C00i mConnectionStarter = new 1BQ(49235);
    public final C00i mBRStreamSender = new 1BV(82476);
    public final C00i mMonotonicClock = new 1BQ(84488);
    public final Map mMessageCallback = Collections.synchronizedMap(new HashMap());
    public final Map mConnectionCallback = Collections.synchronizedMap(new HashMap());

    static {
        C0il.A0B("mqttprotocol-jni");
    }

    public String getMqttHostnameForLogging() {
        return ((C1lw) this.mMqttConnectionConfigManager.get()).A05.A0U;
    }

    public void onConnected() {
        Iterator A0y = AnonymousClass001.A0y(Collections.unmodifiableMap(new LinkedHashMap(this.mConnectionCallback)));
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            ((SubscribeCallback) A0z.getValue()).onConnected();
            0fH.A0g(A0z.getKey(), "BladeRunnerMqttJniImp", "MQTT onConnected call back invoked for %s");
        }
    }

    public void publishWithCallback(final String str, byte[] bArr, final PublishCallback publishCallback) {
        if (C1me.A00.contains(str)) {
            0fH.A0g(str, "BladeRunnerMqttJniImp", "Publishing to topic %s");
            final long A09 = 1BL.A09(this.mMonotonicClock);
            ListenableFuture D3C = ((1ED) this.mExecutorService.get()).D3C(new C4Xd(this.mBRStreamSender.get(), bArr, str, 2));
            1Kd.A0D(this.mExecutorService, new 1K9() { // from class: X.4Wb
                public void onFailure(Throwable th) {
                    Object[] objArr;
                    String str2;
                    if ((th instanceof C4Rn) || (th instanceof RemoteException)) {
                        objArr = new Object[]{str};
                        str2 = "Publish on topic %s failed";
                    } else {
                        objArr = new Object[]{str};
                        str2 = "Publish on topic %s failed with unexpected exception";
                    }
                    0fH.A11("BladeRunnerMqttJniImp", str2, th, objArr);
                    PublishCallback publishCallback2 = publishCallback;
                    if (publishCallback2 != null) {
                        publishCallback2.onFailure();
                    }
                }

                public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    0fH.A0g(str, "BladeRunnerMqttJniImp", "Publish successfully ack'd on topic %s");
                    PublishCallback publishCallback2 = publishCallback;
                    if (publishCallback2 != null) {
                        MQTTProtocolImp mQTTProtocolImp = MQTTProtocolImp.this;
                        MQTTProtocolImp mQTTProtocolImp2 = MQTTProtocolImp.$redex_init_class;
                        publishCallback2.onSuccess(1BL.A09(mQTTProtocolImp.mMonotonicClock) - A09);
                    }
                }
            }, D3C);
        }
    }

    public void subscribe(String str, SubscribeCallback subscribeCallback) {
        if (C1me.A01.contains(str)) {
            this.mMessageCallback.put(str, subscribeCallback);
        }
    }

    public void subscribeToStateChange(String str, SubscribeCallback subscribeCallback) {
        if (!C1me.A01.contains(str)) {
            0fH.A17("BladeRunnerMqttJniImp", "MQTT subscribeToStateChange topic %s not supported", new Object[]{str});
            return;
        }
        this.mConnectionCallback.put(str, subscribeCallback);
        4mA r0 = (4mA) this.mConnectionStarter.get();
        synchronized (r0.A04) {
            if (!r0.A01) {
                0fH.A0j("BladeRunnerMqttJniImp", "Adding action reciever for mqtt state changes");
                1P9 r02 = new 1P9((1I7) r0.A03.get());
                r02.A05(new C4Om(r0, this, 4), AnonymousClass000.A00(17));
                r02.A02().A00();
                r0.A01 = true;
            }
        }
        if (((C1m1) r0.A02.get()).A03()) {
            onConnected();
        }
        0fH.A0g(str, "BladeRunnerMqttJniImp", "MQTT subscribeToStateChange for %s");
    }

    public void unsubscribe(String str) {
        if (C1me.A01.contains(str)) {
            this.mMessageCallback.remove(str);
        }
    }

    public void unsubscribeToStateChange(String str) {
        if (C1me.A01.contains(str)) {
            this.mConnectionCallback.remove(str);
        } else {
            0fH.A17("BladeRunnerMqttJniImp", "MQTT unsubscribeToStateChange topic %s not supported", new Object[]{str});
        }
    }
}
