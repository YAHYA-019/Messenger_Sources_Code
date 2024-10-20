package X;

/* loaded from: Eyk.class */
public final class Eyk {
    public final ELD A00;
    public final String A01;
    public final String A02;

    public Eyk(ELD eld, String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = eld;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Eyk)) {
                return false;
            }
            Eyk eyk = (Eyk) obj;
            if (!11T.A0O(this.A01, eyk.A01) || !11T.A0O(this.A02, eyk.A02) || this.A00 != eyk.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A07(this.A02, 4YV.A02(this.A01)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SuggestedPrompt(text=");
        A0k.append(this.A01);
        A0k.append(", pillType=");
        A0k.append(this.A02);
        DKG.A1Y(A0k, ", promptId=");
        A0k.append(", suggestedPromptType=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
