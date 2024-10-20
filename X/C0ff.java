package X;

/* renamed from: X.0ff, reason: invalid class name */
/* loaded from: 0ff.class */
public abstract class C0ff {
    public static String A00;
    public static final C0fe A01 = new Object();

    public static final String A00() {
        C0fe c0fe = A01;
        if (A00 == null) {
            synchronized (c0fe) {
                String str = A00;
                if (str != null) {
                    return str;
                }
                String l = Long.toString(System.currentTimeMillis());
                11T.A0A(l);
                A00 = 0Pz.A0Y(l, 0zI.A00(), '-');
            }
        }
        String str2 = A00;
        11T.A0D(str2);
        return str2;
    }
}
