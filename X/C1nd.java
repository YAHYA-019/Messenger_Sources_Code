package X;

import com.facebook.common.dextricks.DexStore;
import com.facebook.mqtt.service.ConnectionConfig;

/* renamed from: X.1nd, reason: invalid class name */
/* loaded from: 1nd.class */
public final class C1nd implements Runnable {
    public static final String __redex_internal_original_name = "DozeAwareClientWrapper$isOnline$1$1";
    public final /* synthetic */ 1nT A00;
    public final /* synthetic */ boolean A01;

    public C1nd(1nT r302, boolean z) {
        this.A01 = z;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        boolean z = this.A01;
        1nT r0 = this.A00;
        ConnectionConfig connectionConfig = r0.A01;
        if (z) {
            if (connectionConfig != null) {
                if (connectionConfig.initialNetworkState != 1) {
                    connectionConfig.initialNetworkState = 1;
                    i = 45;
                    1nT.A01(r0, new C2xn(r0, i));
                    return;
                }
                0fH.A0m("MqttDozeAwareClientWrapper", "No change in network connectivity");
                return;
            }
            11T.A0L(DexStore.CONFIG_FILENAME);
            throw 0Q8.createAndThrow();
        }
        if (connectionConfig != null) {
            if (connectionConfig.initialNetworkState != 2) {
                connectionConfig.initialNetworkState = 2;
                i = 46;
                1nT.A01(r0, new C2xn(r0, i));
                return;
            }
            0fH.A0m("MqttDozeAwareClientWrapper", "No change in network connectivity");
            return;
        }
        11T.A0L(DexStore.CONFIG_FILENAME);
        throw 0Q8.createAndThrow();
    }
}
