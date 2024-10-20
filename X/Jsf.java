package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: Jsf.class */
public final class Jsf extends C1F6 {
    public Jsf(1BO r302) {
        super(r302);
    }

    public KqV A00(MJY mjy, String str) {
        Context A00 = 1Bf.A00(this);
        try {
            KqV kqV = new KqV(mjy, this, str);
            1Bn.A0K();
            FbInjector.A04(A00);
            return kqV;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }
}
