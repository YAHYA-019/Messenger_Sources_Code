package com.meta.wearable.comms.calling.hera.engine.camera;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureCameraInfraProxy.class */
public abstract class FeatureCameraInfraProxy {

    /* loaded from: FeatureCameraInfraProxy$CppProxy.class */
    public final class CppProxy extends FeatureCameraInfraProxy {
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

        private native void native_setCameraAccess2(long j, String str, boolean z);

        private native void native_setCameraOn2(long j, String str, String str2, boolean z, boolean z2);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(100962726);
            _djinni_private_destroy();
            0FI.A09(167189827, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy
        public void setCameraAccess2(String str, boolean z) {
            native_setCameraAccess2(this.nativeRef, str, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy
        public void setCameraOn2(String str, String str2, boolean z, boolean z2) {
            native_setCameraOn2(this.nativeRef, str, str2, z, z2);
        }
    }

    public abstract void setCameraAccess2(String str, boolean z);

    public abstract void setCameraOn2(String str, String str2, boolean z, boolean z2);
}
