package X;

import com.facebook.messaging.communitymessaging.notify.analytics.CommunityMessagingNotificationsLoggerModel;
import java.util.LinkedHashMap;

/* renamed from: X.Abf, reason: case insensitive filesystem */
/* loaded from: Abf.class */
public final class C1237Abf {
    public final CommunityMessagingNotificationsLoggerModel A00(java.util.Map map) {
        LinkedHashMap linkedHashMap;
        Long A0e;
        Integer num = null;
        if (map == null) {
            return null;
        }
        String A0b = AnonymousClass001.A0b("notification_logger_surface", map);
        BOA boa = null;
        if (A0b != null) {
            try {
                boa = BOA.valueOf(A0b);
            } catch (IllegalArgumentException e) {
                0fH.A0u("CommunityMessagingNotificationsLoggerModel", 0Pz.A0W("Failed to parse surface: ", A0b), e);
            }
        }
        String A0b2 = AnonymousClass001.A0b("notification_logger_action", map);
        BNr bNr = null;
        if (A0b2 != null) {
            try {
                bNr = BNr.valueOf(A0b2);
            } catch (IllegalArgumentException e2) {
                0fH.A0u("CommunityMessagingNotificationsLoggerModel", 0Pz.A0W("Failed to parse action: ", A0b2), e2);
            }
        }
        if (boa == null || bNr == null) {
            return null;
        }
        String A0b3 = AnonymousClass001.A0b("notification_logger_community_id", map);
        Long A0e2 = A0b3 != null ? 0CW.A0e(A0b3) : null;
        String A0b4 = AnonymousClass001.A0b("notification_logger_thread_id", map);
        Long A0e3 = A0b4 != null ? 0CW.A0e(A0b4) : null;
        String A0b5 = AnonymousClass001.A0b("notification_logger_group_id", map);
        Long A0e4 = A0b5 != null ? 0CW.A0e(A0b5) : null;
        String A0b6 = AnonymousClass001.A0b("notification_logger_event", map);
        if (A0b6 == null || A0b6.length() == 0) {
            A0b6 = null;
        }
        String A0b7 = AnonymousClass001.A0b("notification_logger_source", map);
        if (A0b7 == null || A0b7.length() == 0) {
            A0b7 = null;
        }
        String A0b8 = AnonymousClass001.A0b("notification_logger_notification_type", map);
        if (A0b8 == null || A0b8.length() == 0) {
            A0b8 = null;
        }
        String A0b9 = AnonymousClass001.A0b("notification_logger_sender_id", map);
        Long A0e5 = A0b9 != null ? 0CW.A0e(A0b9) : null;
        String A0b10 = AnonymousClass001.A0b("notification_logger_community_notification_id", map);
        if (A0b10 == null || A0b10.length() == 0) {
            A0b10 = null;
        }
        String A0b11 = AnonymousClass001.A0b("notification_logger_push_notification_id", map);
        if (A0b11 == null || A0b11.length() == 0) {
            A0b11 = null;
        }
        String A0b12 = AnonymousClass001.A0b("notification_logger_message_id", map);
        if (A0b12 == null || A0b12.length() == 0) {
            A0b12 = null;
        }
        String A0b13 = AnonymousClass001.A0b("notification_logger_join_behavior", map);
        if (A0b13 != null) {
            num = 0CW.A0c(A0b13);
        }
        String A0b14 = AnonymousClass001.A0b("notification_logger_extras_count", map);
        if (A0b14 != null && (A0e = 0CW.A0e(A0b14)) != null) {
            long longValue = A0e.longValue();
            linkedHashMap = 1BK.A1C();
            long j = 0;
            while (true) {
                long j2 = j;
                if (j2 >= longValue) {
                    break;
                }
                Object obj = map.get(0Pz.A0U("notification_logger_extras_key_", j2));
                Object obj2 = map.get(0Pz.A0U("notification_logger_extras_value_", j2));
                if (obj != null && obj2 != null) {
                    linkedHashMap.put(obj, obj2);
                }
                j = j2 + 1;
            }
        } else {
            linkedHashMap = null;
        }
        return new CommunityMessagingNotificationsLoggerModel(bNr, boa, num, A0e2, A0e3, A0e4, A0e5, A0b6, A0b7, A0b8, A0b10, A0b11, A0b12, linkedHashMap);
    }
}
