package X;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* loaded from: Ebz.class */
public final class Ebz {
    public SecretKey A00;

    public Ebz() {
        SecretKey generateKey = KeyGenerator.getInstance("AES").generateKey();
        11T.A0A(generateKey);
        this.A00 = generateKey;
    }
}
