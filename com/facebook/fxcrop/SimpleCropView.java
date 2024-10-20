package com.facebook.fxcrop;

import X.0S2;
import X.DKC;
import X.Qzk;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: SimpleCropView.class */
public class SimpleCropView extends ImageView implements View.OnTouchListener {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public Bitmap A05;
    public Paint A06;
    public Paint A07;
    public Paint A08;
    public Uri A09;
    public Integer A0A;
    public final RectF A0B;
    public static final float A0E = Qzk.A00(1);
    public static final float A0D = Qzk.A00(3);
    public static final float A0C = Qzk.A00(24);

    public SimpleCropView(Context context) {
        super(context);
        this.A05 = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A0B = DKC.A0D();
        this.A0A = 0S2.A00;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A09 = null;
        this.A02 = 0;
        A00();
    }

    public SimpleCropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A05 = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A0B = DKC.A0D();
        this.A0A = 0S2.A00;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A09 = null;
        this.A02 = 0;
        A00();
    }

    public SimpleCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = null;
        this.A04 = 0;
        this.A03 = 0;
        this.A0B = DKC.A0D();
        this.A0A = 0S2.A00;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A09 = null;
        this.A02 = 0;
        A00();
    }

    private void A00() {
        setOnTouchListener(this);
        Paint A0A = DKC.A0A(1);
        this.A08 = A0A;
        DKC.A1M(A0A);
        this.A08.setColor(-16777216);
        this.A08.setAlpha(127);
        Paint A0A2 = DKC.A0A(1);
        this.A07 = A0A2;
        Paint.Style style = Paint.Style.STROKE;
        A0A2.setStyle(style);
        this.A07.setStrokeCap(Paint.Cap.SQUARE);
        this.A07.setColor(-1);
        this.A07.setAlpha(127);
        this.A07.setStrokeWidth(A0E);
        Paint A0A3 = DKC.A0A(1);
        this.A06 = A0A3;
        A0A3.setStyle(style);
        this.A06.setStrokeCap(Paint.Cap.ROUND);
        this.A06.setColor(-1);
        this.A06.setStrokeWidth(A0D);
    }

    public static void A01(Bitmap bitmap, SimpleCropView simpleCropView) {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0 || simpleCropView.A04 == 0 || simpleCropView.A03 == 0) {
            return;
        }
        simpleCropView.A05 = bitmap;
        simpleCropView.setImageBitmap(bitmap);
        simpleCropView.getLayoutParams().height = (simpleCropView.A04 * bitmap.getHeight()) / bitmap.getWidth();
        simpleCropView.requestLayout();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path A0B = DKC.A0B();
        A0B.setFillType(Path.FillType.WINDING);
        A0B.addRect(0.0f, 0.0f, this.A04, this.A03, Path.Direction.CW);
        RectF rectF = this.A0B;
        A0B.addRect(rectF, Path.Direction.CCW);
        canvas.drawPath(A0B, this.A08);
        float width = rectF.width() * 0.333f;
        float height = rectF.height() * 0.333f;
        float f = rectF.left;
        float f2 = rectF.top;
        int i = 0;
        do {
            f += width;
            f2 += height;
            canvas.drawLine(f, rectF.top, f, rectF.bottom, this.A07);
            canvas.drawLine(rectF.left, f2, rectF.right, f2, this.A07);
            i++;
        } while (i < 2);
        canvas.drawRect(rectF, this.A07);
        float f3 = rectF.left;
        float f4 = rectF.top;
        float f5 = A0C;
        canvas.drawLine(f3, f4, f3, f4 + f5, this.A06);
        float f6 = rectF.left;
        float f7 = rectF.top;
        canvas.drawLine(f6, f7, f6 + f5, f7, this.A06);
        float f8 = rectF.right;
        float f9 = rectF.top;
        canvas.drawLine(f8, f9, f8, f9 + f5, this.A06);
        float f10 = rectF.right;
        float f11 = rectF.top;
        canvas.drawLine(f10, f11, f10 - f5, f11, this.A06);
        float f12 = rectF.left;
        float f13 = rectF.bottom;
        canvas.drawLine(f12, f13, f12, f13 - f5, this.A06);
        float f14 = rectF.left;
        float f15 = rectF.bottom;
        canvas.drawLine(f14, f15, f14 + f5, f15, this.A06);
        float f16 = rectF.right;
        float f17 = rectF.bottom;
        canvas.drawLine(f16, f17, f16, f17 - f5, this.A06);
        float f18 = rectF.right;
        float f19 = rectF.bottom;
        canvas.drawLine(f18, f19, f18 - f5, f19, this.A06);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        this.A04 = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.A03 = size;
        setMeasuredDimension(this.A04, size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x04ff, code lost:
    
        if (r0 <= ((r0 + com.facebook.fxcrop.SimpleCropView.A0C) + 50.0f)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x055d, code lost:
    
        r309 = X.0S2.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x055a, code lost:
    
        if (r0 <= (r0 + 50.0f)) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x05aa, code lost:
    
        if (r0 <= (r0 + 50.0f)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x05fc, code lost:
    
        r309 = X.0S2.A0j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x05f9, code lost:
    
        if (r0 <= (r0 + 50.0f)) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x069b, code lost:
    
        if (r0 <= (r0 + 50.0f)) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0445, code lost:
    
        if (r0 <= ((r0 + com.facebook.fxcrop.SimpleCropView.A0C) + 50.0f)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0498, code lost:
    
        r309 = X.0S2.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0495, code lost:
    
        if (r0 <= (r0 + 50.0f)) goto L99;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r302, android.view.MotionEvent r303) {
        /*
            Method dump skipped, instructions count: 1710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fxcrop.SimpleCropView.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
