package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: X.9mV, reason: invalid class name */
/* loaded from: 9mV.class */
public final class C9mV {
    public static Float A00;
    public static Float A01;
    public static Float A02;
    public static final C9mV A03 = new Object();

    public static final float A00(Context context) {
        Float f = A02;
        if (f != null) {
            return f.floatValue();
        }
        float dimensionPixelSize = 7zO.A0I(context).heightPixels - context.getResources().getDimensionPixelSize(2132279503);
        A02 = Float.valueOf(dimensionPixelSize);
        return dimensionPixelSize;
    }

    public static final long A01(1Iw r301, float f, float f2, long j) {
        return 7zL.A07(7zO.A00(7zQ.A0J(r301), f + (7zP.A00(r301, j) * f2)));
    }

    public static final Activity A02(Context context) {
        while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
            11T.A0A(context);
        }
        return (Activity) context;
    }

    public final float A03(Context context) {
        Float f = A01;
        if (f != null) {
            return f.floatValue();
        }
        float A002 = 7zO.A00(4YU.A0C(context), A00(context));
        A01 = Float.valueOf(A002);
        return A002;
    }
}
