package X;

/* renamed from: X.AsD, reason: case insensitive filesystem */
/* loaded from: AsD.class */
public final class C1779AsD extends C04v {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Integer A05;
    public final Long A06;
    public final Long A07;
    public final String A08;
    public final String A09;

    public C1779AsD(Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        this.A06 = l;
        this.A07 = l2;
        this.A00 = j;
        this.A05 = num;
        this.A04 = str;
        this.A03 = str2;
        this.A09 = str3;
        this.A01 = str4;
        this.A08 = str5;
        this.A02 = str6;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C1779AsD)) {
                return false;
            }
            C1779AsD c1779AsD = (C1779AsD) obj;
            if (!11T.A0O(this.A06, c1779AsD.A06) || !11T.A0O(this.A07, c1779AsD.A07) || this.A00 != c1779AsD.A00 || this.A05 != c1779AsD.A05 || !11T.A0O(this.A04, c1779AsD.A04) || !11T.A0O(this.A03, c1779AsD.A03) || !11T.A0O(this.A09, c1779AsD.A09) || !11T.A0O(this.A01, c1779AsD.A01) || !11T.A0O(this.A08, c1779AsD.A08) || !11T.A0O(this.A02, c1779AsD.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int hashCode;
        int A02 = AnonymousClass002.A02(this.A00, ((AnonymousClass001.A02(this.A06) * 31) + AnonymousClass001.A02(this.A07)) * 31);
        Integer num = this.A05;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "CM_DI_PRESET_INVITE";
                    break;
                case 2:
                    str = "CM_DI_SEE_MORE";
                    break;
                default:
                    str = "CM_DI_MAIN";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        return ((AnonymousClass002.A07(this.A01, (AnonymousClass002.A07(this.A03, AnonymousClass002.A07(this.A04, (A02 + hashCode) * 31)) + 1BL.A05(this.A09)) * 31) + 1BL.A05(this.A08)) * 31) + 7zN.A05(this.A02);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GroupThreadDirectInviteModel(communityId=");
        A0k.append(this.A06);
        A0k.append(", threadKeyId=");
        A0k.append(this.A07);
        A0k.append(", resultGroupThreadId=");
        A0k.append(this.A00);
        A0k.append(", surface=");
        Integer num = this.A05;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "CM_DI_PRESET_INVITE";
                    break;
                case 2:
                    str = "CM_DI_SEE_MORE";
                    break;
                default:
                    str = "CM_DI_MAIN";
                    break;
            }
        } else {
            str = "null";
        }
        A0k.append(str);
        A0k.append(", title=");
        A0k.append(this.A04);
        A0k.append(", subtitle=");
        A0k.append(this.A03);
        A0k.append(", secondary_subtitle=");
        A0k.append(this.A09);
        A0k.append(", profile_picture_url=");
        A0k.append(this.A01);
        A0k.append(", fallback_url=");
        A0k.append(this.A08);
        A0k.append(", secondary_profile_picture_url=");
        A0k.append(this.A02);
        return 4YV.A0x(A0k);
    }
}
