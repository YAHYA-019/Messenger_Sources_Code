package com.facebook.wearable.common.comms.hera.shared.engine;

import X.0Q8;
import com.meta.wearable.comms.calling.hera.engine.consensus.DataListener;

/* loaded from: HeraNativeClientCallEngine$replicaListener$1.class */
public final class HeraNativeClientCallEngine$replicaListener$1 extends DataListener {
    public final /* synthetic */ HeraNativeClientCallEngine this$0;

    public HeraNativeClientCallEngine$replicaListener$1(HeraNativeClientCallEngine heraNativeClientCallEngine) {
        this.this$0 = heraNativeClientCallEngine;
    }

    @Override // com.meta.wearable.comms.calling.hera.engine.consensus.DataListener
    public void onData(byte[] bArr) {
        HeraNativeClientCallEngine.access$getConnection$p(null);
        throw 0Q8.createAndThrow();
    }
}
