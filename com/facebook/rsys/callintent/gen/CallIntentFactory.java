package com.facebook.rsys.callintent.gen;

import X.2JQ;
import X.HMl;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.execution.gen.TaskExecutor;
import com.facebook.rsys.outgoingcallconfig.gen.OutgoingCallConfig;
import com.facebook.rsys.perf.holders.gen.PerfListenerFactory;
import com.facebook.rsys.perf.holders.gen.PerfLoggerHolder;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallIntentFactory.class */
public abstract class CallIntentFactory {
    public static 2JQ CONVERTER = IR0.A00(32);

    /* loaded from: CallIntentFactory$CProxy.class */
    public final class CProxy extends CallIntentFactory {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMl.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CallIntentFactory createFromMcfType(McfReference mcfReference);

        public static native CallIntentFactory createInstance(TaskExecutor taskExecutor, CallIntentFactoryListener callIntentFactoryListener, PerfListenerFactory perfListenerFactory);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void asyncDestroyForSigcoreUseOnly();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void destroy();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallIntentFactory)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native PerfLoggerHolder getPerfLogger(String str, String str2);

        public native int hashCode();

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void registerUser(SignalingUserContext signalingUserContext);

        @Override // com.facebook.rsys.callintent.gen.CallIntentFactory
        public native void unregisterUser(String str, String str2);
    }

    public abstract void asyncDestroyForSigcoreUseOnly();

    public abstract CallIntentCreationResult createCallIntent(OutgoingCallConfig outgoingCallConfig);

    public abstract void destroy();

    public abstract PerfLoggerHolder getPerfLogger(String str, String str2);

    public abstract void registerUser(SignalingUserContext signalingUserContext);

    public abstract void unregisterUser(String str, String str2);
}
