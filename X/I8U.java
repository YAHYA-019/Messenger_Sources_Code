package X;

import android.graphics.Bitmap;
import android.util.SparseIntArray;

/* loaded from: I8U.class */
public final class I8U {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 3553;
    public int A04;
    public Bitmap A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final SparseIntArray A0A;

    public I8U(String str) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.A0A = sparseIntArray;
        sparseIntArray.put(10241, 9729);
        sparseIntArray.put(10240, 9729);
        sparseIntArray.put(10242, 33071);
        sparseIntArray.put(10243, 33071);
        this.A01 = -1;
        this.A09 = false;
        this.A07 = false;
        this.A06 = str;
    }

    public static HsT A00(String str) {
        I8U i8u = new I8U(str);
        i8u.A03 = 36197;
        return new HsT(i8u);
    }

    public static void A01(I8U i8u) {
        i8u.A02(10241, 9729);
        i8u.A02(10240, 9729);
        i8u.A02(10242, 33071);
        i8u.A02(10243, 33071);
    }

    public void A02(int i, int i2) {
        this.A0A.put(i, i2);
    }
}
