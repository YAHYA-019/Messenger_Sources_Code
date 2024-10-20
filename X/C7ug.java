package X;

import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.pages.bizapp.config.model.BizAppBusinessPermissions;
import com.facebook.pages.bizapp.config.model.BizAppConfigNode;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: X.7ug, reason: invalid class name */
/* loaded from: 7ug.class */
public abstract class C7ug {
    public static C6gg A00(C01i c01i) {
        return (C6gg) c01i.getValue();
    }

    public static final BizAppConfigNode A01(C6gc c6gc, long j) {
        ImmutableList of;
        ImmutableList of2;
        C01i c01i = c6gc.A01;
        String string = A00(c01i).A00.getString(0Pz.A0U("cached_name_prefix_", j), (String) null);
        String A02 = A02(A00(c01i), "cached_profile_pic_url_prefix_", null, j);
        String A022 = A02(A00(c01i), "cached_tab_list_prefix_", null, j);
        String[] A00 = A022 == null ? new String[0] : C6gh.A00(A022);
        String ATw = GraphQLStringDefUtil.A00().ATw("GraphQLBusinessPresenceLinkingToolReadinessEnum", A00(c01i).A00.getString(0Pz.A0U("cached_tool_readiness_status_prefix_", j), ""));
        11T.A0A(ATw);
        String A023 = A02(A00(c01i), "cached_default_ad_account_id_prefix_", "", j);
        11T.A0A(A023);
        long j2 = A00(c01i).A00.getLong(0Pz.A0U("cached_page_id_prefix_", j), -1);
        String A024 = A02(A00(c01i), "cached_page_name_prefix_", null, j2);
        String A025 = A02(A00(c01i), "cached_page_profile_picture_url_prefix_", null, j2);
        String A026 = A02(A00(c01i), "cached_page_cover_photo_url_prefix_", null, j2);
        String A027 = A02(A00(c01i), "cached_page_cover_photo_id_prefix_", null, j2);
        String A028 = j2 > 0 ? A02(A00(c01i), "cached_access_token_prefix_", null, j2) : null;
        if (j2 > 0) {
            String string2 = A00(c01i).A00.getString(0Pz.A0U("cached_permissions_prefix_", j2), (String) null);
            if (string2 == null) {
                of = 1BK.A0b();
            } else {
                of = string2.length() == 0 ? ImmutableList.of() : ImmutableList.copyOf((Collection) 4YU.A19(string2, "#", 0));
                11T.A0C(of);
            }
        } else {
            of = ImmutableList.of();
        }
        if (j2 > 0) {
            String string3 = A00(c01i).A00.getString(0Pz.A0U("cached_page_based_experiments_list_prefix_", j2), (String) null);
            if (string3 == null) {
                of2 = 1BK.A0b();
            } else {
                of2 = string3.length() == 0 ? ImmutableList.of() : ImmutableList.copyOf((Collection) 4YU.A19(string3, "#", 0));
                11T.A0C(of2);
            }
        } else {
            of2 = ImmutableList.of();
            11T.A0A(of2);
        }
        boolean A03 = A03(A00(c01i), "cached_page_crossposting_permission_prefix_", j2);
        boolean A032 = A03(A00(c01i), "cached_page_publishing_permission_prefix_", j2);
        boolean A033 = A03(A00(c01i), "cached_is_delegate_profile_with_linked_profile_prefix_", j2);
        boolean A034 = A03(A00(c01i), "cached_is_delegate_profile_with_linked_primary_profile_prefix_", j2);
        boolean A035 = A03(A00(c01i), "cached_has_consented_to_leads_manager_tos_prefix_", j2);
        boolean A036 = A03(A00(c01i), "cached_should_render_as_profile_on_biz_tool_prefix_", j2);
        boolean A037 = A03(A00(c01i), "cache_has_seen_automated_activity_nux_prefix_", j2);
        String string4 = A00(c01i).A00.getString(0Pz.A0U("cached_ctm_ads_label_id_prefix_", j2), (String) null);
        C6gg A002 = A00(c01i);
        long j3 = -1;
        long j4 = A002.A00.getLong(0Pz.A0U("cached_whatsapp_business_id_prefix_", j), j3);
        long j5 = A00(c01i).A00.getLong(0Pz.A0U("cached_whatsapp_mailbox_id_prefix_", j), j3);
        long j6 = A00(c01i).A00.getLong(0Pz.A0U("cached_instagram_business_id_prefix_", j), j3);
        long j7 = A00(c01i).A00.getLong(0Pz.A0U("cached_instagram_business_profile_id_prefix_", j), j3);
        long j8 = A00(c01i).A00.getLong(0Pz.A0U("cached_instagram_asset_id_for_inbox_prefix", j), j3);
        long j9 = A00(c01i).A00.getLong(0Pz.A0U("cached_instagram_eimu_for_inbox_prefix", j), j3);
        long j10 = A00(c01i).A00.getLong(0Pz.A0U("cached_page_backed_instagram_asset_id_prefix", j), j3);
        long j11 = A00(c01i).A00.getLong(0Pz.A0U("cached_page_backed_instagram_eimu_prefix", j), j3);
        long j12 = A00(c01i).A00.getLong(0Pz.A0U("cached_instagram_eimu_id_prefix_", j), j3);
        String string5 = A00(c01i).A00.getString(0Pz.A0U("cached_instagram_username_prefix_", j), (String) null);
        String A029 = A02(A00(c01i), "cached_instagram_user_profile_picture_url_prefix_", null, j);
        String A0210 = A02(A00(c01i), "cached_instagram_iga_id_prefix_", null, j);
        if (j2 <= 0 || string == null || A028 == null || of.isEmpty()) {
            AnonymousClass047 ACu = ((AnonymousClass046) 1Bn.A0A(16669)).ACu("invalid node read from disk cache", 914364516);
            ACu.A8J("page_id", j2);
            ACu.A8J("presence_id", j);
            ACu.A8L("access_token_exists", AnonymousClass001.A1T(A028));
            ACu.A8L("permissions_list_exists", !AnonymousClass001.A1N(of.isEmpty() ? 1 : 0));
            ACu.report();
            return null;
        }
        ImmutableList.Builder A0h = 4YU.A0h();
        for (String str : A00) {
            A0h.m11011add((Object) GraphQLStringDefUtil.A00().ATw(1BJ.A00(273), str));
        }
        boolean A038 = A03(A00(c01i), "cached_can_manage_permissions", j);
        boolean A039 = A03(A00(c01i), "cached_can_add_post", j);
        boolean A0310 = A03(A00(c01i), "cached_can_create_ads", j);
        boolean A0311 = A03(A00(c01i), "cached_can_add_comment", j);
        boolean A0312 = A03(A00(c01i), "cached_can_send_message", j);
        boolean A0313 = A03(A00(c01i), "cached_can_view_insights", j);
        BizAppBusinessPermissions bizAppBusinessPermissions = new BizAppBusinessPermissions(A03(A00(c01i), "cached_can_access_activity_log", j), A0311, A039, A03(A00(c01i), "cached_can_ban_user", j), A0310, A03(A00(c01i), "cached_can_edit_profile_info", j), A03(A00(c01i), "cached_can_link_non_business_page_with_ig", j), A03(A00(c01i), "can_login_as_profile", j), A03(A00(c01i), "cached_can_manage_leads", j), A038, A0312, A0313);
        HashSet A0v = AnonymousClass001.A0v();
        ImmutableList.of();
        ImmutableList.of();
        return new BizAppConfigNode(bizAppBusinessPermissions, of, of2, A0h.build(), string4, A023, A0210, A029, string5, A027, A026, A024, A025, string, A028, A02, ATw, 4YV.A10("businessPermissions", 4YV.A0z("toolReadinessStatus", A0v, A0v)), A00(c01i).A00.getInt(0Pz.A0U("cached_displayed_tab_count_prefix_", j), 5), j7, j8, j6, j12, j9, j2, j4, j5, j10, j11, j, A035, A03, A032, A037, A034, A033, A03(A00(c01i), "cached_is_ig_only_prefix_", j), A036);
    }

    public static String A02(C6gg c6gg, String str, String str2, long j) {
        return c6gg.A00.getString(0Pz.A0U(str, j), str2);
    }

    public static boolean A03(C6gg c6gg, String str, long j) {
        return c6gg.A00.getBoolean(0Pz.A0U(str, j), false);
    }
}
