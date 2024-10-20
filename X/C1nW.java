package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.mqtt.service.ConnectionConfig;
import com.facebook.mqtt.service.XplatServiceDelegate;
import com.facebook.push.mqtt.service.xplat.MqttXplatServiceDelegate;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1nW, reason: invalid class name */
/* loaded from: 1nW.class */
public final class C1nW implements C1nX {
    public 1nY A00 = 1nY.A05;
    public boolean A01;
    public final /* synthetic */ XplatServiceDelegate A02;

    public C1nW(XplatServiceDelegate xplatServiceDelegate) {
        this.A02 = xplatServiceDelegate;
    }

    @Override // X.C1nX
    public void Bqo(ConnectionConfig connectionConfig, QpF qpF) {
        11T.A0F(qpF, 0);
        XplatServiceDelegate xplatServiceDelegate = this.A02;
        if (xplatServiceDelegate instanceof MqttXplatServiceDelegate) {
            0fH.A0g(qpF, "MqttXplatServiceDelegate", "Connection error %s");
            09L r0 = (09L) 1Bn.A0A(32829);
            int ordinal = qpF.ordinal();
            if (ordinal == 2) {
                0fH.A0k("MqttXplatServiceDelegate", "Connection hash is not used in xplat native client");
            } else {
                if (ordinal != 3 && ordinal != 1) {
                    if (ordinal == 0 || ordinal == 4) {
                        0fH.A0j("MqttXplatServiceDelegate", "Xplat mqtt will reconnect");
                        return;
                    }
                    return;
                }
                ((C1lv) 1Bi.A03(16778)).A00 = connectionConfig;
                r0.clear();
                Context applicationContext = xplatServiceDelegate.A01.getApplicationContext();
                11T.A0A(applicationContext);
                ((1I7) 1Hv.A02(applicationContext, 65731)).CkS(new Intent("ACTION_MQTT_NO_AUTH"));
            }
            XplatServiceDelegate.A01.A01(new C3fm(xplatServiceDelegate));
        }
    }

    @Override // X.C1nX
    public boolean Bqu(1nY r302) {
        11T.A0F(r302, 0);
        1nY r0 = this.A00;
        this.A00 = r302;
        boolean z = false;
        if (r302 == 1nY.A03) {
            z = true;
        }
        if (z != this.A01) {
            this.A01 = z;
            if (z) {
                0fH.A0j("MqttXplatService", "Signal client connected");
                ReentrantLock reentrantLock = XplatServiceDelegate.A07;
                reentrantLock.lock();
                try {
                    XplatServiceDelegate.A06.signalAll();
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        ConnectionConfig connectionConfig = XplatServiceDelegate.A04.A00;
        if (connectionConfig != null && connectionConfig.improvedStateReportEnabled) {
            1nY r02 = 1nY.A04;
            if (r302 == r02) {
                XplatServiceDelegate xplatServiceDelegate = this.A02;
                Context applicationContext = xplatServiceDelegate.A01.getApplicationContext();
                11T.A0A(applicationContext);
                if (!1mP.A00(applicationContext)) {
                    0fH.A0j("MqttXplatService", "Xplat its trying to connect but there is no network now.Keep reporting state as disconnected to avoid extra app logic to be trigger");
                    xplatServiceDelegate.A0R(1nY.A05);
                    return false;
                }
            }
            if (r302 == 1nY.A05 && r0 == r02) {
                0fH.A0j("MqttXplatService", "MQTT client will reconnect later. Skipping disconnect report to avoid extra cycle of connecting->disconnected->connecting...");
                return false;
            }
        }
        this.A02.A0R(r302);
        return false;
    }

    @Override // X.C1nX
    public void onMessageDropped(String str, byte[] bArr, long j) {
        if (this.A02 instanceof MqttXplatServiceDelegate) {
            0fH.A0h(str, "MqttXplatServiceDelegate", "Received msg on unsubscribed topic. Topic %s should be subscribed!!!");
            ((1nZ) 1Bi.A03(16802)).onData(str, bArr, j);
        }
    }
}
