package com.meta.wearable.comms.calling.hera.engine.core;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Call;
import com.meta.wearable.comms.calling.hera.engine.base.EngineErrno;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureCoreProxy.class */
public abstract class FeatureCoreProxy {

    /* loaded from: FeatureCoreProxy$CppProxy.class */
    public final class CppProxy extends FeatureCoreProxy {
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

        private native void native_acceptIncomingCall2(long j, Call call);

        private native void native_endCall2(long j, Call call);

        private native EngineErrno native_startOutgoingCall(long j, Call call);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy
        public void acceptIncomingCall2(Call call) {
            native_acceptIncomingCall2(this.nativeRef, call);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy
        public void endCall2(Call call) {
            native_endCall2(this.nativeRef, call);
        }

        public void finalize() {
            int A03 = 0FI.A03(-307884661);
            _djinni_private_destroy();
            0FI.A09(568321911, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy
        public EngineErrno startOutgoingCall(Call call) {
            return native_startOutgoingCall(this.nativeRef, call);
        }
    }

    public abstract void acceptIncomingCall2(Call call);

    public abstract void endCall2(Call call);

    public abstract EngineErrno startOutgoingCall(Call call);
}
