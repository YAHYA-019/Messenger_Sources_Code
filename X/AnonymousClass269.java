package X;

/* renamed from: X.269, reason: invalid class name */
/* loaded from: 269.class */
public final class AnonymousClass269 extends AnonymousClass266 {
    public static final AnonymousClass269 A00;
    public static final String A01;
    public static final long serialVersionUID = 1;
    public final int charsPerLevel;
    public final String eol;
    public final char[] indents;

    static {
        String str;
        try {
            str = System.getProperty("line.separator");
        } catch (Throwable unused) {
            str = "\n";
        }
        A01 = str;
        A00 = new AnonymousClass269(str);
    }

    public AnonymousClass269() {
        this(A01);
    }

    public AnonymousClass269(String str) {
        int length = "  ".length();
        this.charsPerLevel = length;
        this.indents = new char[length * 16];
        int i = 0;
        int i2 = 0;
        do {
            "  ".getChars(0, length, this.indents, i2);
            i2 += length;
            i++;
        } while (i < 16);
        this.eol = str;
    }
}
