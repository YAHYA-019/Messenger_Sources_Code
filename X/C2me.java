package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2me, reason: invalid class name */
/* loaded from: 2me.class */
public final class C2me {
    public final C2mf A01;
    public final Set A02;
    public final C00i A04;
    public final C00i A05;
    public final Object[] A03 = new Object[0];
    public final C00i A00 = new 1BQ(32769);

    public C2me() {
        1BQ r0 = new 1BQ(84488);
        this.A04 = r0;
        1BV r02 = new 1BV(17150);
        this.A05 = r02;
        C1F6 c1f6 = (C1F6) r02.get();
        C0dr c0dr = (C0dr) r0.get();
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.A00.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            C2mf c2mf = new C2mf(c0dr);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A01 = c2mf;
            this.A02 = new HashSet();
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
