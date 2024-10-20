package X;

/* loaded from: BVb.class */
public abstract class BVb {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    public static final String A00(String str) {
        switch (str.hashCode()) {
            case -1162027870:
                if (str.equals("sc_thread_view_button_video")) {
                    return "sc_thread_view_menu_button_video";
                }
                return str;
            case -757810778:
                if (str.equals("sc_thread_view_button")) {
                    return "sc_thread_view_menu_button";
                }
                return str;
            case -229185361:
                if (str.equals("multiway_call_thread_view_button")) {
                    return "multiway_call_thread_view_menu_button";
                }
                return str;
            case 911908243:
                if (str.equals("thread_view_button_video")) {
                    return "thread_view_menu_button_video";
                }
                return str;
            case 1145979735:
                if (str.equals("thread_view_button")) {
                    return "thread_view_menu_button";
                }
                return str;
            case 1742671667:
                if (str.equals("multiway_call_thread_view_video_button")) {
                    return "multiway_call_thread_view_menu_video_button";
                }
                return str;
            default:
                return str;
        }
    }
}
