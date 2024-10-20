package com.facebook.realtime.requeststream.network;

import X.11T;
import X.1Bq;
import X.1Br;
import X.C06w;
import X.C06z;
import com.facebook.common.connectionstatus.FbDataConnectionManager;
import com.facebook.common.network.FbNetworkManager;

/* loaded from: NetworkDetailedStateGetter.class */
public final class NetworkDetailedStateGetter implements com.facebook.realtime.common.network.NetworkDetailedStateGetter {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(NetworkDetailedStateGetter.class, "fbDataConnectionManager", "getFbDataConnectionManager()Lcom/facebook/common/connectionstatus/FbDataConnectionManager;", 0), new C06w(NetworkDetailedStateGetter.class, "fbNetworkManager", "getFbNetworkManager()Lcom/facebook/common/network/FbNetworkManager;", 0)};
    public final 1Br fbDataConnectionManager$delegate = 1Bq.A00(32888);
    public final 1Br fbNetworkManager$delegate = 1Bq.A00(16687);

    private final FbDataConnectionManager getFbDataConnectionManager() {
        return (FbDataConnectionManager) 1Br.A0B(this.fbDataConnectionManager$delegate);
    }

    private final FbNetworkManager getFbNetworkManager() {
        return (FbNetworkManager) 1Br.A0B(this.fbNetworkManager$delegate);
    }

    @Override // com.facebook.realtime.common.network.NetworkDetailedStateGetter
    public String getNetworkSubType() {
        String A0G = getFbNetworkManager().A0G();
        11T.A0A(A0G);
        return A0G;
    }

    @Override // com.facebook.realtime.common.network.NetworkDetailedStateGetter
    public String getNetworkType() {
        String A0H = getFbNetworkManager().A0H();
        11T.A0A(A0H);
        return A0H;
    }

    @Override // com.facebook.realtime.common.network.NetworkDetailedStateGetter
    public String getSignalStrength() {
        return getFbDataConnectionManager().A05().name();
    }
}
