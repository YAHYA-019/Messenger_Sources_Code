package X;

/* renamed from: X.0db, reason: invalid class name */
/* loaded from: 0db.class */
public abstract class C0db {
    public static String A00(String str) {
        if (str != null && str.length() != 0) {
            char charAt = str.charAt(0);
            char c = charAt;
            if (charAt >= 'a' && charAt <= 'z') {
                c = (char) (charAt - ' ');
            }
            if (charAt != c) {
                char[] charArray = str.toCharArray();
                charArray[0] = c;
                return new String(charArray);
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0199 A[LOOP:0: B:42:0x0192->B:44:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b1 A[EDGE_INSN: B:45:0x01b1->B:46:0x01b1 BREAK  A[LOOP:0: B:42:0x0192->B:44:0x0199], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c5 A[LOOP:1: B:47:0x01be->B:49:0x01c5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A01(boolean r301, int r302) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0db.A01(boolean, int):java.lang.String");
    }
}
