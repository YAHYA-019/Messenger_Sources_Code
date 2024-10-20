package X;

/* renamed from: X.7lo, reason: invalid class name */
/* loaded from: 7lo.class */
public abstract class C7lo {
    public static String A00(C6xd c6xd) {
        String str = "MESSAGES";
        if (c6xd != null) {
            int ordinal = c6xd.ordinal();
            if (ordinal == 2) {
                return "COMMENTS";
            }
            if (ordinal == 3) {
                return "COMPOSER";
            }
            if (ordinal == 4) {
                return "POSTS";
            }
            if (ordinal == 5) {
                return "SMS";
            }
            if (ordinal == 7) {
                str = "NEO";
            }
        }
        return str;
    }
}
