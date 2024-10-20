package com.meta.wearable.comms.calling.hera.engine.audio;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.Engine;
import com.meta.wearable.comms.calling.hera.engine.base.ModuleInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureAudio.class */
public abstract class FeatureAudio {

    /* loaded from: FeatureAudio$CppProxy.class */
    public final class CppProxy extends FeatureAudio {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native FeatureAudio create(Engine engine);

        public static native FeatureAudioApi createStandardApi(Engine engine);

        private native void nativeDestroy(long j);

        private native ModuleInterface native_getModule(long j);

        private native void native_setProxy(long j, FeatureAudioProxy featureAudioProxy);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1449832207);
            _djinni_private_destroy();
            0FI.A09(-1104548382, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudio
        public ModuleInterface getModule() {
            return native_getModule(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudio
        public void setProxy(FeatureAudioProxy featureAudioProxy) {
            native_setProxy(this.nativeRef, featureAudioProxy);
        }
    }

    public static FeatureAudio create(Engine engine) {
        return CppProxy.create(engine);
    }

    public static FeatureAudioApi createStandardApi(Engine engine) {
        return CppProxy.createStandardApi(engine);
    }

    public abstract ModuleInterface getModule();

    public abstract void setProxy(FeatureAudioProxy featureAudioProxy);
}
