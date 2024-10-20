package X;

import android.content.Context;

/* renamed from: X.2rY, reason: invalid class name */
/* loaded from: 2rY.class */
public abstract class C2rY {
    public static final boolean A00(Context context) {
        11T.A0F(context, 0);
        return (context.getApplicationInfo().flags & 4194304) != 0 && context.getResources().getConfiguration().getLayoutDirection() == 1;
    }
}
