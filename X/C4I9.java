package X;

import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.4I9, reason: invalid class name */
/* loaded from: 4I9.class */
public final class C4I9 implements C07n {
    public static final /* synthetic */ C4I9[] A00;
    public static final C4I9 A01;
    public static final C4I9 A02;
    public final String mValue;

    static {
        C4I9 c4i9 = new C4I9("ACCOUNT_RECOVERY", 0, "account_recovery");
        C4I9 c4i92 = new C4I9("APP_SHORTCUT", 1, "app_shortcut");
        C4I9 c4i93 = new C4I9("BOOKMARK", 2, "bookmark");
        C4I9 c4i94 = new C4I9("BUSINESS_INBOX_IN_MESSENGER", 3, "business_inbox_in_messenger");
        C4I9 c4i95 = new C4I9("DIRECT_INBOX", 4, "direct_inbox");
        C4I9 c4i96 = new C4I9("GROUP", 5, "group");
        C4I9 c4i97 = new C4I9("GROUP_FLYOUT", 6, "group_flyout");
        C4I9 c4i98 = new C4I9("GROUP_FULL_SCREEN_COMPOSER", 7, "group_full_screen_composer");
        C4I9 c4i99 = new C4I9("GROUP_GYSJ", 8, "group_gysj");
        C4I9 c4i910 = new C4I9("GROUP_INLINE_COMMENT_COMPOSER", 9, "group_inline_comment_composer");
        C4I9 c4i911 = new C4I9("GROUP_JOIN_BUTTON", 10, "group_join_button");
        C4I9 c4i912 = new C4I9("GROUP_JOINED_BS", 11, "group_joined_bs");
        C4I9 c4i913 = new C4I9("GROUP_MALL_INLINE_COMPOSER", 12, "group_mall_inline_composer");
        C4I9 c4i914 = new C4I9("GROUP_MALL_TERTIARY_CTA", 13, "group_mall_tertiary_cta");
        C4I9 c4i915 = new C4I9("GROUP_SEARCH", 14, "group_search");
        C4I9 c4i916 = new C4I9("HAMBURGER_MENU", 15, "hamburger_menu");
        C4I9 c4i917 = new C4I9("HORIZONTAL_SWITCH", 16, "horizontal_switch");
        C4I9 c4i918 = new C4I9("IA_DRAWER", 17, "ia_drawer");
        A01 = c4i918;
        C4I9 c4i919 = new C4I9("IA_DRAWER_BUTTON_LONG_PRESS", 18, "ia_drawer_button_long_press");
        C4I9 c4i920 = new C4I9("MINI_SWITCHER_SELECT", 19, "mini_switcher_select");
        C4I9 c4i921 = new C4I9("NAVBAR", 20, "navbar");
        C4I9 c4i922 = new C4I9("NEW_ACCOUNT_CREATED", 21, "new_account_created");
        C4I9 c4i923 = new C4I9("NT_FAST_SWITCH", 22, "nt_fast_switch");
        C4I9 c4i924 = new C4I9("NT_FBLITE_FAST_SWITCH", 23, "nt_fblite_fast_switch");
        C4I9 c4i925 = new C4I9("PERMISSIONS_ACCEPT_INVITE", 24, "permissions_accept_invite");
        C4I9 c4i926 = new C4I9("POST_PERMALINK_COMMENT_COMPOSER", 25, "post_permalink_comment_composer");
        C4I9 c4i927 = new C4I9("PROFESSIONAL_ACCOUNT_ONBOARDING_CHECKLIST", 26, "professional_account_onboarding_checklist");
        C4I9 c4i928 = new C4I9("PROFILE", 27, "profile");
        C4I9 c4i929 = new C4I9("PROFILE_TITLE", 28, "profile_title");
        C4I9 c4i930 = new C4I9("SETTINGS", 29, "settings");
        A02 = c4i930;
        C4I9 c4i931 = new C4I9("SHORTCUT", 30, "shortcut");
        C4I9 c4i932 = new C4I9("SHOUTOUT_TO_BUSINESS", 31, "shoutout_to_business");
        C4I9 c4i933 = new C4I9("SNACK_BAR", 32, "snack_bar");
        C4I9 c4i934 = new C4I9("TAB_BAR_DOUBLE_TAP", 33, "tab_bar_double_tap");
        C4I9 c4i935 = new C4I9("TAB_BAR_LONG_PRESS", 34, "tab_bar_long_press");
        C4I9 c4i936 = new C4I9("TOAST", 35, "toast");
        C4I9 c4i937 = new C4I9("TOAST_ACTIVE_PROFILE", 36, "toast_active_profile");
        C4I9 c4i938 = new C4I9("TOAST_UNDO_SWITCH", 37, "toast_undo_switch");
        C4I9 c4i939 = new C4I9("TOP_RIGHT_CORNER_PROFILE_LONG_PRESS", 38, "top_right_corner_profile_long_press");
        C4I9 c4i940 = new C4I9(OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID, 39, "unknown");
        C4I9 c4i941 = new C4I9("UNKNOWN_NT_ACTION", 40, "unknown_nt_action");
        C4I9[] c4i9Arr = new C4I9[41];
        System.arraycopy(new C4I9[]{c4i9, c4i92, c4i93, c4i94, c4i95, c4i96, c4i97, c4i98, c4i99, c4i910, c4i911, c4i912, c4i913, c4i914, c4i915, c4i916, c4i917, c4i918, c4i919, c4i920, c4i921, c4i922, c4i923, c4i924, c4i925, c4i926, c4i927}, 0, c4i9Arr, 0, 27);
        System.arraycopy(new C4I9[]{c4i928, c4i929, c4i930, c4i931, c4i932, c4i933, c4i934, c4i935, c4i936, c4i937, c4i938, c4i939, c4i940, c4i941}, 0, c4i9Arr, 27, 14);
        A00 = c4i9Arr;
    }

    public C4I9(String str, int i, String str2) {
        this.mValue = str2;
    }

    public static C4I9 valueOf(String str) {
        return (C4I9) Enum.valueOf(C4I9.class, str);
    }

    public static C4I9[] values() {
        return (C4I9[]) A00.clone();
    }

    @Override // X.C07n
    public /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
