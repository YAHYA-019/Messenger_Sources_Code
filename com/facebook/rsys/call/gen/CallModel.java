package com.facebook.rsys.call.gen;

import X.1BL;
import X.2JQ;
import X.30R;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOm;
import X.JQw;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.callinfo.gen.CallInfo;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: CallModel.class */
public class CallModel {
    public static 2JQ CONVERTER = new 30R(0);
    public static long sMcfTypeId;
    public final boolean acceptRemoteVideoEnabled;
    public final long callAnsweredTimestampMs;
    public final long callConnectedTimestampMs;
    public final CallContext callContext;
    public final long callCreatedTimestampMs;
    public final long callEndedTimestampMs;
    public final CallInfo callInfo;
    public final int callStartedWithCamera;
    public final String callTrigger;
    public final boolean canSendMultipleVideoStreams;
    public final boolean canSendScreenshareStream;
    public final String clientEndpointId;
    public final int connectionQuality;
    public final int inCallState;
    public final ArrayList initialDataMessages;
    public final int initialDirection;
    public final boolean inviteRequestedVideo;
    public final boolean joinAttemptSent;
    public final int joinMode;
    public final boolean maxParticipantsReached;
    public final ArrayList notifications;
    public final long numSuccessfulRejoins;
    public final long rejoinAttempts;
    public final long rejoinTotalAttempts;
    public final ArrayList remoteParticipants;
    public final int requiredVideoEscalationConsent;
    public final CallParticipant selfParticipant;
    public final String sharedCallId;
    public final boolean supportsSctp;
    public final int transferState;
    public final Map userCapabilities;

    public CallModel(int i, long j, long j2, long j3, long j4, boolean z, boolean z2, int i2, int i3, CallParticipant callParticipant, ArrayList arrayList, CallContext callContext, CallInfo callInfo, boolean z3, boolean z4, boolean z5, String str, ArrayList arrayList2, Map map, ArrayList arrayList3, int i4, int i5, long j5, long j6, long j7, int i6, int i7, String str2, boolean z6, boolean z7, String str3) {
        callParticipant.getClass();
        arrayList.getClass();
        callContext.getClass();
        callInfo.getClass();
        arrayList2.getClass();
        str2.getClass();
        this.inCallState = i;
        this.callCreatedTimestampMs = j;
        this.callAnsweredTimestampMs = j2;
        this.callConnectedTimestampMs = j3;
        this.callEndedTimestampMs = j4;
        this.inviteRequestedVideo = z;
        this.acceptRemoteVideoEnabled = z2;
        this.requiredVideoEscalationConsent = i2;
        this.callStartedWithCamera = i3;
        this.selfParticipant = callParticipant;
        this.remoteParticipants = arrayList;
        this.callContext = callContext;
        this.callInfo = callInfo;
        this.maxParticipantsReached = z3;
        this.canSendMultipleVideoStreams = z4;
        this.canSendScreenshareStream = z5;
        this.sharedCallId = str;
        this.notifications = arrayList2;
        this.userCapabilities = map;
        this.initialDataMessages = arrayList3;
        this.connectionQuality = i4;
        this.initialDirection = i5;
        this.rejoinAttempts = j5;
        this.rejoinTotalAttempts = j6;
        this.numSuccessfulRejoins = j7;
        this.transferState = i6;
        this.joinMode = i7;
        this.clientEndpointId = str2;
        this.supportsSctp = z6;
        this.joinAttemptSent = z7;
        this.callTrigger = str3;
    }

