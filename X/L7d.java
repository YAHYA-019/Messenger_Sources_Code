package X;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: L7d.class */
public final class L7d {
    public static final KMC A03 = KMC.A01;
    public static final ThreadLocal A04 = new Lxu();
    public final int A00;
    public final int A01;
    public final SecretKeySpec A02;

    public L7d(byte[] bArr, int i) {
        if (!A03.A00()) {
            throw JQx.A10("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        L71.A01(bArr.length);
        this.A02 = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) A04.get()).getBlockSize();
        this.A01 = blockSize;
        if (i < 12 || i > blockSize) {
            throw JQx.A10("invalid IV size");
        }
        this.A00 = i;
    }

    public static void A00(L7d l7d, byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, boolean z) {
        Cipher cipher = (Cipher) A04.get();
        byte[] bArr4 = new byte[l7d.A01];
        System.arraycopy(bArr3, 0, bArr4, 0, l7d.A00);
        cipher.init(GOp.A02(z ? 1 : 0), l7d.A02, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw JQx.A10("stored output's length does not match input's length");
        }
    }
}
