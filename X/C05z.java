package X;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.HashMap;

/* renamed from: X.05z, reason: invalid class name */
/* loaded from: 05z.class */
public final class C05z {
    public static C01a A02;
    public static C05z A03;
    public final Context A00;
    public final java.util.Map A01 = new HashMap();

    public C05z(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static C05z A00(Context context) {
        if (A03 == null) {
            A03 = new C05z(context);
            A02 = C01a.A00();
        }
        return A03;
    }

    public Object A01(String str, Object obj) {
        Class<?> cls = obj.getClass();
        java.util.Map map = this.A01;
        0BX r306 = (0BX) map.get(cls);
        if (r306 == null) {
            r306 = new 0BX(this.A00, cls);
            map.put(cls, r306);
        }
        Field field = (Field) r306.A00.get(str);
        if (field == null) {
            return null;
        }
        try {
            return field.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
