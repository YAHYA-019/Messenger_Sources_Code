package com.meta.wearable.comms.calling.hera.engine.device;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.hera.engine.device.Device;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureDeviceProxy.class */
public abstract class FeatureDeviceProxy {

    /* loaded from: FeatureDeviceProxy$CppProxy.class */
    public final class CppProxy extends FeatureDeviceProxy {
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

        private native Device native_getDevice(long j);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1982333559);
            _djinni_private_destroy();
            0FI.A09(-1663570997, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.device.FeatureDeviceProxy
        public Device getDevice() {
            return native_getDevice(this.nativeRef);
        }
    }

    public abstract Device getDevice();
}
