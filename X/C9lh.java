package X;

import android.content.res.Resources;
import java.util.AbstractMap;

/* renamed from: X.9lh, reason: invalid class name */
/* loaded from: 9lh.class */
public final class C9lh {
    public static final C9lh A00 = new Object();

    public static final String A00(Resources resources, 8Lu r302) {
        AbstractMap abstractMap = (AbstractMap) r302.A01;
        C95t c95t = (C95t) r302.A00;
        Number number = (Number) abstractMap.get(c95t);
        if (number == null) {
            return null;
        }
        return A01(resources, c95t, number.intValue());
    }

    public static final String A01(Resources resources, C95t c95t, int i) {
        int i2;
        int ordinal = c95t.ordinal();
        if (ordinal == 0) {
            i2 = 2131820803;
        } else if (ordinal == 1) {
            i2 = 2131820804;
        } else {
            if (ordinal != 2) {
                throw 1BK.A1F();
            }
            i2 = 2131820802;
        }
        String A0o = 4YV.A0o(resources, i, i2);
        11T.A0D(A0o);
        return A0o;
    }
}
