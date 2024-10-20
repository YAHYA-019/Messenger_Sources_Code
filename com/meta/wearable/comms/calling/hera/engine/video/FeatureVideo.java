package com.meta.wearable.comms.calling.hera.engine.video;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.Engine;
import com.meta.wearable.comms.calling.hera.engine.base.ModuleInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureVideo.class */
public abstract class FeatureVideo {

    /* loaded from: FeatureVideo$CppProxy.class */
    public final class CppProxy extends FeatureVideo {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native FeatureVideo create(Engine engine);

        private native void nativeDestroy(long j);

        private native ModuleInterface native_getModule(long j);

        private native void native_setIsPrimary(long j, boolean z);

        private native void native_setProxy(long j, FeatureVideoProxy featureVideoProxy);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(1327550336);
            _djinni_private_destroy();
            0FI.A09(-2056445256, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.video.FeatureVideo
        public ModuleInterface getModule() {
            return native_getModule(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.video.FeatureVideo
        public void setIsPrimary(boolean z) {
            native_setIsPrimary(this.nativeRef, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.video.FeatureVideo
        public void setProxy(FeatureVideoProxy featureVideoProxy) {
            native_setProxy(this.nativeRef, featureVideoProxy);
        }
    }

    public static FeatureVideo create(Engine engine) {
        return CppProxy.create(engine);
    }

    public abstract ModuleInterface getModule();

    public abstract void setIsPrimary(boolean z);

    public abstract void setProxy(FeatureVideoProxy featureVideoProxy);
}
