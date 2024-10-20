package X;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: Kv0.class */
public abstract class Kv0 {
    public static void A00(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void A01(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
