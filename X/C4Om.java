package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.omnistore.mqtt.ConnectionStarter;
import com.facebook.realtime.mqttprotocol.MQTTProtocolImp;
import com.facebook.realtime.mqttprotocol.SubscribeCallback;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.4Om, reason: invalid class name */
/* loaded from: 4Om.class */
public final class C4Om implements C02l {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C4Om(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    @Override // X.C02l
    public void CFb(Context context, Intent intent, C01q c01q) {
        int A00;
        int i;
        switch (this.A00) {
            case 0:
                A00 = C09o.A00(2023176779);
                if (((C4Ep) this.A01).A00.A0M()) {
                    ((Runnable) this.A02).run();
                }
                i = -66137933;
                break;
            case 1:
                A00 = C09o.A00(1894044558);
                11T.A0F(intent, 1);
                if (11T.A0O(1F9.A0Q.dbName, intent.getStringExtra("folder_name"))) {
                    C4Mm.A01((FbUserSession) this.A01, (C4Mm) this.A02);
                }
                i = 1434414839;
                break;
            case 2:
                A00 = C09o.A00(1990046769);
                ((ConnectionStarter) this.A01).handleIntent(intent, (InterfaceC01363qv) this.A02);
                i = 999305032;
                break;
            case 3:
                A00 = C09o.A00(-648304428);
                C4Ad c4Ad = (C4Ad) this.A01;
                if (c4Ad.A01.A0M()) {
                    c4Ad.A06((FbUserSession) this.A02, false);
                    c4Ad.A00.A01();
                }
                i = -1812623241;
                break;
            default:
                A00 = C09o.A00(-115984456);
                MQTTProtocolImp mQTTProtocolImp = (MQTTProtocolImp) this.A02;
                int ordinal = C1og.A00(intent.getIntExtra("event", C1og.UNKNOWN.value)).ordinal();
                if (ordinal == 1) {
                    mQTTProtocolImp.onConnected();
                } else if (ordinal == 0) {
                    Iterator A0y = AnonymousClass001.A0y(Collections.unmodifiableMap(new LinkedHashMap(mQTTProtocolImp.mConnectionCallback)));
                    while (A0y.hasNext()) {
                        Map.Entry A0z = AnonymousClass001.A0z(A0y);
                        ((SubscribeCallback) A0z.getValue()).onConnecting();
                        0fH.A0g(A0z.getKey(), "BladeRunnerMqttJniImp", "MQTT onConnecting call back invoked for %s");
                    }
                } else if (ordinal == 2 || ordinal == 3) {
                    Iterator A0y2 = AnonymousClass001.A0y(Collections.unmodifiableMap(new LinkedHashMap(mQTTProtocolImp.mConnectionCallback)));
                    while (A0y2.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(A0y2);
                        ((SubscribeCallback) A0z2.getValue()).onDisconnected();
                        0fH.A0g(A0z2.getKey(), "BladeRunnerMqttJniImp", "MQTT onDisconnected call back invoked for %s");
                    }
                }
                i = 2094875458;
                break;
        }
        C09o.A01(i, A00);
    }
}
