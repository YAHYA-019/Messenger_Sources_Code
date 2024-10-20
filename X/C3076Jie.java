package X;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: X.Jie, reason: case insensitive filesystem */
/* loaded from: Jie.class */
public final class C3076Jie extends C3077Jif {
    public float A00(View view) {
        return view.getTransitionAlpha();
    }

    public void A01(Matrix matrix, View view) {
        view.setAnimationMatrix(matrix);
    }

    public void A02(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    public void A03(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }

    public void A04(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // X.C3077Jif
    public void A05(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public void A06(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
