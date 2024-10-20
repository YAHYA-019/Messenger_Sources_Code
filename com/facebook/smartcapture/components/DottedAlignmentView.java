package com.facebook.smartcapture.components;

import X.0FI;
import X.11T;
import X.DKC;
import X.Kw8;
import X.LF7;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.mapbox.mapboxsdk.R;

/* loaded from: DottedAlignmentView.class */
public final class DottedAlignmentView extends View {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public Bitmap A06;
    public float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final Paint A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DottedAlignmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        Paint A0A = DKC.A0A(1);
        this.A0B = A0A;
        A0A.setColor(Kw8.A00(context, 2130971527));
        Resources resources = getResources();
        float dimension = resources.getDimension(2132279305);
        this.A09 = dimension;
        this.A0A = dimension / 2.0f;
        this.A08 = resources.getDimension(R.dimen.mapbox_four_dp);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        int i = (int) this.A07;
        int i2 = this.A04;
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= i2) {
                return;
            }
            Paint paint = this.A0B;
            int i5 = this.A02;
            if (i5 <= i4) {
                i5 += this.A04;
            }
            int i6 = i5 - i4;
            paint.setAlpha(i6 >= this.A04 / 2 ? 127 : 255 - ((int) (i6 * this.A00)));
            Bitmap bitmap = this.A06;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, i, paint);
                i += bitmap.getHeight();
            }
            i3 = i4 + 1;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = 0FI.A06(715410182);
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.A09;
        float f2 = this.A08;
        float f3 = f + (2.0f * f2);
        int i5 = (int) f3;
        int i6 = i / i5;
        this.A03 = i6;
        int i7 = i2 / i5;
        this.A04 = i7;
        float f4 = i7;
        this.A00 = 127.5f / (f4 / 2.0f);
        this.A01 = (i - (i6 * f3)) / 2.0f;
        this.A07 = (i2 - (f4 * f3)) / 2.0f;
        Bitmap createBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
        11T.A0A(createBitmap);
        Canvas canvas = new Canvas(createBitmap);
        this.A06 = createBitmap;
        float f5 = this.A01 + f2;
        float f6 = this.A0A;
        float f7 = f5 + f6;
        float f8 = f2 + f6;
        Paint A0A = DKC.A0A(1);
        float f9 = 0.0f / 0.0f;
        A0A.setColor(-1);
        int i8 = this.A03;
        for (int i9 = 0; i9 < i8; i9++) {
            canvas.drawCircle(f7, f8, f6, A0A);
            f7 += f3;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setRepeatMode(1);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setDuration(700L);
        valueAnimator.setValues(PropertyValuesHolder.ofInt("animation_property", 0, this.A04 + 1));
        LF7.A00(valueAnimator, this, 14);
        this.A05 = valueAnimator;
        0FI.A0C(-2002386928, A06);
    }
}
