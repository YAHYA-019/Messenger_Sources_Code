package X;

/* renamed from: X.5p9, reason: invalid class name */
/* loaded from: 5p9.class */
public abstract class C5p9 {
    public static String A00(String str) {
        int i;
        if (str.startsWith("act_notification_id_reaction_notification_")) {
            return str.substring(42, str.indexOf(95, 42));
        }
        int lastIndexOf = str.lastIndexOf(95);
        if (lastIndexOf == -1 || (i = lastIndexOf + 1) == str.length()) {
            return null;
        }
        return str.substring(i);
    }
}
