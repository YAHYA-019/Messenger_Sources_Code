package com.facebook.wearable.common.comms.hera.host.camera;

import X.03Y;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.C00m;
import X.C00q;
import X.Icj;
import X.JQ2;
import X.JQ3;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHost;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* loaded from: HeraMessengerLiteCameraCoordinator$configureCameraPipeline$2.class */
public final class HeraMessengerLiteCameraCoordinator$configureCameraPipeline$2 extends C00q implements C00m {
    public final /* synthetic */ JQ2 $previewController;
    public final /* synthetic */ JQ3 $surfacePipeComponent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraMessengerLiteCameraCoordinator$configureCameraPipeline$2(JQ2 jq2, JQ3 jq3) {
        super(0);
        this.$previewController = jq2;
        this.$surfacePipeComponent = jq3;
    }

    @Override // X.C00m
    public final Boolean invoke() {
        String str;
        IHeraHost iHeraHost = HeraMessengerLiteCameraCoordinator.heraHost;
        if (iHeraHost != null) {
            IHeraCallManager callManager = iHeraHost.getCallManager();
            boolean z = false;
            if (callManager != null) {
                JQ2 jq2 = this.$previewController;
                JQ3 jq3 = this.$surfacePipeComponent;
                0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "Switch camera to wearable camera source");
                jq2.enable(false);
                HeraHostCameraSurfaceAdapter heraHostCameraSurfaceAdapter = HeraMessengerLiteCameraCoordinator.input;
                str = "input";
                if (heraHostCameraSurfaceAdapter != null) {
                    heraHostCameraSurfaceAdapter.release();
                    HeraHostCameraSurfaceAdapter heraHostCameraSurfaceAdapter2 = HeraMessengerLiteCameraCoordinator.input;
                    if (heraHostCameraSurfaceAdapter2 != null) {
                        heraHostCameraSurfaceAdapter2.initNewSurface();
                        03Y currentDesiredCamera = callManager.getCurrentDesiredCamera();
                        Object obj = currentDesiredCamera.first;
                        Object obj2 = currentDesiredCamera.second;
                        HeraHostCameraSurfaceAdapter heraHostCameraSurfaceAdapter3 = HeraMessengerLiteCameraCoordinator.input;
                        if (heraHostCameraSurfaceAdapter3 != null) {
                            Icj glInput = heraHostCameraSurfaceAdapter3.getGlInput();
                            HeraHostCameraSurfaceAdapter heraHostCameraSurfaceAdapter4 = HeraMessengerLiteCameraCoordinator.input;
                            if (heraHostCameraSurfaceAdapter4 != null) {
                                jq3.Cpl(heraHostCameraSurfaceAdapter4.width, glInput, heraHostCameraSurfaceAdapter4.height, 0, 0);
                                HeraMessengerLiteCameraCoordinator.cameraSourceStateFlow.D5H(1BK.A1G(obj, obj2));
                                z = true;
                            }
                        }
                    }
                }
            } else {
                0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "Switch camera to wearable camera failed, call manager is not available");
                HeraMessengerLiteCameraCoordinator.cameraSourceStateFlow.D5H(1BK.A1G(ConstantsKt.DEVICE_ID_HOST, (Object) null));
            }
            return Boolean.valueOf(z);
        }
        str = "heraHost";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
