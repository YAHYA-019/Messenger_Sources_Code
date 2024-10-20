package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.7yx, reason: invalid class name */
/* loaded from: 7yx.class */
public interface C7yx {
    public static final 4vP[] A00;
    public static final 4vQ[] A01;

    static {
        4vP[] r0 = new 4vP[84];
        System.arraycopy(new 4vP[]{new 4vP("_id", "INTEGER", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, true, true, false, false), AbM.A0I("thread_key", "TEXT"), AbM.A0I("legacy_thread_id", "TEXT"), AbM.A0I("sequence_id", "INTEGER"), AbM.A0I(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "TEXT"), AbM.A0I("senders", "TEXT"), AbM.A0I("snippet", "TEXT"), AbM.A0I("snippet_sender", "TEXT"), AbM.A0I("admin_snippet", "TEXT"), AbM.A0I("timestamp_ms", "INTEGER"), AbM.A0I("last_read_timestamp_ms", "INTEGER"), AbM.A0I("approx_total_message_count", "INTEGER"), AbM.A0I("unread_message_count", "INTEGER"), AbM.A0I("last_fetch_time_ms", "INTEGER"), AbM.A0I("pic_hash", "TEXT"), AbM.A0I("pic", "TEXT"), AbM.A0I("can_reply_to", "INTEGER"), AbM.A0I("cannot_reply_reason", "TEXT"), AbM.A0I("last_message_admin_text_type", "TEXT"), AbM.A0I("mute_until", "INTEGER"), AbM.A0I("is_subscribed", "INTEGER"), AbM.A0I("folder", "TEXT"), AbM.A0I("draft", "TEXT"), AbM.A0I("missed_call_status", "INTEGER"), AbM.A0I("me_bubble_color", "INTEGER"), AbM.A0I("other_bubble_color", "INTEGER"), AbM.A0I("wallpaper_color", "INTEGER")}, 0, r0, 0, 27);
        System.arraycopy(new 4vP[]{AbM.A0I("initial_fetch_complete", "INTEGER"), AbM.A0I("custom_like_emoji", "TEXT"), AbM.A0I("outgoing_message_lifetime", "INTEGER"), AbM.A0I("custom_nicknames", "TEXT"), AbM.A0I("invite_uri", "TEXT"), AbM.A0I("last_message_id_if_sponsored", "TEXT"), AbM.A0I("group_chat_rank", "REAL"), new 4vP("is_joinable", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), new 4vP("requires_approval", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("rtc_call_info", "TEXT"), AbM.A0I("last_message_commerce_message_type", "TEXT"), AbM.A0I("is_thread_queue_enabled", "INTEGER"), AbM.A0I("group_description", "TEXT"), AbM.A0I("media_preview", "TEXT"), AbM.A0I("booking_requests", "TEXT"), AbM.A0I("last_call_ms", "INTEGER"), AbM.A0I("is_discoverable", "INTEGER"), AbM.A0I("last_sponsored_message_call_to_action", "TEXT"), AbM.A0I("montage_thread_key", "TEXT"), AbM.A0I("room_privacy_mode", "INTEGER"), AbM.A0I("room_associated_fb_group_id", "INTEGER"), AbM.A0I("room_associated_fb_group_name", "TEXT"), AbM.A0I("room_associated_photo_uri", "TEXT"), AbM.A0I("has_work_multi_company_associated_group", "INTEGER"), AbM.A0I("approval_toggleable", "INTEGER"), AbM.A0I("video_room_mode", "INTEGER"), AbM.A0I("marketplace_data", "TEXT")}, 0, r0, 27, 27);
        System.arraycopy(new 4vP[]{AbM.A0I("room_creation_time", "INTEGER"), AbM.A0I("group_thread_category", "TEXT"), new 4vP("are_admins_supported", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("group_thread_add_mode", "TEXT"), AbM.A0I("group_thread_offline_threading_id", "INTEGER"), new 4vP("had_messenger_call", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("personal_group_invite_link", "TEXT"), new 4vP("optimistic_group_state", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("ad_context_data", "TEXT"), AbM.A0I("use_existing_group", "INTEGER"), AbM.A0I("thread_associated_object_type", "TEXT"), AbM.A0I("last_aloha_call_conference_id", "TEXT"), AbM.A0I("thread_streak_data", "TEXT"), AbM.A0I("page_comm_item_data", "TEXT"), AbM.A0I("games_push_notification_settings", "TEXT"), new 4vP("can_participants_claim_admin", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), new 4vP("group_approval_mode", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("unopened_montage_directs", "TEXT"), AbM.A0I("synced_fb_group_id", "INTEGER"), AbM.A0I("synced_fb_group_status", "TEXT"), new 4vP("synced_fb_group_is_work_multi_company_group", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("video_chat_link", "TEXT"), new 4vP("theme_id", "INTEGER", ErrorReportingConstants.ANR_DEFAULT_RECOVERY_DELAY_VAL, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), new 4vP("theme_fallback_color", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("theme_gradient_colors", "TEXT"), AbM.A0I("theme_accessibility_label", "TEXT"), new 4vP("is_thread_pinned", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false)}, 0, r0, 54, 27);
        System.arraycopy(new 4vP[]{new 4vP("thread_pin_timestamp", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), AbM.A0I("bonfire_user_id", "TEXT"), AbM.A0I("animated_thread_activity_banner", "TEXT")}, 0, r0, 81, 3);
        A00 = r0;
        A01 = new 4vQ[]{new 4vQ(new String[]{"thread_key"}, new String[]{""}, true), new 4vQ(new String[]{"legacy_thread_id"}, new String[]{""}, false), new 4vQ(new String[]{"montage_thread_key"}, new String[]{""}, true)};
    }
}