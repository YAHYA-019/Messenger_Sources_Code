package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.66g, reason: invalid class name */
/* loaded from: 66g.class */
public final class C66g extends Drawable {
    public static final C66h A09 = C66h.A03(40.0d, 7.0d);
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final Paint A06;
    public final Paint A07;
    public final C66i A08;

    public C66g(Context context, C62j c62j) {
        C66h c66h = A09;
        this.A04 = true;
        this.A03 = true;
        this.A00 = 0;
        this.A02 = -1;
        this.A05 = context;
        C66i c66i = new C66i(c62j);
        c66i.A0A(new C66m() { // from class: X.66l
            @Override // X.C66m, X.C66n
            public void CMV(C66i c66i2) {
                C66g.this.invalidateSelf();
            }
        });
        c66i.A06(0.0d);
        c66i.A06 = true;
        c66i.A09(c66h);
        this.A08 = c66i;
        this.A06 = new Paint(1);
        this.A07 = new Paint(1);
        this.A01 = this.A05.getResources().getDimensionPixelSize(2132279309);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.A00;
        if (i != 0) {
            Paint paint = this.A06;
            paint.setColor(i);
            canvas.drawRect(bounds.left, r0 - this.A01, bounds.right, bounds.bottom, paint);
        }
        C66j c66j = this.A08.A09;
        if (((float) c66j.A00) > 0.0f) {
            Paint paint2 = this.A07;
            paint2.setColor(this.A02);
            float f = bounds.left;
            canvas.drawRect(f, bounds.bottom - this.A01, f + (bounds.width() * ((float) c66j.A00)), bounds.bottom, paint2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0039, code lost:
    
        if (r0 < ((float) r301.A08.A09.A00)) goto L6;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onLevelChange(int r302) {
        /*
            r301 = this;
            r0 = r302
            float r0 = (float) r0
            r303 = r0
            r0 = 1176256512(0x461c4000, float:10000.0)
            r304 = r0
            r0 = r303
            r1 = r304
            float r0 = r0 / r1
            r303 = r0
            r0 = r301
            boolean r0 = r0.A04
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = 1
            r307 = r0
            r0 = r305
            if (r0 == 0) goto L3c
            r0 = r301
            X.66i r0 = r0.A08
            X.66j r0 = r0.A09
            r308 = r0
            r0 = r308
            double r0 = r0.A00
            r309 = r0
            r0 = r309
            float r0 = (float) r0
            r304 = r0
            r0 = r303
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r305 = r0
            r0 = 1
            r311 = r0
            r0 = r305
            if (r0 >= 0) goto L3f
        L3c:
            r0 = 0
            r311 = r0
        L3f:
            r0 = r301
            boolean r0 = r0.A03
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L6b
            r0 = r301
            X.66i r0 = r0.A08
            X.66j r0 = r0.A09
            r308 = r0
            r0 = r308
            double r0 = r0.A00
            r309 = r0
            r0 = r309
            float r0 = (float) r0
            r304 = r0
            r0 = r303
            r1 = r304
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r305 = r0
            r0 = r305
            if (r0 >= 0) goto L6b
            r0 = 1
            r306 = r0
        L6b:
            r0 = r311
            if (r0 != 0) goto L8e
            r0 = r306
            if (r0 != 0) goto L8e
            r0 = r301
            X.66i r0 = r0.A08
            r312 = r0
            r0 = r303
            double r0 = (double) r0
            r313 = r0
            r0 = r312
            r1 = r313
            r0.A06(r1)
            r0 = r312
            r0.A02()
            r0 = r307
            return r0
        L8e:
            r0 = r301
            X.66i r0 = r0.A08
            r312 = r0
            r0 = r303
            double r0 = (double) r0
            r313 = r0
            r0 = r312
            r1 = r313
            r0.A07(r1)
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66g.onLevelChange(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
