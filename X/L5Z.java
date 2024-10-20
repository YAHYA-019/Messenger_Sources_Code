package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* loaded from: L5Z.class */
public abstract class L5Z {
    public static int A00(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    public static BiometricManager A01(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method A02() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", BiometricPrompt.CryptoObject.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
