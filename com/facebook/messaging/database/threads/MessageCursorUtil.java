package com.facebook.messaging.database.threads;

import X.1BQ;
import X.1BV;
import X.1Bi;
import X.1Bn;
import X.4yI;
import X.4yL;
import X.4yM;
import X.4yP;
import X.4yR;
import X.4yS;
import X.4yT;
import X.4yU;
import X.4yX;
import X.4yY;
import X.AnonymousClass243;
import X.C00663oZ;
import X.C00i;
import X.C11994yd;
import X.C12004ye;
import com.facebook.proxygen.TraceFieldType;
import com.mapbox.mapboxsdk.style.layers.Property;

/* loaded from: MessageCursorUtil.class */
public final class MessageCursorUtil {
    public static final String[] A0H;
    public final 4yI A0A = (4yI) 1Bn.A0A(49391);
    public final 4yT A06 = (4yT) 1Bn.A0A(49399);
    public final 4yL A05 = (4yL) 1Bn.A0A(49392);
    public final 4yM A0E = (4yM) 1Bn.A0A(49393);
    public final 4yP A0D = (4yP) 1Bn.A0A(49395);
    public final 4yR A07 = (4yR) 1Bn.A0A(49397);
    public final 4yS A08 = (4yS) 1Bn.A0A(49398);
    public final 4yY A0B = (4yY) 1Bn.A0A(49404);
    public final 4yX A0C = (4yX) 1Bn.A0A(49403);
    public final 4yU A04 = (4yU) 1Bn.A0A(49400);
    public final C00i A01 = new 1BV(66117);
    public final C00i A02 = new 1BV(66118);
    public final C00i A03 = new 1BQ(84642);
    public final AnonymousClass243 A00 = (AnonymousClass243) 1Bn.A0A(68334);
    public final C12004ye A0G = (C12004ye) 1Bn.A0A(67313);
    public final C00663oZ A0F = (C00663oZ) 1Bi.A03(32770);
    public final C11994yd A09 = (C11994yd) 1Bn.A0A(49409);

    static {
        String[] strArr = new String[91];
        System.arraycopy(new String[]{"thread_key", TraceFieldType.MsgId, "text", "is_not_forwardable", "sender", "timestamp_ms", "timestamp_sent_ms", TraceFieldType.MsgType, "affected_users", "attachments", "shares", "sticker_id", "sticker_size", "offline_threading_id", Property.SYMBOL_Z_ORDER_SOURCE, "channel_source", "is_non_authoritative", "pending_send_media_attachment", "sent_share_attachment", "client_tags", "extensible_message_data", "send_error", "send_error_message", "send_error_detail", "send_error_original_exception", "send_error_number", "send_error_timestamp_ms"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"send_error_error_url", "send_channel", "publicity", "copy_message_id", "send_queue_type", "payment_transaction", "payment_request", "has_unavailable_attachment", "app_attribution", "content_app_attribution", "tree_xma", "admin_text_type", "admin_text_theme_color", "admin_text_should_show_theme_icon", "admin_text_gradient_colors", "admin_text_thread_icon_emoji", "admin_text_nickname", "admin_text_target_id", "admin_text_thread_message_lifetime", "message_lifetime", "admin_text_thread_rtc_event", "admin_text_thread_rtc_server_info_data", "admin_text_thread_rtc_is_video_call", "is_sponsored", "unsent_timestamp_ms", "unsendability_status", "admin_text_thread_ad_properties"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"admin_text_game_score_data", "commerce_message_type", "admin_text_joinable_event_type", "metadata_at_text_ranges", "platform_metadata", "admin_text_is_joinable_promo", "montage_reply_message_id", "montage_reply_action", "montage_reply_message_media_type", "montage_reply_story_media_type", "montage_reply_story_name", "montage_reply_story_type", "montage_story_type", "generic_admin_message_extensible_data", "reactions", "profile_ranges", "tree_message_replied_to_data", "message_replied_to_id", "message_replied_to_status", "montage_attribution", "montage_metadata", "work_bot_should_show_get_started_cta", "snippet", "genie_original_sender", "ad_client_token", "powerup_type", "transcriptions_v2"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"magic_word_ranges", "admin_text_notification_messages_token_ent_id", "admin_text_notification_messages_user_action_type", "pinned_message_metadata", "forward_score", "admin_text_cta_text", "admin_text_game_bot_message_management_user_action", "is_takedown", "admin_text_custom_update_mute_management_game_id", "admin_text_custom_update_mute_management_user_action"}, 0, strArr, 81, 10);
        A0H = strArr;
    }
}
