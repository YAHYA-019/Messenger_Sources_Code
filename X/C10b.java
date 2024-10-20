package X;

import com.facebook.acra.constants.ActionId;

/* renamed from: X.10b, reason: invalid class name */
/* loaded from: 10b.class */
public abstract class C10b {
    public static String A00(int i) {
        if (i == 1) {
            return "RTC_PERF_RTC_OUTGOING_CALL_START";
        }
        if (i == 2) {
            return "RTC_PERF_RTC_INCOMING_CALL_START";
        }
        if (i == 6) {
            return "RTC_PERF_LAB_METRIC";
        }
        if (i == 7) {
            return "RTC_PERF_RTC_CREATE_CALL_ENT";
        }
        if (i == 19) {
            return "RTC_PERF_PLATFORM_P2P_START_CALL_CALLER_FLOW";
        }
        if (i == 20) {
            return "RTC_PERF_PLATFORM_P2P_START_CALL_CALLEE_FLOW";
        }
        if (i == 22) {
            return "RTC_PERF_PLATFORM_P2P_ACCEPT_CALL_CALLER_FLOW";
        }
        if (i == 23) {
            return "RTC_PERF_PLATFORM_P2P_ACCEPT_CALL_CALLEE_FLOW";
        }
        if (i == 35) {
            return "RTC_PERF_PLATFORM_SERVER_TRANSACTION";
        }
        if (i == 36) {
            return "RTC_PERF_RTC_CALL_ENDED";
        }
        switch (i) {
            case 4:
                return "RTC_PERF_RTC_FULLSCREEN_CREATE_TO_VISIBLE";
            case 12:
                return "RTC_PERF_PLATFORM_P2P_SET_REMOTE_DESCRIPTION";
            case 15:
                return "RTC_PERF_PLATFORM_P2P_SET_LOCAL_DESCRIPTION";
            case 41:
                return "RTC_PERF_PLATFORM_SDP_RENEGOTIATION";
            case ActionId.ON_START_END /* 47 */:
                return "RTC_PERF_FB_APP_TIME_TO_REDIRECT";
            case 2271:
                return "RTC_PERF_RTC_CALL_TRACE";
            case 4562:
                return "RTC_PERF_RTC_CPU_SPIN";
            case 7464:
                return "RTC_PERF_PEER_VIDEO_SUBSCRIPTION_TO_FIRST_FRAME";
            case 8639:
                return "RTC_PERF_TOUCH_RESPONSIVENESS";
            case 9555:
                return "RTC_PERF_RTC_SESSION_DURATION_RESPONSIVENESS_TRACE_COLLECTION";
            case 10380:
                return "RTC_PERF_TRAFFIC_QUEUED";
            case 11725:
                return "RTC_PERF_RTC_CALL_EFFICIENCY_CRITICAL_EVENT";
            case 12744:
                return "RTC_PERF_RTC_CALL_EFFICIENCY";
            case 13177:
                return "RTC_PERF_RTC_THERMAL_TRACE";
            case 13601:
                return "RTC_PERF_RTC_CALL_SESSION";
            case 14643:
                return "RTC_PERF_RP_STORE_DISPATCH_CHAIN";
            default:
                switch (i) {
                    case 26:
                        return "RTC_PERF_PLATFORM_MW_JOIN_CALL_FLOW";
                    case 27:
                        return "RTC_PERF_PLATFORM_MW_CONNECT_TO_PARTICIPANT_FLOW";
                    case 28:
                        return "RTC_PERF_PLATFORM_MW_INVITE_PARTICIPANT_INVITEE_FLOW";
                    case 29:
                        return "RTC_PERF_PLATFORM_MW_INVITE_PARTICIPANT_INVITER_FLOW";
                    default:
                        return "UNDEFINED_QPL_EVENT";
                }
        }
    }
}
