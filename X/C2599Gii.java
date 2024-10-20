package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.Gii, reason: case insensitive filesystem */
/* loaded from: Gii.class */
public final class C2599Gii extends C1F6 {
    public C2599Gii(1BO r302) {
        super(r302);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.Ik5, java.lang.Object] */
    public Ik5 A00(IEP iep, JJI jji) {
        Context A01 = FbInjector.A01();
        AbL.A0y(this);
        try {
            ?? obj = new Object();
            obj.A00 = iep;
            obj.A01 = jji;
            1Bn.A0K();
            FbInjector.A04(A01);
            return obj;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
