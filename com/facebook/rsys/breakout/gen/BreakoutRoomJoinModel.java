package com.facebook.rsys.breakout.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: BreakoutRoomJoinModel.class */
public class BreakoutRoomJoinModel {
    public static 2JQ CONVERTER = IR0.A00(20);
    public static long sMcfTypeId;
    public final boolean isAudioOn;
    public final boolean isVideoOn;
    public final String linkUrl;
    public final int logInstanceKey;

    public BreakoutRoomJoinModel(String str, boolean z, boolean z2, int i) {
        str.getClass();
        this.linkUrl = str;
        this.isVideoOn = z;
        this.isAudioOn = z2;
        this.logInstanceKey = i;
    }

    public static native BreakoutRoomJoinModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof BreakoutRoomJoinModel)) {
                return false;
            }
            BreakoutRoomJoinModel breakoutRoomJoinModel = (BreakoutRoomJoinModel) obj;
            if (this.linkUrl.equals(breakoutRoomJoinModel.linkUrl) && this.isVideoOn == breakoutRoomJoinModel.isVideoOn && this.isAudioOn == breakoutRoomJoinModel.isAudioOn && this.logInstanceKey == breakoutRoomJoinModel.logInstanceKey) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A07(this.linkUrl) + (this.isVideoOn ? 1 : 0)) * 31) + (this.isAudioOn ? 1 : 0)) * 31) + this.logInstanceKey;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BreakoutRoomJoinModel{linkUrl=");
        A0k.append(this.linkUrl);
        A0k.append(",isVideoOn=");
        A0k.append(this.isVideoOn);
        A0k.append(",isAudioOn=");
        A0k.append(this.isAudioOn);
        A0k.append(",logInstanceKey=");
        return AbstractC2327GOs.A0W(A0k, this.logInstanceKey);
    }
}
