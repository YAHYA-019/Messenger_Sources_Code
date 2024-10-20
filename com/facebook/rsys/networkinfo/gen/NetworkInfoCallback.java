package com.facebook.rsys.networkinfo.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.C0il;
import X.HEK;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.Map;

/* loaded from: NetworkInfoCallback.class */
public abstract class NetworkInfoCallback {
    public static 2JQ CONVERTER = IR0.A00(ActionId.BEGIN_START_ACTIVITY);

    /* loaded from: NetworkInfoCallback$CProxy.class */
    public final class CProxy extends NetworkInfoCallback {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            if (HEK.A00) {
                return;
            }
            C0il.A0B(AbstractC2326GOr.A1U() ? "rsysnetworkinfojniStaging" : "rsysnetworkinfojniLatest");
            HEK.A00 = true;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native NetworkInfoCallback createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetworkInfoCallback)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.networkinfo.gen.NetworkInfoCallback
        public native void onUpdateRadioSignals(int i, Map map);
    }

    public abstract void onUpdateRadioSignals(int i, Map map);
}
