package X;

import android.app.Activity;
import android.view.View;
import kotlin.jvm.functions.Function2;

/* loaded from: GBx.class */
public final class GBx extends C00q implements Function2 {
    public static final GBx A00 = new GBx();

    public GBx() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        Qo6 qo6 = (Qo6) obj2;
        11T.A0H(view, qo6);
        Activity A002 = 0Dg.A00(4YU.A08(view));
        if (A002 != null) {
            1Iw A0W = 7zL.A0W(A002);
            ExT A003 = FFw.A00(A0W);
            A003.A02 = A002;
            C2154Dfi c2154Dfi = new C2154Dfi(A0W);
            c2154Dfi.A0f(2131957536);
            A003.A0B = new Ecw(c2154Dfi);
            A003.A0D = new QIB(qo6);
            A003.A00(EaL.A00).A04();
        }
        return 04S.A00;
    }
}
