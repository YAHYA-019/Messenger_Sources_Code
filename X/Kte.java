package X;

/* loaded from: Kte.class */
public final class Kte {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public Kte(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = z;
        this.A05 = z2;
        this.A00 = str4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Kte)) {
                return false;
            }
            Kte kte = (Kte) obj;
            if (!11T.A0O(this.A02, kte.A02) || !11T.A0O(this.A03, kte.A03) || !11T.A0O(this.A01, kte.A01) || this.A04 != kte.A04 || this.A05 != kte.A05 || !11T.A0O(this.A00, kte.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1237;
        int A05 = ((((((((1BL.A05(this.A02) * 31) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A01)) * 31) + AnonymousClass002.A00(this.A04 ? 1 : 0)) * 31) + 1237) * 31;
        if (this.A05) {
            i = 1231;
        }
        return ((A05 + i) * 31) + 7zN.A05(this.A00);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PhoneNumber(id=");
        A0k.append(this.A02);
        A0k.append(", normalizedPhoneNumber=");
        A0k.append(this.A03);
        A0k.append(", formattedPhoneNumberWithPlus=");
        A0k.append(this.A01);
        A0k.append(", isDefault=");
        A0k.append(this.A04);
        4YV.A1Q(A0k, ", isOneTime=");
        A0k.append(", isEditable=");
        A0k.append(this.A05);
        A0k.append(", externalSourceLabel=");
        return DKH.A0o(this.A00, A0k);
    }
}
