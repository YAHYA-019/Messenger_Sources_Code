package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableMap;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.Arrays;
import java.util.LinkedHashSet;

/* renamed from: X.4z3, reason: invalid class name */
/* loaded from: 4z3.class */
public final class C4z3 extends 4xA {
    public static final 4xD A01;
    public final C00i A00;

    static {
        4xB r0 = new 4xB();
        r0.A00("_id", "messages", "_id");
        r0.A00("thread_key", "messages", "thread_key");
        r0.A00(TraceFieldType.MsgId, "messages", TraceFieldType.MsgId);
        r0.A00("text", "messages", "text");
        r0.A00("snippet", "messages", "snippet");
        r0.A00("sender", "messages", "sender");
        r0.A00("is_not_forwardable", "messages", "is_not_forwardable");
        r0.A00("timestamp_ms", "messages", "timestamp_ms");
        r0.A00("timestamp_sent_ms", "messages", "timestamp_sent_ms");
        r0.A00(TraceFieldType.MsgType, "messages", TraceFieldType.MsgType);
        r0.A00("affected_users", "messages", "affected_users");
        r0.A00("attachments", "messages", "attachments");
        r0.A00("shares", "messages", "shares");
        r0.A00("sticker_id", "messages", "sticker_id");
        r0.A00("sticker_size", "messages", "sticker_size");
        r0.A00("offline_threading_id", "messages", "offline_threading_id");
        r0.A00(Property.SYMBOL_Z_ORDER_SOURCE, "messages", Property.SYMBOL_Z_ORDER_SOURCE);
        r0.A00("channel_source", "messages", "channel_source");
        r0.A00("is_non_authoritative", "messages", "is_non_authoritative");
        r0.A00("pending_send_media_attachment", "messages", "pending_send_media_attachment");
        r0.A00("sent_share_attachment", "messages", "sent_share_attachment");
        r0.A00("client_tags", "messages", "client_tags");
        r0.A00("extensible_message_data", "messages", "extensible_message_data");
        r0.A00("send_error", "messages", "send_error");
        r0.A00("send_error_message", "messages", "send_error_message");
        r0.A00("send_error_detail", "messages", "send_error_detail");
        r0.A00("send_error_original_exception", "messages", "send_error_original_exception");
        r0.A00("send_error_number", "messages", "send_error_number");
        r0.A00("send_error_timestamp_ms", "messages", "send_error_timestamp_ms");
        r0.A00("send_error_error_url", "messages", "send_error_error_url");
        r0.A00("send_channel", "messages", "send_channel");
        r0.A00("publicity", "messages", "publicity");
        r0.A00("send_queue_type", "messages", "send_queue_type");
        r0.A00("payment_transaction", "messages", "payment_transaction");
        r0.A00("payment_request", "messages", "payment_request");
        r0.A00("has_unavailable_attachment", "messages", "has_unavailable_attachment");
        r0.A00("app_attribution", "messages", "app_attribution");
        r0.A00("content_app_attribution", "messages", "content_app_attribution");
        r0.A00("tree_xma", "messages", "tree_xma");
        r0.A00("admin_text_type", "messages", "admin_text_type");
        r0.A00("admin_text_theme_color", "messages", "admin_text_theme_color");
        r0.A00("admin_text_should_show_theme_icon", "messages", "admin_text_should_show_theme_icon");
        r0.A00("admin_text_gradient_colors", "messages", "admin_text_gradient_colors");
        r0.A00("admin_text_thread_icon_emoji", "messages", "admin_text_thread_icon_emoji");
        r0.A00("admin_text_nickname", "messages", "admin_text_nickname");
        r0.A00("admin_text_target_id", "messages", "admin_text_target_id");
        r0.A00("admin_text_thread_message_lifetime", "messages", "admin_text_thread_message_lifetime");
        r0.A00("message_lifetime", "messages", "message_lifetime");
        r0.A00("admin_text_thread_rtc_event", "messages", "admin_text_thread_rtc_event");
        r0.A00("admin_text_thread_rtc_server_info_data", "messages", "admin_text_thread_rtc_server_info_data");
        r0.A00("admin_text_thread_rtc_is_video_call", "messages", "admin_text_thread_rtc_is_video_call");
        r0.A00("is_sponsored", "messages", "is_sponsored");
        r0.A00("unsent_timestamp_ms", "messages", "unsent_timestamp_ms");
        r0.A00("unsendability_status", "messages", "unsendability_status");
        r0.A00("admin_text_thread_ad_properties", "messages", "admin_text_thread_ad_properties");
        r0.A00("admin_text_game_score_data", "messages", "admin_text_game_score_data");
        r0.A00("commerce_message_type", "messages", "commerce_message_type");
        r0.A00("admin_text_joinable_event_type", "messages", "admin_text_joinable_event_type");
        r0.A00("metadata_at_text_ranges", "messages", "metadata_at_text_ranges");
        r0.A00("platform_metadata", "messages", "platform_metadata");
        r0.A00("admin_text_is_joinable_promo", "messages", "admin_text_is_joinable_promo");
        r0.A00("montage_reply_message_id", "messages", "montage_reply_message_id");
        r0.A00("montage_reply_action", "messages", "montage_reply_action");
        r0.A00("montage_reply_message_media_type", "messages", "montage_reply_message_media_type");
        r0.A00("montage_reply_story_media_type", "messages", "montage_reply_story_media_type");
        r0.A00("montage_reply_story_name", "messages", "montage_reply_story_name");
        r0.A00("montage_reply_story_type", "messages", "montage_reply_story_type");
        r0.A00("montage_story_type", "messages", "montage_story_type");
        r0.A00("montage_branded_camera_share_attribution", "messages", "montage_branded_camera_share_attribution");
        r0.A00("montage_attribution", "messages", "montage_attribution");
        r0.A00("generic_admin_message_extensible_data", "messages", "generic_admin_message_extensible_data");
        r0.A00("folder", "threads", "folder");
        r0.A00("reactions", "message_reactions", "reactions");
        r0.A00("profile_ranges", "messages", "profile_ranges");
        r0.A00("tree_message_replied_to_data", "messages", "tree_message_replied_to_data");
        r0.A00("copy_message_id", "messages", "copy_message_id");
        r0.A00("montage_metadata", "messages", "montage_metadata");
        r0.A00("work_bot_should_show_get_started_cta", "messages", "work_bot_should_show_get_started_cta");
        r0.A00("message_replied_to_id", "messages", "message_replied_to_id");
        r0.A00("message_replied_to_status", "messages", "message_replied_to_status");
        r0.A00("genie_original_sender", "messages", "genie_original_sender");
        r0.A00("ad_client_token", "messages", "ad_client_token");
        r0.A00("powerup_type", "messages", "powerup_type");
        r0.A00("transcriptions_v2", "messages", "transcriptions_v2");
        r0.A00("magic_word_ranges", "messages", "magic_word_ranges");
        r0.A00("admin_text_notification_messages_token_ent_id", "messages", "admin_text_notification_messages_token_ent_id");
        r0.A00("admin_text_notification_messages_user_action_type", "messages", "admin_text_notification_messages_user_action_type");
        r0.A00("pinned_message_metadata", "messages", "pinned_message_metadata");
        r0.A00("forward_score", "messages", "forward_score");
        r0.A00("admin_text_cta_text", "messages", "admin_text_cta_text");
        r0.A00("admin_text_game_bot_message_management_user_action", "messages", "admin_text_game_bot_message_management_user_action");
        r0.A00("admin_text_custom_update_mute_management_game_id", "messages", "admin_text_custom_update_mute_management_game_id");
        r0.A00("is_takedown", "messages", "is_takedown");
        r0.A00("admin_text_custom_update_mute_management_user_action", "messages", "admin_text_custom_update_mute_management_user_action");
        A01 = new 4xD(r0.A00.build());
    }

