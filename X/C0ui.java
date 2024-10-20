package X;

import android.os.Build;
import java.lang.reflect.Field;
import org.json.JSONObject;

/* renamed from: X.0ui, reason: invalid class name */
/* loaded from: 0ui.class */
public final class C0ui extends 0XJ {
    public static final boolean A00;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        }
        A00 = z;
    }

    public static void A00(ClassLoader classLoader, String str, JSONObject jSONObject) {
        Field[] declaredFields = classLoader.loadClass(str).getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return;
            }
            Field field = declaredFields[i2];
            String name = field.getName();
            if (name.endsWith("_TIMEOUT") || name.endsWith("_TIMEOUT_MS")) {
                field.setAccessible(true);
                if (field.getType() == Integer.TYPE) {
                    jSONObject.put(name, field.getInt(null));
                } else if (field.getType() == Long.TYPE) {
                    jSONObject.put(name, field.getLong(null));
                }
            }
            i = i2 + 1;
        }
    }

    public String A01() {
        JSONObject A12 = AnonymousClass001.A12();
        if (!A00) {
            try {
                ClassLoader classLoader = ((0XJ) this).A01;
                if (classLoader != null) {
                    A00(classLoader, "com.android.server.am.ActivityManagerService", A12);
                    A00(classLoader, "com.android.server.am.ActiveServices", A12);
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 29) {
                        A00(classLoader, "com.android.server.wm.ActivityTaskManagerService", A12);
                    }
                    if (i >= 30) {
                        if (07L.A00) {
                            try {
                                A12.put("KEY_DISPATCHING_TIMEOUT_MS", AnonymousClass001.A0r(Class.forName("android.os.InputConstants"), "DEFAULT_DISPATCHING_TIMEOUT_MILLIS").getInt(null));
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                0fH.A0q("AnrTimeoutConfigReader", "Failed to read System ANR config", th);
            }
        }
        return A12.toString();
    }
}
