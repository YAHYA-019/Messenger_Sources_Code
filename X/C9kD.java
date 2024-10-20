package X;

import android.content.res.Resources;

/* renamed from: X.9kD, reason: invalid class name */
/* loaded from: 9kD.class */
public final class C9kD {
    public static final C9kD A00 = new Object();

    public static final int A00(Resources resources, 8L4 r302, StringBuilder sb) {
        String A0o;
        int i = r302.A04;
        int i2 = r302.A02;
        int i3 = i + i2;
        int i4 = r302.A03;
        int i5 = i3 + i4;
        Object obj = r302.A05;
        if (obj == 0S2.A00 && i > 0) {
            A0o = 4YV.A0o(resources, i, 2131820859);
        } else if (obj == 0S2.A01 && i2 > 0) {
            i = i2;
            A0o = 4YV.A0o(resources, i2, 2131820860);
        } else {
            if (obj != 0S2.A0C || i4 <= 0) {
                return 0;
            }
            i = i4;
            A0o = 4YV.A0o(resources, i4, 2131820858);
        }
        sb.append(A0o);
        return i5 - i;
    }
}
