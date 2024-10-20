package X;

/* loaded from: Kc9.class */
public abstract class Kc9 {
    public static final String A00;
    public static final String A01;

    static {
        String replaceAll = String.valueOf(12451).replaceAll("(\\d+)(\\d)(\\d\\d)", "$1.$2.$3");
        A00 = replaceAll;
        String valueOf = String.valueOf(replaceAll);
        A01 = valueOf.length() != 0 ? "ma".concat(valueOf) : new String("ma");
    }
}
