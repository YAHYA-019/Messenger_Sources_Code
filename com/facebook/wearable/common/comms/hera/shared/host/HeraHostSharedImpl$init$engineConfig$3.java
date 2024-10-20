package com.facebook.wearable.common.comms.hera.shared.host;

import X.C00m;
import X.C00q;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy;

/* loaded from: HeraHostSharedImpl$init$engineConfig$3.class */
public final class HeraHostSharedImpl$init$engineConfig$3 extends C00q implements C00m {
    public final /* synthetic */ HeraHostSharedImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraHostSharedImpl$init$engineConfig$3(HeraHostSharedImpl heraHostSharedImpl) {
        super(0);
        this.this$0 = heraHostSharedImpl;
    }

    @Override // X.C00m
    public final FeatureAudioProxy invoke() {
        return this.this$0.audioProxyImpl;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        return this.this$0.audioProxyImpl;
    }
}
