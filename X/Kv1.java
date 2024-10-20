package X;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* loaded from: Kv1.class */
public abstract class Kv1 {
    public static BiometricPrompt.CryptoObject A00(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    public static IdentityCredential A01(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
