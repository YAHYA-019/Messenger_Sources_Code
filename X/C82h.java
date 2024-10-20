package X;

/* renamed from: X.82h, reason: invalid class name */
/* loaded from: 82h.class */
public final class C82h extends C04v implements 5PP {
    public final int A00 = 0;
    public final Object A01;
    public final String A02;

    public C82h(C5fv c5fv, String str) {
        11T.A0F(str, 2);
        this.A01 = c5fv;
        this.A02 = str;
    }

    public C82h(Integer num, String str) {
        this.A01 = num;
        this.A02 = str;
    }

    public C82h(Integer num, String str, int i) {
        this.A02 = str;
        this.A01 = num;
    }

    public static java.util.Map A00(1Ih r301, C5fv c5fv, C5fv c5fv2, C5fq c5fq, String str) {
        c5fq.A0B = str;
        c5fq.A02(C5m1.A00, new C82h(c5fv2, 7mE.A00(r301, c5fv)));
        return C5bz.A00() ? 9GN.A00 : 9GP.A02;
    }

    public boolean equals(Object obj) {
        C82h c82h;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82h)) {
                    return false;
                }
                c82h = (C82h) obj;
                if (c82h.A00 != 0 || !11T.A0O(this.A01, c82h.A01)) {
                    return false;
                }
                break;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82h)) {
                    return false;
                }
                C82h c82h2 = (C82h) obj;
                return c82h2.A00 == 1 && 11T.A0O(this.A02, c82h2.A02) && this.A01 == c82h2.A01;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C82h)) {
                    return false;
                }
                c82h = (C82h) obj;
                if (c82h.A00 != 2 || this.A01 != c82h.A01) {
                    return false;
                }
                break;
        }
        return 11T.A0O(this.A02, c82h.A02);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int A00;
        switch (this.A00) {
            case 0:
                hashCode = this.A01.hashCode();
                hashCode2 = hashCode * 31;
                A00 = this.A02.hashCode();
                break;
            case 1:
                hashCode2 = this.A02.hashCode() * 31;
                Integer num = (Integer) this.A01;
                if (num != null) {
                    A00 = C3P6.A00(num);
                    break;
                } else {
                    A00 = 0;
                    break;
                }
            default:
                int intValue = ((Number) this.A01).intValue();
                hashCode = (1 != intValue ? "YOUTUBE_VIDEO" : "YOUTUBE_SHORTS").hashCode() + intValue;
                hashCode2 = hashCode * 31;
                A00 = this.A02.hashCode();
                break;
        }
        return hashCode2 + A00;
    }
}
