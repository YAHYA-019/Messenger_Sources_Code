package X;

/* loaded from: Eyy.class */
public final class Eyy {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public Eyy(Integer num, String str, String str2, String str3) {
        this.A00 = num;
        this.A03 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyy)) {
                return false;
            }
            Eyy eyy = (Eyy) obj;
            if (this.A00 != eyy.A00 || !11T.A0O(this.A03, eyy.A03) || !11T.A0O(this.A01, eyy.A01) || !11T.A0O(this.A02, eyy.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int intValue = this.A00.intValue();
        return ((AnonymousClass002.A07(this.A03, 7zM.A04(intValue != 0 ? "CREATED" : "GENERATED", intValue) * 31) + 1BL.A05(this.A01)) * 31) + 7zN.A05(this.A02);
    }

    public String toString() {
        return 0Pz.A14("PromptSummaryData(summaryType=", this.A00.intValue() != 0 ? "CREATED" : "GENERATED", ", summaryText=", this.A03, ", requestId=", this.A01, ", responseId=", this.A02, ')');
    }
}
