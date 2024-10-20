package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.Jju, reason: case insensitive filesystem */
/* loaded from: Jju.class */
public final class C3123Jju extends LSJ {
    public LBU A00;
    public LBU A01;
    public final Paint A02;
    public final Rect A03;
    public final Rect A04;
    public final KlL A05;

    public C3123Jju(JVZ jvz, Ks8 ks8) {
        super(jvz, ks8);
        this.A02 = new Paint(3);
        this.A04 = DKC.A0C();
        this.A03 = DKC.A0C();
        String str = ks8.A0K;
        L4k l4k = jvz.A0D;
        this.A05 = l4k == null ? null : (KlL) l4k.A01().get(str);
    }

    public void A7g(L34 l34, Object obj) {
        super.A7g(l34, obj);
        C3103Jja c3103Jja = null;
        if (obj == MLa.A01) {
            if (l34 == null) {
                this.A00 = null;
                return;
            } else {
                this.A00 = new C3103Jja(l34, null);
                return;
            }
        }
        if (obj == MLa.A00) {
            if (l34 != null) {
                c3103Jja = C3103Jja.A00(l34);
            }
            this.A01 = c3103Jja;
        }
    }

    public void Aa0(Matrix matrix, RectF rectF, boolean z) {
        super.Aa0(matrix, rectF, z);
        if (this.A05 != null) {
            float f = DKD.A08().density;
            rectF.set(0.0f, 0.0f, r0.A02 * f, r0.A01 * f);
            ((LSJ) this).A08.mapRect(rectF);
        }
    }
}
