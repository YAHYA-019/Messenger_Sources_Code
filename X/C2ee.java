package X;

import android.provider.BaseColumns;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableSet;

/* renamed from: X.2ee, reason: invalid class name */
/* loaded from: 2ee.class */
public interface C2ee extends BaseColumns {
    public static final ImmutableSet A00;
    public static final ImmutableSet A01;

    static {
        String[] strArr = new String[37];
        System.arraycopy(new String[]{"favorite_color", "is_viewer_managing_parent", "work_info", "is_managing_parent_approved_user", "avatar_id", "is_avatar_public_and_usable_by_viewer", "avatar_preview_uri", "nickname_for_viewer", "restriction_type", "mentions_messenger_sharing_score"}, 1BK.A1W(new String[]{"huge_picture_url", "small_picture_size", "big_picture_size", "huge_picture_size", "communication_rank", "is_mobile_pushable", "is_messenger_user", "messenger_install_time_ms", "added_time_ms", "is_on_viewer_contact_list", "contact_relationship_status", "viewer_connection_status", "viewer_ig_follow_status", "add_source", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "link_type", "phonebook_section_key", "bday_month", "bday_day", "last_fetch_time_ms", "is_partial", "is_memorialized", "messenger_invite_priority", "is_broadcast_recipient_holdout", "is_aloha_proxy_confirmed", "aloha_proxy_user_owners", "is_message_ignored_by_viewer"}, strArr) ? 1 : 0, strArr, 27, 10);
        A00 = ImmutableSet.A06("fbid", "first_name", "last_name", "display_name", "small_picture_url", "big_picture_url", strArr);
        A01 = ImmutableSet.A05("_id", "communication_rank", "with_tagging_rank", "sort_name_key", "added_time_ms");
    }
}
