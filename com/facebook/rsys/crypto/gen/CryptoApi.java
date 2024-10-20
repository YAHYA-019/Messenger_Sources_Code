package com.facebook.rsys.crypto.gen;

import X.2JQ;
import X.HMv;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

/* loaded from: CryptoApi.class */
public abstract class CryptoApi {
    public static 2JQ CONVERTER = IR0.A00(92);

    /* loaded from: CryptoApi$CProxy.class */
    public final class CProxy extends CryptoApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMv.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CryptoApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void ackNewDeviceNotifications(ArrayList arrayList);

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void ackUiDisplayedParticipantIds(ArrayList arrayList);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CryptoApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.crypto.gen.CryptoApi
        public native void setE2eeMode(int i);
    }

    public abstract void ackNewDeviceNotifications(ArrayList arrayList);

    public abstract void ackUiDisplayedParticipantIds(ArrayList arrayList);

    public abstract void setE2eeMode(int i);
}
