package com.facebook.rsys.filelogging.gen;

import X.2JQ;
import X.HN0;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: LargeLogUploadProxy.class */
public abstract class LargeLogUploadProxy {
    public static 2JQ CONVERTER = LVi.A00(13);

    /* loaded from: LargeLogUploadProxy$CProxy.class */
    public final class CProxy extends LargeLogUploadProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN0.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native LargeLogUploadProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LargeLogUploadProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void setStructuredLogger(McfReference mcfReference);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadConsoleLog(String str, String str2);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadOnDemand(byte[] bArr);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadRtcEventLog(String str, String str2);

        @Override // com.facebook.rsys.filelogging.gen.LargeLogUploadProxy
        public native void uploadSdpLog(String str, String str2);
    }

    public abstract void setStructuredLogger(McfReference mcfReference);

    public abstract void uploadConsoleLog(String str, String str2);

    public abstract void uploadOnDemand(byte[] bArr);

    public abstract void uploadRtcEventLog(String str, String str2);

    public abstract void uploadSdpLog(String str, String str2);
}
