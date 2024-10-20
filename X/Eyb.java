package X;

/* loaded from: Eyb.class */
public final class Eyb {
    public final String A00;
    public final java.util.Map A01;
    public final String A02;

    public Eyb(java.util.Map map, String str, String str2) {
        this.A01 = map;
        this.A02 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyb)) {
                return false;
            }
            Eyb eyb = (Eyb) obj;
            if (!11T.A0O(this.A01, eyb.A01) || !11T.A0O(this.A02, eyb.A02) || !11T.A0O(this.A00, eyb.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((1BL.A03(this.A01) + 1BL.A05(this.A02)) * 31) + 7zN.A05(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("BloksComponentQueryParseResult(components=");
        A0k.append(this.A01);
        A0k.append(", generatedBundleId=");
        A0k.append(this.A02);
        A0k.append(", clientBundleId=");
        return DKH.A0o(this.A00, A0k);
    }
}
