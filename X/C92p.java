package X;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.92p, reason: invalid class name */
/* loaded from: 92p.class */
public final class C92p extends DN9 {
    public float A00;
    public float A01;
    public 6ON A02;
    public boolean A03;
    public final float A04;
    public final Path A05;
    public final RectF A06;

    public C92p(6Jq r302, float f) {
        11T.A0F(r302, 1);
        this.A04 = f;
        this.A03 = true;
        this.A05 = new Path();
        this.A06 = new RectF();
        r302.A02(AVF.A01(this, 6), new 6Ju[]{6Ju.A04, 6Ju.A06, 6Ju.A05});
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x010e, code lost:
    
        r310 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0110, code lost:
    
        r302.restoreToCount(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0118, code lost:
    
        throw r310;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r302) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C92p.draw(android.graphics.Canvas):void");
    }

    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBoundsChange(Rect rect) {
        11T.A0F(rect, 0);
        super/*android.graphics.drawable.Drawable*/.onBoundsChange(rect);
        this.A03 = true;
        7zT.A14(rect, this.A06);
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
