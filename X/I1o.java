package X;

/* loaded from: I1o.class */
public final class I1o {
    public IDm A00 = null;
    public final I7c A01;

    public I1o(I7c i7c) {
        this.A01 = i7c;
        i7c.A01 = this;
    }

    public static float A00(float[] fArr, int i) {
        float f = 0.0f;
        for (int i2 = 0; i2 < i; i2++) {
            f += fArr[i2];
        }
        return i > 0 ? f / i : 0.0f;
    }

    public void A01() {
        I7c i7c = this.A01;
        if (i7c.A02) {
            I7c.A01(i7c);
            int i = 0;
            do {
                i7c.A05[i] = i7c.A03[i];
                i7c.A06[i] = i7c.A04[i];
                i++;
            } while (i < 2);
            I7c.A00(i7c);
        }
    }
}
