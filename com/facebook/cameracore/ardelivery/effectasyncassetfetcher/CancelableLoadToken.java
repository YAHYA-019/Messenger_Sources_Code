package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.GEI;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;

/* loaded from: CancelableLoadToken.class */
public class CancelableLoadToken implements CancelableToken {
    public GEI mLoadToken;

    public CancelableLoadToken(GEI gei) {
        this.mLoadToken = gei;
    }

    @Override // com.facebook.cameracore.ardelivery.listener.CancelableToken
    public boolean cancel() {
        GEI gei = this.mLoadToken;
        if (gei != null) {
            return gei.cancel();
        }
        return false;
    }
}
