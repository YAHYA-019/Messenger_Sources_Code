package X;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import java.util.Collections;

/* loaded from: Fv4.class */
public final class Fv4 implements GGr {
    public final F8v A00;

    public Fv4(F8v f8v) {
        this.A00 = f8v;
    }

    @Override // X.GGr
    public LiveData D1N(Bundle bundle, GIw gIw, FGo fGo) {
        F8v f8v = this.A00;
        String string = bundle.getString("PAYMENT_TYPE");
        FEq A00 = FEq.A00(C06014fk.A0C().A01, new Object(), "ENABLE_FBPAY_PIN", FAt.A02(bundle), Collections.singleton(fGo));
        F4T f4t = f8v.A02;
        FYl fYl = new FYl(f8v, A00, string, 7);
        F60 f60 = f8v.A01;
        Qmd A01 = F2R.A01(fYl, f60, f4t, A00);
        FH8.A02(A01);
        DSD dsd = ((FH8) A01).A03;
        F8v.A00(dsd, f60);
        return G7P.A00(dsd, this, 16);
    }
}
