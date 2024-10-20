package com.meta.wearable.comms.calling.hera.engine.base;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: EngineFactory.class */
public abstract class EngineFactory {

    /* loaded from: EngineFactory$CppProxy.class */
    public final class CppProxy extends EngineFactory {
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native Engine create();

        private native void nativeDestroy(long j);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-232952673);
            _djinni_private_destroy();
            0FI.A09(2023730976, A03);
        }
    }

    public static Engine create() {
        return CppProxy.create();
    }
}
