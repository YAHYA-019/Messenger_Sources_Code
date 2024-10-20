package com.meta.wearable.comms.calling.hera.engine.consensus;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.EngineEnhancer;
import com.meta.wearable.comms.calling.hera.engine.base.EngineErrno;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: EngineEnhancerReplica.class */
public abstract class EngineEnhancerReplica {

    /* loaded from: EngineEnhancerReplica$CppProxy.class */
    public final class CppProxy extends EngineEnhancerReplica {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native EngineEnhancerReplica create();

        private native void nativeDestroy(long j);

        private native EngineEnhancer native_getEnhancer(long j);

        private native int native_getRttMs(long j);

        private native void native_ping(long j);

        private native EngineErrno native_provideState(long j, byte[] bArr);

        private native void native_setDispatchListener(long j, DataListener dataListener);

        private native void native_setEnableCompressionOnWire(long j, boolean z);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-590221739);
            _djinni_private_destroy();
            0FI.A09(1665074965, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica
        public EngineEnhancer getEnhancer() {
            return native_getEnhancer(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica
        public int getRttMs() {
            return native_getRttMs(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica
        public void ping() {
            native_ping(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica
        public EngineErrno provideState(byte[] bArr) {
            return native_provideState(this.nativeRef, bArr);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica
        public void setDispatchListener(DataListener dataListener) {
            native_setDispatchListener(this.nativeRef, dataListener);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica
        public void setEnableCompressionOnWire(boolean z) {
            native_setEnableCompressionOnWire(this.nativeRef, z);
        }
    }

    public static EngineEnhancerReplica create() {
        return CppProxy.create();
    }

    public abstract EngineEnhancer getEnhancer();

    public abstract int getRttMs();

    public abstract void ping();

    public abstract EngineErrno provideState(byte[] bArr);

    public abstract void setDispatchListener(DataListener dataListener);

    public abstract void setEnableCompressionOnWire(boolean z);
}
