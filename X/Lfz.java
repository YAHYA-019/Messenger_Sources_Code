package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* loaded from: Lfz.class */
public final class Lfz implements MGW {
    public static final KMC A04 = KMC.A01;
    public final String A00;
    public final java.security.Key A01;
    public final int A02;
    public final ThreadLocal A03;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public Lfz(String str, java.security.Key key) {
        int i;
        Lxx lxx = new Lxx(this);
        this.A03 = lxx;
        if (!A04.A00()) {
            throw JQx.A10("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.A00 = str;
        this.A01 = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i = 20;
                    break;
                }
                throw new NoSuchAlgorithmException(0Pz.A0W("unknown Hmac algorithm: ", str));
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i = 28;
                    break;
                }
                throw new NoSuchAlgorithmException(0Pz.A0W("unknown Hmac algorithm: ", str));
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i = 32;
                    break;
                }
                throw new NoSuchAlgorithmException(0Pz.A0W("unknown Hmac algorithm: ", str));
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i = 48;
                    break;
                }
                throw new NoSuchAlgorithmException(0Pz.A0W("unknown Hmac algorithm: ", str));
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i = 64;
                    break;
                }
                throw new NoSuchAlgorithmException(0Pz.A0W("unknown Hmac algorithm: ", str));
            default:
                throw new NoSuchAlgorithmException(0Pz.A0W("unknown Hmac algorithm: ", str));
        }
        this.A02 = i;
        lxx.get();
    }

    @Override // X.MGW
    public byte[] AH8(byte[] bArr, int i) {
        if (i > this.A02) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.A03;
        ((javax.crypto.Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((javax.crypto.Mac) threadLocal.get()).doFinal(), i);
    }
}
