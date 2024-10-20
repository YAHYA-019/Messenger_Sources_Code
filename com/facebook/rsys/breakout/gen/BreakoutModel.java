package com.facebook.rsys.breakout.gen;

import X.1BK;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: BreakoutModel.class */
public class BreakoutModel {
    public static 2JQ CONVERTER = IR0.A00(18);
    public static long sMcfTypeId;
    public final BreakoutRoomModel assignedRoom;
    public final boolean canViewerManageBreakout;
    public final boolean isBreakoutFeatureEnabled;
    public final boolean isInBreakoutRoom;
    public final ArrayList participantsSupportingBreakout;
    public final BreakoutSessionModel sessionModel;
    public final boolean stateSyncCanViewerStartBreakout;
    public final boolean stateSyncIsBreakoutFeatureEnabledInCall;
    public final BreakoutParticipantTransitionModel transitionModel;

    public BreakoutModel(boolean z, BreakoutSessionModel breakoutSessionModel, BreakoutRoomModel breakoutRoomModel, BreakoutParticipantTransitionModel breakoutParticipantTransitionModel, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList) {
        breakoutParticipantTransitionModel.getClass();
        arrayList.getClass();
        this.isInBreakoutRoom = z;
        this.sessionModel = breakoutSessionModel;
        this.assignedRoom = breakoutRoomModel;
        this.transitionModel = breakoutParticipantTransitionModel;
        this.stateSyncIsBreakoutFeatureEnabledInCall = z2;
        this.isBreakoutFeatureEnabled = z3;
        this.stateSyncCanViewerStartBreakout = z4;
        this.canViewerManageBreakout = z5;
        this.participantsSupportingBreakout = arrayList;
    }

    public static native BreakoutModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BreakoutModel)) {
                return false;
            }
            BreakoutModel breakoutModel = (BreakoutModel) obj;
            if (this.isInBreakoutRoom != breakoutModel.isInBreakoutRoom) {
                return false;
            }
            BreakoutSessionModel breakoutSessionModel = this.sessionModel;
            BreakoutSessionModel breakoutSessionModel2 = breakoutModel.sessionModel;
            if (breakoutSessionModel == null) {
                if (breakoutSessionModel2 != null) {
                    return false;
                }
            } else if (!breakoutSessionModel.equals(breakoutSessionModel2)) {
                return false;
            }
            BreakoutRoomModel breakoutRoomModel = this.assignedRoom;
            BreakoutRoomModel breakoutRoomModel2 = breakoutModel.assignedRoom;
            if (breakoutRoomModel == null) {
                if (breakoutRoomModel2 != null) {
                    return false;
                }
            } else if (!breakoutRoomModel.equals(breakoutRoomModel2)) {
                return false;
            }
            if (!this.transitionModel.equals(breakoutModel.transitionModel) || this.stateSyncIsBreakoutFeatureEnabledInCall != breakoutModel.stateSyncIsBreakoutFeatureEnabledInCall || this.isBreakoutFeatureEnabled != breakoutModel.isBreakoutFeatureEnabled || this.stateSyncCanViewerStartBreakout != breakoutModel.stateSyncCanViewerStartBreakout || this.canViewerManageBreakout != breakoutModel.canViewerManageBreakout || !this.participantsSupportingBreakout.equals(breakoutModel.participantsSupportingBreakout)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.participantsSupportingBreakout, (((((((AnonymousClass002.A05(this.transitionModel, (((AbstractC2326GOr.A03(this.isInBreakoutRoom ? 1 : 0) + AnonymousClass001.A02(this.sessionModel)) * 31) + 4YU.A03(this.assignedRoom)) * 31) + (this.stateSyncIsBreakoutFeatureEnabledInCall ? 1 : 0)) * 31) + (this.isBreakoutFeatureEnabled ? 1 : 0)) * 31) + (this.stateSyncCanViewerStartBreakout ? 1 : 0)) * 31) + (this.canViewerManageBreakout ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BreakoutModel{isInBreakoutRoom=");
        A0k.append(this.isInBreakoutRoom);
        A0k.append(",sessionModel=");
        A0k.append(this.sessionModel);
        A0k.append(",assignedRoom=");
        A0k.append(this.assignedRoom);
        A0k.append(",transitionModel=");
        A0k.append(this.transitionModel);
        A0k.append(",stateSyncIsBreakoutFeatureEnabledInCall=");
        A0k.append(this.stateSyncIsBreakoutFeatureEnabledInCall);
        A0k.append(",isBreakoutFeatureEnabled=");
        A0k.append(this.isBreakoutFeatureEnabled);
        A0k.append(",stateSyncCanViewerStartBreakout=");
        A0k.append(this.stateSyncCanViewerStartBreakout);
        A0k.append(",canViewerManageBreakout=");
        A0k.append(this.canViewerManageBreakout);
        A0k.append(",participantsSupportingBreakout=");
        return AbstractC2327GOs.A0U(this.participantsSupportingBreakout, A0k);
    }
}
