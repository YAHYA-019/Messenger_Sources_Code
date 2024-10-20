package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.6qm, reason: invalid class name */
/* loaded from: 6qm.class */
public final class C6qm extends C1F6 {
    public C6qm(1BO r302) {
        super(r302);
    }

    public C6wd A00(C6ri c6ri, C6qq c6qq, boolean z) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(B92().Aqm());
        1Bn.A0M(this);
        try {
            C6wd c6wd = new C6wd(new 1De(this, new int[0]), c6ri, c6qq, z);
            1Bn.A0K();
            FbInjector.A04(A01);
            return c6wd;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
