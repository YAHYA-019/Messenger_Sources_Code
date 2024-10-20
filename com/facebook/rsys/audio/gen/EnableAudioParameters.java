package com.facebook.rsys.audio.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: EnableAudioParameters.class */
public class EnableAudioParameters {
    public static 2JQ CONVERTER = IR0.A00(12);
    public static long sMcfTypeId;
    public final boolean enable;
    public final int streamType;
    public final String userID;

    public EnableAudioParameters(String str, int i, boolean z) {
        this.userID = str;
        this.streamType = i;
        this.enable = z;
    }

    public static native EnableAudioParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EnableAudioParameters)) {
                return false;
            }
            EnableAudioParameters enableAudioParameters = (EnableAudioParameters) obj;
            String str = this.userID;
            String str2 = enableAudioParameters.userID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.streamType != enableAudioParameters.streamType || this.enable != enableAudioParameters.enable) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A03(1BL.A05(this.userID)) + this.streamType) * 31) + (this.enable ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("EnableAudioParameters{userID=");
        A0k.append(this.userID);
        A0k.append(",streamType=");
        A0k.append(this.streamType);
        A0k.append(",enable=");
        return AbstractC2327GOs.A0X(A0k, this.enable);
    }
}
