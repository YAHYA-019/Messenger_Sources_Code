package X;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* loaded from: Hwv.class */
public abstract class Hwv {
    public static Boolean A00;
    public static Boolean A01;
    public static Boolean A02;
    public static final List A03 = Arrays.asList("Redmi Note 8 Pro", "Redmi Note 8", "Redmi Note 7", "Redmi 7", "CPH1717", "CPH1909", "Redmi Note 8T", "vivo 1904", "POT-LX1", "JKM-LX3", "Redmi Note 5", "Redmi 6");

    public static boolean A00(Context context) {
        boolean z = true;
        if (!A03.contains(Build.MODEL.toLowerCase(Locale.getDefault())) && C05a.A00(context) > 2012) {
            z = false;
        }
        return z;
    }
}
