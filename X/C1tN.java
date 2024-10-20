package X;

import android.view.View;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.1tN, reason: invalid class name */
/* loaded from: 1tN.class */
public abstract class C1tN {
    public static final int A00 = View.MeasureSpec.makeMeasureSpec(0, 0);

    public static final String A00(int i) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        return 1BK.A15(Locale.US, "[%d, %s]", Arrays.copyOf(new Object[]{Integer.valueOf(size), mode == ((-1) << (-1)) ? "AT_MOST" : mode == 1073741824 ? "EXACTLY" : mode == A00 ? "UNSPECIFIED" : "INVALID"}, 2));
    }
}
