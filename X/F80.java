package X;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import javax.crypto.Cipher;

/* loaded from: F80.class */
public final class F80 {
    public 1BY A00;
    public final KeyStore A02 = (KeyStore) 1Bn.A0E((Context) null, (1BY) null, 99394);
    public final C15h A03 = G7K.A01(this, 81);
    public final KeyPairGenerator A01 = (KeyPairGenerator) 1Bn.A0E((Context) null, (1BY) null, 99393);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.F80] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.security.KeyStore] */
    public F80(1BO r302) {
        ?? r0 = this;
        r0.A00 = 7zL.A0Q(r302);
        try {
            r0 = this.A02;
            r0.load(null);
        } catch (IOException | GeneralSecurityException unused) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.security.KeyPair] */
    public static void A00(F80 f80) {
        ?? r0 = "fingerprint_nonce_keystore_alias";
        try {
            KeyStore keyStore = f80.A02;
            java.security.Key key = keyStore.getKey("fingerprint_nonce_keystore_alias", null);
            Certificate certificate = keyStore.getCertificate("fingerprint_nonce_keystore_alias");
            if (key != null && certificate != null) {
                try {
                    ((Cipher) f80.A03.get()).init(2, key);
                    return;
                } catch (KeyPermanentlyInvalidatedException unused) {
                }
            }
            KeyPairGenerator keyPairGenerator = f80.A01;
            keyPairGenerator.initialize(new KeyGenParameterSpec.Builder("fingerprint_nonce_keystore_alias", 3).setBlockModes("ECB").setUserAuthenticationRequired(true).setEncryptionPaddings("PKCS1Padding").build());
            r0 = keyPairGenerator.generateKeyPair();
        } catch (GeneralSecurityException unused2) {
            throw AnonymousClass001.A0U(r0);
        }
    }

    public boolean A01() {
        try {
            return this.A02.isKeyEntry(0Pz.A0W(1Fw.A05(this.A00).A02, "_fbpay_client_auth_keystore_alias"));
        } catch (KeyStoreException unused) {
            return false;
        }
    }
}
