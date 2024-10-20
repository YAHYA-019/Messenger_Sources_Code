package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.6qn, reason: invalid class name */
/* loaded from: 6qn.class */
public final class C6qn extends C1F6 {
    public C6qn(1BO r302) {
        super(r302);
    }

    public 6wC A00(int i) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(B92().Aqm());
        1Bn.A0M(this);
        try {
            6wC r0 = new 6wC(i);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
