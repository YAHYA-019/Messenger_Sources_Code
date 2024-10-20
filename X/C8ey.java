package X;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ey, reason: invalid class name */
/* loaded from: 8ey.class */
public final class C8ey extends 1LH {
    public static final 3yK A01 = new 3yK(-1, -1);
    public static final 3yK A02;
    public final HSo A00;

    static {
        int parseColor = Color.parseColor("#FFCCCCCC");
        A02 = new 3yK(parseColor, parseColor);
    }

    public C8ey(HSo hSo) {
        11T.A0F(hSo, 1);
        this.A00 = hSo;
    }

    public 1LI A0s(C2k5 c2k5) {
        MigColorScheme migColorScheme = (MigColorScheme) 2rO.A00(c2k5, AQq.A00(c2k5, 16), 7zL.A1Z(c2k5));
        Drawable drawable = (Drawable) 2rO.A00(c2k5, ANO.A00, new Object[0]);
        2lQ r0 = 2lO.A02;
        2lO A0L = 4YV.A0L(7zS.A0d((2lO) null, 3yH.A09(c2k5, 2131964351)), 0S2.A1G, AnonymousClass843.A00(this, 39), 1);
        C2sn A0L2 = 7zR.A0L(c2k5);
        2zB A00 = 2cP.A00(A0L2.A00);
        A00.A2Z(drawable);
        A00.A2a(migColorScheme);
        2cP r02 = A00.A01;
        r02.A0A = true;
        r02.A04 = A01;
        r02.A05 = A02;
        return 7zM.A0l(A00.A2W(), A0L2, c2k5, A0L);
    }
}
