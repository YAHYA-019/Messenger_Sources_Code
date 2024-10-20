package com.facebook.rsys.syncedclock.helpers;

import X.4YV;

/* loaded from: RtcCallFetchServerTimePostResult.class */
public class RtcCallFetchServerTimePostResult {
    public final Long clientTimeMs;
    public final Long requestTimeMs;
    public final Long serverTimeMs;

    public RtcCallFetchServerTimePostResult() {
        Long A0j = 4YV.A0j();
        this.serverTimeMs = A0j;
        this.clientTimeMs = A0j;
        this.requestTimeMs = A0j;
    }
}
