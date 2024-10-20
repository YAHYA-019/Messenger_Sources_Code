package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.71f, reason: invalid class name */
/* loaded from: 71f.class */
public abstract class C71f {
    public static final void A00(Context context, BOj bOj, 1pK r303, C6qu c6qu) {
        83Z A0F;
        View view = r303.mView;
        if (view == null || (A0F = 1BK.A0F()) == null) {
            return;
        }
        A0F.A03(context, c6qu.A00.Aoc().BdK(), bOj, 1vD.A00(view), false);
    }

    public static final void A01(C6qu c6qu) {
        6zE A00 = C6qt.A00(C6z2.A0u, 6zM.A00, new C82x(c6qu, 12));
        c6qu.A03(new C82x(A00, 10));
        c6qu.A04(new C82x(A00, 11));
    }
}
