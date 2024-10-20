package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.45o, reason: invalid class name */
/* loaded from: 45o.class */
public final class C45o {
    public final C00i A00;
    public final 1CO A03;
    public final boolean A04;
    public final C00i A02 = new 1BQ(16634);
    public final C00i A01 = new 1BQ(16617);

    public C45o() {
        1CO r0 = (1CO) 1Bi.A03(16385);
        this.A03 = r0;
        this.A04 = r0.AZk(36324677316005790L);
        this.A00 = new 1BQ(84027);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "TINCAN_NOTIFICATIONS_SYNC_MESSAGE_RECEIVED";
            case 1:
                return "TINCAN_NOTIFICATIONS_SYNC_MESSAGE_RECEIVED_OMNISTORE";
            case 2:
                return "TINCAN_NOTIFICATIONS_SYNC_UNKNOWN";
            case 3:
                return "TINCAN_NOTIFICATIONS_PUSH_MESSAGE_RECEIVED";
            case 4:
                return "TINCAN_NOTIFICATIONS_PUSH_MESSAGE_RECEIVED_PAGE_USER";
            case 5:
                return "TINCAN_NOTIFICATIONS_PUSH_MESSAGE_IGNORED";
            case 6:
                return "TINCAN_NOTIFICATIONS_PUSH_MESSAGE_ERROR";
            case 7:
                return "ARMADILLO_NOTIFICATIONS_PUSH_PAYLOAD_IGNORED";
            case 8:
                return 4YT.A00(516);
            case 9:
                return 4YT.A00(515);
            case 10:
                return "ARMADILLO_NOTIFICATIONS_SERVICE_LAUNCHER_INITIATED";
            case 11:
                return "ARMADILLO_NOTIFICATIONS_STOP_SERVICE";
            case 12:
                return "TINCAN_TO_ARMADILLO_MIGRATION_HANDLER_SUCCESS";
            case 13:
                return "TINCAN_TO_ARMADILLO_MIGRATION_HANDLER_ERROR";
            case 14:
                return "CHAT_HEAD_BUBBLE_NOTIFICATION_CHECKED";
            case 15:
                return "CHAT_HEAD_BUBBLE_NOTIFICATION_RECEIVED";
            case 16:
                return "CHAT_HEAD_BUBBLE_NOTIFICATION_SUPPRESSED";
            case 17:
                return "CHAT_HEAD_BUBBLE_NOTIFICATION_DISPLAYED";
            case 18:
                return "CHAT_HEAD_BUBBLE_NOTIFICATION_ERROR";
            case 19:
                return "ARMADILLO_NOTIFICATIONS_ONE_TO_ONE_SYNC_MESSAGE_RENDERED";
            case 20:
                return "ARMADILLO_NOTIFICATIONS_GROUP_SYNC_MESSAGE_RENDERED";
            case 21:
                return "ARMADILLO_NOTIFICATIONS_ONE_TO_ONE_RENDER_ERROR";
            case 22:
                return "ARMADILLO_NOTIFICATIONS_GROUP_RENDER_ERROR";
            case 23:
                return "ARMADILLO_NOTIFICATIONS_NOT_PRESENTED";
            case 24:
                return "ARMADILLO_NOTIFICATIONS_CLICKED";
            case 25:
                return "ARMADILLO_NOTIFICATIONS_PUSH_PAYLOAD_RECEIVED";
            case 26:
                return "ARMADILLO_NOTIFICATIONS_RECEIVED_WRONG_USER_NOTIFICATION";
            case 27:
                return "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_SYNCED";
            case 28:
                return "ARMADILLO_NOTIFICATIONS_SUPPRESSED";
            case 29:
                return "ARMADILLO_NOTIFICATIONS_PRESENT_CLIENT_NOTIFICATION_SUCCESS";
            case 30:
                return "ARMADILLO_NOTIFICATIONS_BG_WORKER_STARTED_SYNC";
            case 31:
                return "ARMADILLO_NOTIFICATIONS_BG_WORKER_SUCCESSFUL_SYNC";
            case 32:
                return "ARMADILLO_NOTIFICATIONS_BG_WORKER_WILL_RETRY_SYNC";
            case 33:
                return "ARMADILLO_NOTIFICATIONS_BG_WORKER_FAILED_SYNC";
            default:
                return "ARMADILLO_NOTIFICATIONS_BG_WORKER_CANCELLED_SYNC";
        }
    }

    public static void A01(ThreadKey threadKey, C45o c45o, Integer num, String str, String str2, String str3) {
        boolean z = !ThreadKey.A0S(threadKey);
        if (!z || c45o.A04) {
            1UG A00 = 1UD.A00((04J) c45o.A02.get(), 1ZG.A01, "tincan_notifications_sync");
            if (A00.isSampled()) {
                A00.A7R("event_type", A00(num));
                if (z) {
                    2DM r0 = new 2DM(C26T.A00);
                    r0.A0p("is_om", true);
                    A00.A7R("extra_info", r0.toString());
                }
                A00.A7R(TraceFieldType.MsgId, str);
                A00.A7R("error_info", str3);
                A00.A7R("push_notif_id", str2);
                A00.A6H("chat_head_bubble_type", 1L);
                A00.BZL();
            }
        }
    }

    public static void A02(C45o c45o, 24X r302, Integer num, Long l, String str, String str2, String str3, String str4, String str5) {
        String str6 = null;
        1UG A00 = 1UD.A00((04J) c45o.A02.get(), 1ZG.A01, "tincan_notifications_sync");
        if (A00.isSampled()) {
            A00.A7R("event_type", A00(num));
            if (C1fW.A00()) {
                A00.A7R("process", "bg-process");
            }
            A00.A7R(TraceFieldType.MsgId, str);
            A00.A7R("push_notif_id", str2);
            A00.A7R("wa_push_id", str3);
            A00.A7R("error_info", str4);
            A00.A7R("exception_type", (String) null);
            if (r302 != null) {
                str6 = r302.toString();
            }
            A00.A7R("extra_info", str6);
            A00.A6H("client_skew_time", Long.valueOf(l == null ? System.currentTimeMillis() : l.longValue()));
            A00.A7R("offline_threading_id", str5);
            A00.A6H("render_type", (Long) null);
            A00.A7R("family_device_id", ((1Oe) c45o.A01.get()).A04(C1fe.A2b));
            A00.BZL();
        }
    }

    public static void A03(C45o c45o, Integer num, String str) {
        A02(c45o, null, num, null, str, null, null, null, null);
    }

    public void A04(String str, String str2, String str3, String str4) {
        A02(this, null, 0S2.A0L, null, str, str2, null, str4, str3);
    }
}
