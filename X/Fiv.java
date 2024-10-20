package X;

import android.content.Context;

/* loaded from: Fiv.class */
public final class Fiv implements C2kb {
    public int A00;
    public final float A01;
    public final int A02;

    public Fiv(int i, float f, int i2) {
        this.A00 = i;
        this.A01 = f;
        this.A02 = i2;
    }

    @Override // X.C2kb
    public C2X6 AK6(Context context, int i, boolean z, boolean z2) {
        return new E0z(context, this.A01, i, this.A00, this.A02, z);
    }
}
