package X;

/* renamed from: X.7ss, reason: invalid class name */
/* loaded from: 7ss.class */
public final class C7ss {
    public static long A00(String str) {
        String str2;
        int lastIndexOf;
        long j = -1;
        if (str != null) {
            String[] split = str.split("-");
            if (split.length == 3 && (lastIndexOf = (str2 = split[2]).lastIndexOf(46)) >= 0) {
                try {
                    return Integer.parseInt(str2.substring(0, lastIndexOf));
                } catch (NumberFormatException unused) {
                    0fH.A0B(C7ss.class, "Invalid fileName does not contain duration.");
                    return j;
                }
            }
            0fH.A0B(C7ss.class, "Invalid fileName does not contain duration.");
        }
        return j;
    }
}
