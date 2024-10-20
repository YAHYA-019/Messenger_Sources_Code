package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.inject.FbInjector;

/* loaded from: Elv.class */
public final class Elv {
    public final Resources A00;
    public final EfO A01;
    public final 2oN A02;

    public Elv() {
        Context A00 = FbInjector.A00();
        2oN r0 = (2oN) 1Hv.A02(DKC.A08(), 33246);
        1HH A0Q = AbF.A0Q(DKC.A08(), 99278);
        this.A00 = A00.getResources();
        this.A02 = r0;
        this.A01 = (EfO) A0Q.get();
    }
}
