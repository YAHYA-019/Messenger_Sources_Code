package X;

/* renamed from: X.3wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3wp.class */
public final class C02963wp implements 2lU {
    public final long A00;
    public final Integer A01;

    public C02963wp(Integer num, long j) {
        this.A01 = num;
        this.A00 = j;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "WIDTH";
            case 1:
                return "HEIGHT";
            case 2:
                return "MIN_WIDTH";
            case 3:
                return "MAX_WIDTH";
            case 4:
                return "MIN_HEIGHT";
            case 5:
                return "MAX_HEIGHT";
            case 6:
                return "PADDING_START";
            case 7:
                return "PADDING_TOP";
            case 8:
                return "PADDING_END";
            case 9:
                return "PADDING_BOTTOM";
            case 10:
                return "PADDING_LEFT";
            case 11:
                return "PADDING_RIGHT";
            case 12:
                return "PADDING_HORIZONTAL";
            case 13:
                return "PADDING_VERTICAL";
            case 14:
                return "PADDING_ALL";
            case 15:
                return "MARGIN_START";
            case 16:
                return "MARGIN_TOP";
            case 17:
                return "MARGIN_END";
            case 18:
                return "MARGIN_BOTTOM";
            case 19:
                return "MARGIN_LEFT";
            case 20:
                return "MARGIN_RIGHT";
            case 21:
                return "MARGIN_HORIZONTAL";
            case 22:
                return "MARGIN_VERTICAL";
            default:
                return "MARGIN_ALL";
        }
    }

    public void A8l(C1ti c1ti, 1Iw r303) {
        C26z c26z;
        C26z c26z2;
        11T.A0F(r303, 0);
        11T.A0F(c1ti, 1);
        long j = this.A00;
        C1qo c1qo = r303.A0E;
        11T.A0A(c1qo);
        int A01 = C2lu.A01(c1qo, j);
        switch (this.A01.intValue()) {
            case 0:
                c1ti.A0I(A01);
                return;
            case 1:
                c1ti.A0D(A01);
                return;
            case 2:
                c1ti.A0H(A01);
                return;
            case 3:
                c1ti.A0F(A01);
                return;
            case 4:
                c1ti.A0G(A01);
                return;
            case 5:
                c1ti.A0E(A01);
                return;
            case 6:
                c26z = C26z.START;
                break;
            case 7:
                c26z = C26z.TOP;
                break;
            case 8:
                c26z = C26z.END;
                break;
            case 9:
                c26z = C26z.BOTTOM;
                break;
            case 10:
                c26z = C26z.LEFT;
                break;
            case 11:
                c26z = C26z.RIGHT;
                break;
            case 12:
                c26z = C26z.HORIZONTAL;
                break;
            case 13:
                c26z = C26z.VERTICAL;
                break;
            case 14:
                c26z = C26z.ALL;
                break;
            case 15:
                c26z2 = C26z.START;
                c1ti.A0Q(c26z2, A01);
                return;
            case 16:
                c26z2 = C26z.TOP;
                c1ti.A0Q(c26z2, A01);
                return;
            case 17:
                c26z2 = C26z.END;
                c1ti.A0Q(c26z2, A01);
                return;
            case 18:
                c26z2 = C26z.BOTTOM;
                c1ti.A0Q(c26z2, A01);
                return;
            case 19:
                c26z2 = C26z.LEFT;
                c1ti.A0Q(c26z2, A01);
                return;
            case 20:
                c26z2 = C26z.RIGHT;
                c1ti.A0Q(c26z2, A01);
                return;
            case 21:
                c26z2 = C26z.HORIZONTAL;
                c1ti.A0Q(c26z2, A01);
                return;
            case 22:
                c26z2 = C26z.VERTICAL;
                c1ti.A0Q(c26z2, A01);
                return;
            default:
                c26z2 = C26z.ALL;
                c1ti.A0Q(c26z2, A01);
                return;
        }
        c1ti.CWc(c26z, A01);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C02963wp)) {
                return false;
            }
            C02963wp c02963wp = (C02963wp) obj;
            if (this.A01 != c02963wp.A01 || this.A00 != c02963wp.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        int A05 = C3o5.A05(num, A00(num));
        long j = this.A00;
        return A05 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CoreDimenStyleItem(field=");
        A0k.append(A00(this.A01));
        A0k.append(", value=");
        return AnonymousClass002.A0K(C2lu.A03(this.A00), A0k);
    }
}
