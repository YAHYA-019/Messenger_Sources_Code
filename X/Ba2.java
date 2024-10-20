package X;

import java.util.Arrays;

/* loaded from: Ba2.class */
public abstract class Ba2 {
    public static final String[] A00 = {"fbid"};
    public static final String[] A01;
    public static final String[] A02;
    public static final String[] A03;
    public static final String[] A04;

    static {
        String[] strArr = {"fbid", "item_type", "display_name", "first_name", "last_name", "flags", "can_reply_to", "picture_url", "participant_url_list", "restriction_type", "thread_type", "is_blocked_by_viewer", "community_group_id", "msys_thread_pk", "community_profile_pic_url", "capabilities_1", "capabilities_2", "context_line", "group_thread_sub_type", "is_subscribed", "is_taken_down", "force_e2ee", "has_cutover_thread", "is_default_e2ee_eligible_for_one_to_one", "admin_type", "invite_link", "is_creator_verified"};
        A02 = strArr;
        Object[] copyOf = Arrays.copyOf(strArr, 28);
        copyOf[27] = "group_fbid";
        A01 = (String[]) copyOf;
        String[] strArr2 = new String[28];
        System.arraycopy(new String[]{"fbid", "item_type", "display_name", "first_name", "last_name", "picture_url", "participant_url_list", "flags", "can_reply_to", "restriction_type", "thread_type", "group_participants_blob", "is_blocked_by_viewer", "community_group_id", "msys_thread_pk", "community_profile_pic_url", "capabilities_1", "capabilities_2", "context_line", "group_thread_sub_type", "is_subscribed", "is_taken_down", "force_e2ee", "has_cutover_thread", "is_default_e2ee_eligible_for_one_to_one", "admin_type", "invite_link"}, 0, strArr2, 0, 27);
        System.arraycopy(new String[]{"is_creator_verified"}, 0, strArr2, 27, 1);
        A03 = strArr2;
        A04 = (String[]) 1Dz.A02(strArr2, new String[]{"most_recent_pick_time_ms", "most_recent_pick_rank_section", "total_pick_count"});
    }
}
