package com.google.android.material.timepicker;

import X.6Ld;
import X.AnonymousClass001;
import X.DKC;
import X.MDL;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.Iterator;
import java.util.List;

/* loaded from: ClockHandView.class */
public class ClockHandView extends View {
    public double A00;
    public float A01;
    public int A02;
    public boolean A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08;
    public final List A09;

    public ClockHandView(Context context) {
        this(context, null);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130971085);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = AnonymousClass001.A0s();
        Paint A09 = DKC.A09();
        this.A07 = A09;
        this.A08 = DKC.A0D();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, 6Ld.A06, i, 2132608633);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.A05 = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        this.A06 = getResources().getDimensionPixelSize(2132279309);
        this.A04 = DKC.A04(r0);
        int color = obtainStyledAttributes.getColor(0, 0);
        A09.setAntiAlias(true);
        A09.setColor(color);
        A00(this, 0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        setImportantForAccessibility(2);
        obtainStyledAttributes.recycle();
    }

    public static void A00(ClockHandView clockHandView, float f) {
        float f2 = f % 360.0f;
        clockHandView.A01 = f2;
        clockHandView.A00 = Math.toRadians(f2 - 90.0f);
        int height = clockHandView.getHeight() / 2;
        float width = clockHandView.getWidth() / 2;
        float f3 = clockHandView.A02;
        double d = clockHandView.A00;
        float cos = width + (((float) Math.cos(d)) * f3);
        float sin = height + (f3 * ((float) Math.sin(d)));
        RectF rectF = clockHandView.A08;
        float f4 = clockHandView.A05;
        rectF.set(cos - f4, sin - f4, cos + f4, sin + f4);
        Iterator it = clockHandView.A09.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((MDL) it.next());
            if (DKC.A01(clockFaceView.A00, f2) > 0.001f) {
                clockFaceView.A00 = f2;
                ClockFaceView.A00(clockFaceView);
            }
        }
        clockHandView.invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        float width = getWidth() / 2;
        float f = this.A02;
        double d = this.A00;
        float cos = (f * ((float) Math.cos(d))) + width;
        float f2 = height;
        float sin = (f * ((float) Math.sin(d))) + f2;
        Paint paint = this.A07;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.A05, paint);
        double d2 = this.A00;
        double sin2 = Math.sin(d2);
        double cos2 = Math.cos(d2);
        paint.setStrokeWidth(this.A06);
        canvas.drawLine(width, f2, r0 + ((int) (cos2 * r0)), height + ((int) (r0 * sin2)), paint);
        canvas.drawCircle(width, f2, this.A04, paint);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A00(this, this.A01);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ab, code lost:
    
        if (r0 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        if (r0 == false) goto L22;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockHandView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
