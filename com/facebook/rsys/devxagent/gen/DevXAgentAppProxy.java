package com.facebook.rsys.devxagent.gen;

import X.2JQ;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DevXAgentAppProxy.class */
public abstract class DevXAgentAppProxy {
    public static 2JQ CONVERTER = N6e.A00(29);

    /* loaded from: DevXAgentAppProxy$CProxy.class */
    public final class CProxy extends DevXAgentAppProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native DevXAgentAppProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void appCommand(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentAppProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentAppProxy
        public native void startCall(DevXAgentCallStartParams devXAgentCallStartParams);
    }

    public abstract void appCommand(String str);

    public abstract void startCall(DevXAgentCallStartParams devXAgentCallStartParams);
}
