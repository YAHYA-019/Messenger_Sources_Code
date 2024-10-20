package com.facebook.rsys.devxcallagent.gen;

import X.2JQ;
import X.HMx;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DevXAgentCallApi.class */
public abstract class DevXAgentCallApi {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ACTION_BAR_COMPLETE);

    /* loaded from: DevXAgentCallApi$CProxy.class */
    public final class CProxy extends DevXAgentCallApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMx.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native DevXAgentCallApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.devxcallagent.gen.DevXAgentCallApi
        public native DevXAgentCallConfig copyCallConfig(String str);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DevXAgentCallApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract DevXAgentCallConfig copyCallConfig(String str);
}
