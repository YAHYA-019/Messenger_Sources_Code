package X;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: GzS.class */
public abstract class GzS extends IDm {
    public boolean A00;
    public final Matrix A01;
    public final float[] A02;
    public final float[] A03;
    public final float[] A04;
    public final Matrix A05;

    public GzS(I1o i1o) {
        super(i1o);
        this.A03 = new float[9];
        this.A04 = new float[9];
        this.A02 = new float[9];
        this.A05 = GOn.A0F();
        this.A01 = GOn.A0F();
    }

    private void A09() {
        GzR gzR = (GzR) this;
        if (((GzS) gzR).A00) {
            ValueAnimator valueAnimator = gzR.A00;
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.removeAllListeners();
        }
    }

    public void A04() {
        A09();
        this.A01.reset();
        this.A05.reset();
        super.A04();
    }

    public void A05(I1o i1o) {
        A09();
        super.A05(i1o);
    }

    public void A06(I1o i1o) {
        if (this.A00) {
            return;
        }
        super.A06(i1o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (super.A07() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A07() {
        /*
            r301 = this;
            r0 = r301
            boolean r0 = r0.A00
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L14
            r0 = r301
            boolean r0 = super.A07()
            r303 = r0
            r0 = 1
            r302 = r0
            r0 = r303
            if (r0 != 0) goto L16
        L14:
            r0 = 0
            r302 = r0
        L16:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GzS.A07():boolean");
    }

    public void A0A(PointF pointF, PointF pointF2, float f, long j) {
        Matrix matrix = this.A05;
        float[] fArr = ((IDm) this).A09;
        fArr[0] = pointF.x;
        fArr[1] = pointF.y;
        float f2 = fArr[0];
        RectF rectF = ((IDm) this).A06;
        fArr[0] = (f2 * rectF.width()) + rectF.left;
        float height = (fArr[1] * rectF.height()) + rectF.top;
        fArr[1] = height;
        float f3 = pointF2.x;
        float f4 = fArr[0];
        float f5 = f3 - f4;
        float f6 = pointF2.y - height;
        matrix.setScale(f, f, f4, height);
        float f7 = fArr[0];
        float f8 = fArr[1];
        matrix.getValues(fArr);
        float f9 = fArr[0];
        float min = Math.min(Math.max(1.0f, f9), ((IDm) this).A00);
        if (min != f9) {
            float f10 = min / f9;
            matrix.postScale(f10, f10, f7, f8);
        }
        matrix.postTranslate(f5, f6);
        IDm.A02(matrix, this);
        if (j <= 0) {
            A09();
            this.A01.set(matrix);
            ((IDm) this).A04.set(matrix);
            IDm.A01(this);
            ((IDm) this).A01.A01();
            return;
        }
        GzR gzR = (GzR) this;
        gzR.A09();
        C0By.A04(!((GzS) gzR).A00);
        ((GzS) gzR).A00 = true;
        ValueAnimator valueAnimator = gzR.A00;
        valueAnimator.setDuration(j);
        ((IDm) gzR).A04.getValues(gzR.A03);
        matrix.getValues(gzR.A04);
        IG6.A00(valueAnimator, gzR, 13);
        GSD.A00(valueAnimator, gzR, 17);
        0K6.A00(valueAnimator);
    }
}
