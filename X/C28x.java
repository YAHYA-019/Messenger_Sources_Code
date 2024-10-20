package X;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* renamed from: X.28x, reason: invalid class name */
/* loaded from: 28x.class */
public final class C28x {
    public GoogleApiAvailabilityLight A00;
    public final SparseIntArray A01;

    public C28x() {
        this(GoogleApiAvailability.A00);
    }

    public C28x(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.A01 = new SparseIntArray();
        AbstractC00481b7.A02(googleApiAvailabilityLight);
        this.A00 = googleApiAvailabilityLight;
    }

    public final int A00(Context context, 2AE r303) {
        AbstractC00481b7.A02(context);
        AbstractC00481b7.A02(r303);
        int Axj = r303.Axj();
        SparseIntArray sparseIntArray = this.A01;
        int i = sparseIntArray.get(Axj, -1);
        if (i == -1) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= sparseIntArray.size()) {
                    i = this.A00.A04(context, Axj);
                    break;
                }
                int keyAt = sparseIntArray.keyAt(i3);
                if (keyAt > Axj && sparseIntArray.get(keyAt) == 0) {
                    i = 0;
                    break;
                }
                i2 = i3 + 1;
            }
            sparseIntArray.put(Axj, i);
        }
        return i;
    }
}
