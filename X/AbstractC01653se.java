package X;

import android.content.res.Resources;
import com.facebook.graphql.querybuilder.common.ScaleInputPixelRatio;

/* renamed from: X.3se, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3se.class */
public abstract class AbstractC01653se {
    public static int A00() {
        if (Resources.getSystem() == null || Resources.getSystem().getDisplayMetrics() == null) {
            return 0;
        }
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static ScaleInputPixelRatio A01() {
        int A00 = A00();
        return A00 > 480 ? ScaleInputPixelRatio.NUMBER_4 : A00 > 320 ? ScaleInputPixelRatio.NUMBER_3 : A00 > 240 ? ScaleInputPixelRatio.NUMBER_2 : A00 > 160 ? ScaleInputPixelRatio.NUMBER_1_5 : ScaleInputPixelRatio.NUMBER_1;
    }
}
