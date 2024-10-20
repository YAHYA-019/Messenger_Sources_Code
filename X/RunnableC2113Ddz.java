package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* renamed from: X.Ddz, reason: case insensitive filesystem */
/* loaded from: Ddz.class */
public final class RunnableC2113Ddz extends 5CC implements Runnable {
    public static final String __redex_internal_original_name = "AutoRotateDrawable";
    public float A00;
    public int A01;
    public boolean A02;
    public boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC2113Ddz(Drawable drawable, int i) {
        super(drawable);
        drawable.getClass();
        this.A00 = 0.0f;
        this.A03 = false;
        this.A01 = i;
        this.A02 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.A00;
        if (!this.A02) {
            f = 360.0f - f;
        }
        canvas.rotate(f, r0 + (i / 2), r0 + (i2 / 2));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (this.A03) {
            return;
        }
        this.A03 = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        this.A03 = false;
        this.A00 += (int) ((20.0f / this.A01) * 360.0f);
        invalidateSelf();
    }
}
