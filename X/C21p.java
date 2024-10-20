package X;

import com.facebook.proxygen.TraceEventType;

/* renamed from: X.21p, reason: invalid class name */
/* loaded from: 21p.class */
public final class C21p {
    public final 1Br A00 = 1Bq.A00(16634);

    public static final String A00(Integer num) {
        if (num == null) {
            return null;
        }
        switch (num.intValue()) {
            case 0:
                return TraceEventType.Push;
            case 1:
                return "sync";
            case 2:
                return "sync_msg";
            case 3:
                return "push_fcm";
            case 4:
                return "push_fbns";
            case 5:
                return "push_mqtt";
            case 6:
                return "sync_iris";
            default:
                return null;
        }
    }

    public static final void A01(C21p c21p, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        2R2 A04 = 2R2.A04((04J) c21p.A00.A00.get());
        if (((0D7) A04).A00.isSampled()) {
            A04.A0E("notif_id", str4);
            A04.A0E("message_id", str3);
            A04.A0E("notif_event", str2);
            A04.A0E("carrier", (String) null);
            A04.A0E("channel", str5);
            A04.A0E("notif_type", str);
            A04.A0E("extra_info", str9);
            A04.A0E("message_type_id", str6);
            A04.A0E("unified_notif_type", str7);
            A04.A0E("pi_nid", str8);
            A04.BZL();
        }
    }

    public final void A02(Integer num, String str, String str2, String str3, String str4, String str5) {
        A04(num, str, str2, str3, str4, null, null, null, str5);
    }

    public final void A03(Integer num, String str, String str2, String str3, String str4, String str5) {
        A01(this, str, str2, str3, str4, A00(num), null, null, null, str5);
    }

    public final void A04(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        A01(this, str, str2, str3, str4, A00(num), str5, str6, str7, str8);
    }

    public final void A05(String str) {
        A01(this, "notes", "notif_rich_status_note_loading", null, null, TraceEventType.Push, null, null, null, str);
    }

    public final void A06(String str, String str2, String str3, int i) {
        String str4;
        switch (i) {
            case 0:
                str4 = "secure_text_message";
                break;
            case 1:
                str4 = "secure_message_reaction";
                break;
            case 2:
                str4 = "secure_unsend_message";
                break;
            case 3:
                str4 = "secure_forwarded_message";
                break;
            case 4:
                str4 = "secure_reply_message";
                break;
            case 5:
                str4 = "secure_media_message";
                break;
            case 6:
                str4 = "secure_message_request";
                break;
            case 7:
                str4 = "secure_thread_name_update";
                break;
            case 8:
                str4 = "secure_current_user_added_to_thread";
                break;
            case 9:
                str4 = "secure_current_user_removed_from_thread";
                break;
            case 10:
                str4 = "secure_group_invite";
                break;
            default:
                str4 = "secure_message";
                break;
        }
        A01(this, str4, "notif_engine_processing_app_layer_stage", str, str2, "sync", null, null, null, str3);
    }
}
