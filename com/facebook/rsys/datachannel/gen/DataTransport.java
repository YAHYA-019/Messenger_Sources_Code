package com.facebook.rsys.datachannel.gen;

import X.2JQ;
import X.HMw;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: DataTransport.class */
public abstract class DataTransport {
    public static 2JQ CONVERTER = IR0.A00(ActionId.ON_VIEW_CREATED_END);

    /* loaded from: DataTransport$CProxy.class */
    public final class CProxy extends DataTransport {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMw.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native DataTransport createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof DataTransport)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void sendData(byte[] bArr);

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

        @Override // com.facebook.rsys.datachannel.gen.DataTransport
        public native void setListener(DataTransportListener dataTransportListener);
    }

    public abstract void sendData(byte[] bArr);

    public abstract void sendDataWithParams(DataChannelMessageParams dataChannelMessageParams, byte[] bArr);

    public abstract void setListener(DataTransportListener dataTransportListener);
}
