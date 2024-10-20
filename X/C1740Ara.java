package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.integrity.frx.model.FRXParams;

/* renamed from: X.Ara, reason: case insensitive filesystem */
/* loaded from: Ara.class */
public final class C1740Ara extends C1F6 {
    public C1740Ara(1BO r302) {
        super(r302);
    }

    public C8C A00(FRXParams fRXParams, String str) {
        Context A01 = FbInjector.A01();
        AbL.A0y(this);
        try {
            C8C c8c = new C8C(fRXParams, str);
            1Bn.A0K();
            FbInjector.A04(A01);
            return c8c;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
