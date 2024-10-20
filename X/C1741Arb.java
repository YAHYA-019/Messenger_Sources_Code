package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.integrity.frx.model.FRXParams;

/* renamed from: X.Arb, reason: case insensitive filesystem */
/* loaded from: Arb.class */
public final class C1741Arb extends C1F6 {
    public C1741Arb(1BO r302) {
        super(r302);
    }

    public CGd A00(FRXParams fRXParams, String str) {
        Context A01 = FbInjector.A01();
        AbL.A0y(this);
        try {
            CGd cGd = new CGd(fRXParams, str);
            1Bn.A0K();
            FbInjector.A04(A01);
            return cGd;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
