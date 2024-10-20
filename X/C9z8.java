package X;

import android.content.Context;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.9z8, reason: invalid class name */
/* loaded from: 9z8.class */
public final class C9z8 implements DGJ {
    public final 9Sl A00;

    public C9z8(9Sl r302) {
        this.A00 = r302;
    }

    public 1LI AJE(1Iw r302, MigColorScheme migColorScheme) {
        1BK.A1M(r302, migColorScheme);
        Context context = r302.A0D;
        2SG r0 = (2SG) 1Lm.A05(context, 1Fw.A01(context), 33197);
        C1rq A00 = C1rg.A00(r302);
        2KD A01 = 2K3.A01(r302, 0);
        7zU.A1W(A01, r302.A08(2131953260));
        A01.A2X();
        A01.A0R();
        A01.A2x(migColorScheme);
        7zN.A1T(A00, A01);
        8TU A002 = C8nm.A00(r302);
        A002.A2Y(migColorScheme);
        A002.A2Z(r302.A08(2131953259));
        A002.A2F(C26z.END, 2RH.A05.sizeRes);
        A002.A0c();
        A002.A2a(r0.A02());
        A002.A01.A00 = C9py.A03(this, ActionId.APPLY_FINISHED_LIST_AGAIN);
        A00.A2f(A002.A2W());
        A00.A2c();
        A00.A2b();
        A00.A0l(56.0f);
        4YU.A1L(A00, 2RH.A03);
        return A00.A00;
    }
}
