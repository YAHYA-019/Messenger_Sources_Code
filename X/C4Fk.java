package X;

import android.content.res.Resources;

/* renamed from: X.4Fk, reason: invalid class name */
/* loaded from: 4Fk.class */
public final class C4Fk {
    public static final C4Fk A00 = new Object();

    public static final float A00(Resources resources) {
        return (Math.max((int) ((resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density) + 0.5f), (int) ((resources.getConfiguration().screenHeightDp * resources.getDisplayMetrics().density) + 0.5f)) * 2.0f) / 3.0f;
    }

    public final float A01(Resources resources) {
        float A002 = 2RH.A03.A00() * resources.getDisplayMetrics().density * 4.0f;
        float A003 = A00(resources);
        float f = ((int) ((resources.getConfiguration().screenWidthDp * resources.getDisplayMetrics().density) + 0.5f)) - A002;
        if (f <= 0.0f || A003 <= 0.0f) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Unexpected content width less than 0.  MaxWidth ");
            A0k.append(A003);
            A0k.append(", and screenWidthWithoutMargin ");
            A0k.append(f);
            A0k.append(" using margin ");
            A0k.append(A002);
            0fH.A0o("DrawerSizeUtil", A0k.toString());
        }
        return Math.min(A003, f);
    }
}
