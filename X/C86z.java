package X;

import android.content.Context;
import com.facebook.inject.FbInjector;

/* renamed from: X.86z, reason: invalid class name */
/* loaded from: 86z.class */
public final class C86z {
    public final 1Br A00 = 1Bu.A00(1079);

    public AnonymousClass875 A00(int i, int i2) {
        Context A00 = 1Bf.A00((C1F6) 1Br.A0B(this.A00));
        try {
            AnonymousClass875 anonymousClass875 = new AnonymousClass875(i, i2);
            1Bn.A0K();
            FbInjector.A04(A00);
            return anonymousClass875;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }
}
