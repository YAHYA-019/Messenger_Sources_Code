package com.meta.wearable.comms.calling.hera.engine.camera;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureCameraApi.class */
public abstract class FeatureCameraApi {

    /* loaded from: FeatureCameraApi$CppProxy.class */
    public final class CppProxy extends FeatureCameraApi {
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

        private native void native_activateCamera(long j, String str, String str2, String str3);

        private native void native_setCameraOn(long j, String str, boolean z);

        private native void native_setCameraPaused(long j, String str, boolean z);

        private native void native_toggleCamera(long j, String str, String str2);

        private native void native_updateActiveCamera(long j, String str, String str2, String str3);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi
        public void activateCamera(String str, String str2, String str3) {
            native_activateCamera(this.nativeRef, str, str2, str3);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1975778985);
            _djinni_private_destroy();
            0FI.A09(1080369761, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi
        public void setCameraOn(String str, boolean z) {
            native_setCameraOn(this.nativeRef, str, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi
        public void setCameraPaused(String str, boolean z) {
            native_setCameraPaused(this.nativeRef, str, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi
        public void toggleCamera(String str, String str2) {
            native_toggleCamera(this.nativeRef, str, str2);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi
        public void updateActiveCamera(String str, String str2, String str3) {
            native_updateActiveCamera(this.nativeRef, str, str2, str3);
        }
    }

    public abstract void activateCamera(String str, String str2, String str3);

    public abstract void setCameraOn(String str, boolean z);

    public abstract void setCameraPaused(String str, boolean z);

    public abstract void toggleCamera(String str, String str2);

    public abstract void updateActiveCamera(String str, String str2, String str3);
}
