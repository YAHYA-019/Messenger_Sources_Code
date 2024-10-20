package com.facebook.rsys.log.gen;

import X.0Pz;
import X.1BJ;
import X.1BL;
import X.2JQ;
import X.4YU;
import X.4YV;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOm;
import X.GOq;
import X.JR1;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CallSummaryInfo.class */
public class CallSummaryInfo {
    public static 2JQ CONVERTER = LVi.A00(28);
    public static long sMcfTypeId;
    public final Long autoRejoinCount;
    public final Long autoRejoinSuccessfulCount;
    public final Long batteryEndLevel;
    public final Long batteryStartLevel;
    public final long callAnsweredTime;
    public final long callConnectedTime;
    public final long callCreatedTime;
    public final long callEndedTime;
    public final String callTrigger;
    public final String clientSessionId;
    public final String coldStartReason;
    public final Long deviceShutdownTime;
    public final String endCallAppState;
    public final String endCallReason;
    public final String endCallSubreason;
    public final Long engineCreatedTime;
    public final Boolean inviteRequestedVideo;
    public final Boolean isAutomation;
    public final boolean isCaller;
    public final Boolean isConnectedEnd;
    public final String joinMode;
    public final Long joinableCompleteTime;
    public final String joiningContext;
    public final long lastUpdatedTime;
    public final String localCallId;
    public final Long localVideoDuration;
    public final Long maxConcurrentConnectedParticipant;
    public final Long mediaGateBlockedFrameCount;
    public final String peerId;
    public final Boolean remoteEnded;
    public final Long remoteVideoDuration;
    public final Long rtcActorId;
    public final String sharedCallId;
    public final long steadyTime;
    public final long systemTime;
    public final String videoEscalationStatus;
    public final Boolean wasDeviceCharged;
    public final String webDeviceId;
    public final String webrtcVersion;

    /* loaded from: CallSummaryInfo$Builder.class */
    public class Builder {
        public Long autoRejoinCount;
        public Long autoRejoinSuccessfulCount;
        public Long batteryEndLevel;
        public Long batteryStartLevel;
        public long callAnsweredTime;
        public long callConnectedTime;
        public long callCreatedTime;
        public long callEndedTime;
        public String callTrigger;
        public String clientSessionId;
        public String coldStartReason;
        public Long deviceShutdownTime;
        public String endCallAppState;
        public String endCallReason;
        public String endCallSubreason;
        public Long engineCreatedTime;
        public Boolean inviteRequestedVideo;
        public Boolean isAutomation;
        public boolean isCaller;
        public Boolean isConnectedEnd;
        public String joinMode;
        public Long joinableCompleteTime;
        public String joiningContext;
        public long lastUpdatedTime;
        public String localCallId;
        public Long localVideoDuration;
        public Long maxConcurrentConnectedParticipant;
        public Long mediaGateBlockedFrameCount;
        public String peerId;
        public Boolean remoteEnded;
        public Long remoteVideoDuration;
        public Long rtcActorId;
        public String sharedCallId;
        public long steadyTime;
        public long systemTime;
        public String videoEscalationStatus;
        public Boolean wasDeviceCharged;
        public String webDeviceId;
        public String webrtcVersion;

        public CallSummaryInfo build() {
            return new CallSummaryInfo(this);
        }
    }

