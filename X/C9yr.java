package X;

import android.graphics.Color;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.9yr, reason: invalid class name */
/* loaded from: 9yr.class */
public final class C9yr implements 5OT {
    public /* bridge */ /* synthetic */ 1LI AK3(1Iw r302, 55B r303, 58D r304) {
        C9yp c9yp = (C9yp) r303;
        boolean A1X = 1BL.A1X(r302, c9yp);
        MigColorScheme migColorScheme = (MigColorScheme) 7zQ.A12(r302, 16979);
        2KD A0X = 7zN.A0X(r302, migColorScheme, 0);
        7zQ.A1S(A0X, c9yp.A00);
        A0X.A2Z();
        2K3 A2W = A0X.A2W();
        List list = c9yp.A01;
        2rR r308 = null;
        if (1BK.A1Y(list)) {
            2rQ r0 = new 2rQ(list, (List) null);
            2rS A00 = 2rR.A00(r302);
            A00.A0S();
            A00.A2c(r0);
            A00.A2b(migColorScheme);
            A00.A2a(2);
            A00.A2Z(16.0f);
            4YU.A1O(A00, 2RH.A07, C26z.END);
            A00.A0L();
            A00.A2d(false);
            A00.A2Q(false);
            2rR r02 = A00.A01;
            r02.A09 = false;
            r02.A01 = Color.argb(A1X ? 1 : 0, 0, 0, 0);
            r308 = A00.A2W();
        }
        C1rq A002 = C1rg.A00(r302);
        A002.A2b();
        A002.A2f(r308);
        return 7zL.A0d(A2W, A002);
    }

    public Class BDi() {
        return C9yp.class;
    }
}
