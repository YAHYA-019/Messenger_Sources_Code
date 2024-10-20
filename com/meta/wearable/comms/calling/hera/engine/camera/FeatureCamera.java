package com.meta.wearable.comms.calling.hera.engine.camera;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.Engine;
import com.meta.wearable.comms.calling.hera.engine.base.ModuleInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureCamera.class */
public abstract class FeatureCamera {

    /* loaded from: FeatureCamera$CppProxy.class */
    public final class CppProxy extends FeatureCamera {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native FeatureCamera create(Engine engine);

        public static native FeatureCameraApi createStandardApi(Engine engine);

        private native void nativeDestroy(long j);

        private native ModuleInterface native_getModule(long j);

        private native void native_setInfraProxy(long j, FeatureCameraInfraProxy featureCameraInfraProxy);

        private native void native_setIsPrimary(long j, boolean z);

        private native void native_setProviderProxy(long j, FeatureCameraProviderProxy featureCameraProviderProxy);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-862831512);
            _djinni_private_destroy();
            0FI.A09(-1833914822, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCamera
        public ModuleInterface getModule() {
            return native_getModule(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCamera
        public void setInfraProxy(FeatureCameraInfraProxy featureCameraInfraProxy) {
            native_setInfraProxy(this.nativeRef, featureCameraInfraProxy);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCamera
        public void setIsPrimary(boolean z) {
            native_setIsPrimary(this.nativeRef, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCamera
        public void setProviderProxy(FeatureCameraProviderProxy featureCameraProviderProxy) {
            native_setProviderProxy(this.nativeRef, featureCameraProviderProxy);
        }
    }

    public static FeatureCamera create(Engine engine) {
        return CppProxy.create(engine);
    }

    public static FeatureCameraApi createStandardApi(Engine engine) {
        return CppProxy.createStandardApi(engine);
    }

    public abstract ModuleInterface getModule();

    public abstract void setInfraProxy(FeatureCameraInfraProxy featureCameraInfraProxy);

    public abstract void setIsPrimary(boolean z);

    public abstract void setProviderProxy(FeatureCameraProviderProxy featureCameraProviderProxy);
}
