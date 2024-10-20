package X;

/* loaded from: Ez9.class */
public final class Ez9 {
    public final ELD A00;
    public final GDv A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public Ez9(ELD eld, GDv gDv, String str, String str2, String str3) {
        this.A02 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = gDv;
        this.A00 = eld;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez9)) {
                return false;
            }
            Ez9 ez9 = (Ez9) obj;
            if (!11T.A0O(this.A02, ez9.A02) || !11T.A0O(this.A04, ez9.A04) || !11T.A0O(this.A03, ez9.A03) || !11T.A0O(this.A01, ez9.A01) || this.A00 != ez9.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A00, AnonymousClass002.A05(this.A01, ((((1BL.A05(this.A02) * 31) + 1BL.A05(this.A04)) * 31) + 7zN.A05(this.A03)) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("WriteWithAIContext(initialContent=");
        A0k.append(this.A02);
        A0k.append(", prompt=");
        A0k.append(this.A04);
        A0k.append(", initialPromptRequestId=");
        A0k.append(this.A03);
        A0k.append(", requestInput=");
        A0k.append(this.A01);
        A0k.append(", suggestedPromptType=");
        return AnonymousClass002.A0K(this.A00, A0k);
    }
}
