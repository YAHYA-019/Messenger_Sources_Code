package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.651, reason: invalid class name */
/* loaded from: 651.class */
public final class AnonymousClass651 {
    public static final AnonymousClass652 A01 = new Object();
    public final 1Br A00 = 1Bq.A00(68056);

    public final int A00(Context context, boolean z) {
        int dimensionPixelSize;
        11T.A0F(context, 0);
        1Br.A0C(this.A00);
        int A00 = Resources.getSystem().getDisplayMetrics().widthPixels - A01.A00(context, z);
        Resources A0C = 4YU.A0C(context);
        if (z) {
            dimensionPixelSize = A0C.getDimensionPixelSize(2132279310);
        } else {
            dimensionPixelSize = A0C.getDimensionPixelSize(2132279321) + (A0C.getDimensionPixelSize(2RH.A04.sizeRes) * 2);
        }
        return A00 - dimensionPixelSize;
    }
}
