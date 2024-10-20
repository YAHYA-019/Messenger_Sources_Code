package X;

/* renamed from: X.3P4, reason: invalid class name */
/* loaded from: 3P4.class */
public abstract class C3P4 {
    public static Integer A00(String str) {
        if (str.equals("UNSET")) {
            return 0S2.A00;
        }
        if (str.equals("CONTACT")) {
            return 0S2.A01;
        }
        if (str.equals("SOFT_CONTACT")) {
            return 0S2.A0C;
        }
        if (str.equals("NON_CONTACT")) {
            return 0S2.A0N;
        }
        throw AnonymousClass001.A0L(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CONTACT";
            case 2:
                return "SOFT_CONTACT";
            case 3:
                return "NON_CONTACT";
            default:
                return "UNSET";
        }
    }
}
