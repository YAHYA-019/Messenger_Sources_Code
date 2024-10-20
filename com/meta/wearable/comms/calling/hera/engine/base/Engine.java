package com.meta.wearable.comms.calling.hera.engine.base;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Engine.class */
public abstract class Engine {

    /* loaded from: Engine$CppProxy.class */
    public final class CppProxy extends Engine {
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

        private native void native_attachEnhancer(long j, EngineEnhancer engineEnhancer);

        private native void native_dispatchBlocking(long j, Any any);

        private native EngineState native_getStateBlocking(long j);

        private native void native_init(long j);

        private native void native_prepare(long j);

        private native void native_registerModule(long j, ModuleInterface moduleInterface);

        private native byte native_subscribe(long j, EngineSubscriber engineSubscriber);

        private native void native_unsubscribe(long j, byte b);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public void attachEnhancer(EngineEnhancer engineEnhancer) {
            native_attachEnhancer(this.nativeRef, engineEnhancer);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public void dispatchBlocking(Any any) {
            native_dispatchBlocking(this.nativeRef, any);
        }

        public void finalize() {
            int A03 = 0FI.A03(1443569316);
            _djinni_private_destroy();
            0FI.A09(701974265, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public EngineState getStateBlocking() {
            return native_getStateBlocking(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public void init() {
            native_init(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public void prepare() {
            native_prepare(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public void registerModule(ModuleInterface moduleInterface) {
            native_registerModule(this.nativeRef, moduleInterface);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public byte subscribe(EngineSubscriber engineSubscriber) {
            return native_subscribe(this.nativeRef, engineSubscriber);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.base.Engine
        public void unsubscribe(byte b) {
            native_unsubscribe(this.nativeRef, b);
        }
    }

    public abstract void attachEnhancer(EngineEnhancer engineEnhancer);

    public abstract void dispatchBlocking(Any any);

    public abstract EngineState getStateBlocking();

    public abstract void init();

    public abstract void prepare();

    public abstract void registerModule(ModuleInterface moduleInterface);

    public abstract byte subscribe(EngineSubscriber engineSubscriber);

    public abstract void unsubscribe(byte b);
}
