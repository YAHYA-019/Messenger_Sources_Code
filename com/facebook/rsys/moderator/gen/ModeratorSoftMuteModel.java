package com.facebook.rsys.moderator.gen;

import X.1BK;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;
import java.util.Map;

/* loaded from: ModeratorSoftMuteModel.class */
public class ModeratorSoftMuteModel {
    public static 2JQ CONVERTER = LVi.A00(37);
    public static long sMcfTypeId;
    public final boolean actionCapabilitiesAsModerator;
    public final boolean actionCapabilitiesAsParticipant;
    public final ModeratorActionInfo actionExecuted;
    public final ModeratorActionInfo actionIssued;
    public final ModeratorActionInfo actionPending;
    public final Map conferenceParticipantCapabilities;
    public final boolean isCapabilityInitialized;
    public final boolean isFeatureEnabled;
    public final HashSet issueActionTargetUids;

    public ModeratorSoftMuteModel(boolean z, boolean z2, boolean z3, boolean z4, Map map, ModeratorActionInfo moderatorActionInfo, ModeratorActionInfo moderatorActionInfo2, ModeratorActionInfo moderatorActionInfo3, HashSet hashSet) {
        map.getClass();
        hashSet.getClass();
        this.isCapabilityInitialized = z;
        this.isFeatureEnabled = z2;
        this.actionCapabilitiesAsModerator = z3;
        this.actionCapabilitiesAsParticipant = z4;
        this.conferenceParticipantCapabilities = map;
        this.actionIssued = moderatorActionInfo;
        this.actionPending = moderatorActionInfo2;
        this.actionExecuted = moderatorActionInfo3;
        this.issueActionTargetUids = hashSet;
    }

    public static native ModeratorSoftMuteModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorSoftMuteModel)) {
                return false;
            }
            ModeratorSoftMuteModel moderatorSoftMuteModel = (ModeratorSoftMuteModel) obj;
            if (this.isCapabilityInitialized != moderatorSoftMuteModel.isCapabilityInitialized || this.isFeatureEnabled != moderatorSoftMuteModel.isFeatureEnabled || this.actionCapabilitiesAsModerator != moderatorSoftMuteModel.actionCapabilitiesAsModerator || this.actionCapabilitiesAsParticipant != moderatorSoftMuteModel.actionCapabilitiesAsParticipant || !this.conferenceParticipantCapabilities.equals(moderatorSoftMuteModel.conferenceParticipantCapabilities)) {
                return false;
            }
            ModeratorActionInfo moderatorActionInfo = this.actionIssued;
            ModeratorActionInfo moderatorActionInfo2 = moderatorSoftMuteModel.actionIssued;
            if (moderatorActionInfo == null) {
                if (moderatorActionInfo2 != null) {
                    return false;
                }
            } else if (!moderatorActionInfo.equals(moderatorActionInfo2)) {
                return false;
            }
            ModeratorActionInfo moderatorActionInfo3 = this.actionPending;
            ModeratorActionInfo moderatorActionInfo4 = moderatorSoftMuteModel.actionPending;
            if (moderatorActionInfo3 == null) {
                if (moderatorActionInfo4 != null) {
                    return false;
                }
            } else if (!moderatorActionInfo3.equals(moderatorActionInfo4)) {
                return false;
            }
            ModeratorActionInfo moderatorActionInfo5 = this.actionExecuted;
            ModeratorActionInfo moderatorActionInfo6 = moderatorSoftMuteModel.actionExecuted;
            if (moderatorActionInfo5 == null) {
                if (moderatorActionInfo6 != null) {
                    return false;
                }
            } else if (!moderatorActionInfo5.equals(moderatorActionInfo6)) {
                return false;
            }
            if (!this.issueActionTargetUids.equals(moderatorSoftMuteModel.issueActionTargetUids)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.issueActionTargetUids, (((((((((((((AbstractC2326GOr.A03(this.isCapabilityInitialized ? 1 : 0) + (this.isFeatureEnabled ? 1 : 0)) * 31) + (this.actionCapabilitiesAsModerator ? 1 : 0)) * 31) + (this.actionCapabilitiesAsParticipant ? 1 : 0)) * 31) + this.conferenceParticipantCapabilities.hashCode()) * 31) + AnonymousClass001.A02(this.actionIssued)) * 31) + AnonymousClass001.A02(this.actionPending)) * 31) + 4YU.A03(this.actionExecuted)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ModeratorSoftMuteModel{isCapabilityInitialized=");
        A0k.append(this.isCapabilityInitialized);
        A0k.append(",isFeatureEnabled=");
        A0k.append(this.isFeatureEnabled);
        A0k.append(",actionCapabilitiesAsModerator=");
        A0k.append(this.actionCapabilitiesAsModerator);
        A0k.append(",actionCapabilitiesAsParticipant=");
        A0k.append(this.actionCapabilitiesAsParticipant);
        A0k.append(",conferenceParticipantCapabilities=");
        A0k.append(this.conferenceParticipantCapabilities);
        A0k.append(",actionIssued=");
        A0k.append(this.actionIssued);
        A0k.append(",actionPending=");
        A0k.append(this.actionPending);
        A0k.append(",actionExecuted=");
        A0k.append(this.actionExecuted);
        A0k.append(",issueActionTargetUids=");
        return AbstractC2327GOs.A0U(this.issueActionTargetUids, A0k);
    }
}
