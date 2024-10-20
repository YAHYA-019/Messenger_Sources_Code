package X;

import java.util.HashMap;

/* renamed from: X.0d6, reason: invalid class name */
/* loaded from: 0d6.class */
public final class C0d6 extends HashMap {
    public final int A00;

    public C0d6(int i) {
        this.A00 = i;
        if (i == 0) {
            put("31", "build.version.extensions.r");
            put("32", "build.version.extensions.s");
            put("33", "build.version.extensions.tiramisu");
            return;
        }
        C18v[] values = C18v.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= length) {
                return;
            }
            C18v c18v = values[i3];
            put(Integer.valueOf(c18v.mValue), c18v);
            i2 = i3 + 1;
        }
    }
}
