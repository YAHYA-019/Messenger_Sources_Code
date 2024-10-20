package X;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: Lfy.class */
public final class Lfy implements MGW {
    public static final KMC A03 = KMC.A00;
    public byte[] A00;
    public byte[] A01;
    public final SecretKey A02;

    public Lfy(byte[] bArr) {
        L71.A01(bArr.length);
        this.A02 = new SecretKeySpec(bArr, "AES");
        if (!A03.A00()) {
            throw JQx.A10("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) Kza.A01.A00.ArR("AES/ECB/NoPadding");
        cipher.init(1, this.A02);
        byte[] A00 = KYd.A00(cipher.doFinal(new byte[16]));
        this.A00 = A00;
        this.A01 = KYd.A00(A00);
    }

    @Override // X.MGW
    public byte[] AH8(byte[] bArr, int i) {
        byte[] A01;
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!A03.A00()) {
            throw JQx.A10("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) Kza.A01.A00.ArR("AES/ECB/NoPadding");
        cipher.init(1, this.A02);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        int i2 = max * 16;
        int i3 = max - 1;
        int i4 = i3 * 16;
        if (i2 == length) {
            A01 = L9R.A02(bArr, this.A00, i4, 0, 16);
        } else {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, i4, length);
            int length2 = copyOfRange.length;
            if (length2 >= 16) {
                throw AnonymousClass001.A0L("x must be smaller than a block.");
            }
            byte[] copyOf = Arrays.copyOf(copyOfRange, 16);
            copyOf[length2] = Byte.MIN_VALUE;
            A01 = L9R.A01(copyOf, this.A01);
        }
        byte[] bArr2 = new byte[16];
        for (int i5 = 0; i5 < i3; i5++) {
            bArr2 = cipher.doFinal(L9R.A02(bArr2, bArr, 0, i5 * 16, 16));
        }
        return Arrays.copyOf(cipher.doFinal(L9R.A01(A01, bArr2)), i);
    }
}
