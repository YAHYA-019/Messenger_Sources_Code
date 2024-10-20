package X;

import com.facebook.distribgw.client.di.AppStateSyncerProvider;
import com.facebook.realtime.common.network.NetworkDetailedStateGetter;
import com.facebook.realtime.common.streamid.RSStreamIdProvider;
import com.facebook.realtime.mqttprotocol.MQTTProtocolImp;
import com.facebook.realtime.requeststream.E2ELogging;
import com.facebook.realtime.requeststream.RequestStreamClient;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: Gv8.class */
public final class Gv8 extends RequestStreamClient {
    public Gv8() {
        super((MQTTProtocolImp) 1Bi.A03(32806), (ScheduledExecutorService) 1Bn.A0A(16452), ((AppStateSyncerProvider) 1Bi.A03(16743)).A05, ((AppStateSyncerProvider) 1Bi.A03(16743)).A06, (NetworkDetailedStateGetter) 1Bi.A03(115274), (RSStreamIdProvider) 1Bi.A03(115442), (Hrh) 1Bn.A0A(115435), GOp.A0j(), (E2ELogging) 1Lo.A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), 115239), new 1MV(1Fw.A04((1EZ) 1Bn.A0A(16428)), 82371));
    }
}
