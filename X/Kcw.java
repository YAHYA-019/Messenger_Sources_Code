package X;

/* loaded from: Kcw.class */
public abstract class Kcw {
    public static final 5xY A00;
    public static final 5xY A01;
    public static final 5xY A02;
    public static final boolean A03;

    static {
        boolean z;
        5xY r301;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        A03 = z;
        if (z) {
            A00 = KDj.A01;
            A02 = KDk.A01;
            r301 = KDl.A01;
        } else {
            r301 = null;
        }
        A01 = r301;
    }
}
