package com.meta.wearable.comms.calling.hera.engine.camera;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CameraHardware;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureCameraProviderProxy.class */
public abstract class FeatureCameraProviderProxy {

    /* loaded from: FeatureCameraProviderProxy$CppProxy.class */
    public final class CppProxy extends FeatureCameraProviderProxy {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        private native void nativeDestroy(long j);

        private native void native_switchCamera2(long j, CameraHardware cameraHardware, CameraHardware cameraHardware2);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1021384585);
            _djinni_private_destroy();
            0FI.A09(420074815, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy
        public void switchCamera2(CameraHardware cameraHardware, CameraHardware cameraHardware2) {
            native_switchCamera2(this.nativeRef, cameraHardware, cameraHardware2);
        }
    }

    public abstract void switchCamera2(CameraHardware cameraHardware, CameraHardware cameraHardware2);
}
