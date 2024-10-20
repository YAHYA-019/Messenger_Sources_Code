package X;

/* renamed from: X.5wl, reason: invalid class name */
/* loaded from: 5wl.class */
public final class C5wl extends C04v implements 5PP {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final Long A06;
    public final Long A07;
    public final String A08;
    public final String A09;

    public C5wl(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Long l, Long l2, String str, String str2) {
        this.A07 = l;
        this.A00 = bool;
        this.A03 = num;
        this.A04 = num2;
        this.A06 = l2;
        this.A08 = str;
        this.A09 = str2;
        this.A02 = num3;
        this.A05 = num4;
        this.A01 = num5;
    }

    public boolean equals(Object obj) {
        return obj instanceof C5wl;
    }

    public int hashCode() {
        Long l = this.A07;
        int i = 0;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Boolean bool = this.A00;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A04;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.A06;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.A08;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A09;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode8 = (hashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A05;
        int hashCode9 = (hashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A01;
        if (num5 != null) {
            i = num5.hashCode();
        }
        return hashCode9 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("MediaLoggerMetadata(consistentThreadFbId=");
        A0k.append(this.A07);
        A0k.append(", isCutoverThread=");
        A0k.append(this.A00);
        A0k.append(", resolutionCode=");
        A0k.append(this.A03);
        A0k.append(", sendStatus=");
        A0k.append(this.A04);
        A0k.append(", attachmentPk=");
        A0k.append(this.A06);
        A0k.append(", previewContentToken=");
        A0k.append(this.A08);
        A0k.append(", contentToken=");
        A0k.append(this.A09);
        A0k.append(", offsetFromBottom=");
        A0k.append(this.A02);
        A0k.append(AbstractC00603o4.A00(327));
        A0k.append(this.A05);
        A0k.append(", attachmentType=");
        return AnonymousClass002.A0K(this.A01, A0k);
    }
}
