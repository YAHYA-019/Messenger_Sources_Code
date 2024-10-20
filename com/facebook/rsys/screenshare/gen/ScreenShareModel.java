package com.facebook.rsys.screenshare.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.HashSet;

/* loaded from: ScreenShareModel.class */
public class ScreenShareModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.FAIL_FILE_TOO_LARGE);
    public static long sMcfTypeId;
    public final boolean audioFeatureEnabled;
    public final boolean isSctpEnabled;
    public final long maxParticipants;
    public final PeerScreenShareStates peerStates;
    public final int screenShareAvailability;
    public final boolean screenShareInitiateSharing;
    public final boolean screenShareIntendedOn;
    public final int screenSharePlayerCurrentIndex;
    public final int screenSharePlayerMediaQueueCount;
    public final int screenShareSourceType;
    public final int screenShareState;
    public final boolean screenShareStopSharing;
    public final int screenShareStopSharingActionSource;
    public final HashSet selfRemoteScreenShareChannelIds;

    public ScreenShareModel(boolean z, int i, boolean z2, int i2, int i3, boolean z3, int i4, PeerScreenShareStates peerScreenShareStates, long j, boolean z4, int i5, int i6, HashSet hashSet, boolean z5) {
        hashSet.getClass();
        this.screenShareInitiateSharing = z;
        this.screenShareState = i;
        this.screenShareIntendedOn = z2;
        this.screenShareSourceType = i2;
        this.screenShareAvailability = i3;
        this.screenShareStopSharing = z3;
        this.screenShareStopSharingActionSource = i4;
        this.peerStates = peerScreenShareStates;
        this.maxParticipants = j;
        this.audioFeatureEnabled = z4;
        this.screenSharePlayerMediaQueueCount = i5;
        this.screenSharePlayerCurrentIndex = i6;
        this.selfRemoteScreenShareChannelIds = hashSet;
        this.isSctpEnabled = z5;
    }

    public static native ScreenShareModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ScreenShareModel)) {
                return false;
            }
            ScreenShareModel screenShareModel = (ScreenShareModel) obj;
            if (this.screenShareInitiateSharing != screenShareModel.screenShareInitiateSharing || this.screenShareState != screenShareModel.screenShareState || this.screenShareIntendedOn != screenShareModel.screenShareIntendedOn || this.screenShareSourceType != screenShareModel.screenShareSourceType || this.screenShareAvailability != screenShareModel.screenShareAvailability || this.screenShareStopSharing != screenShareModel.screenShareStopSharing || this.screenShareStopSharingActionSource != screenShareModel.screenShareStopSharingActionSource) {
                return false;
            }
            PeerScreenShareStates peerScreenShareStates = this.peerStates;
            PeerScreenShareStates peerScreenShareStates2 = screenShareModel.peerStates;
            if (peerScreenShareStates == null) {
                if (peerScreenShareStates2 != null) {
                    return false;
                }
            } else if (!peerScreenShareStates.equals(peerScreenShareStates2)) {
                return false;
            }
            if (this.maxParticipants != screenShareModel.maxParticipants || this.audioFeatureEnabled != screenShareModel.audioFeatureEnabled || this.screenSharePlayerMediaQueueCount != screenShareModel.screenSharePlayerMediaQueueCount || this.screenSharePlayerCurrentIndex != screenShareModel.screenSharePlayerCurrentIndex || !this.selfRemoteScreenShareChannelIds.equals(screenShareModel.selfRemoteScreenShareChannelIds) || this.isSctpEnabled != screenShareModel.isSctpEnabled) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.selfRemoteScreenShareChannelIds, (((((AnonymousClass002.A02(this.maxParticipants, (((((((((((((AbstractC2326GOr.A03(this.screenShareInitiateSharing ? 1 : 0) + this.screenShareState) * 31) + (this.screenShareIntendedOn ? 1 : 0)) * 31) + this.screenShareSourceType) * 31) + this.screenShareAvailability) * 31) + (this.screenShareStopSharing ? 1 : 0)) * 31) + this.screenShareStopSharingActionSource) * 31) + AnonymousClass001.A02(this.peerStates)) * 31) + (this.audioFeatureEnabled ? 1 : 0)) * 31) + this.screenSharePlayerMediaQueueCount) * 31) + this.screenSharePlayerCurrentIndex) * 31) + (this.isSctpEnabled ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ScreenShareModel{screenShareInitiateSharing=");
        A0k.append(this.screenShareInitiateSharing);
        A0k.append(",screenShareState=");
        A0k.append(this.screenShareState);
        A0k.append(",screenShareIntendedOn=");
        A0k.append(this.screenShareIntendedOn);
        A0k.append(",screenShareSourceType=");
        A0k.append(this.screenShareSourceType);
        A0k.append(",screenShareAvailability=");
        A0k.append(this.screenShareAvailability);
        A0k.append(",screenShareStopSharing=");
        A0k.append(this.screenShareStopSharing);
        A0k.append(",screenShareStopSharingActionSource=");
        A0k.append(this.screenShareStopSharingActionSource);
        A0k.append(",peerStates=");
        A0k.append(this.peerStates);
        A0k.append(",maxParticipants=");
        A0k.append(this.maxParticipants);
        A0k.append(",audioFeatureEnabled=");
        A0k.append(this.audioFeatureEnabled);
        A0k.append(",screenSharePlayerMediaQueueCount=");
        A0k.append(this.screenSharePlayerMediaQueueCount);
        A0k.append(",screenSharePlayerCurrentIndex=");
        A0k.append(this.screenSharePlayerCurrentIndex);
        A0k.append(",selfRemoteScreenShareChannelIds=");
        A0k.append(this.selfRemoteScreenShareChannelIds);
        A0k.append(",isSctpEnabled=");
        return AbstractC2327GOs.A0X(A0k, this.isSctpEnabled);
    }
}