    public CallSummaryInfo(Builder builder) {
        builder.localCallId.getClass();
        builder.callTrigger.getClass();
        this.localCallId = builder.localCallId;
        this.sharedCallId = builder.sharedCallId;
        this.systemTime = builder.systemTime;
        this.steadyTime = builder.steadyTime;
        this.callCreatedTime = builder.callCreatedTime;
        this.engineCreatedTime = builder.engineCreatedTime;
        this.callAnsweredTime = builder.callAnsweredTime;
        this.callConnectedTime = builder.callConnectedTime;
        this.callEndedTime = builder.callEndedTime;
        this.joinableCompleteTime = builder.joinableCompleteTime;
        this.lastUpdatedTime = builder.lastUpdatedTime;
        this.callTrigger = builder.callTrigger;
        this.isCaller = builder.isCaller;
        this.peerId = builder.peerId;
        this.endCallReason = builder.endCallReason;
        this.remoteEnded = builder.remoteEnded;
        this.inviteRequestedVideo = builder.inviteRequestedVideo;
        this.mediaGateBlockedFrameCount = builder.mediaGateBlockedFrameCount;
        this.videoEscalationStatus = builder.videoEscalationStatus;
        this.localVideoDuration = builder.localVideoDuration;
        this.remoteVideoDuration = builder.remoteVideoDuration;
        this.batteryStartLevel = builder.batteryStartLevel;
        this.batteryEndLevel = builder.batteryEndLevel;
        this.wasDeviceCharged = builder.wasDeviceCharged;
        this.joiningContext = builder.joiningContext;
        this.webDeviceId = builder.webDeviceId;
        this.endCallSubreason = builder.endCallSubreason;
        this.coldStartReason = builder.coldStartReason;
        this.isConnectedEnd = builder.isConnectedEnd;
        this.deviceShutdownTime = builder.deviceShutdownTime;
        this.maxConcurrentConnectedParticipant = builder.maxConcurrentConnectedParticipant;
        this.rtcActorId = builder.rtcActorId;
        this.autoRejoinCount = builder.autoRejoinCount;
        this.joinMode = builder.joinMode;
        this.autoRejoinSuccessfulCount = builder.autoRejoinSuccessfulCount;
        this.webrtcVersion = builder.webrtcVersion;
        this.clientSessionId = builder.clientSessionId;
        this.endCallAppState = builder.endCallAppState;
        this.isAutomation = builder.isAutomation;
    }

