package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.Gih, reason: case insensitive filesystem */
/* loaded from: Gih.class */
public final class C2598Gih extends C1F6 {
    public C2598Gih(1BO r302) {
        super(r302);
    }

    public IiK A00(I8g i8g, boolean z) {
        Context A01 = FbInjector.A01();
        AbL.A0y(this);
        try {
            IiK iiK = new IiK(i8g, z);
            1Bn.A0K();
            FbInjector.A04(A01);
            return iiK;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
