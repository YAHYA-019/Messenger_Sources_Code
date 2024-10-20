package com.meta.wearable.comms.calling.hera.engine.core;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.EngineErrno;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: ResultCallback.class */
public abstract class ResultCallback {

    /* loaded from: ResultCallback$CppProxy.class */
    public final class CppProxy extends ResultCallback {
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

        private native void native_onResult(long j, EngineErrno engineErrno);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1698740602);
            _djinni_private_destroy();
            0FI.A09(-212166208, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.ResultCallback
        public void onResult(EngineErrno engineErrno) {
            native_onResult(this.nativeRef, engineErrno);
        }
    }

    public abstract void onResult(EngineErrno engineErrno);
}
