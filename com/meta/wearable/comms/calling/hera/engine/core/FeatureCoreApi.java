package com.meta.wearable.comms.calling.hera.engine.core;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.CallAccount;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.CallIntent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureCoreApi.class */
public abstract class FeatureCoreApi {

    /* loaded from: FeatureCoreApi$CppProxy.class */
    public final class CppProxy extends FeatureCoreApi {
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

        private native void native_endCall(long j, String str, Integer num, String str2);

        private native void native_setIncomingCallDecision(long j, String str, int i, Boolean bool);

        private native void native_startOutgoingOneToOneCall(long j, CallIntent callIntent, CallAccount callAccount, String str, ResultCallback resultCallback);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreApi
        public void endCall(String str, Integer num, String str2) {
            native_endCall(this.nativeRef, str, num, str2);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1303791268);
            _djinni_private_destroy();
            0FI.A09(-22858324, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreApi
        public void setIncomingCallDecision(String str, int i, Boolean bool) {
            native_setIncomingCallDecision(this.nativeRef, str, i, bool);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreApi
        public void startOutgoingOneToOneCall(CallIntent callIntent, CallAccount callAccount, String str, ResultCallback resultCallback) {
            native_startOutgoingOneToOneCall(this.nativeRef, callIntent, callAccount, str, resultCallback);
        }
    }

    public abstract void endCall(String str, Integer num, String str2);

    public abstract void setIncomingCallDecision(String str, int i, Boolean bool);

    public abstract void startOutgoingOneToOneCall(CallIntent callIntent, CallAccount callAccount, String str, ResultCallback resultCallback);
}
