package X;

import android.database.Cursor;
import com.facebook.messaging.database.threads.MessageCursorUtil;
import com.facebook.proxygen.TraceFieldType;
import com.mapbox.mapboxsdk.style.layers.Property;

/* renamed from: X.4z4, reason: invalid class name */
/* loaded from: 4z4.class */
public final class C4z4 {
    public boolean A00 = false;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;
    public final int A0T;
    public final int A0U;
    public final int A0V;
    public final int A0W;
    public final int A0X;
    public final int A0Y;
    public final int A0Z;
    public final int A0a;
    public final int A0b;
    public final int A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final int A0j;
    public final int A0k;
    public final int A0l;
    public final int A0m;
    public final int A0n;
    public final int A0o;
    public final int A0p;
    public final int A0q;
    public final int A0r;
    public final int A0s;
    public final int A0t;
    public final int A0u;
    public final int A0v;
    public final int A0w;
    public final int A0x;
    public final int A0y;
    public final int A0z;
    public final int A10;
    public final int A11;
    public final int A12;
    public final int A13;
    public final int A14;
    public final int A15;
    public final int A16;
    public final int A17;
    public final int A18;
    public final int A19;
    public final int A1A;
    public final int A1B;
    public final int A1C;
    public final int A1D;
    public final int A1E;
    public final int A1F;
    public final int A1G;
    public final int A1H;
    public final int A1I;
    public final int A1J;
    public final int A1K;
    public final int A1L;
    public final int A1M;
    public final int A1N;
    public final int A1O;
    public final int A1P;
    public final int A1Q;
    public final int A1R;
    public final int A1S;
    public final int A1T;
    public final Cursor A1U;
    public final C00663oZ A1V;
    public final /* synthetic */ MessageCursorUtil A1W;

