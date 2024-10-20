package com.facebook.rsys.media.gen;

import X.0Pz;
import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: StreamInfo.class */
public class StreamInfo {
    public static 2JQ CONVERTER = LVi.A00(30);
    public static long sMcfTypeId;
    public final String streamName;
    public final int streamType;

    public StreamInfo(int i, String str) {
        this.streamType = i;
        this.streamName = str;
    }

    public static native StreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StreamInfo)) {
                return false;
            }
            StreamInfo streamInfo = (StreamInfo) obj;
            if (this.streamType != streamInfo.streamType) {
                return false;
            }
            String str = this.streamName;
            String str2 = streamInfo.streamName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.streamType) + 1BL.A05(this.streamName);
    }

    public String toString() {
        return 0Pz.A0G(this.streamType, "StreamInfo{streamType=", ",streamName=", this.streamName, "}");
    }
}
