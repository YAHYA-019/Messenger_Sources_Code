package X;

/* loaded from: DqF.class */
public final class DqF extends C04v {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DqF(String str, String str2, String str3, int i) {
        this(str, str2, str3, null, i != 0 ? 1 : 0);
        this.A00 = i;
    }

    public DqF(String str, String str2, String str3, String str4, int i) {
        this.A00 = i;
        if (i == 0) {
            11T.A0F(str, 1);
        }
        this.A02 = str;
        this.A01 = str2;
        this.A04 = str3;
        this.A03 = str4;
    }

    public boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else {
            if (this == obj) {
                return true;
            }
            i = 0;
        }
        if (!(obj instanceof DqF)) {
            return false;
        }
        DqF dqF = (DqF) obj;
        return dqF.A00 == i && 11T.A0O(this.A02, dqF.A02) && 11T.A0O(this.A01, dqF.A01) && 11T.A0O(this.A04, dqF.A04) && 11T.A0O(this.A03, dqF.A03);
    }

    public int hashCode() {
        int A07;
        if (this.A00 != 0) {
            A07 = ((1BL.A05(this.A02) * 31) + 1BL.A05(this.A01)) * 31;
        } else {
            A07 = AnonymousClass002.A07(this.A01, 4YV.A02(this.A02));
        }
        return ((A07 + 1BL.A05(this.A04)) * 31) + 7zN.A05(this.A03);
    }

    public String toString() {
        return this.A00 != 0 ? super.toString() : 0Pz.A14("APIParameters(paymentId=", this.A02, 1BJ.A00(241), this.A01, ", ptt=", this.A04, ", paymentType=", this.A03, ')');
    }
}
