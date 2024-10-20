package X;

/* loaded from: BP4.class */
public enum BP4 implements C4zn {
    UNKNOWN("unknown", 0),
    INBOX("thread_list", 1),
    GROUPS_TAB("groups_tab", 2),
    THREAD_SETTINGS("messenger_thread_settings", 3),
    THREAD_VIEW("messenger_thread_view", 4),
    BROADCAST_FLOW("broadcast_flow"),
    GROUP_THREAD_DETAILS_ADD("group_thread_details_add"),
    GROUP_THREAD_DETAILS_CREATE_NEW_GROUP("group_thread_details_create_new_group"),
    GROUP_THREAD_DETAILS_MEMBERSHIP_ADD("group_thread_details_membership_add"),
    ONE_ON_ONE_THREAD_DETAILS("one_on_one_thread_details"),
    GROUP_THREAD_VIEW_ADD_MEMBERS("group_thread_view_add_members"),
    INBOX_FAB("inbox_fab"),
    INBOX_THREAD_LONG_PRESS_MENU("inbox_thread_long_press_menu"),
    INBOX_THREAD_LONG_PRESS_MENU_ADD_MEMBER("inbox_thread_long_press_menu_add_member"),
    /* JADX INFO: Fake field, exist only in values array */
    EVENTS("events");

    public static final BP4[] A00 = values();
    public final String loggingName;
    public final String oldLoggingName;

    BP4(String str) {
        this.loggingName = str;
        this.oldLoggingName = str;
    }

    BP4(String str, int i) {
        this.loggingName = r303;
        this.oldLoggingName = str;
    }

    public static void A00() {
        for (BP4 bp4 : A00) {
            if (bp4.oldLoggingName.equals("thread_list")) {
                return;
            }
        }
        0fH.A14("SearchEntrySurface", "Unknown tab analytics name: %s", new Object[]{"thread_list"});
    }

    @Override // X.C4zn
    public String Aus() {
        throw 0Q8.createAndThrow();
    }
}
