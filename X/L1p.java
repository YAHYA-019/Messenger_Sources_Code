package X;

/* loaded from: L1p.class */
public final class L1p {
    public static final L1p A01 = new L1p("SHA1");
    public static final L1p A02 = new L1p("SHA224");
    public static final L1p A03 = new L1p("SHA256");
    public static final L1p A04 = new L1p("SHA384");
    public static final L1p A05 = new L1p("SHA512");
    public final String A00;

    public L1p(String str) {
        this.A00 = str;
    }

    public String toString() {
        return this.A00;
    }
}
