package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.Base64;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/* loaded from: Esf.class */
public final class Esf {
    public static volatile Esf A01;
    public Context A00;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, X.Esf] */
    public static Esf A00(Context context) {
        if (A01 == null) {
            synchronized (Esf.class) {
                if (A01 == null) {
                    ?? obj = new Object();
                    obj.A00 = context.getApplicationContext();
                    A01 = obj;
                }
            }
        }
        return A01;
    }

    public KeyPair A01(String str) {
        try {
            LFr A00 = EXV.A00(this.A00);
            String string = A00.getString(0Pz.A0W("pk_", str), (String) null);
            String string2 = A00.getString(0Pz.A0W("sk_", str), (String) null);
            if (string == null || string2 == null) {
                throw new Resources.NotFoundException(0Pz.A0j("Key specified by keyAlias: ", str, " does not exist in EncryptedSharedPreferences"));
            }
            try {
                byte[] decode = Base64.decode(string, 0);
                KeyFactory keyFactory = KeyFactory.getInstance("EC");
                return new KeyPair(keyFactory.generatePublic(new X509EncodedKeySpec(decode)), keyFactory.generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(string2, 0))));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                throw new KeyStoreException(e);
            }
        } catch (IllegalArgumentException | SecurityException | GeneralSecurityException e2) {
            throw new KeyStoreException(e2);
        }
    }
}
