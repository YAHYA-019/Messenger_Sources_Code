package X;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: L5t.class */
public abstract class L5t {
    public static void A00(Matrix matrix, View view) {
        view.setAnimationMatrix(matrix);
    }

    public static void A01(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    public static void A02(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }
}
