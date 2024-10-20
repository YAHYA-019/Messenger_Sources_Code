package X;

import android.os.Looper;
import android.util.SparseArray;
import java.util.concurrent.Future;

/* loaded from: I22.class */
public final class I22 {
    public final java.util.Map A00 = AnonymousClass001.A0u();
    public final java.util.Map A01 = AnonymousClass001.A0u();
    public final Looper A02 = Looper.myLooper();

    public static void A00(I22 i22) {
        if (Looper.myLooper() != i22.A02) {
            throw new RuntimeException();
        }
    }

    public Future A01(HAy hAy, int i) {
        A00(this);
        return (Future) ((SparseArray) DKC.A12(hAy, this.A00)).get(i);
    }
}
