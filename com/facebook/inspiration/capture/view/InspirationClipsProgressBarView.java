package com.facebook.inspiration.capture.view;

import X.11T;
import X.2Me;
import X.3yG;
import X.AnonymousClass001;
import X.DKC;
import X.DKD;
import X.DKF;
import X.DKG;
import X.DKH;
import X.Rat;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: InspirationClipsProgressBarView.class */
public final class InspirationClipsProgressBarView extends View {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public final int A05;
    public final Paint A06;
    public final RectF A07;
    public final Rat A08;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InspirationClipsProgressBarView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InspirationClipsProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InspirationClipsProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = -1;
        this.A01 = -1;
        this.A06 = DKC.A0A(1);
        this.A08 = new Rat();
        this.A07 = DKC.A0D();
        Resources resources = getResources();
        11T.A0A(resources);
        this.A05 = 3yG.A04(resources, 3.0f);
    }

    public /* synthetic */ InspirationClipsProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public final void A00() {
        Rat rat = this.A08;
        List list = rat.A01;
        synchronized (list) {
            list.clear();
            rat.A00 = 0;
        }
        if (this.A01 >= rat.A01()) {
            this.A01 = -1;
            this.A02 = 0;
            invalidate();
        }
        invalidate();
    }

    public final void A01() {
        Rat rat = this.A08;
        List list = rat.A01;
        synchronized (list) {
            if (!list.isEmpty()) {
                list.remove(AnonymousClass001.A04(list));
                Rat.A00(rat);
            }
        }
        if (this.A01 >= rat.A01()) {
            this.A01 = -1;
            this.A02 = 0;
            invalidate();
        }
        postInvalidate();
    }

    public final void A02(int i) {
        int i2 = (int) this.A00;
        Rat rat = this.A08;
        int min = Math.min(i2 - rat.A00, i);
        List list = rat.A01;
        synchronized (list) {
            DKD.A1S(list, min);
            Rat.A00(rat);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float A01;
        float A012;
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        Paint paint = this.A06;
        paint.setColor(2130706432);
        RectF rectF = this.A07;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRect(rectF, paint);
        Rat rat = this.A08;
        int i = rat.A00;
        if (i > 0 && i <= this.A00) {
            float f = 0.0f / 0.0f;
            paint.setColor(-4646872);
            int i2 = this.A03;
            float f2 = 0.0f / 0.0f;
            if (i2 == -1) {
                i2 = rat.A00;
            }
            float A013 = DKH.A01(this, i2);
            rectF.set(0.0f, 0.0f, A013, getMeasuredHeight());
            canvas.drawRect(rectF, paint);
            float f3 = 0.0f / 0.0f;
            if (i2 != -1) {
                paint.setColor(-5196872);
                A012 = DKH.A01(this, rat.A00);
            } else {
                int i3 = this.A01;
                if (i3 != -1 && i3 < rat.A01() && this.A02 < rat.A02(this.A01)) {
                    paint.setColor(-5196872);
                    int i4 = this.A01;
                    if (i4 == 0) {
                        A01 = 0.0f;
                    } else {
                        int i5 = 0;
                        for (int i6 = 0; i6 < i4; i6++) {
                            i5 += rat.A02(i6);
                        }
                        A01 = DKH.A01(this, i5);
                    }
                    A013 = DKH.A01(this, this.A02) + A01;
                    A012 = A01 + DKH.A01(this, rat.A02(this.A01));
                }
            }
            rectF.set(A013, 0.0f, A012, getMeasuredHeight());
            canvas.drawRect(rectF, paint);
        }
        int i7 = rat.A00;
        if (i7 <= 0 || i7 > this.A00) {
            return;
        }
        int A014 = rat.A01();
        for (int i8 = 0; i8 < A014; i8++) {
            boolean z = i8 == rat.A01() - 1 && this.A04;
            int i9 = 0;
            if (i8 >= 0) {
                int i10 = 0;
                while (true) {
                    i9 += rat.A02(i10);
                    if (i10 == i8) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            float A015 = DKH.A01(this, i9);
            if (!z) {
                paint.setColor(2Me.A02.A01(getContext()));
                float measuredHeight = A015 - getMeasuredHeight();
                float f4 = this.A05;
                rectF.set(measuredHeight + f4, 0.0f, A015 + f4, getMeasuredHeight());
                canvas.drawRoundRect(rectF, getMeasuredHeight() / 2, getMeasuredHeight() / 2, paint);
            }
        }
    }
}
