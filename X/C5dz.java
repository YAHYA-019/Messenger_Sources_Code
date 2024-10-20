package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.notifications.constants.push.NotificationType;

/* renamed from: X.5dz, reason: invalid class name */
/* loaded from: 5dz.class */
public final class C5dz {
    public final C00i A01 = new 1BQ(16634);
    public final C00i A00 = new 1BQ(66536);

    public static String A00(ThreadKey threadKey) {
        return threadKey == null ? "UNKNOWN_THREAD_TYPE" : threadKey.A06.ordinal() != 13 ? AbstractC03573yf.A00(threadKey).toString() : "SECURE_MESSAGE_OVER_WA_ONE_TO_ONE";
    }

    public static void A01(ThreadKey threadKey, C5dz c5dz, String str) {
        A04(c5dz, str, "unknown", 4YU.A0z(threadKey), 1BK.A0w(threadKey), A00(threadKey), null);
    }

    public static void A02(ThreadKey threadKey, C5dz c5dz, String str, String str2) {
        A04(c5dz, str, "unknown", str2, threadKey != null ? String.valueOf(threadKey.A0r()) : "unknown", A00(threadKey), null);
    }

    public static void A03(ThreadKey threadKey, C5dz c5dz, String str, java.util.Map map) {
        String str2;
        String str3;
        if (map != null) {
            Object obj = map.get("client_notif_type");
            String str4 = (String) map.get("sender_id");
            String str5 = (String) map.get("message_id");
            String str6 = (String) map.get("notif_type");
            if (threadKey != null) {
                str2 = String.valueOf(threadKey.A0r());
                str3 = A00(threadKey);
            } else {
                str2 = str4;
                str3 = NotificationType.A3r.toString().equalsIgnoreCase(str6) ? "SECURE_MESSAGE_OVER_WA_ONE_TO_ONE" : NotificationType.A3P.toString().equalsIgnoreCase(str6) ? "ONE_TO_ONE" : "UNKNOWN_THREAD_TYPE";
            }
            if (C5ap.A1r.toString().equals(obj)) {
                A04(c5dz, str, str5, str4, str2, str3, null);
            }
        }
    }

    public static void A04(C5dz c5dz, String str, String str2, String str3, String str4, String str5, String str6) {
        1UG A00 = 1UD.A00((04J) c5dz.A01.get(), 1ZG.A01, 1BJ.A00(1694));
        if (A00.isSampled()) {
            A00.A7R("event", str);
            A00.A7R("message_id", str2);
            A00.A7R("sender_id", str3);
            A00.A7R("thread_key", str4);
            A00.A7R("thread_type", str5);
            A00.A7R("failed_rule", str6);
            A00.BZL();
        }
    }
}
