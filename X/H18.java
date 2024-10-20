package X;

import android.content.Context;
import android.os.Build;
import android.view.SurfaceView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: H18.class */
public final class H18 extends GU5 {
    public H18(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT < 30) {
            if (!HEj.A01) {
                try {
                    Method method = Class.class.getMethod("getDeclaredField", String.class);
                    HEj.A01 = true;
                    Object invoke = method.invoke(SurfaceView.class, "mRtHandlingPositionUpdates");
                    11T.A0I(invoke, "null cannot be cast to non-null type java.lang.reflect.Field");
                    Field field = (Field) invoke;
                    HEj.A00 = field;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                } catch (Exception e) {
                    0fH.A0r("SafeSurfaceView", "Failed to get inner field", e);
                }
            }
            try {
                Field field2 = HEj.A00;
                if (field2 != null) {
                    field2.setBoolean(this, true);
                }
            } catch (IllegalAccessException e2) {
                0fH.A0r("SafeSurfaceView", "Failed to set inner field", e2);
            }
        }
    }
}
