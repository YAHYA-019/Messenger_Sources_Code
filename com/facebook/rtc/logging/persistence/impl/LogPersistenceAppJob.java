package com.facebook.rtc.logging.persistence.impl;

import X.0BY;
import X.0BZ;
import X.0CU;
import X.0Pz;
import X.0fH;
import X.0jH;
import X.0yR;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Mi;
import X.1Od;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.51I;
import X.51J;
import X.51K;
import X.51L;
import X.AnonymousClass001;
import X.C00i;
import X.C01g;
import X.C01h;
import X.C03r;
import X.C0gx;
import X.C82y;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.rsys.log.gen.CallSummaryInfo;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: LogPersistenceAppJob.class */
public final class LogPersistenceAppJob {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 51I A05;

    public LogPersistenceAppJob() {
        1Br A00 = 1Bq.A00(98404);
        this.A01 = A00;
        this.A03 = 1Bq.A00(16634);
        this.A00 = 1Bq.A00(16616);
        this.A04 = 1Bq.A00(84491);
        this.A02 = 1Bq.A00(33013);
        51I r0 = 51I.A02;
        1Mi r02 = (1Mi) A00.A00.get();
        11T.A0F(r02, 0);
        51I.A01 = r02;
        51J r03 = 51J.A01;
        File file = null;
        try {
            file = r02.AUU(384226697);
        } catch (Exception e) {
            0fH.A0q("LogPersistence", "Failed to open call status directory", e);
        }
        51J.A00 = file;
        51I.A00 = r03;
        this.A05 = r0;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.facebook.rsys.log.gen.CallSummaryInfo$Builder] */
    public static final CallSummaryInfo.Builder A00(String str) {
        JSONObject jSONObject = new JSONObject(str);
        ?? obj = new Object();
        obj.localCallId = jSONObject.getString("localCallId");
        obj.sharedCallId = (String) A01("sharedCallId", new 0BY(String.class), jSONObject);
        obj.systemTime = jSONObject.getLong("systemTime");
        obj.steadyTime = jSONObject.getLong("steadyTime");
        obj.callCreatedTime = jSONObject.getLong("callCreatedTime");
        Class cls = Long.TYPE;
        obj.engineCreatedTime = (Long) A01("engineCreatedTime", new 0BY(cls), jSONObject);
        obj.callAnsweredTime = jSONObject.getLong("callAnsweredTime");
        obj.callConnectedTime = jSONObject.getLong("callConnectedTime");
        obj.callEndedTime = jSONObject.getLong("callEndedTime");
        obj.joinableCompleteTime = (Long) A01("joinableCompleteTime", new 0BY(cls), jSONObject);
        obj.lastUpdatedTime = jSONObject.getLong("lastUpdatedTime");
        obj.callTrigger = jSONObject.getString("callTrigger");
        obj.isCaller = jSONObject.getBoolean("isCaller");
        obj.peerId = (String) A01("peerId", new 0BY(String.class), jSONObject);
        obj.endCallReason = (String) A01("endCallReason", new 0BY(String.class), jSONObject);
        Class cls2 = Boolean.TYPE;
        obj.remoteEnded = (Boolean) A01("remoteEnded", new 0BY(cls2), jSONObject);
        obj.inviteRequestedVideo = (Boolean) A01("inviteRequestedVideo", new 0BY(cls2), jSONObject);
        Class cls3 = Long.TYPE;
        obj.mediaGateBlockedFrameCount = (Long) A01("mediaGateBlockedFrameCount", new 0BY(cls3), jSONObject);
        obj.videoEscalationStatus = (String) A01("videoEscalationStatus", new 0BY(String.class), jSONObject);
        obj.localVideoDuration = (Long) A01("localVideoDuration", new 0BY(cls3), jSONObject);
        obj.remoteVideoDuration = (Long) A01("remoteVideoDuration", new 0BY(cls3), jSONObject);
        obj.batteryStartLevel = (Long) A01("batteryStartLevel", new 0BY(cls3), jSONObject);
        obj.batteryEndLevel = (Long) A01("batteryEndLevel", new 0BY(cls3), jSONObject);
        Class cls4 = Boolean.TYPE;
        obj.wasDeviceCharged = (Boolean) A01("wasDeviceCharged", new 0BY(cls4), jSONObject);
        obj.joiningContext = (String) A01("joiningContext", new 0BY(String.class), jSONObject);
        obj.webDeviceId = (String) A01("webDeviceId", new 0BY(String.class), jSONObject);
        obj.endCallSubreason = (String) A01("endCallSubreason", new 0BY(String.class), jSONObject);
        obj.coldStartReason = (String) A01("coldStartReason", new 0BY(String.class), jSONObject);
        obj.isConnectedEnd = (Boolean) A01("isConnectedEnd", new 0BY(cls4), jSONObject);
        Class cls5 = Long.TYPE;
        obj.deviceShutdownTime = (Long) A01("deviceShutdownTime", new 0BY(cls5), jSONObject);
        obj.maxConcurrentConnectedParticipant = (Long) A01("maxConcurrentConnectedParticipant", new 0BY(cls5), jSONObject);
        obj.rtcActorId = (Long) A01("rtcActorId", new 0BY(cls5), jSONObject);
        obj.autoRejoinCount = (Long) A01("autoRejoinCount", new 0BY(cls5), jSONObject);
        obj.joinMode = (String) A01("joinMode", new 0BY(String.class), jSONObject);
        obj.autoRejoinSuccessfulCount = (Long) A01("autoRejoinSuccessfulCount", new 0BY(cls5), jSONObject);
        obj.webrtcVersion = (String) A01("webrtcVersion", new 0BY(String.class), jSONObject);
        obj.clientSessionId = (String) A01("clientSessionId", new 0BY(String.class), jSONObject);
        obj.endCallAppState = (String) A01("endCallAppState", new 0BY(String.class), jSONObject);
        obj.isAutomation = (Boolean) A01("isAutomation", new 0BY(Boolean.TYPE), jSONObject);
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Long] */
    public static final Object A01(String str, 0BZ r302, JSONObject jSONObject) {
        ArrayList A0s;
        if (!jSONObject.has(str)) {
            return null;
        }
        if (r302.equals(new 0BY(Long.TYPE))) {
            A0s = Long.valueOf(jSONObject.getLong(str));
        } else {
            if (!r302.equals(new 0BY(ArrayList.class))) {
                return jSONObject.get(str);
            }
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            A0s = AnonymousClass001.A0s();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                A0s.add(jSONArray.getString(i));
            }
        }
        return A0s;
    }

    public final void A02() {
        File[] listFiles;
        String str;
        this.A04.A00.get();
        long currentTimeMillis = System.currentTimeMillis();
        long A05 = currentTimeMillis - ((1Od) this.A00.A00.get()).A05();
        C01h A01 = C01g.A01(new C82y(this, 40));
        C00i c00i = this.A02.A00;
        String BD0 = ((FbSharedPreferences) c00i.get()).BD0(51K.A0P);
        if (BD0 == null) {
            BD0 = "";
        }
        long Av1 = ((FbSharedPreferences) c00i.get()).Av1(51K.A0Q, -1);
        51L r0 = (51L) A01.getValue();
        11T.A0F(r0, 4);
        if (51I.A00 == null) {
            return;
        }
        long j = currentTimeMillis - 172800000;
        File file = 51J.A00;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            File file2 = listFiles[i2];
            if (file2.lastModified() > A05) {
                0fH.A0j("AppLogPersistenceAppJobBase", "Skipping file for call from current app session.");
            } else {
                try {
                    try {
                        if (file2.lastModified() > j) {
                            String A012 = 0yR.A01(file2, C03r.A05);
                            String name = file2.getName();
                            11T.A0A(name);
                            String A0H = 0CU.A0H(name, ".", name);
                            if (!11T.A0O(A0H, "callSummaryInfo")) {
                                throw AnonymousClass001.A0L("Invalid log type");
                                break;
                            }
                            CallSummaryInfo callSummaryInfo = new CallSummaryInfo(A00(A012));
                            CallSummaryInfo.Builder A00 = A00(A012);
                            Long l = callSummaryInfo.batteryEndLevel;
                            0jH r02 = 0jH.A0B;
                            if (r02 != null) {
                                str = "psd_null";
                                if (r02.A02(r02.A07) != null) {
                                    C0gx A002 = C0gx.A00(r02, false);
                                    if (A002.A06) {
                                        if (l != null) {
                                            long longValue = l.longValue();
                                            if (longValue >= 0 && longValue <= 1) {
                                                str = 0Pz.A0W(A002.A05 ? "fg_" : "bg_", "battery_death");
                                            }
                                        }
                                        str = A002.A01();
                                    }
                                }
                            } else {
                                str = "not_init";
                            }
                            A00.coldStartReason = str;
                            String str2 = callSummaryInfo.localCallId;
                            11T.A09(str2);
                            long j2 = Av1;
                            if (!BD0.equals(str2)) {
                                j2 = -1;
                            }
                            A00.deviceShutdownTime = Long.valueOf(j2);
                            CallSummaryInfo callSummaryInfo2 = new CallSummaryInfo(A00);
                            1UG A003 = 1UD.A00(r0.A00, 1ZG.A01, "ls_rtc_call_summary");
                            if (A003.isSampled()) {
                                A003.A7R("local_call_id", callSummaryInfo2.localCallId);
                                A003.A6H("system_time", Long.valueOf(callSummaryInfo2.systemTime));
                                A003.A6H("steady_time", Long.valueOf(callSummaryInfo2.steadyTime));
                                A003.A6H("call_created_time", Long.valueOf(callSummaryInfo2.callCreatedTime));
                                A003.A6H("call_answered_time", Long.valueOf(callSummaryInfo2.callAnsweredTime));
                                A003.A6H("call_connected_time", Long.valueOf(callSummaryInfo2.callConnectedTime));
                                A003.A6H("call_ended_time", Long.valueOf(callSummaryInfo2.callEndedTime));
                                A003.A6H("last_updated_time", Long.valueOf(callSummaryInfo2.lastUpdatedTime));
                                A003.A7R("call_trigger", callSummaryInfo2.callTrigger);
                                A003.A5H("is_caller", Boolean.valueOf(callSummaryInfo2.isCaller));
                                String str3 = callSummaryInfo2.sharedCallId;
                                if (str3 != null) {
                                    A003.A7R("shared_call_id", str3);
                                }
                                Long l2 = callSummaryInfo2.engineCreatedTime;
                                if (l2 != null) {
                                    A003.A6H("engine_created_time", l2);
                                }
                                Long l3 = callSummaryInfo2.joinableCompleteTime;
                                if (l3 != null) {
                                    A003.A6H("joinable_complete_time", l3);
                                }
                                String str4 = callSummaryInfo2.peerId;
                                if (str4 != null) {
                                    A003.A7R("peer_id", str4);
                                }
                                String str5 = callSummaryInfo2.endCallReason;
                                if (str5 != null) {
                                    A003.A7R("end_call_reason", str5);
                                }
                                Boolean bool = callSummaryInfo2.remoteEnded;
                                if (bool != null) {
                                    A003.A5H("remote_ended", bool);
                                }
                                Boolean bool2 = callSummaryInfo2.inviteRequestedVideo;
                                if (bool2 != null) {
                                    A003.A5H("invite_requested_video", bool2);
                                }
                                Long l4 = callSummaryInfo2.mediaGateBlockedFrameCount;
                                if (l4 != null) {
                                    A003.A6H("media_gate_blocked_frame_count", l4);
                                }
                                String str6 = callSummaryInfo2.videoEscalationStatus;
                                if (str6 != null) {
                                    A003.A7R("video_escalation_status", str6);
                                }
                                Long l5 = callSummaryInfo2.localVideoDuration;
                                if (l5 != null) {
                                    A003.A6H("local_video_duration", l5);
                                }
                                Long l6 = callSummaryInfo2.remoteVideoDuration;
                                if (l6 != null) {
                                    A003.A6H("remote_video_duration", l6);
                                }
                                Long l7 = callSummaryInfo2.batteryStartLevel;
                                if (l7 != null) {
                                    A003.A6H("battery_start_level", l7);
                                }
                                Long l8 = callSummaryInfo2.batteryEndLevel;
                                if (l8 != null) {
                                    A003.A6H("battery_end_level", l8);
                                }
                                Boolean bool3 = callSummaryInfo2.wasDeviceCharged;
                                if (bool3 != null) {
                                    A003.A5H("was_device_charged", bool3);
                                }
                                String str7 = callSummaryInfo2.joiningContext;
                                if (str7 != null) {
                                    A003.A7R("joining_context", str7);
                                }
                                String str8 = callSummaryInfo2.webDeviceId;
                                if (str8 != null) {
                                    A003.A7R("web_device_id", str8);
                                }
                                String str9 = callSummaryInfo2.endCallSubreason;
                                if (str9 != null) {
                                    A003.A7R("end_call_subreason", str9);
                                }
                                String str10 = callSummaryInfo2.coldStartReason;
                                if (str10 != null) {
                                    A003.A7R("cold_start_reason", str10);
                                }
                                Boolean bool4 = callSummaryInfo2.isConnectedEnd;
                                if (bool4 != null) {
                                    A003.A5H("is_connected_end", bool4);
                                }
                                Long l9 = callSummaryInfo2.deviceShutdownTime;
                                if (l9 != null) {
                                    A003.A6H("device_shutdown_time", l9);
                                }
                                Long l10 = callSummaryInfo2.maxConcurrentConnectedParticipant;
                                if (l10 != null) {
                                    A003.A6H("max_concurrent_connected_participant", l10);
                                }
                                Long l11 = callSummaryInfo2.rtcActorId;
                                if (l11 != null) {
                                    A003.A6H("rtc_actor_id", l11);
                                }
                                Long l12 = callSummaryInfo2.autoRejoinCount;
                                if (l12 != null) {
                                    A003.A6H("auto_rejoin_count", l12);
                                }
                                String str11 = callSummaryInfo2.joinMode;
                                if (str11 != null) {
                                    A003.A7R("join_mode", str11);
                                }
                                Long l13 = callSummaryInfo2.autoRejoinSuccessfulCount;
                                if (l13 != null) {
                                    A003.A6H("auto_rejoin_successful_count", l13);
                                }
                                String str12 = callSummaryInfo2.webrtcVersion;
                                if (str12 != null) {
                                    A003.A7R("webrtc_version", str12);
                                }
                                A003.BZL();
                            }
                            0fH.A0g(callSummaryInfo2, "AppLogPersistenceAppJobBase", 0Pz.A0j("Pending ", A0H, ": \n%s\nuploaded"));
                        }
                    } catch (IOException e) {
                        0fH.A0z("AppLogPersistenceAppJobBase", "Unable to upload crashed call summary:\n%s\ncannot be parsed", e, new Object[]{file2});
                    } catch (Exception e2) {
                        0fH.A0s("AppLogPersistenceAppJobBase", "Unable to upload crashed call summary", e2);
                    }
                } finally {
                    file2.delete();
                }
            }
            i = i2 + 1;
        }
    }
}
