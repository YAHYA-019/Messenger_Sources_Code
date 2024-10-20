package com.facebook.wearable.common.comms.hera.host.camera;

import X.0fH;
import X.1BK;
import X.C00m;
import X.C00q;
import X.JQ2;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: HeraMessengerLiteCameraCoordinator$configureCameraPipeline$1.class */
public final class HeraMessengerLiteCameraCoordinator$configureCameraPipeline$1 extends C00q implements C00m {
    public final /* synthetic */ JQ2 $previewController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraMessengerLiteCameraCoordinator$configureCameraPipeline$1(JQ2 jq2) {
        super(0);
        this.$previewController = jq2;
    }

    @Override // X.C00m
    public final Boolean invoke() {
        0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "Switch camera to local camera source");
        this.$previewController.enable(true);
        HeraMessengerLiteCameraCoordinator.cameraSourceStateFlow.D5H(1BK.A1G(ConstantsKt.DEVICE_ID_HOST, (Object) null));
        return true;
    }
}
