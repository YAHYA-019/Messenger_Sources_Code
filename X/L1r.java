package X;

/* loaded from: L1r.class */
public final class L1r {
    public final String A00;
    public static final L1r A03 = new L1r("ASSUME_AES_GCM");
    public static final L1r A06 = new L1r("ASSUME_XCHACHA20POLY1305");
    public static final L1r A05 = new L1r("ASSUME_CHACHA20POLY1305");
    public static final L1r A01 = new L1r("ASSUME_AES_CTR_HMAC");
    public static final L1r A02 = new L1r("ASSUME_AES_EAX");
    public static final L1r A04 = new L1r("ASSUME_AES_GCM_SIV");

    public L1r(String str) {
        this.A00 = str;
    }

    public String toString() {
        return this.A00;
    }
}
