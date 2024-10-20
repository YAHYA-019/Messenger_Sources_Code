package X;

/* loaded from: C9i.class */
public abstract class C9i {
    public static Integer A00(String str) {
        if (str.equals("SOCIAL_CHANNEL")) {
            return 0S2.A00;
        }
        if (str.equals("SOCIAL_CHANNEL_UNJOINED")) {
            return 0S2.A01;
        }
        if (str.equals("BROADCAST_CHANNEL")) {
            return 0S2.A0C;
        }
        if (str.equals("BROADCAST_CHANNEL_UNJOINED")) {
            return 0S2.A0N;
        }
        throw AnonymousClass001.A0L(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SOCIAL_CHANNEL_UNJOINED";
            case 2:
                return "BROADCAST_CHANNEL";
            case 3:
                return "BROADCAST_CHANNEL_UNJOINED";
            default:
                return "SOCIAL_CHANNEL";
        }
    }
}