    public static native CallModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallModel)) {
                return false;
            }
            CallModel callModel = (CallModel) obj;
            if (this.inCallState != callModel.inCallState || this.callCreatedTimestampMs != callModel.callCreatedTimestampMs || this.callAnsweredTimestampMs != callModel.callAnsweredTimestampMs || this.callConnectedTimestampMs != callModel.callConnectedTimestampMs || this.callEndedTimestampMs != callModel.callEndedTimestampMs || this.inviteRequestedVideo != callModel.inviteRequestedVideo || this.acceptRemoteVideoEnabled != callModel.acceptRemoteVideoEnabled || this.requiredVideoEscalationConsent != callModel.requiredVideoEscalationConsent || this.callStartedWithCamera != callModel.callStartedWithCamera || !this.selfParticipant.equals(callModel.selfParticipant) || !this.remoteParticipants.equals(callModel.remoteParticipants) || !this.callContext.equals(callModel.callContext) || !this.callInfo.equals(callModel.callInfo) || this.maxParticipantsReached != callModel.maxParticipantsReached || this.canSendMultipleVideoStreams != callModel.canSendMultipleVideoStreams || this.canSendScreenshareStream != callModel.canSendScreenshareStream) {
                return false;
            }
            String str = this.sharedCallId;
            String str2 = callModel.sharedCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (!this.notifications.equals(callModel.notifications)) {
                return false;
            }
            Map map = this.userCapabilities;
            Map map2 = callModel.userCapabilities;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
            ArrayList arrayList = this.initialDataMessages;
            ArrayList arrayList2 = callModel.initialDataMessages;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (this.connectionQuality != callModel.connectionQuality || this.initialDirection != callModel.initialDirection || this.rejoinAttempts != callModel.rejoinAttempts || this.rejoinTotalAttempts != callModel.rejoinTotalAttempts || this.numSuccessfulRejoins != callModel.numSuccessfulRejoins || this.transferState != callModel.transferState || this.joinMode != callModel.joinMode || !this.clientEndpointId.equals(callModel.clientEndpointId) || this.supportsSctp != callModel.supportsSctp || this.joinAttemptSent != callModel.joinAttemptSent) {
                return false;
            }
            String str3 = this.callTrigger;
            String str4 = callModel.callTrigger;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = AnonymousClass002.A05(this.notifications, (((((((AnonymousClass002.A05(this.callInfo, AnonymousClass002.A05(this.callContext, AnonymousClass002.A05(this.remoteParticipants, AnonymousClass002.A05(this.selfParticipant, (((((((AnonymousClass002.A02(this.callEndedTimestampMs, AnonymousClass002.A02(this.callConnectedTimestampMs, AnonymousClass002.A02(this.callAnsweredTimestampMs, AnonymousClass002.A02(this.callCreatedTimestampMs, (527 + this.inCallState) * 31)))) + (this.inviteRequestedVideo ? 1 : 0)) * 31) + (this.acceptRemoteVideoEnabled ? 1 : 0)) * 31) + this.requiredVideoEscalationConsent) * 31) + this.callStartedWithCamera) * 31)))) + (this.maxParticipantsReached ? 1 : 0)) * 31) + (this.canSendMultipleVideoStreams ? 1 : 0)) * 31) + (this.canSendScreenshareStream ? 1 : 0)) * 31) + 1BL.A05(this.sharedCallId)) * 31);
        Map map = this.userCapabilities;
        int A07 = (((AnonymousClass002.A07(this.clientEndpointId, (((AnonymousClass002.A02(this.numSuccessfulRejoins, AnonymousClass002.A02(this.rejoinTotalAttempts, AnonymousClass002.A02(this.rejoinAttempts, (((((((A05 + (map == null ? 0 : map.hashCode())) * 31) + AnonymousClass001.A02(this.initialDataMessages)) * 31) + this.connectionQuality) * 31) + this.initialDirection) * 31))) + this.transferState) * 31) + this.joinMode) * 31) + (this.supportsSctp ? 1 : 0)) * 31) + (this.joinAttemptSent ? 1 : 0)) * 31;
        String str = this.callTrigger;
        if (str != null) {
            i = str.hashCode();
        }
        return A07 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallModel{inCallState=");
        A0k.append(this.inCallState);
        A0k.append(",callCreatedTimestampMs=");
        A0k.append(this.callCreatedTimestampMs);
        A0k.append(",callAnsweredTimestampMs=");
        A0k.append(this.callAnsweredTimestampMs);
        A0k.append(",callConnectedTimestampMs=");
        A0k.append(this.callConnectedTimestampMs);
        A0k.append(",callEndedTimestampMs=");
        A0k.append(this.callEndedTimestampMs);
        A0k.append(",inviteRequestedVideo=");
        A0k.append(this.inviteRequestedVideo);
        A0k.append(GOm.A00(ActionId.ACTION_BAR_COMPLETE));
        A0k.append(this.acceptRemoteVideoEnabled);
        A0k.append(",requiredVideoEscalationConsent=");
        A0k.append(this.requiredVideoEscalationConsent);
        A0k.append(",callStartedWithCamera=");
        A0k.append(this.callStartedWithCamera);
        A0k.append(",selfParticipant=");
        A0k.append(this.selfParticipant);
        A0k.append(",remoteParticipants=");
        A0k.append(this.remoteParticipants);
        A0k.append(GOm.A00(ActionId.ABORTED));
        A0k.append(this.callContext);
        A0k.append(",callInfo=");
        A0k.append(this.callInfo);
        A0k.append(",maxParticipantsReached=");
        A0k.append(this.maxParticipantsReached);
        A0k.append(",canSendMultipleVideoStreams=");
        A0k.append(this.canSendMultipleVideoStreams);
        A0k.append(",canSendScreenshareStream=");
        A0k.append(this.canSendScreenshareStream);
        A0k.append(",sharedCallId=");
        A0k.append(this.sharedCallId);
        A0k.append(",notifications=");
        A0k.append(this.notifications);
        A0k.append(",userCapabilities=");
        A0k.append(this.userCapabilities);
        A0k.append(GOm.A00(ActionId.QUERY_READY));
        A0k.append(this.initialDataMessages);
        A0k.append(",connectionQuality=");
        A0k.append(this.connectionQuality);
        A0k.append(",initialDirection=");
        A0k.append(this.initialDirection);
        A0k.append(",rejoinAttempts=");
        A0k.append(this.rejoinAttempts);
        A0k.append(",rejoinTotalAttempts=");
        A0k.append(this.rejoinTotalAttempts);
        A0k.append(",numSuccessfulRejoins=");
        A0k.append(this.numSuccessfulRejoins);
        A0k.append(",transferState=");
        A0k.append(this.transferState);
        A0k.append(GOm.A00(35));
        A0k.append(this.joinMode);
        A0k.append(",clientEndpointId=");
        A0k.append(this.clientEndpointId);
        A0k.append(",supportsSctp=");
        A0k.append(this.supportsSctp);
        A0k.append(",joinAttemptSent=");
        A0k.append(this.joinAttemptSent);
        A0k.append(JQw.A00(ActionId.RTMP_CONNECTION_CONNECTED));
        A0k.append(this.callTrigger);
        return 1BL.A0v(A0k);
    }
}
