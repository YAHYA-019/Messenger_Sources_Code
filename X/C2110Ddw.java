package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.Ddw, reason: case insensitive filesystem */
/* loaded from: Ddw.class */
public final class C2110Ddw extends 5CC {
    public final /* synthetic */ DgG A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2110Ddw(Drawable drawable, DgG dgG) {
        super(drawable);
        this.A00 = dgG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void draw(Canvas canvas) {
        if (!isVisible()) {
            setVisible(true, false);
        }
        super.draw(canvas);
    }
}
