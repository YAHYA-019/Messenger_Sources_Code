package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Jjv, reason: case insensitive filesystem */
/* loaded from: Jjv.class */
public final class C3124Jjv extends LSJ {
    public LBU A00;
    public LBU A01;
    public final Paint A02;
    public final Path A03;
    public final Ks8 A04;
    public final float[] A05;
    public final RectF A06;

    public C3124Jjv(JVZ jvz, Ks8 ks8) {
        super(jvz, ks8);
        this.A06 = DKC.A0D();
        Paint paint = new Paint();
        this.A02 = paint;
        this.A05 = new float[8];
        this.A03 = DKC.A0B();
        this.A04 = ks8;
        paint.setAlpha(0);
        DKC.A1M(paint);
        paint.setColor(ks8.A04);
    }

    public void A7g(L34 l34, Object obj) {
        super.A7g(l34, obj);
        if (obj == MLa.A01) {
            if (l34 == null) {
                this.A01 = null;
                return;
            } else {
                this.A01 = new C3103Jja(l34, null);
                return;
            }
        }
        if (obj == MLa.A0a) {
            if (l34 != null) {
                this.A00 = C3103Jja.A00(l34);
            } else {
                this.A00 = null;
                this.A02.setColor(this.A04.A04);
            }
        }
    }

    public void Aa0(Matrix matrix, RectF rectF, boolean z) {
        super.Aa0(matrix, rectF, z);
        RectF rectF2 = this.A06;
        Ks8 ks8 = this.A04;
        rectF2.set(0.0f, 0.0f, ks8.A06, ks8.A05);
        ((LSJ) this).A08.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
