package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.69h, reason: invalid class name */
/* loaded from: 69h.class */
public final class C69h extends 5CC implements C69i {
    public Drawable A00;
    public 69X A01;

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        if (isVisible()) {
            69X r0 = this.A01;
            if (r0 != null) {
                r0.onDraw();
            }
            super.draw(canvas);
            Drawable drawable = this.A00;
            if (drawable != null) {
                drawable.setBounds(getBounds());
                this.A00.draw(canvas);
            }
        }
    }

    public int getIntrinsicHeight() {
        return -1;
    }

    public int getIntrinsicWidth() {
        return -1;
    }

    public boolean setVisible(boolean z, boolean z2) {
        69X r0 = this.A01;
        if (r0 != null) {
            r0.CUn(z);
        }
        return super.setVisible(z, z2);
    }
}
