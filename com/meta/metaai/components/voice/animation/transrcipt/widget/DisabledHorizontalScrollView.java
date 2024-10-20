package com.meta.metaai.components.voice.animation.transrcipt.widget;

import X.03Y;
import X.0FI;
import X.11T;
import X.1BK;
import X.4YU;
import X.7zN;
import X.DKC;
import X.DKD;
import X.DKG;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: DisabledHorizontalScrollView.class */
public final class DisabledHorizontalScrollView extends HorizontalScrollView {
    public float A00;
    public float A01;
    public 03Y A02;
    public final Paint A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisabledHorizontalScrollView(Context context) {
        this(context, null);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisabledHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        Paint A0A = DKC.A0A(1);
        this.A03 = A0A;
        A0A.setDither(true);
        Integer[] numArr = {4YU.A0k(), 7zN.A0h()};
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = numArr[i].intValue();
            i++;
        } while (i < 2);
        Float[] fArr = {Float.valueOf(0.0f), Float.valueOf(1.0f)};
        float[] fArr2 = new float[2];
        int i2 = 0;
        do {
            fArr2[i2] = fArr[i2].floatValue();
            i2++;
        } while (i2 < 2);
        A0A.setShader(new LinearGradient(0.0f, 0.0f, 100.0f, 0.0f, iArr, fArr2, Shader.TileMode.CLAMP));
        DKD.A19(A0A, PorterDuff.Mode.MULTIPLY);
    }

    public /* synthetic */ DisabledHorizontalScrollView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        Bitmap createBitmap;
        Canvas canvas2;
        11T.A0F(canvas, 0);
        03Y r0 = this.A02;
        if (r0 != null) {
            createBitmap = (Bitmap) r0.first;
            canvas2 = (Canvas) r0.second;
        } else {
            createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
            11T.A0A(createBitmap);
            canvas2 = new Canvas(createBitmap);
            this.A02 = 1BK.A1G(createBitmap, canvas2);
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        View childAt = getChildAt(0);
        canvas2.save();
        canvas2.translate(childAt.getTranslationX(), 0.0f);
        childAt.draw(canvas2);
        canvas2.restore();
        float f = this.A01;
        if (f > 0.0f) {
            canvas2.drawRect(new RectF(0.0f, 0.0f, f, DKC.A03(this)), this.A03);
        }
        if (this.A00 > 0.0f) {
            canvas2.drawRect(new RectF(DKC.A02(this) - this.A00, 0.0f, DKC.A02(this), DKC.A03(this)), this.A03);
        }
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.A02 = null;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        0FI.A0B(1699866799, 0FI.A05(-1294201786));
        return false;
    }
}
