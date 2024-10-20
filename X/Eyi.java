package X;

/* loaded from: Eyi.class */
public final class Eyi {
    public final String A00;
    public final String A01;
    public final String A02;

    public Eyi(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyi)) {
                return false;
            }
            Eyi eyi = (Eyi) obj;
            if (!11T.A0O(this.A02, eyi.A02) || !11T.A0O(this.A00, eyi.A00) || !11T.A0O(this.A01, eyi.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((4YV.A02(this.A02) + 1BL.A05(this.A00)) * 31) + 7zN.A05(this.A01);
    }

    public String toString() {
        return 0Pz.A11("GeneratedPromptSummaryData(text=", this.A02, ", requestId=", this.A00, ", responseId=", this.A01);
    }
}
