package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: Dqx.class */
public final class Dqx extends C04v implements AYX {
    public final int A00;
    public final Dq6 A01;
    public final GDB A02;
    public final GDC A03;

    public Dqx(Dq6 dq6, GDB gdb, GDC gdc, int i) {
        this.A03 = gdc;
        this.A02 = gdb;
        this.A00 = i;
        this.A01 = dq6;
    }

    public void AOI(Canvas canvas, F9I f9i) {
        11T.A0F(f9i, 1);
        Paint paint = f9i.A00;
        if (paint == null) {
            paint = DKC.A0A(7);
            DKC.A1M(paint);
            f9i.A00 = paint;
        }
        Dq6 dq6 = this.A01;
        Dqx dqx = f9i.A03;
        if (!11T.A0O(dq6, dqx != null ? dqx.A01 : null)) {
            if (dq6 != null) {
                paint.setShadowLayer(dq6.A02, dq6.A00, dq6.A01, dq6.A04);
            } else {
                paint.clearShadowLayer();
            }
        }
        int i = this.A00;
        Dqx dqx2 = f9i.A03;
        if (dqx2 == null || i != dqx2.A00) {
            L6f.A01(i, paint);
        }
        GDB gdb = this.A02;
        Dqx dqx3 = f9i.A03;
        if (!11T.A0O(gdb, dqx3 != null ? dqx3.A02 : null)) {
            if (gdb instanceof Dr7) {
                if (paint.getShader() != null) {
                    paint.setShader(null);
                }
                int color = paint.getColor();
                int i2 = ((Dr7) gdb).A00;
                if (color != i2) {
                    paint.setColor(i2);
                }
            } else if (gdb instanceof Dr6) {
                paint.setShader(((Dr6) gdb).A00.D4V());
            }
        }
        f9i.A03 = this;
        DrC drC = this.A03;
        if (drC instanceof Dr8) {
            canvas.drawPath(f9i.A00((Dr8) drC, (DrG) null), paint);
            return;
        }
        if (drC instanceof GOW) {
            if ((drC instanceof DrC) && drC.A00 == 1) {
                1Jj.A01(1Lc.A03, "CanvasFill", "A Line shape cannot be 'filled'. Ignoring.", (Throwable) null, 0);
            } else {
                ((GOW) drC).AOG(canvas, paint);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Dqx)) {
                return false;
            }
            Dqx dqx = (Dqx) obj;
            if (!11T.A0O(this.A03, dqx.A03) || !11T.A0O(this.A02, dqx.A02) || this.A00 != dqx.A00 || !11T.A0O(this.A01, dqx.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.A02, 1BL.A03(this.A03)) + this.A00) * 31) + AnonymousClass001.A02(this.A01);
    }
}
