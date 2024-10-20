package com.facebook.cameracore.ardelivery.xplat.connectioninfo;

import X.11T;
import X.1Br;
import X.Fbe;
import X.GCT;
import com.facebook.common.connectionstatus.FbDataConnectionManager;

/* loaded from: XplatDataConnectionManager.class */
public final class XplatDataConnectionManager {
    public final GCT assetManagerDataConnectionManager;

    public XplatDataConnectionManager(GCT gct) {
        11T.A0F(gct, 1);
        this.assetManagerDataConnectionManager = gct;
    }

    public final String getBandwidthConnectionQuality() {
        String name = ((FbDataConnectionManager) 1Br.A0B(((Fbe) this.assetManagerDataConnectionManager).A00)).A03().name();
        11T.A0A(name);
        return name;
    }

    public final String getConnectionName() {
        return ((FbDataConnectionManager) 1Br.A0B(((Fbe) this.assetManagerDataConnectionManager).A00)).A06();
    }
}
