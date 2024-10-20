package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;

/* renamed from: X.92q, reason: invalid class name */
/* loaded from: 92q.class */
public final class C92q extends DN9 {
    public float A00;
    public int A01;
    public 6ON A02;
    public 6ON A03;
    public 6ON A04;
    public boolean A05;
    public final int A06;
    public final float A07;

    public C92q(Context context, 6Jq r303, float f) {
        11T.A0F(r303, 1);
        this.A07 = f;
        this.A05 = true;
        this.A06 = C0A8.A00(context, 125.0f);
        r303.A02(AVF.A01(this, 3), new 6Ju[]{6Ju.A06, 6Ju.A05});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        6ON r0;
        11T.A0F(canvas, 0);
        if (this.A05) {
            6ON r304 = this.A04;
            if (r304 != null && (r0 = this.A03) != null) {
                if (7zO.A02(this) >= this.A06) {
                    r304 = r0;
                }
                if (!r304.equals(this.A02)) {
                    6ON r02 = this.A02;
                    if (r02 != null) {
                        r02.stop();
                    }
                    this.A02 = r304;
                }
                int A02 = 7zO.A02(this);
                this.A01 = (r304.getIntrinsicHeight() * A02) / r304.getIntrinsicWidth();
                this.A00 = 7zN.A02(this) - (A02 / 2);
                r304.setBounds(0, 0, A02, this.A01);
                r304.CXT();
            }
        }
        this.A05 = false;
        float f = this.A07;
        float f2 = (-f) * 0.88f;
        float f3 = (f * 2.0f) / this.A01;
        float f4 = 1.0f / f3;
        int A01 = 7zT.A01(canvas, this, f3);
        try {
            float f5 = this.A00;
            float f6 = f2 * f4;
            int save = canvas.save();
            canvas.translate(f5, f6);
            try {
                6ON r03 = this.A02;
                if (r03 != null) {
                    r03.draw(canvas);
                }
            } finally {
                canvas.restoreToCount(save);
            }
        } finally {
            canvas.restoreToCount(A01);
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super/*android.graphics.drawable.Drawable*/.onBoundsChange(rect);
        this.A05 = true;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
