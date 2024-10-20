package com.facebook.rsys.videoeffectcommunication.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoEffectCommunicationModel.class */
public class VideoEffectCommunicationModel {
    public static 2JQ CONVERTER = new IQz(13);
    public static long sMcfTypeId;
    public final VideoEffectCommunicationCallLayoutRemovingState callLayoutRemovingState;
    public final long confirmationPromptEffectId;
    public final int confirmationPromptState;
    public final boolean effectReadyForSplitScreen;
    public final VideoEffectCommunicationGroupEffectSharingState effectReceivingState;
    public final VideoEffectCommunicationGroupEffectSharingState effectSendingState;
    public final long multipeerListeningEffectId;
    public final long participantModuleEffectId;
    public final Long updatedCallLayoutEffectId;
    public final int updatedGroupEffectStatus;

    public VideoEffectCommunicationModel(VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState, VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState2, int i, long j, long j2, long j3, Long l, int i2, VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState, boolean z) {
        this.effectReceivingState = videoEffectCommunicationGroupEffectSharingState;
        this.effectSendingState = videoEffectCommunicationGroupEffectSharingState2;
        this.confirmationPromptState = i;
        this.confirmationPromptEffectId = j;
        this.multipeerListeningEffectId = j2;
        this.participantModuleEffectId = j3;
        this.updatedCallLayoutEffectId = l;
        this.updatedGroupEffectStatus = i2;
        this.callLayoutRemovingState = videoEffectCommunicationCallLayoutRemovingState;
        this.effectReadyForSplitScreen = z;
    }

    public static native VideoEffectCommunicationModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoEffectCommunicationModel)) {
                return false;
            }
            VideoEffectCommunicationModel videoEffectCommunicationModel = (VideoEffectCommunicationModel) obj;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState = this.effectReceivingState;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState2 = videoEffectCommunicationModel.effectReceivingState;
            if (videoEffectCommunicationGroupEffectSharingState == null) {
                if (videoEffectCommunicationGroupEffectSharingState2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationGroupEffectSharingState.equals(videoEffectCommunicationGroupEffectSharingState2)) {
                return false;
            }
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState3 = this.effectSendingState;
            VideoEffectCommunicationGroupEffectSharingState videoEffectCommunicationGroupEffectSharingState4 = videoEffectCommunicationModel.effectSendingState;
            if (videoEffectCommunicationGroupEffectSharingState3 == null) {
                if (videoEffectCommunicationGroupEffectSharingState4 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationGroupEffectSharingState3.equals(videoEffectCommunicationGroupEffectSharingState4)) {
                return false;
            }
            if (this.confirmationPromptState != videoEffectCommunicationModel.confirmationPromptState || this.confirmationPromptEffectId != videoEffectCommunicationModel.confirmationPromptEffectId || this.multipeerListeningEffectId != videoEffectCommunicationModel.multipeerListeningEffectId || this.participantModuleEffectId != videoEffectCommunicationModel.participantModuleEffectId) {
                return false;
            }
            Long l = this.updatedCallLayoutEffectId;
            Long l2 = videoEffectCommunicationModel.updatedCallLayoutEffectId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (this.updatedGroupEffectStatus != videoEffectCommunicationModel.updatedGroupEffectStatus) {
                return false;
            }
            VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState = this.callLayoutRemovingState;
            VideoEffectCommunicationCallLayoutRemovingState videoEffectCommunicationCallLayoutRemovingState2 = videoEffectCommunicationModel.callLayoutRemovingState;
            if (videoEffectCommunicationCallLayoutRemovingState == null) {
                if (videoEffectCommunicationCallLayoutRemovingState2 != null) {
                    return false;
                }
            } else if (!videoEffectCommunicationCallLayoutRemovingState.equals(videoEffectCommunicationCallLayoutRemovingState2)) {
                return false;
            }
            if (this.effectReadyForSplitScreen != videoEffectCommunicationModel.effectReadyForSplitScreen) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass002.A02(this.participantModuleEffectId, AnonymousClass002.A02(this.multipeerListeningEffectId, AnonymousClass002.A02(this.confirmationPromptEffectId, (((AbstractC2326GOr.A03(AnonymousClass001.A02(this.effectReceivingState)) + AnonymousClass001.A02(this.effectSendingState)) * 31) + this.confirmationPromptState) * 31))) + AnonymousClass001.A02(this.updatedCallLayoutEffectId)) * 31) + this.updatedGroupEffectStatus) * 31) + 4YU.A03(this.callLayoutRemovingState)) * 31) + (this.effectReadyForSplitScreen ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoEffectCommunicationModel{effectReceivingState=");
        A0k.append(this.effectReceivingState);
        A0k.append(",effectSendingState=");
        A0k.append(this.effectSendingState);
        A0k.append(",confirmationPromptState=");
        A0k.append(this.confirmationPromptState);
        A0k.append(",confirmationPromptEffectId=");
        A0k.append(this.confirmationPromptEffectId);
        A0k.append(",multipeerListeningEffectId=");
        A0k.append(this.multipeerListeningEffectId);
        A0k.append(",participantModuleEffectId=");
        A0k.append(this.participantModuleEffectId);
        A0k.append(",updatedCallLayoutEffectId=");
        A0k.append(this.updatedCallLayoutEffectId);
        A0k.append(",updatedGroupEffectStatus=");
        A0k.append(this.updatedGroupEffectStatus);
        A0k.append(",callLayoutRemovingState=");
        A0k.append(this.callLayoutRemovingState);
        A0k.append(",effectReadyForSplitScreen=");
        return AbstractC2327GOs.A0X(A0k, this.effectReadyForSplitScreen);
    }
}
