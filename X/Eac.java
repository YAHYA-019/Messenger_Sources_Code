package X;

import android.text.Layout;

/* loaded from: Eac.class */
public abstract class Eac {
    public static final Layout.Alignment A00;
    public static final Layout.Alignment A01;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                A00 = alignment;
                A01 = alignment2;
                return;
            }
            Layout.Alignment alignment3 = values[i2];
            if (11T.A0O(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (11T.A0O(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
            i = i2 + 1;
        }
    }
}
