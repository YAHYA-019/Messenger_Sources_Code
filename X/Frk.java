package X;

import android.content.Context;
import android.os.Bundle;

/* loaded from: Frk.class */
public final class Frk implements NAP {
    public final /* synthetic */ Epv A00;

    public Frk(Epv epv) {
        this.A00 = epv;
    }

    public void onFailure(Throwable th) {
        AbN.A1Q((F8q) 1Br.A0B(this.A00.A03), 2131951799);
    }

    public void onSuccess() {
        Epv epv = this.A00;
        1Br.A0C(epv.A01);
        Context A05 = AbJ.A05(epv.A02);
        Bundle A052 = 1BK.A05();
        A052.putBoolean("EXTRA_SAVE_LINK_SUCCEED", true);
        L5x.A01(A05, A052, "ACTION_SAVE_LINK", true, false);
    }
}
