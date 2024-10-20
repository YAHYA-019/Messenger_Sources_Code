package X;

/* loaded from: Fyj.class */
public final class Fyj implements GDs {
    public final C9ca A00;
    public final EMA A01;
    public final FA6 A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public /* synthetic */ Fyj(C9ca c9ca, EMA ema, FA6 fa6, Integer num, String str, String str2, String str3, String str4, String str5, int i) {
        String str6 = null;
        num = (i & 16) != 0 ? null : num;
        str4 = (i & 64) != 0 ? null : str4;
        str5 = (i & 128) != 0 ? null : str5;
        c9ca = (i & 256) != 0 ? null : c9ca;
        fa6 = (i & 512) != 0 ? null : fa6;
        str6 = (i & 1024) != 0 ? 7zR.A0s() : str6;
        11T.A0F(ema, 4);
        11T.A0F(str6, 11);
        this.A07 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A01 = ema;
        this.A03 = num;
        this.A08 = str4;
        this.A09 = str5;
        this.A00 = c9ca;
        this.A02 = fa6;
        this.A05 = str6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Fyj)) {
                return false;
            }
            Fyj fyj = (Fyj) obj;
            if (!11T.A0O(this.A07, fyj.A07) || !11T.A0O(this.A04, fyj.A04) || !11T.A0O(this.A06, fyj.A06) || this.A01 != fyj.A01 || this.A03 != fyj.A03 || !11T.A0O(this.A08, fyj.A08) || !11T.A0O(this.A09, fyj.A09) || !11T.A0O(this.A00, fyj.A00) || !11T.A0O(this.A02, fyj.A02) || !11T.A0O(this.A05, fyj.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A05 = AnonymousClass002.A05(this.A01, AnonymousClass002.A07(this.A06, AnonymousClass002.A07(this.A04, 4YV.A02(this.A07))));
        Integer num = this.A03;
        return 7zM.A05(this.A05, (((((((((((A05 + (num == null ? 0 : 7zU.A02(num, EZ4.A00(num)))) * 31) + AnonymousClass001.A02(null)) * 31) + 1BL.A05(this.A08)) * 31) + 1BL.A05(this.A09)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 4YU.A03(this.A02)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ImagineSuggestion(prompt=");
        A0k.append(this.A07);
        A0k.append(", displayPrompt=");
        A0k.append(this.A04);
        A0k.append(", imageUri=");
        A0k.append(this.A06);
        A0k.append(", intent=");
        A0k.append(this.A01);
        A0k.append(", mediaType=");
        Integer num = this.A03;
        A0k.append(num != null ? EZ4.A00(num) : "null");
        A0k.append(", isMediaPersonalized=");
        A0k.append((Object) null);
        A0k.append(", requestId=");
        A0k.append(this.A08);
        A0k.append(", responseId=");
        A0k.append(this.A09);
        A0k.append(", creatorAttribution=");
        A0k.append(this.A00);
        A0k.append(", suggestionsPromptMetadata=");
        A0k.append(this.A02);
        A0k.append(", id=");
        return DKH.A0o(this.A05, A0k);
    }
}
