package X;

import com.facebook.rsys.log.gen.CallSummaryInfo;
import java.io.File;
import org.json.JSONObject;

/* loaded from: Lph.class */
public final class Lph implements Runnable {
    public static final String __redex_internal_original_name = "AppLogPersistenceProxyHelperBase$writeLog$1";
    public final /* synthetic */ Khl A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ String A02;

    public Lph(Khl khl, Object obj, String str) {
        this.A00 = khl;
        this.A01 = obj;
        this.A02 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.String] */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        Khl khl = this.A00;
        Object obj = this.A01;
        if (!(obj instanceof CallSummaryInfo)) {
            throw AnonymousClass001.A0L(4YT.A00(651));
        }
        ?? r0 = "callSummaryInfo";
        try {
            String str2 = this.A02;
            File file = khl.A01;
            if (file != null) {
                File A0D = AnonymousClass001.A0D(file, 0Pz.A0l("callSummaryInfo", str2, ".callsum", '.'));
                if (A0D != null) {
                    CallSummaryInfo callSummaryInfo = (CallSummaryInfo) obj;
                    11T.A0F(callSummaryInfo, 0);
                    JSONObject A12 = AnonymousClass001.A12();
                    A12.put("localCallId", callSummaryInfo.localCallId);
                    A12.put("sharedCallId", callSummaryInfo.sharedCallId);
                    A12.put("systemTime", callSummaryInfo.systemTime);
                    A12.put("steadyTime", callSummaryInfo.steadyTime);
                    A12.put("callCreatedTime", callSummaryInfo.callCreatedTime);
                    A12.put("engineCreatedTime", callSummaryInfo.engineCreatedTime);
                    A12.put("callAnsweredTime", callSummaryInfo.callAnsweredTime);
                    A12.put("callConnectedTime", callSummaryInfo.callConnectedTime);
                    A12.put("callEndedTime", callSummaryInfo.callEndedTime);
                    A12.put("joinableCompleteTime", callSummaryInfo.joinableCompleteTime);
                    A12.put("lastUpdatedTime", callSummaryInfo.lastUpdatedTime);
                    A12.put("callTrigger", callSummaryInfo.callTrigger);
                    A12.put("isCaller", callSummaryInfo.isCaller);
                    A12.put("peerId", callSummaryInfo.peerId);
                    A12.put("endCallReason", callSummaryInfo.endCallReason);
                    A12.put("remoteEnded", callSummaryInfo.remoteEnded);
                    A12.put("inviteRequestedVideo", callSummaryInfo.inviteRequestedVideo);
                    A12.put("mediaGateBlockedFrameCount", callSummaryInfo.mediaGateBlockedFrameCount);
                    A12.put("videoEscalationStatus", callSummaryInfo.videoEscalationStatus);
                    A12.put("localVideoDuration", callSummaryInfo.localVideoDuration);
                    A12.put("remoteVideoDuration", callSummaryInfo.remoteVideoDuration);
                    A12.put("batteryStartLevel", callSummaryInfo.batteryStartLevel);
                    A12.put("batteryEndLevel", callSummaryInfo.batteryEndLevel);
                    A12.put("wasDeviceCharged", callSummaryInfo.wasDeviceCharged);
                    A12.put("joiningContext", callSummaryInfo.joiningContext);
                    A12.put("webDeviceId", callSummaryInfo.webDeviceId);
                    A12.put("endCallSubreason", callSummaryInfo.endCallSubreason);
                    A12.put("coldStartReason", callSummaryInfo.coldStartReason);
                    A12.put("isConnectedEnd", callSummaryInfo.isConnectedEnd);
                    A12.put("deviceShutdownTime", callSummaryInfo.deviceShutdownTime);
                    A12.put("maxConcurrentConnectedParticipant", callSummaryInfo.maxConcurrentConnectedParticipant);
                    A12.put("rtcActorId", callSummaryInfo.rtcActorId);
                    A12.put("autoRejoinCount", callSummaryInfo.autoRejoinCount);
                    A12.put("joinMode", callSummaryInfo.joinMode);
                    A12.put("autoRejoinSuccessfulCount", callSummaryInfo.autoRejoinSuccessfulCount);
                    A12.put("webrtcVersion", callSummaryInfo.webrtcVersion);
                    A12.put("clientSessionId", callSummaryInfo.clientSessionId);
                    A12.put("endCallAppState", callSummaryInfo.endCallAppState);
                    A12.put("isAutomation", callSummaryInfo.isAutomation);
                    0yR.A02(A0D, 11T.A02(A12), C03r.A05);
                    StringBuilder A0k = AnonymousClass001.A0k();
                    A0k.append("Wrote ");
                    A0k.append("callSummaryInfo");
                    str = AnonymousClass001.A0Z(A0D, " to ", A0k);
                    r0 = "AppLogPersistenceProxyBase";
                    0fH.A0j((String) r0, str);
                }
            }
            str = "Unable to open call stats file";
            r0 = "AppLogPersistenceProxyBase";
            0fH.A0j((String) r0, str);
        } catch (Exception unused) {
            0fH.A0k("AppLogPersistenceProxyBase", 0Pz.A0m("Error persisting ", "callSummaryInfo", r0.getMessage(), '\n'));
        }
    }
}
