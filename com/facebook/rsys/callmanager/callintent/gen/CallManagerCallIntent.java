package com.facebook.rsys.callmanager.callintent.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.HE1;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callmanager.callintentcommon.gen.CallManagerCallIntentCallbacks;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallCallback;
import com.facebook.rsys.callmanager.callintentcommon.gen.InitCallConfig;
import com.facebook.rsys.callmanager.callintentcommon.gen.RejectCallParams;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.callmanager.gen.CallManagerConfig;
import com.facebook.rsys.callmanager.gen.UnregisterCallback;
import com.facebook.rsys.callmanager.gen.UserContext;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi;
import com.facebook.rsys.filelogging.gen.LogFile;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CallManagerCallIntent.class */
public abstract class CallManagerCallIntent {
    public static 2JQ CONVERTER = IR0.A00(37);

    /* loaded from: CallManagerCallIntent$CProxy.class */
    public final class CProxy extends CallManagerCallIntent {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HE1.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsyscallmanager_callintentjniStaging" : "rsyscallmanager_callintentjniLatest");
            HE1.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CallManagerCallIntent createCallManager(CallManagerConfig callManagerConfig, CallManagerClient callManagerClient, CallManagerCallIntentCallbacks callManagerCallIntentCallbacks, DevXAgentApi devXAgentApi);

        public static native CallManagerCallIntent createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent
        public native LogFile createLogFileForCall(int i, String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CallManagerCallIntent)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent
        public native DevXAgentCallApi getDevXAgentCallApi();

        public native int hashCode();

        @Override // com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent
        public native void initCall(InitCallConfig initCallConfig, InitCallCallback initCallCallback);

        @Override // com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent
        public native void registerUser(UserContext userContext);

        @Override // com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent
        public native void rejectCall(RejectCallParams rejectCallParams);

        @Override // com.facebook.rsys.callmanager.callintent.gen.CallManagerCallIntent
        public native void unregisterUser(String str, String str2, UnregisterCallback unregisterCallback);
    }

    public abstract LogFile createLogFileForCall(int i, String str);

    public abstract DevXAgentCallApi getDevXAgentCallApi();

    public abstract void initCall(InitCallConfig initCallConfig, InitCallCallback initCallCallback);

    public abstract void registerUser(UserContext userContext);

    public abstract void rejectCall(RejectCallParams rejectCallParams);

    public abstract void unregisterUser(String str, String str2, UnregisterCallback unregisterCallback);
}
