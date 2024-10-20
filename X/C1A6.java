package X;

import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.ProviderException;
import java.util.Locale;

/* renamed from: X.1A6, reason: invalid class name */
/* loaded from: 1A6.class */
public abstract class C1A6 {
    public final 0uY A00 = new 0uY();
    public final boolean A01;

    public C1A6(boolean z) {
        this.A01 = z;
    }

    public String A00() {
        try {
            KeyStore.Entry entry = this.A00.A00.getEntry("w6CmevIyM/PL6Q5uUDw=", null);
            try {
                if (!(entry instanceof KeyStore.PrivateKeyEntry)) {
                    throw AnonymousClass001.A0N("Attestation key is not PrivateKeyEntry in keystore");
                }
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.update(((KeyStore.PrivateKeyEntry) entry).getCertificate().getPublicKey().getEncoded());
                byte[] digest = messageDigest.digest();
                StringBuilder A0k = AnonymousClass001.A0k();
                for (byte b : digest) {
                    A0k.append(String.format(Locale.US, "%02x", Byte.valueOf(b)));
                }
                return A0k.toString();
            } catch (IllegalArgumentException | IllegalStateException | GeneralSecurityException e) {
                throw new Exception("Unable to get key hash", e);
            }
        } catch (NullPointerException | UnsupportedOperationException | GeneralSecurityException | ProviderException e2) {
            throw new Exception("Unable to get entry", e2);
        }
    }

    public boolean A01() {
        try {
            return this.A00.A00.containsAlias("w6CmevIyM/PL6Q5uUDw=");
        } catch (NullPointerException | GeneralSecurityException e) {
            throw new Exception("Unable to check key existance", e);
        }
    }
}
