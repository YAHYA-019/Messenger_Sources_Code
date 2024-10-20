package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.Gig, reason: case insensitive filesystem */
/* loaded from: Gig.class */
public final class C2597Gig extends C1F6 {
    public C2597Gig(1BO r302) {
        super(r302);
    }

    public IiN A00(C2325Dka c2325Dka) {
        Context A01 = FbInjector.A01();
        AbL.A0y(this);
        try {
            IiN iiN = new IiN(c2325Dka);
            1Bn.A0K();
            FbInjector.A04(A01);
            return iiN;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
