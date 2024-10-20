package com.meta.wearable.comms.calling.hera.engine.base;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: EngineSubscriber.class */
public abstract class EngineSubscriber {

    /* loaded from: EngineSubscriber$CppProxy.class */
    public final class CppProxy extends EngineSubscriber {
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

        private native void native_onStateUpdate(long j, EngineState engineState);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(1298875929);
            _djinni_private_destroy();
            0FI.A09(-1773990806, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.EngineSubscriber
        public void onStateUpdate(EngineState engineState) {
            native_onStateUpdate(this.nativeRef, engineState);
        }
    }

    public abstract void onStateUpdate(EngineState engineState);
}
