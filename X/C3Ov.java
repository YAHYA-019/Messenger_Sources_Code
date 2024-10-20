package X;

/* renamed from: X.3Ov, reason: invalid class name */
/* loaded from: 3Ov.class */
public abstract class C3Ov {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "archived";
            case 2:
                return "spam";
            case 3:
                return "other";
            case 4:
                return "inbox";
            case 5:
                return "pageFollowUp";
            default:
                return "read";
        }
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ARCHIVED";
            case 2:
                return "SPAM";
            case 3:
                return "OTHER";
            case 4:
                return "INBOX";
            case 5:
                return "PAGE_FOLLOW_UP";
            default:
                return "READ";
        }
    }
}
