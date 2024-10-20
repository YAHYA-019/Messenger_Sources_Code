package X;

/* renamed from: X.4E8, reason: invalid class name */
/* loaded from: 4E8.class */
public final class C4E8 {
    public 1BY A00;
    public final C00i A02 = new 1BV((1BY) null, 33002);
    public final C00i A01 = new 1BV((1BY) null, 17037);

    public C4E8(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static String A00(String str) {
        Object obj;
        if (str.startsWith("www.")) {
            String substring = str.substring(4);
            switch (substring.hashCode()) {
                case -364826023:
                    obj = "facebook.com";
                    break;
                case 3294905:
                    obj = "m.me";
                    break;
                case 97166346:
                    obj = "fb.me";
                    break;
                case 1404265510:
                    obj = "messenger.com";
                    break;
            }
            if (substring.equals(obj)) {
                return substring;
            }
        }
        return str;
    }
}
