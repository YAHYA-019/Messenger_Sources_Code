package X;

import android.content.Context;

/* loaded from: EoA.class */
public final class EoA {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public EoA(Context context) {
        int A00 = C0A8.A00(context, 3.0f);
        this.A01 = A00;
        int A002 = C0A8.A00(context, 6.0f);
        this.A00 = A002;
        this.A03 = (A002 * 3) + (A00 * 2);
        this.A02 = A002;
    }
}
