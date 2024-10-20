package X;

/* loaded from: L1q.class */
public final class L1q {
    public static final L1q A01 = new L1q("SHA1");
    public static final L1q A02 = new L1q("SHA224");
    public static final L1q A03 = new L1q("SHA256");
    public static final L1q A04 = new L1q("SHA384");
    public static final L1q A05 = new L1q("SHA512");
    public final String A00;

    public L1q(String str) {
        this.A00 = str;
    }

    public String toString() {
        return this.A00;
    }
}
