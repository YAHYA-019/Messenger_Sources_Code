package X;

/* loaded from: Ktj.class */
public final class Ktj {
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final String A05;
    public final boolean A06;

    public Ktj(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A01 = str;
        this.A05 = str2;
        this.A02 = str3;
        this.A03 = z;
        this.A06 = z2;
        this.A04 = z3;
        this.A00 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ktj)) {
                return false;
            }
            Ktj ktj = (Ktj) obj;
            if (!11T.A0O(this.A01, ktj.A01) || !11T.A0O(this.A05, ktj.A05) || !11T.A0O(this.A02, ktj.A02) || this.A03 != ktj.A03 || this.A06 != ktj.A06 || this.A04 != ktj.A04 || !11T.A0O(this.A00, ktj.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((1BL.A05(this.A01) * 31) + 1BL.A05(this.A05)) * 31) + 1BL.A05(this.A02)) * 31) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A06 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + 7zN.A05(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Email(id=");
        A0k.append(this.A01);
        A0k.append(", userInputEmailAddress=");
        A0k.append(this.A05);
        A0k.append(", normalizedEmailAddress=");
        A0k.append(this.A02);
        A0k.append(", isDefault=");
        A0k.append(this.A03);
        A0k.append(", isOneTime=");
        A0k.append(this.A06);
        A0k.append(", isEditable=");
        A0k.append(this.A04);
        A0k.append(", externalSourceLabel=");
        return DKH.A0o(this.A00, A0k);
    }
}
