package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7d2, reason: invalid class name */
/* loaded from: 7d2.class */
public final class C7d2 extends 4xA {
    public static final 4xD A02;
    public static final ImmutableMap A03;
    public static final ImmutableMap A04;
    public static final String A05;
    public static final String A06;
    public C0dp A00;
    public final C00i A01;

    static {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put("latest_montage_preview_message_id", TraceFieldType.MsgId);
        builder.put("latest_montage_preview_attachments", "attachments");
        builder.put("latest_montage_preview_pending_send_attachment", "pending_send_media_attachment");
        builder.put("latest_montage_preview_sticker_id", "sticker_id");
        builder.put("latest_montage_preview_text", "text");
        builder.put("latest_montage_message_timestamp_ms", "timestamp_ms");
        builder.put("latest_montage_message_sender", "sender");
        builder.put("latest_montage_preview_message_type", TraceFieldType.MsgType);
        ImmutableMap build = builder.build();
        A04 = build;
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(4);
        builder2.put("inbox_to_montage_preview_message_id", TraceFieldType.MsgId);
        builder2.put("inbox_to_montage_preview_attachments", "attachments");
        builder2.put("inbox_to_montage_preview_sticker_id", "sticker_id");
        builder2.put("inbox_to_montage_preview_text", "text");
        builder2.put("inbox_to_montage_latest_message_timestamp_ms", "timestamp_ms");
        builder2.put("inbox_to_montage_sender", "sender");
        ImmutableMap build2 = builder2.build();
        A03 = build2;
        4xB r0 = new 4xB();
        r0.A00("_id", "threads", "_id");
        r0.A00("thread_key", "threads", "thread_key");
        r0.A00("legacy_thread_id", "threads", "legacy_thread_id");
        r0.A00("sequence_id", "threads", "sequence_id");
        r0.A00(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "threads", PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r0.A00("senders", "threads", "senders");
        r0.A00("snippet", "threads", "snippet");
        r0.A00("snippet_sender", "threads", "snippet_sender");
        r0.A00("admin_snippet", "threads", "admin_snippet");
        r0.A00("timestamp_ms", "threads", "timestamp_ms");
        r0.A00("last_read_timestamp_ms", "threads", "last_read_timestamp_ms");
        r0.A00("approx_total_message_count", "threads", "approx_total_message_count");
        r0.A00("unread_message_count", "threads", "unread_message_count");
        r0.A00("pic_hash", "threads", "pic_hash");
        r0.A00("can_reply_to", "threads", "can_reply_to");
        r0.A00("cannot_reply_reason", "threads", "cannot_reply_reason");
        r0.A00("last_message_admin_text_type", "threads", "last_message_admin_text_type");
        r0.A00("job_application_time", "threads", "job_application_time");
        r0.A00("pic", "threads", "pic");
        r0.A00("is_subscribed", "threads", "is_subscribed");
        r0.A00("folder", "threads", "folder");
        r0.A00("draft", "threads", "draft");
        r0.A00("last_fetch_time_ms", "threads", "last_fetch_time_ms");
        r0.A00("missed_call_status", "threads", "missed_call_status");
        r0.A00("mute_until", "threads", "mute_until");
        r0.A00("mute_calls_until", "threads", "mute_calls_until");
        r0.A00("timestamp_in_folder_ms", "folders", "timestamp_ms");
        r0.A00("timestamp_in_virtual_folder_ms", "virtual_folders", "timestamp_ms");
        r0.A00("group_chat_rank", "threads", "group_chat_rank");
        r0.A00("initial_fetch_complete", "threads", "initial_fetch_complete");
        r0.A00("custom_like_emoji", "threads", "custom_like_emoji");
        r0.A00("custom_like_avatar_sticker_ikid", "threads", "custom_like_avatar_sticker_ikid");
        r0.A00("outgoing_message_lifetime", "threads", "outgoing_message_lifetime");
        r0.A00("custom_nicknames", "threads", "custom_nicknames");
        r0.A00("invite_uri", "threads", "invite_uri");
        r0.A00("last_message_id_if_sponsored", "threads", "last_message_id_if_sponsored");
        r0.A00("is_joinable", "threads", "is_joinable");
        r0.A00("requires_approval", "threads", "requires_approval");
        r0.A00("rtc_call_info", "threads", "rtc_call_info");
        r0.A00("rtc_room_info", "threads", "rtc_room_info");
        r0.A00("last_message_commerce_message_type", "threads", "last_message_commerce_message_type");
        r0.A00("is_thread_queue_enabled", "threads", "is_thread_queue_enabled");
        r0.A00("group_description", "threads", "group_description");
        r0.A00("media_preview", "threads", "media_preview");
        r0.A00("booking_requests", "threads", "booking_requests");
        r0.A00("last_call_ms", "threads", "last_call_ms");
        r0.A00("is_discoverable", "threads", "is_discoverable");
        r0.A00("last_sponsored_message_call_to_action", "threads", "last_sponsored_message_call_to_action");
        r0.A00("montage_thread_key", "threads", "montage_thread_key");
        r0.A00("inbox_to_montage_thread_read_watermark_timestamp_ms", "inbox_to_montage_threads", "last_read_timestamp_ms");
        r0.A00("room_privacy_mode", "threads", "room_privacy_mode");
        r0.A00("room_associated_fb_group_id", "threads", "room_associated_fb_group_id");
        r0.A00("room_associated_fb_group_name", "threads", "room_associated_fb_group_name");
        r0.A00("room_associated_photo_uri", "threads", "room_associated_photo_uri");
        r0.A00("group_associated_fb_group_visibility", "threads", "group_associated_fb_group_visibility");
        r0.A00("has_work_multi_company_associated_group", "threads", "has_work_multi_company_associated_group");
        r0.A00("approval_toggleable", "threads", "approval_toggleable");
        r0.A00("video_room_mode", "threads", "video_room_mode");
        r0.A00("marketplace_data", "threads", "marketplace_data");
        r0.A00("new_friend_bump_data", "threads", "new_friend_bump_data");
        r0.A00("room_creation_time", "threads", "room_creation_time");
        r0.A00("group_thread_category", "threads", "group_thread_category");
        r0.A00("are_admins_supported", "threads", "are_admins_supported");
        r0.A00("group_thread_add_mode", "threads", "group_thread_add_mode");
        r0.A00("group_thread_offline_threading_id", "threads", "group_thread_offline_threading_id");
        r0.A00("personal_group_invite_link", "threads", "personal_group_invite_link");
        r0.A00("optimistic_group_state", "threads", "optimistic_group_state");
        r0.A00("ad_context_data", "threads", "ad_context_data");
        r0.A00("use_existing_group", "threads", "use_existing_group");
        r0.A00("thread_associated_object_type", "threads", "thread_associated_object_type");
        r0.A00("thread_streak_data", "threads", "thread_streak_data");
        r0.A00("games_push_notification_settings", "threads", "games_push_notification_settings");
        r0.A00("can_participants_claim_admin", "threads", "can_participants_claim_admin");
        r0.A00("group_approval_mode", "threads", "group_approval_mode");
        r0.A00("synced_fb_group_id", "threads", "synced_fb_group_id");
        r0.A00("synced_fb_group_status", "threads", "synced_fb_group_status");
        r0.A00("synced_fb_group_is_work_multi_company_group", "threads", "synced_fb_group_is_work_multi_company_group");
        r0.A00("video_chat_link", "threads", "video_chat_link");
        r0.A00("theme_id", "threads", "theme_id");
        r0.A00("theme_fallback_color", "threads", "theme_fallback_color");
        r0.A00("theme_gradient_colors", "threads", "theme_gradient_colors");
        r0.A00("theme_accessibility_label", "threads", "theme_accessibility_label");
        r0.A00("is_fuss_red_page", "threads", "is_fuss_red_page");
        r0.A00("is_disappearing_mode", "threads", "is_disappearing_mode");
        r0.A00("proactive_warning_dismiss_time", "threads", "proactive_warning_dismiss_time");
        r0.A00("vanish_mode_selection_timestamp", "threads", "vanish_mode_selection_timestamp");
        r0.A00("vanish_mode_selected_mode", "threads", "vanish_mode_selected_mode");
        r0.A00("is_thread_pinned", "threads", "is_thread_pinned");
        r0.A00("thread_pin_timestamp", "threads", "thread_pin_timestamp");
        r0.A00("animated_thread_activity_banner", "threads", "animated_thread_activity_banner");
        r0.A00("last_message_breadcrumb_type", "threads", "last_message_breadcrumb_type");
        r0.A00("last_message_breadcrumb_cta", "threads", "last_message_breadcrumb_cta");
        r0.A00("thread_connectivity_data", "threads", "thread_connectivity_data");
        r0.A00("unsendability_status", "threads", "unsendability_status");
        r0.A00("work_sync_group_data", "threads", "work_sync_group_data");
        r0.A00("group_thread_subtype", "threads", "group_thread_subtype");
        r0.A00("is_page_follow_up", "threads", "is_page_follow_up");
        r0.A00("last_message_id", "threads", "last_message_id");
        r0.A00("ads_qp_update_data", "threads", "ads_qp_update_data");
        r0.A00("last_message_timestamp_ms", "threads", "last_message_timestamp_ms");
        r0.A00("messenger_request_appointment_data", "threads", "messenger_request_appointment_data");
        r0.A00("related_page_thread_data", "threads", "related_page_thread_data");
        r0.A00("has_non_admin_message", "threads", "has_non_admin_message");
        r0.A00("ad_client_token", "threads", "ad_client_token");
        r0.A00("message_suggestion", "threads", "message_suggestion");
        r0.A00("unbounded_unsend_limit_sec", "threads", "unbounded_unsend_limit_sec");
        r0.A00("vanishing_mode_paired_timestamp_ms", "threads", "vanishing_mode_paired_timestamp_ms");
        r0.A00("is_ignored_by_viewer", "threads", "is_ignored_by_viewer");
        r0.A00("reported_timestamp_ms", "threads", "reported_timestamp_ms");
        r0.A00("reviewed_timestamp_ms", "threads", "reviewed_timestamp_ms");
        r0.A00("policy_violation_content_visibility_value", "threads", "policy_violation_content_visibility_value");
        r0.A00("is_viewer_allowed_to_add_members", "threads", "is_viewer_allowed_to_add_members");
        r0.A00("should_open_disappearing_mode", "threads", "should_open_disappearing_mode");
        r0.A00("disappearing_thread_key", "threads", "disappearing_thread_key");
        r0.A00("unread_disappearing_message_count", "threads", "unread_disappearing_message_count");
        r0.A00("last_seen_super_react_timestamp_sec", "threads", "last_seen_super_react_timestamp_sec");
        r0.A00("magic_words", "threads", "magic_words");
        r0.A00("pinned_message_id", "threads", "pinned_message_id");
        r0.A00("pinned_message_snippet", "threads", "pinned_message_snippet");
        r0.A00("parent_thread_key", "threads", "parent_thread_key");
        r0.A00("group_thread_warning_type", "threads", "group_thread_warning_type");
        r0.A00("last_missed_call_timestamp_ms", "threads", "last_missed_call_timestamp_ms");
        r0.A00("is_last_missed_call_video", "threads", "is_last_missed_call_video");
        r0.A00("last_snippet_update_timestamp_ms", "threads", "last_snippet_update_timestamp_ms");
        r0.A00("is_xac_thread", "threads", "is_xac_thread");
        r0.A00("last_missed_call_participant_ids", "threads", "last_missed_call_participant_ids");
        r0.A00("is_all_unread_message_missed_call_xma", "threads", "is_all_unread_message_missed_call_xma");
        r0.A00("learning_space_data", "threads", "learning_space_data");
        r0.A00("theme_payload_data", "threads", "theme_payload_data");
        r0.A00("thread_takedown_state", "threads", "thread_takedown_state");
        r0.A00("community_chat_flags", "threads", "community_chat_flags");
        r0.A00("community_chat_direct_invite_permission", "threads", "community_chat_direct_invite_permission");
        r0.A00("is_viewer_thread_creator", "threads", "is_viewer_thread_creator");
        r0.A00("professional_metadata", "threads", "professional_metadata");
        r0.A00("smcta_post_id", "threads", "smcta_post_id");
        r0.A00("is_ai_agent_active", "threads", "is_ai_agent_active");
        Iterator it = build.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(it);
            r0.A00(AnonymousClass001.A0j(A0z), "montage_latest_messages", 1BK.A16(A0z));
        }
        Iterator it2 = build2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(it2);
            r0.A00(AnonymousClass001.A0j(A0z2), "inbox_to_montage_messages", 1BK.A16(A0z2));
        }
        A02 = new 4xD(r0.A00.build());
        ImmutableCollection values = build.values();
        StringBuilder A0k = AnonymousClass001.A0k();
        1Du it3 = values.iterator();
        while (it3.hasNext()) {
            A0k.append(AnonymousClass001.A0i(it3));
            if (it3.hasNext()) {
                A0k.append(',');
            }
        }
        A06 = A0k.toString();
        ImmutableCollection values2 = build2.values();
        StringBuilder A0k2 = AnonymousClass001.A0k();
        1Du it4 = values2.iterator();
        while (it4.hasNext()) {
            A0k2.append(AnonymousClass001.A0i(it4));
            if (it4.hasNext()) {
                A0k2.append(',');
            }
        }
        A05 = A0k2.toString();
    }

    public C7d2(FbUserSession fbUserSession) {
        C0dp c0dp = (C0dp) 1Bi.A03(99390);
        Integer num = 1Lo.A05;
        this.A01 = new 1MV(fbUserSession, 49346);
        this.A00 = c0dp;
    }

    public static final C7d2 A00(Object obj) {
        return new C7d2((FbUserSession) obj);
    }

    public static String A01(C7d2 c7d2, String str, String str2, String[] strArr) {
        StringBuilder A0k;
        String str3;
        String A0v;
        String str4 = str2;
        String str5 = str;
        1I0 r0 = new 1I0(4);
        if (strArr != null) {
            r0.A06(strArr);
        }
        if (str == null) {
            str5 = "";
        }
        if (str2 == null) {
            str4 = "";
        }
        ImmutableMap immutableMap = A02.A00;
        1Du it = immutableMap.keySet().iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            if (str5.contains(A0i) || str4.contains(A0i)) {
                r0.A05(A0i);
            }
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        StringBuilder A0k3 = AnonymousClass001.A0k();
        A0k2.append("t._ROWID_ AS _id");
        A0k3.append("threads AS t");
        1Du it2 = r0.A07().iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (it2.hasNext()) {
            String A0i2 = AnonymousClass001.A0i(it2);
            if (!"_id".equals(A0i2)) {
                4xC r02 = (4xC) immutableMap.get(A0i2);
                if (r02 == null) {
                    throw 0Pz.A05("Unknown field: ", A0i2);
                }
                String str6 = r02.A02;
                if ("threads".equals(str6)) {
                    A0k = AnonymousClass001.A0k();
                    str3 = ", t.";
                } else if ("folders".equals(str6)) {
                    if (!z) {
                        A0k3.append(" INNER JOIN folders AS f ON t.thread_key = f.thread_key");
                        z = true;
                    }
                    A0k = AnonymousClass001.A0k();
                    str3 = ", f.";
                } else if ("virtual_folders".equals(str6)) {
                    if (!z2) {
                        A0k3.append(" INNER JOIN virtual_folders AS vf ON t.thread_key = vf.thread_key AND vf.virtual_folder = ?");
                        z2 = true;
                    }
                    A0k = AnonymousClass001.A0k();
                    str3 = ", vf.";
                } else if ("group_conversations".equals(str6)) {
                    if (!z3) {
                        A0k3.append(" INNER JOIN group_conversations AS g ON t.thread_key = g.thread_key");
                        z3 = true;
                    }
                    A0k = AnonymousClass001.A0k();
                    str3 = ", g.";
                } else {
                    boolean equals = "inbox_to_montage_messages".equals(str6);
                    if (equals || "inbox_to_montage_threads".equals(str6)) {
                        if (!z4) {
                            A0k3.append(" LEFT JOIN ");
                            A0k3.append("threads");
                            A0k3.append(" AS mt ON mt.thread_key = t.");
                            A0k3.append("montage_thread_key");
                            StringBuilder A0k4 = AnonymousClass001.A0k();
                            A0k4.append(" AND mt.folder='");
                            A0k4.append(1F9.A0M);
                            A0k4.append("'");
                            1BK.A1R(A0k3, A0k4);
                            A0k3.append(" LEFT JOIN");
                            A0k3.append(" (SELECT ");
                            AnonymousClass001.A1D(A05, ",thread_key, max(timestamp_ms) FROM ", "messages", A0k3);
                            A0k3.append(" WHERE msg_type=");
                            A0k3.append(C1q8.A0N.dbKeyValue);
                            A0k3.append(" AND timestamp_ms > ");
                            A0k3.append(c7d2.A00.now() - 86400000);
                            A0k3.append(" AND (montage_story_type IS NULL OR montage_story_type NOT IN('group', 'event')) ");
                            A0k3.append(" GROUP BY thread_key)");
                            A0k3.append(" AS mm ON mm.thread_key = mt.thread_key");
                            z4 = true;
                        }
                        A0k2.append(equals ? ", mm" : ", mt");
                        A0v = 0Pz.A0v(".", r02.A01, " AS ", r02.A00);
                    } else if ("montage_latest_messages".equals(str6)) {
                        if (!z5) {
                            A0k3.append(" LEFT JOIN (SELECT ");
                            AnonymousClass001.A1D(A06, ",thread_key, max(timestamp_ms) FROM ", "messages", A0k3);
                            A0k3.append(" WHERE msg_type IN(");
                            A0k3.append(C1q8.A0N.dbKeyValue);
                            A0k3.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                            A0k3.append(C1q8.A0M.dbKeyValue);
                            A0k3.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                            A0k3.append(C1q8.A0A.dbKeyValue);
                            A0k3.append(") AND timestamp_ms > ");
                            A0k3.append(c7d2.A00.now() - 86400000);
                            AnonymousClass001.A1D(" AND (montage_story_type IS NULL OR montage_story_type NOT IN('group', 'event')) ", " GROUP BY thread_key)", " AS ", A0k3);
                            A0k3.append("latest");
                            A0k3.append(" ON ");
                            A0k3.append("latest");
                            A0k3.append(".thread_key = t.thread_key");
                            z5 = true;
                        }
                        AnonymousClass001.A1D(", ", "latest", ".", A0k2);
                        A0k2.append(r02.A01);
                        A0k2.append(" AS ");
                        A0v = r02.A00;
                    }
                    A0k2.append(A0v);
                }
                A0k.append(str3);
                A0k.append(r02.A01);
                A0k.append(" AS ");
                A0k.append(r02.A00);
                1BK.A1R(A0k2, A0k);
            }
        }
        return 0Pz.A0z("(SELECT ", A0k2.toString(), " FROM ", A0k3.toString(), ")");
    }

    public Cursor A07(SQLiteDatabase sQLiteDatabase, String str, String str2, String[] strArr, String[] strArr2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(A01(this, str, str2, strArr));
        return sQLiteQueryBuilder.query(sQLiteDatabase, strArr, str, strArr2, null, null, str2, null);
    }
}
