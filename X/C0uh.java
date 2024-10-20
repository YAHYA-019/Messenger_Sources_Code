package X;

import android.content.Context;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;

/* renamed from: X.0uh, reason: invalid class name */
/* loaded from: 0uh.class */
public final class C0uh extends 0XJ {
    public Object A00;
    public Field A01;
    public Field A02;
    public Field A03;
    public Field A04;
    public final Context A05;

    public C0uh(Context context, boolean z) {
        super(context.getApplicationContext(), z);
        this.A00 = null;
        this.A05 = context.getApplicationContext();
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [int[], java.lang.Object[]] */
    public static JSONArray A00(C0uh c0uh, Field field) {
        try {
            int[] iArr = (int[]) field.get(c0uh.A00);
            return iArr != null ? new JSONArray((Collection) Arrays.asList(new int[]{iArr})) : new JSONArray();
        } catch (Throwable unused) {
            return new JSONArray();
        }
    }
}
