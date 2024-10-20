package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.92o, reason: invalid class name */
/* loaded from: 92o.class */
public final class C92o extends DN9 {
    public float A00;
    public 6ON A01;
    public boolean A02;
    public final float A03;
    public final Path A04;
    public final RectF A05;

    public C92o(6Jq r302, float f) {
        11T.A0F(r302, 1);
        this.A03 = f;
        this.A02 = true;
        this.A04 = new Path();
        this.A05 = new RectF();
        r302.A02(AVF.A01(this, 1), new 6Ju[]{6Ju.A02});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        6ON r0;
        11T.A0F(canvas, 0);
        if (this.A02 && (r0 = this.A01) != null) {
            int A02 = 7zO.A02(this);
            int i = 600;
            if (600 < A02) {
                i = A02;
            }
            int intrinsicHeight = (r0.getIntrinsicHeight() * i) / r0.getIntrinsicWidth();
            this.A00 = 7zN.A02(this) - (i / 2);
            r0.setBounds(0, 0, i, intrinsicHeight);
            r0.CXT();
        }
        this.A02 = false;
        Path path = this.A04;
        path.rewind();
        RectF rectF = this.A05;
        float f = this.A03;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            float A022 = 7zN.A02(this);
            save = canvas.save();
            canvas.scale(1.5f, 1.5f, A022, 0.0f);
            float f2 = this.A00;
            save = canvas.save();
            canvas.translate(f2, 0.0f);
            try {
                6ON r02 = this.A01;
                if (r02 != null) {
                    r02.draw(canvas);
                }
                canvas.restoreToCount(save);
                canvas.restoreToCount(save);
            } finally {
                canvas.restoreToCount(save);
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super/*android.graphics.drawable.Drawable*/.onBoundsChange(rect);
        this.A02 = true;
        7zT.A14(rect, this.A05);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
