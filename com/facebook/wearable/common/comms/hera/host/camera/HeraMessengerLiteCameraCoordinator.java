package com.facebook.wearable.common.comms.hera.host.camera;

import X.03Y;
import X.0Q8;
import X.0Ro;
import X.0Xs;
import X.0fH;
import X.11T;
import X.1BK;
import X.C00m;
import X.C15t;
import X.DKC;
import X.GOp;
import X.JQ2;
import X.JQ3;
import android.content.Context;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraHost;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: HeraMessengerLiteCameraCoordinator.class */
public final class HeraMessengerLiteCameraCoordinator {
    public static IHeraHost heraHost;
    public static HeraHostCameraSurfaceAdapter input;
    public static C00m toHostCamera;
    public static C00m toWearableCamera;
    public static final HeraMessengerLiteCameraCoordinator INSTANCE = new Object();
    public static final AtomicBoolean initialized = DKC.A1E(false);
    public static final AtomicBoolean isCameraOn = DKC.A1E(false);
    public static final 0Xs cameraSourceStateFlow = new 0Ro(new 03Y((Object) null, (Object) null));

    public final void configureCameraPipeline(IHeraHost iHeraHost, JQ2 jq2, JQ3 jq3) {
        11T.A0F(iHeraHost, 0);
        11T.A0G(jq2, 1, jq3);
        AtomicBoolean atomicBoolean = initialized;
        if (atomicBoolean.get()) {
            return;
        }
        heraHost = iHeraHost;
        input = new HeraHostCameraSurfaceAdapter(iHeraHost);
        HeraMessengerLiteCameraCoordinator$configureCameraPipeline$1 heraMessengerLiteCameraCoordinator$configureCameraPipeline$1 = new HeraMessengerLiteCameraCoordinator$configureCameraPipeline$1(jq2);
        toHostCamera = heraMessengerLiteCameraCoordinator$configureCameraPipeline$1;
        HeraMessengerLiteCameraCoordinator$configureCameraPipeline$2 heraMessengerLiteCameraCoordinator$configureCameraPipeline$2 = new HeraMessengerLiteCameraCoordinator$configureCameraPipeline$2(jq2, jq3);
        toWearableCamera = heraMessengerLiteCameraCoordinator$configureCameraPipeline$2;
        iHeraHost.configureCameraSourcesCallback(heraMessengerLiteCameraCoordinator$configureCameraPipeline$1, heraMessengerLiteCameraCoordinator$configureCameraPipeline$2);
        IHeraCallManager callManager = iHeraHost.getCallManager();
        if (callManager != null) {
            callManager.setCameraSourceFlow(cameraSourceStateFlow);
        }
        atomicBoolean.set(true);
    }

    public final C15t getCameraSourceFlow() {
        return cameraSourceStateFlow;
    }

    public final void onLiteCameraDestroyed() {
        String str;
        AtomicBoolean atomicBoolean = initialized;
        if (!atomicBoolean.get()) {
            0fH.A0n(HeraMessengerLiteCameraCoordinatorKt.TAG, "HeraLiteCameraCoordinator not initialized upon lite camera destroyed");
            return;
        }
        0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "onLiteCameraDestroyed");
        atomicBoolean.set(false);
        HeraHostCameraSurfaceAdapter heraHostCameraSurfaceAdapter = input;
        if (heraHostCameraSurfaceAdapter == null) {
            str = "input";
        } else {
            heraHostCameraSurfaceAdapter.release();
            IHeraHost iHeraHost = heraHost;
            if (iHeraHost != null) {
                iHeraHost.configureCameraSourcesCallback(null, null);
                cameraSourceStateFlow.D5H(new 03Y((Object) null, (Object) null));
                return;
            }
            str = "heraHost";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void onLiteCameraStarted(JQ2 jq2, Context context, int i) {
        0Xs r305;
        03Y A1G;
        String str;
        11T.A0F(jq2, 0);
        0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "onLiteCameraStarted");
        isCameraOn.compareAndSet(false, true);
        IHeraHost iHeraHost = heraHost;
        String str2 = null;
        if (iHeraHost != null) {
            IHeraCallManager callManager = iHeraHost.getCallManager();
            if (callManager != null) {
                if (callManager.isWearableCameraEnabled()) {
                    0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "onLiteCameraStarted with WearableCameraEnabled");
                    03Y currentDesiredCamera = callManager.getCurrentDesiredCamera();
                    String str3 = (String) currentDesiredCamera.first;
                    Object obj = currentDesiredCamera.second;
                    if (str3 == null || str3.equals(ConstantsKt.DEVICE_ID_HOST) || str3.length() <= 0 || obj == null) {
                        0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "onLiteCameraStarted with host camera");
                        jq2.enable(true);
                        r305 = cameraSourceStateFlow;
                    } else {
                        C00m c00m = toWearableCamera;
                        if (c00m != null) {
                            if (GOp.A1b(c00m)) {
                                r305 = cameraSourceStateFlow;
                                A1G = 1BK.A1G(str3, obj);
                                r305.D5H(A1G);
                                return;
                            }
                            return;
                        }
                        str = "toWearableCamera";
                    }
                } else {
                    0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "onLiteCameraStarted with host camera because callmanager is not ready");
                    jq2.enable(true);
                    r305 = cameraSourceStateFlow;
                    str2 = String.valueOf(i);
                }
                A1G = 1BK.A1G(ConstantsKt.DEVICE_ID_HOST, str2);
                r305.D5H(A1G);
                return;
            }
            return;
        }
        str = "heraHost";
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }

    public final void onLiteCameraStopped() {
        if (!initialized.get()) {
            0fH.A0n(HeraMessengerLiteCameraCoordinatorKt.TAG, "HeraLiteCameraCoordinator not initialized upon lite camera stopped");
            return;
        }
        0fH.A0j(HeraMessengerLiteCameraCoordinatorKt.TAG, "onLiteCameraStopped");
        HeraHostCameraSurfaceAdapter heraHostCameraSurfaceAdapter = input;
        if (heraHostCameraSurfaceAdapter == null) {
            11T.A0L("input");
            throw 0Q8.createAndThrow();
        }
        heraHostCameraSurfaceAdapter.release();
        cameraSourceStateFlow.D5H(new 03Y((Object) null, (Object) null));
    }
}
