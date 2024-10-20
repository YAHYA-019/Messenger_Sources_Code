package com.facebook.video.scrubber.lite;

import X.HsT;
import X.I5I;
import X.I9r;
import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.List;

/* loaded from: STextureRender.class */
public final class STextureRender {
    public HsT A00;
    public List A01;
    public final int A02;
    public final int A03;
    public final I5I A04 = new I5I();
    public final float[] A05;
    public final float[] A06;
    public final float[] A07;

    public STextureRender(RectF rectF, List list, int i, int i2) {
        float[] fArr = new float[16];
        this.A06 = fArr;
        float[] fArr2 = new float[16];
        this.A05 = fArr2;
        float[] fArr3 = new float[16];
        this.A07 = fArr3;
        this.A01 = list;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.A03 = i;
        this.A02 = i2;
        Matrix.translateM(fArr3, 0, 0.5f, 0.5f, 0.0f);
        Matrix.scaleM(fArr3, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr3, 0, -0.5f, -0.5f, 0.0f);
        I9r.A00(rectF, fArr2);
        Matrix.scaleM(fArr, 0, 1.0f, 1.0f, 1.0f);
    }
}
