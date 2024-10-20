package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.4xV, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4xV.class */
public final class C11704xV {
    public final C00i A00 = new 1BV(305);
    public final C00i A01 = new 1BV(65569);

    public 1Ph A00(2qM r302, C2d1 c2d1) {
        C1F6 c1f6 = (C1F6) this.A01.get();
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            1Pa r0 = new 4xW(r302, c2d1, new 1De(c1f6, new int[0]));
            1Bn.A0K();
            FbInjector.A04(A01);
            return ((C2xd) this.A00.get()).A03(r0);
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
