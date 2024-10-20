package X;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;

/* renamed from: X.2r4, reason: invalid class name */
/* loaded from: 2r4.class */
public final class C2r4 extends ShapeDrawable implements C2r5 {
    public final /* synthetic */ 2qN A00;

    public C2r4(2qN r302, int i) {
        this.A00 = r302;
        Paint paint = getPaint();
        paint.setColor(i);
        paint.setDither(true);
        paint.setFilterBitmap(true);
    }
}
