package X;

import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: J91.class */
public final class J91 extends C00q implements C00m {
    public static final J91 A00 = new J91();

    public J91() {
        super(0);
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        MIA mia;
        try {
            ClassLoader classLoader = JO3.class.getClassLoader();
            if (classLoader == null) {
                return null;
            }
            WindowLayoutComponent A01 = new I1v(new HOY(classLoader), classLoader).A01();
            if (A01 == null) {
                return null;
            }
            HOY hoy = new HOY(classLoader);
            int A002 = I66.A00();
            if (A002 >= 2) {
                new ILk(A01);
            } else if (A002 == 1) {
                new ILl(hoy, A01);
            } else {
                new Object();
            }
            return mia;
        } catch (Throwable unused) {
            I1Q i1q = I1Q.A02;
            return null;
        }
    }
}
