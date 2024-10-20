package com.meta.wearable.comms.calling.hera.engine.device;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.meta.wearable.comms.calling.hera.engine.base.Engine;
import com.meta.wearable.comms.calling.hera.engine.base.ModuleInterface;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureDevice.class */
public abstract class FeatureDevice {

    /* loaded from: FeatureDevice$CppProxy.class */
    public final class CppProxy extends FeatureDevice {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        public static native FeatureDevice create(Engine engine);

        private native void nativeDestroy(long j);

        private native ModuleInterface native_getModule(long j);

        private native FeatureDevice native_setIsHost(long j, boolean z);

        private native FeatureDevice native_setProxy(long j, FeatureDeviceProxy featureDeviceProxy);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(1709359442);
            _djinni_private_destroy();
            0FI.A09(-1998682031, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.device.FeatureDevice
        public ModuleInterface getModule() {
            return native_getModule(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.device.FeatureDevice
        public FeatureDevice setIsHost(boolean z) {
            return native_setIsHost(this.nativeRef, z);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.device.FeatureDevice
        public FeatureDevice setProxy(FeatureDeviceProxy featureDeviceProxy) {
            return native_setProxy(this.nativeRef, featureDeviceProxy);
        }
    }

    public static FeatureDevice create(Engine engine) {
        return CppProxy.create(engine);
    }

    public abstract ModuleInterface getModule();

    public abstract FeatureDevice setIsHost(boolean z);

    public abstract FeatureDevice setProxy(FeatureDeviceProxy featureDeviceProxy);
}