    public static native CallSummaryInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallSummaryInfo)) {
                return false;
            }
            CallSummaryInfo callSummaryInfo = (CallSummaryInfo) obj;
            if (!this.localCallId.equals(callSummaryInfo.localCallId)) {
                return false;
            }
            String str = this.sharedCallId;
            String str2 = callSummaryInfo.sharedCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.systemTime != callSummaryInfo.systemTime || this.steadyTime != callSummaryInfo.steadyTime || this.callCreatedTime != callSummaryInfo.callCreatedTime) {
                return false;
            }
            Long l = this.engineCreatedTime;
            Long l2 = callSummaryInfo.engineCreatedTime;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (this.callAnsweredTime != callSummaryInfo.callAnsweredTime || this.callConnectedTime != callSummaryInfo.callConnectedTime || this.callEndedTime != callSummaryInfo.callEndedTime) {
                return false;
            }
            Long l3 = this.joinableCompleteTime;
            Long l4 = callSummaryInfo.joinableCompleteTime;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            if (this.lastUpdatedTime != callSummaryInfo.lastUpdatedTime || !this.callTrigger.equals(callSummaryInfo.callTrigger) || this.isCaller != callSummaryInfo.isCaller) {
                return false;
            }
            String str3 = this.peerId;
            String str4 = callSummaryInfo.peerId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.endCallReason;
            String str6 = callSummaryInfo.endCallReason;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            Boolean bool = this.remoteEnded;
            Boolean bool2 = callSummaryInfo.remoteEnded;
            if (bool == null) {
                if (bool2 != null) {
                    return false;
                }
            } else if (!bool.equals(bool2)) {
                return false;
            }
            Boolean bool3 = this.inviteRequestedVideo;
            Boolean bool4 = callSummaryInfo.inviteRequestedVideo;
            if (bool3 == null) {
                if (bool4 != null) {
                    return false;
                }
            } else if (!bool3.equals(bool4)) {
                return false;
            }
            Long l5 = this.mediaGateBlockedFrameCount;
            Long l6 = callSummaryInfo.mediaGateBlockedFrameCount;
            if (l5 == null) {
                if (l6 != null) {
                    return false;
                }
            } else if (!l5.equals(l6)) {
                return false;
            }
            String str7 = this.videoEscalationStatus;
            String str8 = callSummaryInfo.videoEscalationStatus;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            Long l7 = this.localVideoDuration;
            Long l8 = callSummaryInfo.localVideoDuration;
            if (l7 == null) {
                if (l8 != null) {
                    return false;
                }
            } else if (!l7.equals(l8)) {
                return false;
            }
            Long l9 = this.remoteVideoDuration;
            Long l10 = callSummaryInfo.remoteVideoDuration;
            if (l9 == null) {
                if (l10 != null) {
                    return false;
                }
            } else if (!l9.equals(l10)) {
                return false;
            }
            Long l11 = this.batteryStartLevel;
            Long l12 = callSummaryInfo.batteryStartLevel;
            if (l11 == null) {
                if (l12 != null) {
                    return false;
                }
            } else if (!l11.equals(l12)) {
                return false;
            }
            Long l13 = this.batteryEndLevel;
            Long l14 = callSummaryInfo.batteryEndLevel;
            if (l13 == null) {
                if (l14 != null) {
                    return false;
                }
            } else if (!l13.equals(l14)) {
                return false;
            }
            Boolean bool5 = this.wasDeviceCharged;
            Boolean bool6 = callSummaryInfo.wasDeviceCharged;
            if (bool5 == null) {
                if (bool6 != null) {
                    return false;
                }
            } else if (!bool5.equals(bool6)) {
                return false;
            }
            String str9 = this.joiningContext;
            String str10 = callSummaryInfo.joiningContext;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.webDeviceId;
            String str12 = callSummaryInfo.webDeviceId;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            String str13 = this.endCallSubreason;
            String str14 = callSummaryInfo.endCallSubreason;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            String str15 = this.coldStartReason;
            String str16 = callSummaryInfo.coldStartReason;
            if (str15 == null) {
                if (str16 != null) {
                    return false;
                }
            } else if (!str15.equals(str16)) {
                return false;
            }
            Boolean bool7 = this.isConnectedEnd;
            Boolean bool8 = callSummaryInfo.isConnectedEnd;
            if (bool7 == null) {
                if (bool8 != null) {
                    return false;
                }
            } else if (!bool7.equals(bool8)) {
                return false;
            }
            Long l15 = this.deviceShutdownTime;
            Long l16 = callSummaryInfo.deviceShutdownTime;
            if (l15 == null) {
                if (l16 != null) {
                    return false;
                }
            } else if (!l15.equals(l16)) {
                return false;
            }
            Long l17 = this.maxConcurrentConnectedParticipant;
            Long l18 = callSummaryInfo.maxConcurrentConnectedParticipant;
            if (l17 == null) {
                if (l18 != null) {
                    return false;
                }
            } else if (!l17.equals(l18)) {
                return false;
            }
            Long l19 = this.rtcActorId;
            Long l20 = callSummaryInfo.rtcActorId;
            if (l19 == null) {
                if (l20 != null) {
                    return false;
                }
            } else if (!l19.equals(l20)) {
                return false;
            }
            Long l21 = this.autoRejoinCount;
            Long l22 = callSummaryInfo.autoRejoinCount;
            if (l21 == null) {
                if (l22 != null) {
                    return false;
                }
            } else if (!l21.equals(l22)) {
                return false;
            }
            String str17 = this.joinMode;
            String str18 = callSummaryInfo.joinMode;
            if (str17 == null) {
                if (str18 != null) {
                    return false;
                }
            } else if (!str17.equals(str18)) {
                return false;
            }
            Long l23 = this.autoRejoinSuccessfulCount;
            Long l24 = callSummaryInfo.autoRejoinSuccessfulCount;
            if (l23 == null) {
                if (l24 != null) {
                    return false;
                }
            } else if (!l23.equals(l24)) {
                return false;
            }
            String str19 = this.webrtcVersion;
            String str20 = callSummaryInfo.webrtcVersion;
            if (str19 == null) {
                if (str20 != null) {
                    return false;
                }
            } else if (!str19.equals(str20)) {
                return false;
            }
            String str21 = this.clientSessionId;
            String str22 = callSummaryInfo.clientSessionId;
            if (str21 == null) {
                if (str22 != null) {
                    return false;
                }
            } else if (!str21.equals(str22)) {
                return false;
            }
            String str23 = this.endCallAppState;
            String str24 = callSummaryInfo.endCallAppState;
            if (str23 == null) {
                if (str24 != null) {
                    return false;
                }
            } else if (!str23.equals(str24)) {
                return false;
            }
            Boolean bool9 = this.isAutomation;
            Boolean bool10 = callSummaryInfo.isAutomation;
            if (bool9 == null) {
                if (bool10 != null) {
                    return false;
                }
            } else if (!bool9.equals(bool10)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((AnonymousClass002.A07(this.callTrigger, AnonymousClass002.A02(this.lastUpdatedTime, (AnonymousClass002.A02(this.callEndedTime, AnonymousClass002.A02(this.callConnectedTime, AnonymousClass002.A02(this.callAnsweredTime, (AnonymousClass002.A02(this.callCreatedTime, AnonymousClass002.A02(this.steadyTime, AnonymousClass002.A02(this.systemTime, (AbstractC2326GOr.A07(this.localCallId) + 1BL.A05(this.sharedCallId)) * 31))) + AnonymousClass001.A02(this.engineCreatedTime)) * 31))) + AnonymousClass001.A02(this.joinableCompleteTime)) * 31)) + (this.isCaller ? 1 : 0)) * 31) + 1BL.A05(this.peerId)) * 31) + 1BL.A05(this.endCallReason)) * 31) + AnonymousClass001.A02(this.remoteEnded)) * 31) + AnonymousClass001.A02(this.inviteRequestedVideo)) * 31) + AnonymousClass001.A02(this.mediaGateBlockedFrameCount)) * 31) + 1BL.A05(this.videoEscalationStatus)) * 31) + AnonymousClass001.A02(this.localVideoDuration)) * 31) + AnonymousClass001.A02(this.remoteVideoDuration)) * 31) + AnonymousClass001.A02(this.batteryStartLevel)) * 31) + AnonymousClass001.A02(this.batteryEndLevel)) * 31) + AnonymousClass001.A02(this.wasDeviceCharged)) * 31) + 1BL.A05(this.joiningContext)) * 31) + 1BL.A05(this.webDeviceId)) * 31) + 1BL.A05(this.endCallSubreason)) * 31) + 1BL.A05(this.coldStartReason)) * 31) + AnonymousClass001.A02(this.isConnectedEnd)) * 31) + AnonymousClass001.A02(this.deviceShutdownTime)) * 31) + AnonymousClass001.A02(this.maxConcurrentConnectedParticipant)) * 31) + AnonymousClass001.A02(this.rtcActorId)) * 31) + AnonymousClass001.A02(this.autoRejoinCount)) * 31) + 1BL.A05(this.joinMode)) * 31) + AnonymousClass001.A02(this.autoRejoinSuccessfulCount)) * 31) + 1BL.A05(this.webrtcVersion)) * 31) + 1BL.A05(this.clientSessionId)) * 31) + 1BL.A05(this.endCallAppState)) * 31) + 4YU.A03(this.isAutomation);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallSummaryInfo{");
        4YU.A1S("localCallId=", this.localCallId, A0k);
        4YU.A1S(1BJ.A00(245), this.sharedCallId, A0k);
        4YV.A1O(",systemTime=", A0k, this.systemTime);
        4YV.A1O(",steadyTime=", A0k, this.steadyTime);
        4YV.A1O(",callCreatedTime=", A0k, this.callCreatedTime);
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append(",engineCreatedTime=");
        JR1.A1J(this.engineCreatedTime, A0k2, A0k);
        4YV.A1O(",callAnsweredTime=", A0k, this.callAnsweredTime);
        4YV.A1O(",callConnectedTime=", A0k, this.callConnectedTime);
        4YV.A1O(",callEndedTime=", A0k, this.callEndedTime);
        StringBuilder A0k3 = AnonymousClass001.A0k();
        A0k3.append(",joinableCompleteTime=");
        JR1.A1J(this.joinableCompleteTime, A0k3, A0k);
        4YV.A1O(",lastUpdatedTime=", A0k, this.lastUpdatedTime);
        4YU.A1S(",callTrigger=", this.callTrigger, A0k);
        A0k.append(0Pz.A1C(",isCaller=", this.isCaller));
        4YU.A1S(",peerId=", this.peerId, A0k);
        4YU.A1S(",endCallReason=", this.endCallReason, A0k);
        StringBuilder A0k4 = AnonymousClass001.A0k();
        A0k4.append(GOm.A00(108));
        StringBuilder A0j = AbstractC2326GOr.A0j(this.remoteEnded, A0k4, A0k);
        A0j.append(1BJ.A00(619));
        StringBuilder A0j2 = AbstractC2326GOr.A0j(this.inviteRequestedVideo, A0j, A0k);
        A0j2.append(",mediaGateBlockedFrameCount=");
        JR1.A1J(this.mediaGateBlockedFrameCount, A0j2, A0k);
        4YU.A1S(",videoEscalationStatus=", this.videoEscalationStatus, A0k);
        StringBuilder A0k5 = AnonymousClass001.A0k();
        A0k5.append(",localVideoDuration=");
        StringBuilder A0j3 = AbstractC2326GOr.A0j(this.localVideoDuration, A0k5, A0k);
        A0j3.append(",remoteVideoDuration=");
        StringBuilder A0j4 = AbstractC2326GOr.A0j(this.remoteVideoDuration, A0j3, A0k);
        A0j4.append(",batteryStartLevel=");
        StringBuilder A0j5 = AbstractC2326GOr.A0j(this.batteryStartLevel, A0j4, A0k);
        A0j5.append(",batteryEndLevel=");
        StringBuilder A0j6 = AbstractC2326GOr.A0j(this.batteryEndLevel, A0j5, A0k);
        A0j6.append(",wasDeviceCharged=");
        JR1.A1J(this.wasDeviceCharged, A0j6, A0k);
        4YU.A1S(",joiningContext=", this.joiningContext, A0k);
        4YU.A1S(",webDeviceId=", this.webDeviceId, A0k);
        4YU.A1S(",endCallSubreason=", this.endCallSubreason, A0k);
        4YU.A1S(",coldStartReason=", this.coldStartReason, A0k);
        StringBuilder A0k6 = AnonymousClass001.A0k();
        A0k6.append(",isConnectedEnd=");
        StringBuilder A0j7 = AbstractC2326GOr.A0j(this.isConnectedEnd, A0k6, A0k);
        A0j7.append(",deviceShutdownTime=");
        StringBuilder A0j8 = AbstractC2326GOr.A0j(this.deviceShutdownTime, A0j7, A0k);
        A0j8.append(",maxConcurrentConnectedParticipant=");
        StringBuilder A0j9 = AbstractC2326GOr.A0j(this.maxConcurrentConnectedParticipant, A0j8, A0k);
        A0j9.append(",rtcActorId=");
        StringBuilder A0j10 = AbstractC2326GOr.A0j(this.rtcActorId, A0j9, A0k);
        A0j10.append(",autoRejoinCount=");
        JR1.A1J(this.autoRejoinCount, A0j10, A0k);
        4YU.A1S(GOm.A00(35), this.joinMode, A0k);
        StringBuilder A0k7 = AnonymousClass001.A0k();
        A0k7.append(",autoRejoinSuccessfulCount=");
        JR1.A1J(this.autoRejoinSuccessfulCount, A0k7, A0k);
        4YU.A1S(",webrtcVersion=", this.webrtcVersion, A0k);
        4YU.A1S(",clientSessionId=", this.clientSessionId, A0k);
        4YU.A1S(",endCallAppState=", this.endCallAppState, A0k);
        StringBuilder A0k8 = AnonymousClass001.A0k();
        A0k8.append(",isAutomation=");
        return GOq.A12(AnonymousClass001.A0a(this.isAutomation, A0k8), A0k);
    }
}
