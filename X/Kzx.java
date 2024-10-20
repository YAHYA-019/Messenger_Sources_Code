package X;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* loaded from: Kzx.class */
public final class Kzx {
    public Method A00;
    public Method A01;
    public Method A02;

    public Kzx() {
        A00();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.A01 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.A00 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.A02 = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
