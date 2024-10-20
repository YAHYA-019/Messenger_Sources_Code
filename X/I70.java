package X;

import android.graphics.Color;
import android.text.TextUtils;

/* loaded from: I70.class */
public final class I70 {
    public final F9F A00 = (F9F) 1Bi.A03(99710);

    public static int A00(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("#")) {
                str = 0Pz.A0K(str, '#');
            }
            try {
                int parseColor = Color.parseColor(str);
                return Color.argb(Color.blue(parseColor), Color.alpha(parseColor), Color.red(parseColor), Color.green(parseColor));
            } catch (IllegalArgumentException unused) {
            }
        }
        return i;
    }

    public static final I70 A01() {
        return new I70();
    }
}
