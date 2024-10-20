package X;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: I4z.class */
public final class I4z {
    public float A00;
    public Matrix A01;
    public Rect A02;
    public RectF A03;
    public RectF A04;
    public Drawable A05;
    public Drawable A06;
    public Drawable A07;
    public View A08;
    public boolean A0A;
    public boolean A0B;
    public Integer A09 = 0S2.A00;
    public boolean A0C = false;
    public final Paint A0D = DKC.A09();
    public final Paint A0E = DKC.A09();
    public final Paint A0F = DKC.A09();

    public I4z(View view) {
        this.A08 = view;
        view.setLayerType(1, null);
    }

    public static Rect A00(I4z i4z) {
        RectF rectF = i4z.A03;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        i4z.A01.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0095, code lost:
    
        if (r312 == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0041, code lost:
    
        if (r303 >= (r0.bottom + 20.0f)) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int A01(float r302, float r303) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I4z.A01(float, float):int");
    }

    public Rect A02() {
        RectF rectF = this.A03;
        return new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public void A03(Matrix matrix, Rect rect, RectF rectF, boolean z) {
        this.A01 = new Matrix(matrix);
        this.A03 = rectF;
        this.A04 = new RectF(rect);
        this.A0C = z;
        this.A00 = this.A03.width() / this.A03.height();
        this.A02 = A00(this);
        this.A0D.setARGB(125, 50, 50, 50);
        this.A0E.setARGB(125, 50, 50, 50);
        Paint paint = this.A0F;
        paint.setStrokeWidth(3.0f);
        DKC.A1L(paint);
        paint.setAntiAlias(true);
        this.A09 = 0S2.A00;
        Resources resources = this.A08.getResources();
        this.A07 = resources.getDrawable(2131230784);
        this.A06 = resources.getDrawable(2131230783);
        this.A05 = resources.getDrawable(2132476031);
    }
}
