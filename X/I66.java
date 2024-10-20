package X;

import androidx.window.extensions.WindowExtensionsProvider;

/* loaded from: I66.class */
public final class I66 {
    static {
        java.util.Map map = 0BY.A03;
        C0Bx.A01(I66.class);
    }

    public static final int A00() {
        int i = 0;
        try {
            i = WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
        }
        return i;
    }
}
