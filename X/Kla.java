package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;

/* loaded from: Kla.class */
public final class Kla {
    public Paint A00;
    public Rect A01;
    public KfL A02;
    public boolean A03;
    public boolean A04;
    public final ValueAnimator.AnimatorUpdateListener A05 = new LF7(this, 10);

    public Kla(Context context, AttributeSet attributeSet, KfL kfL) {
        this.A00 = DKC.A09();
        this.A01 = DKC.A0C();
        kfL.getClass();
        this.A02 = kfL;
        this.A00 = DKC.A0A(5);
        this.A01 = DKC.A0C();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2f);
        try {
            this.A04 = obtainStyledAttributes.getBoolean(1, false);
            this.A03 = obtainStyledAttributes.getBoolean(0, false);
            int color = obtainStyledAttributes.getColor(2, -16777216);
            if (this.A00.getColor() != color) {
                this.A00.setColor(color);
                this.A02.A00.invalidate();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
