package com.meta.wearable.comms.calling.hera.engine.base;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ModuleInterface.class */
public abstract class ModuleInterface {

    /* loaded from: ModuleInterface$CppProxy.class */
    public final class CppProxy extends ModuleInterface {
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

        private native EngineState native_onReduce(long j, EngineState engineState, Any any);

        private native EngineErrno native_onStateUpdate(long j, EngineState engineState, EngineState engineState2);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1650221063);
            _djinni_private_destroy();
            0FI.A09(-1222763892, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.ModuleInterface
        public EngineState onReduce(EngineState engineState, Any any) {
            return native_onReduce(this.nativeRef, engineState, any);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.ModuleInterface
        public EngineErrno onStateUpdate(EngineState engineState, EngineState engineState2) {
            return native_onStateUpdate(this.nativeRef, engineState, engineState2);
        }
    }

    public abstract EngineState onReduce(EngineState engineState, Any any);

    public abstract EngineErrno onStateUpdate(EngineState engineState, EngineState engineState2);
}
