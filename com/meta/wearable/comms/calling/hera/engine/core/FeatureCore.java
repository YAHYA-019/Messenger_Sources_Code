package com.meta.wearable.comms.calling.hera.engine.core;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.Engine;
import com.meta.wearable.comms.calling.hera.engine.base.ModuleInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureCore.class */
public abstract class FeatureCore {

    /* loaded from: FeatureCore$CppProxy.class */
    public final class CppProxy extends FeatureCore {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native FeatureCore create(Engine engine);

        public static native FeatureCoreApi createStandardApi(Engine engine);

        private native void nativeDestroy(long j);

        private native ModuleInterface native_getModule(long j);

        private native FeatureCore native_setProxy(long j, FeatureCoreProxy featureCoreProxy);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(1243489389);
            _djinni_private_destroy();
            0FI.A09(696265371, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCore
        public ModuleInterface getModule() {
            return native_getModule(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCore
        public FeatureCore setProxy(FeatureCoreProxy featureCoreProxy) {
            return native_setProxy(this.nativeRef, featureCoreProxy);
        }
    }

    public static FeatureCore create(Engine engine) {
        return CppProxy.create(engine);
    }

    public static FeatureCoreApi createStandardApi(Engine engine) {
        return CppProxy.createStandardApi(engine);
    }

    public abstract ModuleInterface getModule();

    public abstract FeatureCore setProxy(FeatureCoreProxy featureCoreProxy);
}
