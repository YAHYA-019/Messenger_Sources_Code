package com.facebook.rsys.filelogging.gen;

import X.2JQ;
import X.HN0;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: LogFile.class */
public abstract class LogFile {
    public static 2JQ CONVERTER = IR0.A00(ActionId.RTMP_CONNECTION_FAILED);

    /* loaded from: LogFile$CProxy.class */
    public final class CProxy extends LogFile {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HN0.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native LogFile createFromMcfType(McfReference mcfReference);

        public static native LogFile createLogFile(String str, int i, String str2);

        public static native LogFileStats createLogFileStats(String str);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.filelogging.gen.LogFile
        public native LogFileData createFileData();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof LogFile)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public native int hashCode();
    }

    public abstract LogFileData createFileData();
}
