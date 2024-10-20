package X;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Locale;

/* loaded from: F4B.class */
public final class F4B {
    public final java.util.Map A00 = new EnumMap(EN8.class);

    public static final void A00(EN8 en8, StringBuilder sb, int i, int i2, boolean z) {
        String str;
        String A15 = 1BK.A15(Locale.US, "%.01f%%", Arrays.copyOf(new Object[]{Float.valueOf((i / i2) * 100.0f)}, 1));
        if (z) {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append(" (");
            A0k.append(i);
            A0k.append('/');
            str = DKH.A0p(A0k, i2);
        } else {
            str = "";
        }
        StringBuilder A0k2 = AnonymousClass001.A0k();
        A0k2.append(' ');
        A0k2.append(en8);
        AnonymousClass001.A1D(": ", A15, str, A0k2);
        A0k2.append('\n');
        1BK.A1R(sb, A0k2);
    }
}
