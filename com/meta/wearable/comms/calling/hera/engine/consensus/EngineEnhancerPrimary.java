package com.meta.wearable.comms.calling.hera.engine.consensus;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.EngineEnhancer;
import com.meta.wearable.comms.calling.hera.engine.base.EngineErrno;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: EngineEnhancerPrimary.class */
public abstract class EngineEnhancerPrimary {

    /* loaded from: EngineEnhancerPrimary$CppProxy.class */
    public final class CppProxy extends EngineEnhancerPrimary {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native EngineEnhancerPrimary create();

        private native void nativeDestroy(long j);

        private native void native_forcePush(long j);

        private native EngineEnhancer native_getEnhancer(long j);

        private native EngineErrno native_provideAction(long j, byte[] bArr);

        private native void native_setEnableActiveDeviceDiscovery(long j, boolean z);

        private native void native_setEnableCompressionOnWire(long j, boolean z);

        private native void native_setUpdateListener(long j, DataListener dataListener);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-565358174);
            _djinni_private_destroy();
            0FI.A09(1761004758, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary
        public void forcePush() {
            native_forcePush(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary
        public EngineEnhancer getEnhancer() {
            return native_getEnhancer(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary
        public EngineErrno provideAction(byte[] bArr) {
            return native_provideAction(this.nativeRef, bArr);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary
        public void setEnableActiveDeviceDiscovery(boolean z) {
            native_setEnableActiveDeviceDiscovery(this.nativeRef, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary
        public void setEnableCompressionOnWire(boolean z) {
            native_setEnableCompressionOnWire(this.nativeRef, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary
        public void setUpdateListener(DataListener dataListener) {
            native_setUpdateListener(this.nativeRef, dataListener);
        }
    }

    public static EngineEnhancerPrimary create() {
        return CppProxy.create();
    }

    public abstract void forcePush();

    public abstract EngineEnhancer getEnhancer();

    public abstract EngineErrno provideAction(byte[] bArr);

    public abstract void setEnableActiveDeviceDiscovery(boolean z);

    public abstract void setEnableCompressionOnWire(boolean z);

    public abstract void setUpdateListener(DataListener dataListener);
}
