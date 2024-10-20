package X;

import java.security.Signature;
import javax.crypto.Cipher;

/* loaded from: L7a.class */
public final class L7a {
    public final Signature A00;
    public final Cipher A01;
    public final javax.crypto.Mac A02;

    public L7a(Signature signature) {
        this.A00 = signature;
        this.A01 = null;
        this.A02 = null;
    }

    public L7a(Cipher cipher) {
        this.A01 = cipher;
        this.A00 = null;
        this.A02 = null;
    }

    public L7a(javax.crypto.Mac mac) {
        this.A02 = mac;
        this.A01 = null;
        this.A00 = null;
    }
}