    public C4z3(FbUserSession fbUserSession) {
        Integer num = 1Lo.A05;
        this.A00 = new 1MV(fbUserSession, 49346);
    }

    public static String A00(String str, String str2, String[] strArr) {
        String A0v;
        String str3;
        LinkedHashSet<String> A06 = strArr != null ? C1n3.A06(Arrays.asList(strArr)) : new LinkedHashSet();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        ImmutableMap immutableMap = A01.A00;
        1Du it = immutableMap.keySet().iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (str.contains(str4) || str2.contains(str4)) {
                A06.add(str4);
            }
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb.append("m._ROWID_ AS _id");
        sb2.append("messages AS m");
        boolean z = false;
        boolean z2 = false;
        for (String str5 : A06) {
            if (!"_id".equals(str5)) {
                4xC r0 = (4xC) immutableMap.get(str5);
                if (r0 == null) {
                    throw 0Pz.A05("Unknown field: ", str5);
                }
                String str6 = r0.A02;
                if ("messages".equals(str6)) {
                    A0v = 0Pz.A0v(", m.", r0.A01, " AS ", r0.A00);
                } else {
                    if ("threads".equals(str6)) {
                        if (!z) {
                            sb2.append(" INNER JOIN ");
                            sb2.append("threads");
                            sb2.append(" AS t ON m.");
                            sb2.append("thread_key");
                            sb2.append("= t.");
                            sb2.append("thread_key");
                            z = true;
                        }
                        str3 = ", t.";
                    } else if ("message_reactions".equals(str6)) {
                        if (!z2) {
                            sb2.append(" LEFT JOIN (SELECT ");
                            sb2.append(TraceFieldType.MsgId);
                            sb2.append(", GROUP_CONCAT((");
                            sb2.append("user_key");
                            sb2.append(" || '");
                            sb2.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            sb2.append("' || ");
                            sb2.append("reaction");
                            sb2.append(" || '");
                            sb2.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            sb2.append("' || ");
                            sb2.append("reaction_timestamp");
                            sb2.append(" || '");
                            sb2.append(InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR);
                            sb2.append("' || ");
                            sb2.append("reaction_style");
                            sb2.append("), '");
                            sb2.append(";");
                            sb2.append("') AS ");
                            sb2.append("reactions");
                            sb2.append(" FROM ");
                            sb2.append("message_reactions");
                            sb2.append(" GROUP BY ");
                            sb2.append(TraceFieldType.MsgId);
                            sb2.append(") AS mr ON m.");
                            sb2.append(TraceFieldType.MsgId);
                            sb2.append("= mr.");
                            sb2.append(TraceFieldType.MsgId);
                            z2 = true;
                        }
                        str3 = ", mr.";
                    }
                    sb.append(str3);
                    sb.append(r0.A01);
                    sb.append(" AS ");
                    A0v = r0.A00;
                }
                sb.append(A0v);
            }
        }
        return 0Pz.A0z("(SELECT ", sb.toString(), " FROM ", sb2.toString(), ")");
    }
}
