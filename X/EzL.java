package X;

/* loaded from: EzL.class */
public final class EzL {
    public final F9l A00;
    public final ETQ A01;
    public final F9z A02;
    public final F9m A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public EzL(F9l f9l, ETQ etq, F9z f9z, F9m f9m, String str, String str2, String str3) {
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = etq;
        this.A02 = f9z;
        this.A00 = f9l;
        this.A03 = f9m;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EzL)) {
                return false;
            }
            EzL ezL = (EzL) obj;
            if (!11T.A0O(this.A06, ezL.A06) || !11T.A0O(this.A05, ezL.A05) || !11T.A0O(this.A04, ezL.A04) || !11T.A0O(this.A01, ezL.A01) || !11T.A0O(this.A02, ezL.A02) || !11T.A0O(this.A00, ezL.A00) || !11T.A0O(this.A03, ezL.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A03, AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A02, AnonymousClass002.A05(this.A01, ((((1BL.A05(this.A06) * 31) + 1BL.A05(this.A05)) * 31) + 7zN.A05(this.A04)) * 31))));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UIState(prompt=");
        A0k.append(this.A06);
        A0k.append(", initialContent=");
        A0k.append(this.A05);
        A0k.append(", everstoreId=");
        A0k.append(this.A04);
        A0k.append(", suggestionState=");
        A0k.append(this.A01);
        A0k.append(", writeTonesState=");
        A0k.append(this.A02);
        A0k.append(", inputComposerState=");
        A0k.append(this.A00);
        A0k.append(", errorInfo=");
        return AnonymousClass002.A0K(this.A03, A0k);
    }
}
