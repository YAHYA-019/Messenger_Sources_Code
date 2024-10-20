package X;

/* renamed from: X.5wn, reason: invalid class name */
/* loaded from: 5wn.class */
public final class C5wn extends C04v implements 5PP {
    public final Boolean A00;
    public final Integer A01;
    public final Long A02;
    public final String A03;
    public final String A04;

    public C5wn(Boolean bool, Integer num, Long l, String str, String str2) {
        11T.A0F(str, 1);
        11T.A0F(str2, 2);
        this.A04 = str;
        this.A03 = str2;
        this.A00 = bool;
        this.A01 = num;
        this.A02 = l;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5wn)) {
                return false;
            }
            C5wn c5wn = (C5wn) obj;
            if (!11T.A0O(this.A04, c5wn.A04) || !11T.A0O(this.A03, c5wn.A03) || !11T.A0O(this.A00, c5wn.A00) || this.A01 != c5wn.A01 || !11T.A0O(this.A02, c5wn.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int A07 = (AnonymousClass002.A07(this.A03, 4YV.A02(this.A04)) + AnonymousClass001.A02(this.A00)) * 31;
        Integer num = this.A01;
        if (num == null) {
            hashCode = 0;
        } else {
            int intValue = num.intValue();
            hashCode = (1 != intValue ? "STYLE_1" : "STYLE_2").hashCode() + intValue;
        }
        return ((A07 + hashCode) * 31) + 4YU.A03(this.A02);
    }
}
