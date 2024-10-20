package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.3mI, reason: invalid class name */
/* loaded from: 3mI.class */
public interface C3mI {
    public static final 4vP[] A00;
    public static final 4vQ[] A01;

    static {
        4vP[] r0 = new 4vP[60];
        System.arraycopy(new 4vP[]{new 4vP("_id", "INTEGER", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, true, true, false, false), A00("user_key", "TEXT"), A00("first_name", "TEXT"), A00("last_name", "TEXT"), A00("username", "TEXT"), A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "TEXT"), A00("is_messenger_user", "INTEGER"), A00("profile_pic_square", "TEXT"), A00("profile_type", "TEXT"), A00("allow_admin_create_appointment", "INTEGER"), A00("is_commerce", "INTEGER"), A00("commerce_page_type", "TEXT"), A00("is_partial", "INTEGER"), A00("user_rank", "REAL"), A00("is_blocked_by_viewer", "INTEGER"), A00("is_message_blocked_by_viewer", "INTEGER"), A00("can_viewer_message", "INTEGER"), A00("commerce_page_settings", "TEXT"), A00("is_friend", "INTEGER"), A00("last_fetch_time", "INTEGER"), A00("montage_thread_fbid", "TEXT"), A00("can_see_viewer_montage_thread", "INTEGER"), A00("is_broadcast_recipient_holdout", "INTEGER"), A00("is_messenger_bot", "INTEGER"), A00("is_vc_endpoint", "INTEGER"), A00("is_messenger_promotion_blocked_by_viewer", "INTEGER"), A00("user_custom_tags", "TEXT")}, 0, r0, 0, 27);
        System.arraycopy(new 4vP[]{A00("is_receiving_subscription_messages", "INTEGER"), A00("is_messenger_platform_bot", "INTEGER"), A00("user_call_to_actions", "TEXT"), A00("structured_menu_call_to_actions", "TEXT"), A00("current_country_code", "TEXT"), A00("home_country_code", "TEXT"), A00("extension_resume_url", "TEXT"), A00("extension_resume_text", "TEXT"), A00("extension_payment_policy", "TEXT"), A00("structured_menu_badge_count", "INTEGER"), A00("does_accept_user_feedback", "INTEGER"), A00("extension_properties", "TEXT"), A00("viewer_connection_status", "TEXT"), A00("is_memorialized", "INTEGER"), A00("nested_menu_call_to_actions", "TEXT"), A00("maximum_messenger_version", "TEXT"), A00("managing_ps", "TEXT"), A00("is_aloha_proxy_confirmed", "INTEGER"), A00("aloha_proxy_user_owners", "TEXT"), A00("instant_game_channel", "TEXT"), A00("is_messenger_welcome_page_cta_enabled", "INTEGER"), new 4vP("is_message_ignored_by_viewer", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), A00("aloha_proxy_users_owned", "TEXT"), new 4vP("is_viewer_subscribed_to_message_updates", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), new 4vP("is_conversation_ice_breaker_enabled", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), A00("is_work_user", "INTEGER"), A00("is_viewer_coworker", "INTEGER")}, 0, r0, 27, 27);
        System.arraycopy(new 4vP[]{A00("favorite_color", "TEXT"), A00("work_info", "TEXT"), new 4vP("is_viewer_managing_parent", "INTEGER", ConstantsKt.CAMERA_ID_FRONT, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false), A00("is_page_callable", "INTEGER"), A00("inbox_profile_pic_uri", "TEXT"), A00("inbox_profile_pic_file_path", "TEXT")}, 0, r0, 54, 6);
        A00 = r0;
        A01 = new 4vQ[]{new 4vQ(new String[]{"user_key"}, new String[]{""}, true)};
    }

    static 4vP A00(String str, String str2) {
        return new 4vP(str, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, true, false, false, false, false);
    }
}
