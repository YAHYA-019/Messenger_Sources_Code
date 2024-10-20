package X;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;

/* loaded from: Kv2.class */
public abstract class Kv2 {
    public static BiometricPrompt.CryptoObject A00(LA1 la1) {
        IdentityCredential A00;
        BiometricPrompt.CryptoObject cryptoObject = null;
        if (la1 != null) {
            Cipher cipher = la1.A01;
            if (cipher != null) {
                cryptoObject = new BiometricPrompt.CryptoObject(cipher);
            } else {
                Signature signature = la1.A00;
                if (signature != null) {
                    return new BiometricPrompt.CryptoObject(signature);
                }
                javax.crypto.Mac mac = la1.A02;
                if (mac != null) {
                    return new BiometricPrompt.CryptoObject(mac);
                }
                if (Build.VERSION.SDK_INT >= 30 && (A00 = la1.A00()) != null) {
                    return Kv1.A00(A00);
                }
            }
        }
        return cryptoObject;
    }

    public static LA1 A01() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("androidxBiometric", 3);
            builder.setBlockModes("CBC");
            builder.setEncryptionPaddings("PKCS7Padding");
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(builder.build());
            keyGenerator.generateKey();
            java.security.Key key = keyStore.getKey("androidxBiometric", null);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            cipher.init(1, key);
            return new LA1(cipher);
        } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableKeyException | CertificateException | NoSuchPaddingException e) {
            android.util.Log.w("CryptoObjectUtils", "Failed to create fake crypto object.", e);
            return null;
        }
    }
}
