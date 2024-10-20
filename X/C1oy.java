package X;

import android.content.res.Resources;

/* renamed from: X.1oy, reason: invalid class name */
/* loaded from: 1oy.class */
public abstract class C1oy {
    public static final boolean A00(Resources resources) {
        11T.A0F(resources, 0);
        boolean z = false;
        if ((resources.getConfiguration().uiMode & 48) == 32) {
            z = true;
        }
        return z;
    }
}
