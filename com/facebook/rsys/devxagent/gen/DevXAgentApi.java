package com.facebook.rsys.devxagent.gen;

import X.2JQ;
import X.C0il;
import X.GOo;
import X.HE9;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.HashSet;

/* loaded from: DevXAgentApi.class */
public abstract class DevXAgentApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.LEGACY_MARKER);

    /* loaded from: DevXAgentApi$CProxy.class */
    public final class CProxy extends DevXAgentApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HE9.A00) {
                return;
            }
            GOo.A14();
            C0il.A0B("rsdevxagentjni");
            HE9.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native DevXAgentApi createApi();

        public static native DevXAgentApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.devxagent.gen.DevXAgentApi
        public native void setProxy(DevXAgentAppProxy devXAgentAppProxy, HashSet hashSet);
    }

    public abstract void setProxy(DevXAgentAppProxy devXAgentAppProxy, HashSet hashSet);
}
