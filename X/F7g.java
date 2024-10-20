package X;

/* loaded from: F7g.class */
public final class F7g {
    public static final F7g A02 = new F7g(0S2.A0C, 1.0E21f);
    public final float A00;
    public final Integer A01;

    public F7g(Integer num, float f) {
        this.A00 = f;
        this.A01 = num;
    }

    public String toString() {
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return Float.toString(this.A00);
        }
        if (intValue != 1) {
            return "auto";
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append(this.A00);
        return AnonymousClass001.A0d("%", A0k);
    }
}
