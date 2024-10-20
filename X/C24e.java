package X;

/* renamed from: X.24e, reason: invalid class name */
/* loaded from: 24e.class */
public final class C24e {
    public static final C24f A00;
    public static final C24f A01;
    public static final C24f A02;
    public static final C24f A03;

    static {
        C24f c24f = new C24f("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=', 76, true);
        A00 = c24f;
        int i = (-1) >>> 1;
        boolean z = c24f._writePadding;
        A01 = new C24f(c24f._paddingReadBehaviour, c24f, "MIME-NO-LINEFEEDS", c24f._paddingChar, i, z);
        A03 = new C24f(c24f._paddingReadBehaviour, c24f, "PEM", '=', 64, true);
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sb.setCharAt(sb.indexOf("+"), '-');
        sb.setCharAt(sb.indexOf("/"), '_');
        A02 = new C24f("MODIFIED-FOR-URL", sb.toString(), (char) 0, i, false);
    }
}
