package X;

import android.content.Context;
import java.util.HashMap;

/* loaded from: Fb5.class */
public final class Fb5 implements GHZ {
    public final /* synthetic */ Emi A00;

    public Fb5(Emi emi) {
        this.A00 = emi;
    }

    public void COo(EoK eoK) {
        Emi emi = this.A00;
        HashMap A1C = DKC.A1C(04R.A0G());
        Eul eul = emi.A01;
        java.util.Map map = eul.A01;
        if (map != null) {
            A1C.putAll(map);
        }
        Context context = emi.A00;
        GJ1 gj1 = emi.A02;
        if (eoK.A02 != null) {
            FAv.A02(context, eoK, gj1, DKc.A01, A1C);
        }
        GJ2 gj2 = eul.A00;
        if (gj2 != null) {
            gj2.onSuccess();
        }
    }

    public void onFailure(Throwable th) {
        Eul eul = this.A00.A01;
        FGT.A00((FyG) null, "BKAsyncActionInvoker", 0Pz.A0W("Bloks Async Action Request Failed - ", eul.A03), th);
        GJ2 gj2 = eul.A00;
        if (gj2 != null) {
            gj2.onFailure(th);
        }
    }
}
