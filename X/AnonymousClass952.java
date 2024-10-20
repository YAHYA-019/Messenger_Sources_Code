package X;

/* JADX WARN: $VALUES field not found */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.952, reason: invalid class name */
/* loaded from: 952.class */
public final class AnonymousClass952 {
    public final String mLoggingName;
    public static final AnonymousClass952 A01 = new AnonymousClass952("DEFAULT_SEND_REPLY", 0, "montage_reply");
    public static final AnonymousClass952 A08 = new AnonymousClass952("MESSENGER_MONTAGE_REPLY_THREAD_NAV_BAR", 1, "messenger_montage_reply:thread_nav_bar");
    public static final AnonymousClass952 A07 = new AnonymousClass952("MESSENGER_MONTAGE_REPLY_INBOX_THREAD_LIST_PROFILE", 2, "MESSENGER_MONTAGE_REPLY_INBOX_THREAD_LIST_PROFILE");
    public static final AnonymousClass952 A04 = new AnonymousClass952("INBOX_UNIT_INACTIVE_REPLY", 3, "montage_reply_inbox_inactive");
    public static final AnonymousClass952 A03 = new AnonymousClass952("INBOX_UNIT_ACTIVE_REPLY", 4, "montage_reply_inbox_active");
    public static final AnonymousClass952 A05 = new AnonymousClass952("MESSENGER_MONTAGE_COMPOSER_FRIENDS_TAB", 5, "messenger_montage_composer:friends_tab");
    public static final AnonymousClass952 A06 = new AnonymousClass952("MESSENGER_MONTAGE_COMPOSER_FRIENDS_TAB_STORY_AND_ACTIVE_NOW", 6, "messenger_montage_composer:friends_tab_story_and_active_now");
    public static final AnonymousClass952 A02 = new AnonymousClass952("HIGHLIGHTS_TAB_STORIES_TRAY", 7, "HIGHLIGHTS_TAB_STORIES_TRAY");
    public static final AnonymousClass952 A09 = new AnonymousClass952("PEOPLE_TAB_MONTAGE_REPLY", 8, "people_tab_montage_reply");
    public static final AnonymousClass952 A00 = new AnonymousClass952("AN_TRAY_STORY_REPLY", 9, "montage_and_active_now:an_tray_story_reply");

    public AnonymousClass952(String str, int i, String str2) {
        this.mLoggingName = str2;
    }

    public static AnonymousClass952 A00(7Mg r301, boolean z) {
        switch (r301.ordinal()) {
            case 0:
                return A04;
            case 1:
                return A03;
            case 2:
            case 3:
                return A07;
            case 6:
                return A08;
            case 9:
            case 19:
                return A09;
            case 10:
                return z ? A06 : A05;
            case 24:
                return A02;
            case 26:
                return A00;
            default:
                return A01;
        }
    }
}
