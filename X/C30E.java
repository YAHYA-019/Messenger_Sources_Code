package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.30E, reason: invalid class name */
/* loaded from: 30E.class */
public abstract class C30E extends 1EJ {
    public static final LEX A00(1BO r301) {
        boolean z = LEX.A0N;
        return new LEX(new 1De(r301, new int[0]));
    }

    public static final 2IN A01() {
        C1F6 c1f6 = (C1F6) 1Bn.A0H(2IH.class, (Class) null);
        C1F6 c1f62 = (C1F6) 1Bn.A0H(2II.class, (Class) null);
        2IJ r0 = new 2IJ();
        Context A00 = 1Bf.A00(c1f62);
        try {
            2IL r02 = new 2IL();
            1Bn.A0K();
            FbInjector.A04(A00);
            A00 = 1Bf.A00(c1f6);
            2IN r03 = new 2IN(r0, r02);
            1Bn.A0K();
            FbInjector.A04(A00);
            return r03;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public static final 2IZ A02() {
        C1F6 c1f6 = (C1F6) 1Bn.A0H(2IV.class, (Class) null);
        C1F6 c1f62 = (C1F6) 1Bn.A0H(2IW.class, (Class) null);
        2IX r0 = new 2IX((1CO) 1Bi.A05(1CO.class, (Class) null));
        Context A00 = 1Bf.A00(c1f62);
        try {
            2IY r02 = new 2IY();
            1Bn.A0K();
            FbInjector.A04(A00);
            A00 = 1Bf.A00(c1f6);
            2IZ r03 = new 2IZ(r0, r02);
            1Bn.A0K();
            FbInjector.A04(A00);
            return r03;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }
}
