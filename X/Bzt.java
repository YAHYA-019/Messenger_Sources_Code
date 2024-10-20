package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: Bzt.class */
public final class Bzt {
    public final C00i A00 = 1BV.A00(84743);

    public BbX A00(DEb dEb) {
        C1F6 A0P = AbF.A0P(this.A00);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0P);
        try {
            BbX bbX = new BbX(dEb);
            1Bn.A0K();
            FbInjector.A04(A01);
            return bbX;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
