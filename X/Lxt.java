package X;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* loaded from: Lxt.class */
public final class Lxt extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom;
        try {
            secureRandom = SecureRandom.getInstance("SHA1PRNG", "GmsCore_OpenSSL");
        } catch (GeneralSecurityException unused) {
            try {
                secureRandom = SecureRandom.getInstance("SHA1PRNG", "AndroidOpenSSL");
            } catch (GeneralSecurityException unused2) {
                try {
                    secureRandom = SecureRandom.getInstance("SHA1PRNG", "Conscrypt");
                } catch (GeneralSecurityException unused3) {
                    try {
                        try {
                            secureRandom = SecureRandom.getInstance("SHA1PRNG", (Provider) DKE.A0p(Class.forName("org.conscrypt.Conscrypt"), "newProvider", 0));
                        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
                            throw new GeneralSecurityException("Failed to get Conscrypt provider", e);
                        }
                    } catch (GeneralSecurityException unused4) {
                        secureRandom = new SecureRandom();
                    }
                }
            }
        }
        secureRandom.nextLong();
        return secureRandom;
    }
}
