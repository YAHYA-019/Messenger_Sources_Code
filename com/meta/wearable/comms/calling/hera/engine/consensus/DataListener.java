package com.meta.wearable.comms.calling.hera.engine.consensus;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: DataListener.class */
public abstract class DataListener {

    /* loaded from: DataListener$CppProxy.class */
    public final class CppProxy extends DataListener {
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

        private native void native_onData(long j, byte[] bArr);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(390872089);
            _djinni_private_destroy();
            0FI.A09(1728825032, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.DataListener
        public void onData(byte[] bArr) {
            native_onData(this.nativeRef, bArr);
        }
    }

    public abstract void onData(byte[] bArr);
}
