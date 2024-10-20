package com.facebook.scaledtextureview;

import X.0FI;
import X.0S2;
import X.1BQ;
import X.4YU;
import X.C00i;
import X.DKC;
import X.GOn;
import X.GOq;
import X.H9i;
import X.HcE;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.TextureView;

/* loaded from: ScaledTextureView.class */
public class ScaledTextureView extends TextureView {
    public double A00;
    public double A01;
    public double A02;
    public float A03;
    public float A04;
    public Integer A05;
    public int A06;
    public C00i A07;
    public H9i A08;

    public ScaledTextureView(Context context) {
        this(context, null);
    }

    public ScaledTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, H9i.CROP_FIT);
    }

    public ScaledTextureView(Context context, AttributeSet attributeSet, H9i h9i) {
        this(context, attributeSet, h9i, 0.12d);
    }

    public ScaledTextureView(Context context, AttributeSet attributeSet, H9i h9i, double d) {
        super(context, attributeSet);
        this.A07 = 1BQ.A02(115942);
        this.A05 = 0S2.A0N;
        this.A08 = h9i;
        this.A00 = d;
    }

    private float A00() {
        float f = 0.0f;
        if (this.A03 != 0.0f) {
            HcE hcE = (HcE) 4YU.A0p(this.A07);
            Point point = new Point();
            hcE.A01.getDefaultDisplay().getSize(point);
            if (point.x > point.y) {
                return 1.0f / this.A03;
            }
            f = this.A03;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        if (r306 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.Integer A01(float r302, float r303) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.scaledtextureview.ScaledTextureView.A01(float, float):java.lang.Integer");
    }

    public static void A02(ScaledTextureView scaledTextureView) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float A00 = scaledTextureView.A00();
        float f6 = 0.0f;
        if (A00 != 0.0f) {
            Matrix matrix = null;
            float A02 = DKC.A02(scaledTextureView);
            float A03 = DKC.A03(scaledTextureView);
            float f7 = A03 / A02;
            Integer A01 = scaledTextureView.A01(A00, f7);
            if (A01 == 0S2.A00) {
                if (f7 > A00) {
                    f5 = A00 * A02;
                    f4 = A02;
                } else {
                    f4 = A03 / A00;
                    f5 = A03;
                }
                matrix = GOn.A0F();
                matrix.setScale(f4 / A02, f5 / A03);
                matrix.postTranslate((A02 - f4) / 2.0f, (A03 - f5) / 2.0f);
            } else if (A01 == 0S2.A01) {
                if (f7 > A00) {
                    f3 = A03 / A00;
                    f2 = A03;
                } else {
                    f2 = A00 * A02;
                    f3 = A02;
                }
                matrix = GOn.A0F();
                matrix.setScale(f3 / A02, f2 / A03, (int) (A02 / 2.0f), (int) (A03 / 2.0f));
            } else if (A01 == 0S2.A0C) {
                matrix = GOn.A0F();
                if (A02 / A03 > A00) {
                    float f8 = A00 * A03;
                    matrix.setRectToRect(new RectF(0.0f, 0.0f, f8, A03), new RectF(0.0f, 0.0f, A02, A03), Matrix.ScaleToFit.CENTER);
                    f6 = (f8 - A02) / 2.0f;
                    f = 0.0f;
                } else {
                    float f9 = A02 / A00;
                    f = (f9 - A03) / 2.0f;
                    matrix.setRectToRect(new RectF(0.0f, 0.0f, A02, f9), new RectF(0.0f, 0.0f, A02, A03), Matrix.ScaleToFit.CENTER);
                }
                matrix.postTranslate(f6, f);
            }
            scaledTextureView.A06 = GOq.A0A(scaledTextureView);
            scaledTextureView.setTransform(matrix);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != this.A06) {
            A02(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r302, int r303) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.scaledtextureview.ScaledTextureView.onMeasure(int, int):void");
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(-1535265084);
        super.onSizeChanged(i, i2, i3, i4);
        A02(this);
        0FI.A0C(-1798504451, A06);
    }
}
