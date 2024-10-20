package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.2r3, reason: invalid class name */
/* loaded from: 2r3.class */
public final class C2r3 implements C02l {
    public WeakReference A00;

    @Override // X.C02l
    public void CFb(Context context, Intent intent, C01q c01q) {
        int A00 = C09o.A00(-482485388);
        2qN r0 = (2qN) this.A00.get();
        if (r0 != null) {
            2qN.A01(intent, r0);
        }
        C09o.A01(-612210884, A00);
    }
}
