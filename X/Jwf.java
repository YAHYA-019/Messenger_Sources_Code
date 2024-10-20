package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: Jwf.class */
public abstract class Jwf extends LJo {
    public Jwf(DisplayMetrics displayMetrics, int i) {
        ((LJo) this).A01 = -16777216;
        ((LJo) this).A00 = TypedValue.applyDimension(2, 20.0f, displayMetrics);
        ((LJo) this).A00 = i == 0 ? 0.0f : TypedValue.applyDimension(2, 22.0f, displayMetrics) + (i * TypedValue.applyDimension(2, 19.0f, displayMetrics));
    }

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        String A0W;
        float f;
        float f2;
        float f3;
        float f4;
        Jwi jwi;
        Spanned spanned;
        float f5;
        float f6;
        float f7;
        float f8;
        if (!(this instanceof Jwe)) {
            Jwi jwi2 = (Jwi) this;
            if (jwi2 instanceof Jwh) {
                Jwh jwh = (Jwh) jwi2;
                11T.A0H(canvas, paint);
                11T.A0F(charSequence, 7);
                if (((Spanned) charSequence).getSpanStart(jwh) != i6) {
                    return;
                }
                jwh.A01(paint);
                A0W = jwh.A01;
                f = i;
                f2 = i2;
                f3 = ((LJo) jwh).A00;
                f4 = jwh.A00;
                jwi = jwh;
            } else {
                if (((Spanned) charSequence).getSpanStart(jwi2) != i6) {
                    return;
                }
                jwi2.A01(paint);
                A0W = jwi2.A01 < 10 ? 0Pz.A0W(" ", Jwi.A00(jwi2)) : Jwi.A00(jwi2);
                f = i;
                f2 = i2;
                f3 = ((LJo) jwi2).A00;
                f4 = jwi2.A00;
                jwi = jwi2;
            }
            canvas.drawText(A0W, f + (f2 * (f3 - f4)), i4, ((LJo) jwi).A02);
            return;
        }
        Jwe jwe = (Jwe) this;
        11T.A0F(canvas, 0);
        4YV.A1M(paint, 1, charSequence);
        if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null && spanned.getSpanStart(jwe) == i6) {
            jwe.A01(paint);
            if (jwe.A00 == null) {
                Paint paint2 = new Paint(paint);
                jwe.A00 = paint2;
                paint2.setColor(((LJo) jwe).A01);
                Paint paint3 = jwe.A00;
                if (paint3 != null) {
                    DKC.A1L(paint3);
                }
            }
            float f9 = jwe.A01;
            float f10 = i + (i2 * (((LJo) jwe).A00 - jwe.A02));
            float f11 = f9;
            if (f9 < f10) {
                f11 = f10;
            }
            int intValue = jwe.A03.intValue();
            if (intValue == 0) {
                canvas.drawCircle(f11, (i3 + i5) / 2.0f, f9, ((LJo) jwe).A02);
                return;
            }
            if (intValue == 1) {
                float f12 = (i3 + i5) / 2.0f;
                f5 = f11 - f9;
                float f13 = f9 / 3.0f;
                f6 = f12 - f13;
                f7 = f11 + f9;
                f8 = f12 + f13;
            } else {
                if (intValue == 2) {
                    Paint paint4 = jwe.A00;
                    if (paint4 != null) {
                        canvas.drawCircle(f11, (i3 + i5) / 2.0f, f9, paint4);
                        return;
                    }
                    return;
                }
                if (intValue != 3) {
                    return;
                }
                float f14 = (i3 + i5) / 2.0f;
                f5 = f11 - f9;
                f6 = f14 - f9;
                f7 = f11 + f9;
                f8 = f14 + f9;
            }
            canvas.drawRect(f5, f6, f7, f8, ((LJo) jwe).A02);
        }
    }
}
