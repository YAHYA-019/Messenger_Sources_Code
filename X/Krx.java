package X;

import android.graphics.Matrix;
import kotlin.jvm.functions.Function2;

/* loaded from: Krx.class */
public final class Krx {
    public Matrix A02;
    public Matrix A03;
    public float[] A05;
    public float[] A06;
    public final Function2 A07;
    public boolean A00 = true;
    public boolean A01 = true;
    public boolean A04 = true;

    public Krx(Function2 function2) {
        this.A07 = function2;
    }

    public final float[] A00(Object obj) {
        float[] fArr = this.A05;
        if (fArr == null) {
            fArr = LBd.A04();
            this.A05 = fArr;
        }
        if (this.A01) {
            this.A04 = KUp.A00(A01(obj), fArr);
            this.A01 = false;
        }
        if (this.A04) {
            return fArr;
        }
        return null;
    }

    public final float[] A01(Object obj) {
        float[] fArr = this.A06;
        if (fArr == null) {
            fArr = LBd.A04();
            this.A06 = fArr;
        }
        if (this.A00) {
            Matrix matrix = this.A02;
            if (matrix == null) {
                matrix = GOn.A0F();
                this.A02 = matrix;
            }
            this.A07.invoke(obj, matrix);
            Matrix matrix2 = this.A03;
            if (matrix2 == null || !matrix.equals(matrix2)) {
                KUW.A00(matrix, fArr);
                this.A02 = matrix2;
                this.A03 = matrix;
            }
            this.A00 = false;
        }
        return fArr;
    }
}
