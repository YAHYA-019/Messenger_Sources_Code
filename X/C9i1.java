package X;

/* renamed from: X.9i1, reason: invalid class name */
/* loaded from: 9i1.class */
public final class C9i1 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public C9i1(Integer num, String str, String str2, String str3) {
        11T.A0F(num, 4);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = num;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "UNSET";
            case 1:
                return "SEND_MESSAGE";
            case 2:
                return "PREFILL_COMPOSER_WITH_PROMPT";
            default:
                return "PREFILL_COMPOSER_WITH_META_AI";
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C9i1)) {
                return false;
            }
            C9i1 c9i1 = (C9i1) obj;
            if (!11T.A0O(this.A02, c9i1.A02) || !11T.A0O(this.A03, c9i1.A03) || !11T.A0O(this.A01, c9i1.A01) || this.A00 != c9i1.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A07 = AnonymousClass002.A07(this.A01, AnonymousClass002.A07(this.A03, 4YV.A02(this.A02)));
        Integer num = this.A00;
        return A07 + 7zU.A02(num, A00(num));
    }

    public String toString() {
        return 0Pz.A14("MetaAIPromptSheetPrompt(id=", this.A02, ", text=", this.A03, ", emojiText=", this.A01, JQw.A00(4), A00(this.A00), ')');
    }
}
