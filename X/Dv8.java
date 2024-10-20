package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.Arrays;

/* loaded from: Dv8.class */
public final class Dv8 extends 1LH {
    public final Uri A00;
    public final 2lO A01;
    public final Fy1 A02;

    public Dv8(Uri uri, 2lO r303, Fy1 fy1) {
        11T.A0F(uri, 1);
        this.A00 = uri;
        this.A02 = fy1;
        this.A01 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        2lQ A0L;
        5BK A00;
        11T.A0F(c2k5, 0);
        C6tP A002 = F2c.A00(c2k5);
        Fy1 fy1 = this.A02;
        Ez5 ez5 = (Ez5) F2c.A01(c2k5, fy1);
        EIx eIx = ez5.A03;
        String str = ez5.A04;
        int i = ez5.A00;
        ESC esc = ez5.A02;
        Object A003 = 2rO.A00(c2k5, new G9M(0, (Object) null, this, c2k5, eIx), new Object[]{null, eIx});
        if (A003 == null) {
            A0L = 2lO.A02;
        } else {
            2lQ r0 = 2lO.A02;
            A0L = 4YV.A0L((2lO) null, 0S2.A00, A003, 1);
        }
        if (!11T.A0O(esc, EIw.A00)) {
            throw 1BK.A1F();
        }
        2lO A004 = A0L.A00((2lO) null).A00(7zT.A0i((2lO) null, 0S2.A00, 7zL.A08(i)));
        Drawable drawable = (Drawable) 2rO.A00(c2k5, new GAW(ez5, 47), Arrays.copyOf(new Object[]{fy1, A002}, 2));
        if (drawable == null) {
            drawable = null;
        }
        if (eIx instanceof EIy) {
            A00 = 5BK.A06;
        } else {
            if (!(eIx instanceof EIx)) {
                throw 1BK.A1F();
            }
            A00 = 5BJ.A00(7zS.A01(c2k5, eIx.A00));
        }
        return new C8ij(null, drawable, ImageView.ScaleType.CENTER_CROP, null, A00, 5Bm.A01(this.A00, (java.util.Map) null), null, A004.A00(this.A01), str, 0);
    }
}
