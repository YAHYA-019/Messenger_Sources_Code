package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: Euh.class */
public final class Euh {
    public int A00;
    public int A01;
    public Canvas A02;
    public final /* synthetic */ E8c A03;

    public Euh(E8c e8c) {
        this.A03 = e8c;
    }

    public final void A00() {
        int i;
        Canvas canvas;
        if (this.A02 != null) {
            int i2 = this.A00;
            E8c e8c = this.A03;
            int length = e8c.A04.length;
            while (true) {
                if (i2 >= length) {
                    i = this.A01;
                    break;
                }
                2JG r0 = e8c.A04[i2];
                if (r0 != null) {
                    if (r0.A01.A06.A04 == 0S2.A01) {
                        i = i2 + 1;
                        break;
                    } else if (r0.A02 && (canvas = this.A02) != null) {
                        Object obj = r0.A04;
                        11T.A0I(obj, 1BJ.A00(9));
                        ((Drawable) obj).draw(canvas);
                    }
                }
                i2++;
            }
            this.A00 = i;
        }
    }
}