    public C4z4(Cursor cursor, MessageCursorUtil messageCursorUtil, C00663oZ c00663oZ) {
        this.A1W = messageCursorUtil;
        this.A1U = cursor;
        this.A1V = c00663oZ;
        this.A1L = cursor.getColumnIndex("thread_key");
        this.A0q = cursor.getColumnIndex(TraceFieldType.MsgId);
        this.A1K = cursor.getColumnIndex("text");
        this.A1F = cursor.getColumnIndex("snippet");
        this.A1B = cursor.getColumnIndex("sender");
        this.A0W = cursor.getColumnIndex("is_not_forwardable");
        this.A1M = cursor.getColumnIndex("timestamp_ms");
        this.A1D = cursor.getColumnIndex("timestamp_sent_ms");
        this.A0r = cursor.getColumnIndex(TraceFieldType.MsgType);
        this.A0J = cursor.getColumnIndex("affected_users");
        this.A0K = cursor.getColumnIndex("attachments");
        this.A1E = cursor.getColumnIndex("shares");
        this.A1H = cursor.getColumnIndex("sticker_id");
        this.A1I = cursor.getColumnIndex("sticker_size");
        this.A1J = cursor.getColumnIndex("client_tags");
        this.A0Q = cursor.getColumnIndex("extensible_message_data");
        this.A0s = cursor.getColumnIndex("offline_threading_id");
        this.A1G = cursor.getColumnIndex(Property.SYMBOL_Z_ORDER_SOURCE);
        this.A0L = cursor.getColumnIndex("channel_source");
        this.A12 = cursor.getColumnIndex("send_channel");
        this.A0V = cursor.getColumnIndex("is_non_authoritative");
        this.A0v = cursor.getColumnIndex("pending_send_media_attachment");
        this.A1C = cursor.getColumnIndex("sent_share_attachment");
        this.A13 = cursor.getColumnIndex("send_error");
        this.A16 = cursor.getColumnIndex("send_error_message");
        this.A14 = cursor.getColumnIndex("send_error_detail");
        this.A18 = cursor.getColumnIndex("send_error_original_exception");
        this.A17 = cursor.getColumnIndex("send_error_number");
        this.A19 = cursor.getColumnIndex("send_error_timestamp_ms");
        this.A15 = cursor.getColumnIndex("send_error_error_url");
        this.A10 = cursor.getColumnIndex("publicity");
        this.A0P = cursor.getColumnIndex("copy_message_id");
        this.A1A = cursor.getColumnIndex("send_queue_type");
        this.A0u = cursor.getColumnIndex("payment_transaction");
        this.A0t = cursor.getColumnIndex("payment_request");
        this.A0U = cursor.getColumnIndex("has_unavailable_attachment");
        this.A0N = cursor.getColumnIndex("app_attribution");
        this.A0O = cursor.getColumnIndex("content_app_attribution");
        this.A1T = cursor.getColumnIndex("tree_xma");
        this.A0G = cursor.getColumnIndex("admin_text_type");
        this.A0D = cursor.getColumnIndex("admin_text_theme_color");
        this.A0B = cursor.getColumnIndex("admin_text_should_show_theme_icon");
        this.A06 = cursor.getColumnIndex("admin_text_gradient_colors");
        this.A0E = cursor.getColumnIndex("admin_text_thread_icon_emoji");
        this.A07 = cursor.getColumnIndex("admin_text_nickname");
        this.A0C = cursor.getColumnIndex("admin_text_target_id");
        this.A0F = cursor.getColumnIndex("admin_text_thread_message_lifetime");
        this.A0c = cursor.getColumnIndex("message_lifetime");
        this.A08 = cursor.getColumnIndex("admin_text_thread_rtc_event");
        this.A0A = cursor.getColumnIndex("admin_text_thread_rtc_server_info_data");
        this.A09 = cursor.getColumnIndex("admin_text_thread_rtc_is_video_call");
        this.A0X = cursor.getColumnIndex("is_sponsored");
        this.A1Q = cursor.getColumnIndex("unsent_timestamp_ms");
        this.A1P = cursor.getColumnIndex("unsendability_status");
        this.A03 = cursor.getColumnIndex("admin_text_thread_ad_properties");
        this.A05 = cursor.getColumnIndex("admin_text_game_score_data");
        this.A0M = cursor.getColumnIndex("commerce_message_type");
        this.A0Z = cursor.getColumnIndex("admin_text_joinable_event_type");
        this.A0g = cursor.getColumnIndex("metadata_at_text_ranges");
        this.A0x = cursor.getColumnIndex("platform_metadata");
        this.A0a = cursor.getColumnIndex("admin_text_is_joinable_promo");
        this.A0k = cursor.getColumnIndex("montage_reply_message_id");
        this.A0j = cursor.getColumnIndex("montage_reply_action");
        this.A0l = cursor.getColumnIndex("montage_reply_message_media_type");
        this.A0m = cursor.getColumnIndex("montage_reply_story_media_type");
        this.A0n = cursor.getColumnIndex("montage_reply_story_name");
        this.A0o = cursor.getColumnIndex("montage_reply_story_type");
        this.A0p = cursor.getColumnIndex("montage_story_type");
        this.A0h = cursor.getColumnIndex("montage_attribution");
        this.A02 = cursor.getColumnIndex("generic_admin_message_extensible_data");
        this.A11 = cursor.getColumnIndex("reactions");
        this.A0z = cursor.getColumnIndex("profile_ranges");
        this.A0d = cursor.getColumnIndex("tree_message_replied_to_data");
        this.A0e = cursor.getColumnIndex("message_replied_to_id");
        this.A0f = cursor.getColumnIndex("message_replied_to_status");
        this.A0i = cursor.getColumnIndex("montage_metadata");
        this.A1S = cursor.getColumnIndex("work_bot_should_show_get_started_cta");
        this.A0T = cursor.getColumnIndex("genie_original_sender");
        this.A01 = cursor.getColumnIndex("ad_client_token");
        this.A0y = cursor.getColumnIndex("powerup_type");
        this.A1O = cursor.getColumnIndex("transcriptions_v2");
        this.A0b = cursor.getColumnIndex("magic_word_ranges");
        this.A1N = cursor.getColumnIndex("admin_text_notification_messages_token_ent_id");
        this.A1R = cursor.getColumnIndex("admin_text_notification_messages_user_action_type");
        this.A0w = cursor.getColumnIndex("pinned_message_metadata");
        this.A0R = cursor.getColumnIndex("forward_score");
        this.A04 = cursor.getColumnIndex("admin_text_cta_text");
        this.A0I = cursor.getColumnIndex("admin_text_game_bot_message_management_user_action");
        this.A0Y = cursor.getColumnIndex("is_takedown");
        this.A0S = cursor.getColumnIndex("admin_text_custom_update_mute_management_game_id");
        this.A0H = cursor.getColumnIndex("admin_text_custom_update_mute_management_user_action");
    }
}
