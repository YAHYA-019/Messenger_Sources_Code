package com.facebook.messaging.montage.composer.crop;

import X.0S2;
import X.11T;
import X.1BK;
import X.7zL;
import X.DKC;
import X.DKF;
import X.DKG;
import X.GOo;
import X.HSZ;
import X.HeE;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.messaging.montage.composer.CanvasOverlayCropViewFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CanvasOverlayCropOverlayView.class */
public final class CanvasOverlayCropOverlayView extends View {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public HSZ A09;
    public Integer A0A;
    public Integer A0B;
    public final float A0C;
    public final float A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final Paint A0G;
    public final Rect A0H;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CanvasOverlayCropOverlayView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CanvasOverlayCropOverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CanvasOverlayCropOverlayView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        Paint A0A = DKC.A0A(5);
        this.A0E = A0A;
        Paint A0A2 = DKC.A0A(5);
        this.A0F = A0A2;
        Paint A0A3 = DKC.A0A(5);
        this.A0G = A0A3;
        Integer num = 0S2.A00;
        this.A0A = num;
        this.A0B = num;
        this.A0H = new Rect(0, 0, 0, 0);
        setFocusable(true);
        Resources resources = getResources();
        this.A0D = GOo.A00(resources);
        this.A0C = 7zL.A01(resources, 2132279310);
        A0A.setColor(-16777216);
        A0A.setAlpha(200);
        A0A2.setColor(-1);
        A0A2.setStrokeWidth(7zL.A01(resources, 2132279309));
        A0A2.setAlpha(100);
        DKC.A1L(A0A2);
        A0A3.setColor(-1);
        A0A3.setStrokeWidth(7zL.A01(resources, 2132279309));
    }

    public /* synthetic */ CanvasOverlayCropOverlayView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    private final void A00(float f) {
        if (this.A00 == 0.0f || !A02(f - this.A0H.top)) {
            Rect rect = this.A0H;
            float f2 = rect.top;
            float f3 = f - f2;
            float f4 = this.A0D;
            if (f3 < f4) {
                f = f2 + f4;
            }
            rect.bottom = (int) f;
        }
    }

    private final void A01(float f) {
        if (this.A00 == 0.0f || !A02(this.A0H.bottom - f)) {
            Rect rect = this.A0H;
            float f2 = rect.bottom;
            float f3 = f2 - f;
            float f4 = this.A0D;
            if (f3 < f4) {
                f = f2 - f4;
            }
            rect.top = (int) f;
        }
    }

    private final boolean A02(float f) {
        Integer num = this.A0B;
        Integer num2 = 0S2.A01;
        float f2 = this.A00;
        float f3 = num == num2 ? f / f2 : f * f2;
        Rect rect = this.A0H;
        float f4 = (rect.left + rect.right) / 2.0f;
        float f5 = f3 / 2.0f;
        int i = (int) (f4 - f5);
        int i2 = (int) (f4 + f5);
        if (f3 < this.A0D || f3 > this.A05 || i < this.A06 || i2 > this.A07) {
            return true;
        }
        rect.left = i;
        rect.right = i2;
        return false;
    }

    private final boolean A03(float f) {
        Integer num = this.A0B;
        Integer num2 = 0S2.A01;
        float f2 = this.A00;
        float f3 = num == num2 ? f * f2 : f / f2;
        Rect rect = this.A0H;
        float f4 = (rect.top + rect.bottom) / 2.0f;
        float f5 = f3 / 2.0f;
        int i = (int) (f4 - f5);
        int i2 = (int) (f4 + f5);
        if (f3 < this.A0D || f3 > this.A04 || i < this.A08 || i2 > this.A03) {
            return true;
        }
        rect.top = i;
        rect.bottom = i2;
        return false;
    }

    public final void A04(HeE heE) {
        float f;
        Rect rect;
        11T.A0F(heE, 0);
        Integer num = heE.A02;
        Integer num2 = 0S2.A00;
        if (num == num2) {
            this.A00 = 0.0f;
            rect = this.A0H;
            rect.set(this.A06, this.A08, this.A07, this.A03);
        } else {
            int intValue = num.intValue();
            if (intValue == 0) {
                f = -1.0f;
            } else if (intValue == 1) {
                f = 1.0f;
            } else if (intValue == 2) {
                f = 0.6666667f;
            } else if (intValue == 3) {
                f = 0.75f;
            } else {
                if (intValue != 4) {
                    throw 1BK.A1F();
                }
                f = 0.5625f;
            }
            this.A00 = f;
            Integer num3 = this.A0B;
            float f2 = this.A05;
            float f3 = f2 / (num3 == num2 ? heE.A01 : heE.A00);
            float f4 = this.A04;
            float f5 = f4 / (num3 == num2 ? heE.A00 : heE.A01);
            if (f3 > f5) {
                f3 = f5;
            }
            float f6 = (num3 == num2 ? heE.A01 : heE.A00) * f3;
            float f7 = (num3 == num2 ? heE.A00 : heE.A01) * f3;
            rect = this.A0H;
            int i = (int) (this.A06 + ((f2 - f6) * 0.5f));
            rect.left = i;
            int i2 = (int) (this.A08 + ((f4 - f7) * 0.5f));
            rect.top = i2;
            rect.right = (int) (i + f6);
            rect.bottom = (int) (i2 + f7);
        }
        HSZ hsz = this.A09;
        if (hsz != null) {
            CanvasOverlayCropViewFragment.A05(rect, hsz.A00);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        Rect rect = this.A0H;
        if (rect.isEmpty()) {
            return;
        }
        float f = this.A06;
        float f2 = this.A08;
        float f3 = this.A07;
        float f4 = rect.top;
        Paint paint = this.A0E;
        canvas.drawRect(f, f2, f3, f4, paint);
        canvas.drawRect(this.A06, rect.bottom, this.A07, this.A03, paint);
        canvas.drawRect(this.A06, rect.top, rect.left, rect.bottom, paint);
        canvas.drawRect(rect.right, rect.top, this.A07, rect.bottom, paint);
        canvas.drawRect(rect, this.A0F);
        float f5 = rect.left;
        float f6 = rect.top;
        float f7 = this.A0C;
        float f8 = f6 + f7;
        Paint paint2 = this.A0G;
        canvas.drawLine(f5, f6, f5, f8, paint2);
        float f9 = rect.left;
        float f10 = rect.top;
        canvas.drawLine(f9, f10, f9 + f7, f10, paint2);
        float f11 = rect.right;
        float f12 = rect.top;
        canvas.drawLine(f11, f12, f11, f12 + f7, paint2);
        float f13 = rect.right;
        float f14 = rect.top;
        canvas.drawLine(f13, f14, f13 - f7, f14, paint2);
        float f15 = rect.left;
        float f16 = rect.bottom;
        canvas.drawLine(f15, f16, f15, f16 - f7, paint2);
        float f17 = rect.left;
        float f18 = rect.bottom;
        canvas.drawLine(f17, f18, f17 + f7, f18, paint2);
        float f19 = rect.right;
        float f20 = rect.bottom;
        canvas.drawLine(f19, f20, f19, f20 - f7, paint2);
        float f21 = rect.right;
        float f22 = rect.bottom;
        canvas.drawLine(f21, f22, f21 - f7, f22, paint2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:75:0x03e3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x031d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r302) {
        /*
            Method dump skipped, instructions count: 1564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.composer.crop.CanvasOverlayCropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
