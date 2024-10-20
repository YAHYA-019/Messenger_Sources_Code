package X;

/* renamed from: X.Gju, reason: case insensitive filesystem */
/* loaded from: Gju.class */
public final class C2640Gju extends C04v implements JDB {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C2640Gju(Integer num, String str, String str2, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2640Gju)) {
                return false;
            }
            C2640Gju c2640Gju = (C2640Gju) obj;
            if (!11T.A0O(this.A02, c2640Gju.A02) || !11T.A0O(this.A01, c2640Gju.A01) || this.A03 != c2640Gju.A03 || this.A00 != c2640Gju.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A07 = (AnonymousClass002.A07(this.A01, 4YV.A02(this.A02)) + AnonymousClass002.A00(this.A03 ? 1 : 0)) * 31;
        int intValue = this.A00.intValue();
        switch (intValue) {
            case 1:
                str = "REDIAL";
                break;
            case 2:
                str = "VOICEMAIL";
                break;
            default:
                str = "NONE";
                break;
        }
        return A07 + str.hashCode() + intValue;
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RedialViewState(redialMessage=");
        A0k.append(this.A02);
        A0k.append(", redialButtonText=");
        A0k.append(this.A01);
        A0k.append(", isVideoCall=");
        A0k.append(this.A03);
        A0k.append(", secondButtonType=");
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "REDIAL";
                    break;
                case 2:
                    str = "VOICEMAIL";
                    break;
                default:
                    str = "NONE";
                    break;
            }
        } else {
            str = "null";
        }
        return DKH.A0o(str, A0k);
    }
}
