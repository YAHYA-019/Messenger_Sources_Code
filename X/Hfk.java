package X;

import android.opengl.Matrix;

/* loaded from: Hfk.class */
public final class Hfk {
    public int A00;
    public int A01;
    public final boolean A02;
    public final float[] A03;

    public Hfk(int i, int i2, boolean z) {
        float[] A1a = GOn.A1a();
        this.A03 = A1a;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = z;
        Matrix.setIdentityM(A1a, 0);
    }
}
