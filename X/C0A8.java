package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;

/* renamed from: X.0A8, reason: invalid class name */
/* loaded from: 0A8.class */
public abstract class C0A8 {
    public static final int A00(Context context, float f) {
        11T.A0F(context, 0);
        float f2 = f * context.getResources().getDisplayMetrics().density;
        return (int) (f2 >= 0.0f ? f2 + 0.5f : f2 - 0.5f);
    }

    public static final int A01(Context context, float f) {
        11T.A0F(context, 0);
        return (int) (f / context.getResources().getDisplayMetrics().density);
    }

    public static final int A02(Context context, float f) {
        11T.A0F(context, 0);
        float f2 = f * context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (f2 >= 0.0f ? f2 + 0.5f : f2 - 0.5f);
    }

    public static final int A03(Resources resources, float f) {
        11T.A0F(resources, 0);
        float f2 = f * resources.getDisplayMetrics().density;
        return (int) (f2 >= 0.0f ? f2 + 0.5f : f2 - 0.5f);
    }

    public static final int A04(Resources resources, float f) {
        11T.A0F(resources, 0);
        float f2 = f * resources.getDisplayMetrics().scaledDensity;
        return (int) (f2 >= 0.0f ? f2 + 0.5f : f2 - 0.5f);
    }

    public static final int A05(Resources resources, int i) {
        11T.A0F(resources, 0);
        return 0KF.A01(resources.getDimensionPixelSize(i) * resources.getConfiguration().fontScale);
    }

    public static final int A06(Resources resources, int i) {
        11T.A0F(resources, 0);
        TypedValue typedValue = new TypedValue();
        resources.getValue(i, typedValue, false);
        return 0KF.A01(TypedValue.complexToFloat(typedValue.data));
    }

    public static final String A07(Resources resources) {
        int i;
        String str = ConstantsKt.CAMERA_ID_BACK;
        if (resources != null && (i = resources.getDisplayMetrics().densityDpi) > 160) {
            if (i < 320) {
                return "1.5";
            }
            str = "2";
        }
        return str;
    }
}
