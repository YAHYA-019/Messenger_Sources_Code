package X;

import android.content.Context;
import java.lang.reflect.Field;

/* renamed from: X.01Y, reason: invalid class name */
/* loaded from: 01Y.class */
public final class C01Y extends 01S {
    public C01Y() {
        super("display", (String) null, (String) null, (String) null);
    }

    public void A01(Context context, C01a c01a) {
        Field A03;
        Field A032;
        Class A01;
        Class A012 = c01a.A01("android.hardware.display.DisplayManagerGlobal");
        if (A012 == null || (A03 = c01a.A03(A012, "sInstance")) == null) {
            return;
        }
        try {
            Object obj = A03.get(null);
            if (obj == null || (A032 = c01a.A03(A012, "mDm")) == null) {
                return;
            }
            Object obj2 = A032.get(obj);
            if (obj2 == null || (A01 = c01a.A01("android.hardware.display.IDisplayManager")) == null) {
                return;
            }
            A032.set(obj, new C01c(A01, obj2, ((01S) this).A02, true).A00);
        } catch (Exception unused) {
        }
    }
}
