package X;

/* loaded from: Lft.class */
public final class Lft implements MGV {
    public final KDD A00;
    public final L4o A01;

    public Lft(KDD kdd, L4o l4o) {
        this.A00 = kdd;
        this.A01 = l4o;
    }

    public static Lft A00(KDD kdd) {
        char charAt;
        String str = kdd.typeUrl_;
        int length = str.length();
        byte[] bArr = new byte[length];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return new Lft(kdd, new L4o(bArr, bArr.length));
            }
            charAt = str.charAt(i2);
            if (charAt < '!' || charAt > '~') {
                break;
            }
            bArr[i2] = (byte) charAt;
            i = i2 + 1;
        }
        throw JQx.A10(0Pz.A0J("Not a printable ASCII character: ", charAt));
    }

    @Override // X.MGV
    public L4o Azu() {
        return this.A01;
    }
}
