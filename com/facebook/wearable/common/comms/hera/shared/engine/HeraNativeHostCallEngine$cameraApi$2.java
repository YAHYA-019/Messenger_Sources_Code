package com.facebook.wearable.common.comms.hera.shared.engine;

import X.C00m;
import X.C00q;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCamera;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi;

/* loaded from: HeraNativeHostCallEngine$cameraApi$2.class */
public final class HeraNativeHostCallEngine$cameraApi$2 extends C00q implements C00m {
    public final /* synthetic */ HeraNativeHostCallEngine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraNativeHostCallEngine$cameraApi$2(HeraNativeHostCallEngine heraNativeHostCallEngine) {
        super(0);
        this.this$0 = heraNativeHostCallEngine;
    }

    @Override // X.C00m
    public final FeatureCameraApi invoke() {
        return FeatureCamera.CppProxy.createStandardApi(this.this$0.getEngine());
    }
}
