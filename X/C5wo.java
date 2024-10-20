package X;

/* renamed from: X.5wo, reason: invalid class name */
/* loaded from: 5wo.class */
public final class C5wo extends C04v implements 5PP {
    public final Integer A00;
    public final String A01;
    public final String A02 = "";

    public C5wo(Integer num, String str) {
        this.A01 = str;
        this.A00 = num;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5wo)) {
                return false;
            }
            C5wo c5wo = (C5wo) obj;
            if (!11T.A0O(this.A01, c5wo.A01) || !11T.A0O(this.A02, c5wo.A02) || this.A00 != c5wo.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int hashCode;
        int A05 = ((1BL.A05(this.A01) * 31) + 1BL.A05(this.A02)) * 31;
        Integer num = this.A00;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "MESSAGE_REPLY";
                    break;
                case 2:
                    str = "SEE_WHY";
                    break;
                default:
                    str = "MEDIA_EXPIRATION_LEARN_MORE";
                    break;
            }
            hashCode = str.hashCode() + intValue;
        }
        return (A05 + hashCode) * 31;
    }

    public String toString() {
        String str;
        String str2 = this.A01;
        String str3 = this.A02;
        Integer num = this.A00;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "MESSAGE_REPLY";
                    break;
                case 2:
                    str = "SEE_WHY";
                    break;
                default:
                    str = "MEDIA_EXPIRATION_LEARN_MORE";
                    break;
            }
        } else {
            str = "null";
        }
        return 0Pz.A14("MustacheMetadata(text=", str2, ", uri=", str3, ", actionType=", str, ", source=", (String) null, ')');
    }
}
