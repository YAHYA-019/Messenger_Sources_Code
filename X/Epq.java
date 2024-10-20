package X;

import android.graphics.Color;

/* loaded from: Epq.class */
public final class Epq {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;

    public Epq(int i, float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = f3;
        this.A03 = f4;
        this.A04 = i;
        this.A05 = Color.argb((int) (f3 * Color.alpha(i)), Color.red(i), Color.green(i), Color.blue(i));
    }
}
