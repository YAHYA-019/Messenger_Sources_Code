package X;

import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: Kmi.class */
public final class Kmi {
    public final void A00(View view) {
        try {
            if (!JXv.A0G) {
                JXv.A0G = true;
                JXv.A0F = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                JXv.A0E = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                Method method = JXv.A0F;
                if (method != null) {
                    method.setAccessible(true);
                }
                Field field = JXv.A0E;
                if (field != null) {
                    field.setAccessible(true);
                }
            }
            Field field2 = JXv.A0E;
            if (field2 != null) {
                field2.setBoolean(view, true);
            }
            Method method2 = JXv.A0F;
            if (method2 != null) {
                method2.invoke(view, new Object[0]);
            }
        } catch (Throwable unused) {
            JXv.A0H = true;
        }
    }
}
