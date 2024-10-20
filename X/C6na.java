package X;

/* renamed from: X.6na, reason: invalid class name */
/* loaded from: 6na.class */
public final class C6na implements 2lU {
    public final long A00;
    public final Integer A01;

    public C6na(Integer num, long j) {
        this.A01 = num;
        this.A00 = j;
    }

    public void A8l(C1ti c1ti, 1Iw r303) {
        C26z c26z;
        11T.A0F(r303, 0);
        11T.A0F(c1ti, 1);
        long j = this.A00;
        C1qo c1qo = r303.A0E;
        11T.A0A(c1qo);
        int A01 = C2lu.A01(c1qo, j);
        switch (this.A01.intValue()) {
            case 7:
                c26z = C26z.VERTICAL;
                break;
            case 8:
                c26z = C26z.ALL;
                break;
            default:
                c1ti.A0C(A01);
                return;
        }
        c1ti.A0S(c26z, A01);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C6na)) {
                return false;
            }
            C6na c6na = (C6na) obj;
            if (this.A01 != c6na.A01 || this.A00 != c6na.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        Integer num = this.A01;
        switch (num.intValue()) {
            case 7:
                str = "TOUCH_EXPANSION_VERTICAL";
                break;
            case 8:
                str = "TOUCH_EXPANSION_ALL";
                break;
            default:
                str = "ELEVATION";
                break;
        }
        return C3o5.A05(num, str) + 1BL.A01(this.A00);
    }

    public String toString() {
        String str;
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DimenStyleItem(field=");
        switch (this.A01.intValue()) {
            case 7:
                str = "TOUCH_EXPANSION_VERTICAL";
                break;
            case 8:
                str = "TOUCH_EXPANSION_ALL";
                break;
            default:
                str = "ELEVATION";
                break;
        }
        A0k.append(str);
        A0k.append(", value=");
        return AnonymousClass002.A0K(C2lu.A03(this.A00), A0k);
    }
}
