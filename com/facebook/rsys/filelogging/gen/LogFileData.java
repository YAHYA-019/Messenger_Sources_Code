package com.facebook.rsys.filelogging.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: LogFileData.class */
public class LogFileData {
    public static 2JQ CONVERTER = LVi.A00(14);
    public static long sMcfTypeId;
    public final boolean isStreamValid;
    public final String line;

    public LogFileData(String str, boolean z) {
        str.getClass();
        this.line = str;
        this.isStreamValid = z;
    }

    public static native LogFileData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof LogFileData)) {
                return false;
            }
            LogFileData logFileData = (LogFileData) obj;
            if (this.line.equals(logFileData.line) && this.isStreamValid == logFileData.isStreamValid) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A07(this.line) + (this.isStreamValid ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LogFileData{line=");
        A0k.append(this.line);
        A0k.append(",isStreamValid=");
        return AbstractC2327GOs.A0X(A0k, this.isStreamValid);
    }
}
