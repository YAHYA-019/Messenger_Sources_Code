package com.facebook.primitive.canvas.model;

import X.11T;
import X.1Jj;
import X.1Lc;
import X.GG3;
import android.graphics.Matrix;

/* loaded from: CanvasInverseTransform.class */
public final class CanvasInverseTransform implements GG3 {
    public static final CanvasInverseTransform A00 = new Object();

    @Override // X.GG3
    public void A92(Matrix matrix) {
        11T.A0F(matrix, 0);
        if (matrix.invert(matrix)) {
            return;
        }
        1Jj.A01(1Lc.A03, "com.facebook.primitive.canvas.model.CanvasInverseTransform", "The matrix supplied cannot be inverted", (Throwable) null, 0);
    }
}
