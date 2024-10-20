package X;

/* renamed from: X.82m, reason: invalid class name */
/* loaded from: 82m.class */
public final class C82m implements 2lU {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C82m(Integer num, float f, int i) {
        this.A01 = i;
        this.A02 = num;
        this.A00 = f;
    }

    public static 2lO A00(2lO r301, int i) {
        return new 2lO(r301, new C82m(0S2.A00, 100.0f, i));
    }

    public static 2lO A01(2lO r301, 2lU r302, int i) {
        return new 2lO(new 2lO(r301, r302), new C82m(0S2.A01, 100.0f, i));
    }

    public static 2lO A02(2lO r301, 2lU r302, Integer num, float f, int i) {
        return new 2lO(new 2lO(r301, r302), new C82m(num, f, i));
    }

    public static 2lO A03(2lO r301, 2lU r302, Integer num, int i) {
        return new 2lO(new 2lO(r301, r302), new C82m(num, 100.0f, i));
    }

    public static 2lO A04(2lO r301, Integer num, float f, int i) {
        return new 2lO(r301, new C82m(num, f, i));
    }

    public static 2lO A05(2lO r301, Integer num, Integer num2, float f, int i) {
        return new 2lO(new 2lO(r301, new C82m(num, f, i)), new C82m(num2, f, i));
    }

    public static 2lO A06(Integer num, float f, int i) {
        return new 2lO((2lO) null, new C82m(num, f, i));
    }

    public static C82m A07(int i) {
        return new C82m(0S2.A00, 100.0f, i);
    }

    public static C82m A08(Integer num, float f, int i) {
        return new C82m(num, f, i);
    }

    public static C82m A09(Integer num, int i) {
        return new C82m(num, 100.0f, i);
    }

    public static String A0A(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "ROTATION";
            case 2:
                return JQw.A00(59);
            case 3:
                return "ROTATION_Y";
            case 4:
                return "SCALE";
            default:
                return "ALPHA";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x00ef. Please report as an issue. */
    public void A8l(C1ti c1ti, 1Iw r303) {
        C26z c26z;
        C26z c26z2;
        29K A02;
        long j;
        long j2;
        if (this.A01 != 0) {
            11T.A0F(c1ti, 1);
            int intValue = ((Number) this.A02).intValue();
            if (intValue == 0) {
                c1ti.A09(this.A00);
                return;
            }
            if (intValue == 1) {
                c1ti.A0A(this.A00);
                return;
            }
            if (intValue == 2) {
                float f = this.A00;
                c1ti.A0A = true;
                A02 = C1ti.A02(c1ti);
                A02.A02 = f;
                j = A02.A0F;
                j2 = 33554432;
            } else if (intValue != 3) {
                if (intValue == 4) {
                    c1ti.A0B(this.A00);
                    return;
                }
                return;
            } else {
                float f2 = this.A00;
                c1ti.A0A = true;
                A02 = C1ti.A02(c1ti);
                A02.A03 = f2;
                j = A02.A0F;
                j2 = 67108864;
            }
            A02.A0F = j | j2;
            return;
        }
        11T.A0F(c1ti, 1);
        switch (((Number) this.A02).intValue()) {
            case 0:
                c1ti.A08(this.A00);
                return;
            case 1:
                c1ti.A03(this.A00);
                return;
            case 2:
                c1ti.A07(this.A00);
                return;
            case 3:
                c1ti.A05(this.A00);
                return;
            case 4:
                c1ti.A06(this.A00);
                return;
            case 5:
                c1ti.A04(this.A00);
                return;
            case 6:
                c26z = C26z.ALL;
                c1ti.A0O(c26z, this.A00);
                return;
            case 7:
                c26z = C26z.START;
                c1ti.A0O(c26z, this.A00);
                return;
            case 8:
                c26z = C26z.TOP;
                c1ti.A0O(c26z, this.A00);
                return;
            case 9:
                c26z = C26z.END;
                c1ti.A0O(c26z, this.A00);
                return;
            case 10:
                c26z = C26z.BOTTOM;
                c1ti.A0O(c26z, this.A00);
                return;
            case 11:
                c26z = C26z.LEFT;
                c1ti.A0O(c26z, this.A00);
                return;
            case 12:
                c26z = C26z.RIGHT;
                c1ti.A0O(c26z, this.A00);
                return;
            case 13:
                c26z = C26z.HORIZONTAL;
                c1ti.A0O(c26z, this.A00);
                return;
            case 14:
                c26z = C26z.VERTICAL;
                c1ti.A0O(c26z, this.A00);
                return;
            case 15:
                c26z2 = C26z.ALL;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 16:
                c26z2 = C26z.START;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 17:
                c26z2 = C26z.TOP;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 18:
                c26z2 = C26z.END;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 19:
                c26z2 = C26z.BOTTOM;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 20:
                c26z2 = C26z.LEFT;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 21:
                c26z2 = C26z.RIGHT;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 22:
                c26z2 = C26z.HORIZONTAL;
                c1ti.A0P(c26z2, this.A00);
                return;
            case 23:
                c26z2 = C26z.VERTICAL;
                c1ti.A0P(c26z2, this.A00);
                return;
            default:
                return;
        }
    }

    public boolean equals(Object obj) {
        if (1 - this.A01 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82m)) {
            return false;
        }
        C82m c82m = (C82m) obj;
        return c82m.A01 == 1 && this.A02 == c82m.A02 && Float.compare(this.A00, c82m.A00) == 0;
    }

    public int hashCode() {
        if (1 - this.A01 != 0) {
            return super.hashCode();
        }
        Integer num = (Integer) this.A02;
        return ((A0A(num).hashCode() + num.intValue()) * 31) + Float.floatToIntBits(this.A00);
    }

    public String toString() {
        if (1 - this.A01 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("FloatStyleItem(field=");
        Integer num = (Integer) this.A02;
        sb.append(num != null ? A0A(num) : "null");
        sb.append(", value=");
        sb.append(this.A00);
        return 4YV.A0x(sb);
    }
}
