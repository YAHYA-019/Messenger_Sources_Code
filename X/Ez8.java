package X;

/* loaded from: Ez8.class */
public final class Ez8 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public Ez8(Integer num, String str, String str2, String str3, String str4) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Ez8)) {
                return false;
            }
            Ez8 ez8 = (Ez8) obj;
            if (!11T.A0O(this.A02, ez8.A02) || !11T.A0O(this.A01, ez8.A01) || !11T.A0O(this.A03, ez8.A03) || !11T.A0O(this.A04, ez8.A04) || this.A00 != ez8.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A07 = (((AnonymousClass002.A07(this.A01, 4YV.A02(this.A02)) + 1BL.A05(this.A03)) * 31) + 1BL.A05(this.A04)) * 31;
        int intValue = this.A00.intValue();
        return A07 + 7zM.A04(intValue != 0 ? "SQUARE" : "PORTRAIT", intValue);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("FeedbackMedia(mediaUrl=");
        A0k.append(this.A02);
        A0k.append(", mediaId=");
        A0k.append(this.A01);
        A0k.append(", requestId=");
        A0k.append(this.A03);
        A0k.append(", responseId=");
        A0k.append(this.A04);
        A0k.append(GOm.A00(97));
        return DKH.A0o(this.A00.intValue() != 0 ? "SQUARE" : "PORTRAIT", A0k);
    }
}
