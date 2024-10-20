package X;

import android.content.Context;
import com.facebook.user.model.UserKey;

/* loaded from: C1y.class */
public final class C1y {
    public 1PA A00;

    public final void A00(Context context, DFp dFp, UserKey userKey) {
        synchronized (this) {
            11T.A0F(dFp, 1);
            D0T d0t = new D0T(dFp, userKey, 2);
            if (this.A00 == null) {
                1PA A01 = 1P9.A01(AbJ.A0B(1Hv.A02(context, 65728)), d0t, 1BJ.A00(1178));
                this.A00 = A01;
                A01.A00();
            }
        }
    }
}
