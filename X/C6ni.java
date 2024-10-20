package X;

import android.graphics.PathEffect;
import java.util.Arrays;

/* renamed from: X.6ni, reason: invalid class name */
/* loaded from: 6ni.class */
public final class C6ni implements 1Ip {
    public static final C6nj A04 = new Object();
    public PathEffect A00;
    public final float[] A01 = new float[4];
    public final int[] A03 = new int[4];
    public final int[] A02 = new int[4];

    public /* bridge */ /* synthetic */ boolean BSF(Object obj) {
        C6ni c6ni = (C6ni) obj;
        11T.A0F(c6ni, 0);
        return this == c6ni || (Arrays.equals(this.A01, c6ni.A01) && Arrays.equals(this.A03, c6ni.A03) && Arrays.equals(this.A02, c6ni.A02) && this.A00 == c6ni.A00);
    }
}
