package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.4un, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4un.class */
public final class C10804un {
    public static final String[] A1A;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
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
    public final 4yZ A18 = (4yZ) 1Bn.A0A(49405);
    public final C00i A11 = new 1BV(66509);
    public final C00i A0z = new 1BV(68216);
    public final C7td A17 = (C7td) 1Bi.A03(68324);
    public C00i A00 = new 1BV(66505);
    public final C11964ya A16 = (C11964ya) 1Bn.A0A(49406);
    public final C11974yb A15 = (C11974yb) 1Bn.A0A(49407);
    public final C00i A09 = new 1BV(49392);
    public final C00i A0A = new 1BV(49391);
    public final 4yW A14 = (4yW) 1Bn.A0A(49402);
    public final C00i A0y = new 1BV(66506);
    public final C11984yc A12 = (C11984yc) 1Bn.A0A(49408);
    public final 9ID A13 = (9ID) 1Bn.A0A(66504);
    public final C4yk A19 = (C4yk) 1Bn.A0A(66933);
    public final C00i A10 = new 1BV(66507);
    public final AnonymousClass243 A0x = (AnonymousClass243) 1Bn.A0A(68334);

    static {
        String[] strArr = new String[57];
        System.arraycopy(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "pic_hash", "pic", "missed_call_status", "custom_like_emoji", "custom_like_avatar_sticker_ikid", "outgoing_message_lifetime", "custom_nicknames", "last_message_id_if_sponsored", "group_chat_rank", "rtc_call_info", "rtc_room_info", "last_message_commerce_message_type", "is_thread_queue_enabled", "media_preview", "booking_requests", "last_call_ms", "last_sponsored_message_call_to_action", "last_message_admin_text_type", "marketplace_data", "new_friend_bump_data", "montage_thread_key", "inbox_to_montage_preview_message_id", "inbox_to_montage_preview_attachments", "inbox_to_montage_preview_text", "inbox_to_montage_preview_sticker_id", "inbox_to_montage_latest_message_timestamp_ms"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"inbox_to_montage_thread_read_watermark_timestamp_ms", "inbox_to_montage_sender", "optimistic_group_state", "ad_context_data", "games_push_notification_settings", "animated_thread_activity_banner", "last_message_breadcrumb_type", "last_message_breadcrumb_cta", "group_thread_subtype", "is_page_follow_up", "last_message_id", "ads_qp_update_data", "messenger_request_appointment_data", "related_page_thread_data", "has_non_admin_message", "ad_client_token", "message_suggestion", "unbounded_unsend_limit_sec", "is_ignored_by_viewer", "is_viewer_allowed_to_add_members", "parent_thread_key", "last_missed_call_timestamp_ms", "is_last_missed_call_video", "last_missed_call_participant_ids", "community_chat_flags", "community_chat_direct_invite_permission", "is_viewer_thread_creator"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"professional_metadata", "smcta_post_id", "is_ai_agent_active"}, 0, strArr, 54, 3);
        A1A = strArr;
    }

    public C10804un(Cursor cursor) {
        this.A0k = cursor.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        this.A0q = cursor.getColumnIndexOrThrow("pic_hash");
        this.A0p = cursor.getColumnIndexOrThrow("pic");
        this.A0g = cursor.getColumnIndexOrThrow("media_preview");
        this.A0j = cursor.getColumnIndexOrThrow("missed_call_status");
        this.A0J = cursor.getColumnIndexOrThrow("custom_like_emoji");
        this.A0I = cursor.getColumnIndexOrThrow("custom_like_avatar_sticker_ikid");
        this.A0W = cursor.getColumnIndexOrThrow("last_message_admin_text_type");
        this.A0n = cursor.getColumnIndexOrThrow("outgoing_message_lifetime");
        this.A01 = cursor.getColumnIndexOrThrow("custom_nicknames");
        this.A0b = cursor.getColumnIndexOrThrow("last_message_id_if_sponsored");
        this.A0L = cursor.getColumnIndexOrThrow("group_chat_rank");
        this.A0t = cursor.getColumnIndexOrThrow("rtc_call_info");
        this.A0u = cursor.getColumnIndexOrThrow("rtc_room_info");
        this.A0Z = cursor.getColumnIndexOrThrow("last_message_commerce_message_type");
        this.A0S = cursor.getColumnIndexOrThrow("is_thread_queue_enabled");
        this.A0F = cursor.getColumnIndexOrThrow("booking_requests");
        this.A0V = cursor.getColumnIndexOrThrow("last_call_ms");
        this.A0e = cursor.getColumnIndexOrThrow("last_sponsored_message_call_to_action");
        this.A0f = cursor.getColumnIndexOrThrow("marketplace_data");
        this.A0l = cursor.getColumnIndexOrThrow("new_friend_bump_data");
        this.A08 = cursor.getColumnIndexOrThrow("montage_thread_key");
        this.A04 = cursor.getColumnIndex("inbox_to_montage_preview_message_id");
        this.A07 = cursor.getColumnIndex("inbox_to_montage_preview_text");
        this.A06 = cursor.getColumnIndex("inbox_to_montage_preview_sticker_id");
        this.A03 = cursor.getColumnIndex("inbox_to_montage_preview_attachments");
        this.A02 = cursor.getColumnIndex("inbox_to_montage_latest_message_timestamp_ms");
        this.A05 = cursor.getColumnIndex("inbox_to_montage_sender");
        this.A0m = cursor.getColumnIndexOrThrow("optimistic_group_state");
        this.A0C = cursor.getColumnIndexOrThrow("ad_context_data");
        this.A0D = cursor.getColumnIndexOrThrow("ads_qp_update_data");
        this.A0K = cursor.getColumnIndexOrThrow("games_push_notification_settings");
        this.A0E = cursor.getColumnIndexOrThrow("animated_thread_activity_banner");
        this.A0Y = cursor.getColumnIndexOrThrow("last_message_breadcrumb_type");
        this.A0X = cursor.getColumnIndexOrThrow("last_message_breadcrumb_cta");
        this.A0M = cursor.getColumnIndexOrThrow("group_thread_subtype");
        this.A0R = cursor.getColumnIndexOrThrow("is_page_follow_up");
        this.A0a = cursor.getColumnIndexOrThrow("last_message_id");
        this.A0i = cursor.getColumnIndexOrThrow("messenger_request_appointment_data");
        this.A0s = cursor.getColumnIndexOrThrow("related_page_thread_data");
        this.A0N = cursor.getColumnIndexOrThrow("has_non_admin_message");
        this.A0B = cursor.getColumnIndex("ad_client_token");
        this.A0h = cursor.getColumnIndex("message_suggestion");
        this.A0w = cursor.getColumnIndex("unbounded_unsend_limit_sec");
        this.A0P = cursor.getColumnIndex("is_ignored_by_viewer");
        this.A0T = cursor.getColumnIndex("is_viewer_allowed_to_add_members");
        this.A0o = cursor.getColumnIndex("parent_thread_key");
        this.A0d = cursor.getColumnIndex("last_missed_call_timestamp_ms");
        this.A0Q = cursor.getColumnIndex("is_last_missed_call_video");
        this.A0c = cursor.getColumnIndex("last_missed_call_participant_ids");
        this.A0H = cursor.getColumnIndex("community_chat_flags");
        this.A0G = cursor.getColumnIndex("community_chat_direct_invite_permission");
        this.A0U = cursor.getColumnIndex("is_viewer_thread_creator");
        this.A0r = cursor.getColumnIndex("professional_metadata");
        this.A0v = cursor.getColumnIndex("smcta_post_id");
        this.A0O = cursor.getColumnIndex("is_ai_agent_active");
    }

    /* JADX WARN: Code restructure failed: missing block: B:486:0x0ad6, code lost:
    
        if (r330.equals(r313) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b48, code lost:
    
        if (r0.A0D("will_expand_to_new_thread").A0P() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0ba6, code lost:
    
        if (r330.equals(r0) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0bbb, code lost:
    
        if (r330.equals("VIDEO_GROUP_CALL") == false) goto L185;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x0136. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v48, types: [com.facebook.messaging.model.threads.NicknamesMap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v609, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v152, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A00(X.CDt r302, X.C1zm r303) {
        /*
            Method dump skipped, instructions count: 6684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10804un.A00(X.CDt, X.1zm):void");
    }
}
