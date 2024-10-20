package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.7W1, reason: invalid class name */
/* loaded from: 7W1.class */
public abstract class C7W1 {
    public static final int A00(Context context) {
        Resources resources = context.getResources();
        11T.A0D(resources);
        11T.A0F(resources, 0);
        return (int) ((resources.getConfiguration().screenHeightDp * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static final int A01(Context context) {
        11T.A0F(context, 0);
        Resources resources = context.getResources();
        11T.A0D(resources);
        11T.A0F(resources, 0);
        return (int) ((resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density) + 0.5f);
    }
}
