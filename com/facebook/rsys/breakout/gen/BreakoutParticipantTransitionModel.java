package com.facebook.rsys.breakout.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: BreakoutParticipantTransitionModel.class */
public class BreakoutParticipantTransitionModel {
    public static 2JQ CONVERTER = IR0.A00(19);
    public static long sMcfTypeId;
    public final String targetRoomName;
    public final String targetRoomUrl;
    public final int transitionState;

    public BreakoutParticipantTransitionModel(String str, String str2, int i) {
        this.targetRoomUrl = str;
        this.targetRoomName = str2;
        this.transitionState = i;
    }

    public static native BreakoutParticipantTransitionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BreakoutParticipantTransitionModel)) {
                return false;
            }
            BreakoutParticipantTransitionModel breakoutParticipantTransitionModel = (BreakoutParticipantTransitionModel) obj;
            String str = this.targetRoomUrl;
            String str2 = breakoutParticipantTransitionModel.targetRoomUrl;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.targetRoomName;
            String str4 = breakoutParticipantTransitionModel.targetRoomName;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.transitionState != breakoutParticipantTransitionModel.transitionState) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A03(1BL.A05(this.targetRoomUrl)) + 7zN.A05(this.targetRoomName)) * 31) + this.transitionState;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BreakoutParticipantTransitionModel{targetRoomUrl=");
        A0k.append(this.targetRoomUrl);
        A0k.append(",targetRoomName=");
        A0k.append(this.targetRoomName);
        A0k.append(",transitionState=");
        return AbstractC2327GOs.A0W(A0k, this.transitionState);
    }
}
