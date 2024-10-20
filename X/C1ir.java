package X;

/* renamed from: X.1ir, reason: invalid class name */
/* loaded from: 1ir.class */
public abstract class C1ir {
    public static final String[] A01 = new String[0];
    public static final String A00 = System.getProperty("scenario", null);

    public static String[] A00(String str) {
        return (str == null || str.isEmpty()) ? A01 : str.split(",,,");
    }
}
