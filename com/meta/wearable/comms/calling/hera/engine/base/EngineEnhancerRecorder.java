package com.meta.wearable.comms.calling.hera.engine.base;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: EngineEnhancerRecorder.class */
public abstract class EngineEnhancerRecorder {

    /* loaded from: EngineEnhancerRecorder$CppProxy.class */
    public final class CppProxy extends EngineEnhancerRecorder {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native EngineEnhancerRecorder create(String str);

        private native void nativeDestroy(long j);

        private native void native_enableDispatchRecording(long j);

        private native EngineEnhancer native_getEnhancer(long j);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.EngineEnhancerRecorder
        public void enableDispatchRecording() {
            native_enableDispatchRecording(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(1251675837);
            _djinni_private_destroy();
            0FI.A09(1382540344, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.EngineEnhancerRecorder
        public EngineEnhancer getEnhancer() {
            return native_getEnhancer(this.nativeRef);
        }
    }

    public static EngineEnhancerRecorder create(String str) {
        return CppProxy.create(str);
    }

    public abstract void enableDispatchRecording();

    public abstract EngineEnhancer getEnhancer();
}
