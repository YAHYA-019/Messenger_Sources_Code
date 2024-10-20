package X;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: L7y.class */
public final class L7y {
    public static final Object A00 = AnonymousClass001.A0R();

    public static boolean A00(String str) {
        boolean containsAlias;
        boolean z;
        synchronized (A00) {
            String A002 = L71.A00(str);
            String str2 = "AndroidKeyStore";
            try {
                try {
                    KeyStore keyStore = KeyStore.getInstance(str2);
                    keyStore.load(null);
                    containsAlias = keyStore.containsAlias(A002);
                    if (containsAlias) {
                        z = false;
                    } else {
                        String A003 = L71.A00(str);
                        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", str2);
                        keyGenerator.init(new KeyGenParameterSpec.Builder(A003, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                        keyGenerator.generateKey();
                        z = true;
                    }
                } catch (IOException e) {
                    throw new GeneralSecurityException(e);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (NullPointerException unused) {
                    android.util.Log.w("AndroidKeystoreKmsClient", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
                    try {
                        Thread.sleep((int) (Math.random() * 40.0d));
                    } catch (InterruptedException unused2) {
                    }
                    str2 = "AndroidKeyStore";
                    try {
                        KeyStore keyStore2 = KeyStore.getInstance(str2);
                        keyStore2.load(null);
                        containsAlias = keyStore2.containsAlias(A002);
                    } catch (IOException e2) {
                        throw new GeneralSecurityException(e2);
                    }
                }
            }
        }
        return z;
    }

    public LfZ A01(String str) {
        LfZ lfZ;
        try {
            synchronized (A00) {
                lfZ = new LfZ(L71.A00(str));
                byte[] A002 = Kxq.A00(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(A002, lfZ.AMO(lfZ.AQ1(A002, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return lfZ;
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
