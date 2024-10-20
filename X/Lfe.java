package X;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: Lfe.class */
public final class Lfe implements MJ0 {
    public static final KMC A03 = KMC.A00;
    public static final Collection A04 = Arrays.asList(64);
    public static final byte[] A05 = new byte[16];
    public final Lfy A00;
    public final byte[] A01;
    public final byte[] A02;

    public Lfe(L4o l4o, byte[] bArr) {
        if (!A03.A00()) {
            throw JQx.A10("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = A04;
        int length = bArr.length;
        if (!collection.contains(Integer.valueOf(length))) {
            throw new InvalidKeyException(0Pz.A0d("invalid key size: ", " bytes; key must have 64 bytes", length));
        }
        int i = length / 2;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.A01 = Arrays.copyOfRange(bArr, i, length);
        this.A00 = new Lfy(copyOfRange);
        this.A02 = l4o.A01();
    }

    private byte[] A00(byte[]... bArr) {
        byte[] A01;
        Lfy lfy = this.A00;
        byte[] AH8 = lfy.AH8(A05, 16);
        byte[] bArr2 = bArr[0];
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] A012 = L9R.A01(KYd.A00(AH8), lfy.AH8(bArr2, 16));
        byte[] bArr3 = bArr[1];
        int length = bArr3.length;
        if (length >= 16) {
            int length2 = A012.length;
            if (length < length2) {
                throw AnonymousClass001.A0L("xorEnd requires a.length >= b.length");
            }
            int i = length - length2;
            A01 = Arrays.copyOf(bArr3, length);
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= length2) {
                    break;
                }
                int i4 = i + i3;
                A01[i4] = (byte) (A01[i4] ^ A012[i3]);
                i2 = i3 + 1;
            }
        } else {
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[length] = Byte.MIN_VALUE;
            A01 = L9R.A01(copyOf, KYd.A00(A012));
        }
        return lfy.AH8(A01, 16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [byte[], byte[][]] */
    @Override // X.MJ0
    public byte[] AMP(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = this.A02;
        int length2 = bArr3.length;
        int i = length2 + 16;
        if (length < i) {
            throw JQx.A10("Ciphertext too short.");
        }
        if (!L9b.A02(bArr3, bArr)) {
            throw JQx.A10("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = (Cipher) Kza.A01.A00.ArR("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, length2, i);
        byte[] bArr4 = (byte[]) copyOfRange.clone();
        bArr4[8] = (byte) (bArr4[8] & Byte.MAX_VALUE);
        bArr4[12] = (byte) (bArr4[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.A01, "AES"), new IvParameterSpec(bArr4));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, i, length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            doFinal = new byte[0];
        }
        if (MessageDigest.isEqual(copyOfRange, A00(new byte[]{bArr2, doFinal}))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [byte[], byte[][]] */
    /* JADX WARN: Type inference failed for: r0v41, types: [byte[], byte[][]] */
    @Override // X.MJ0
    public byte[] AQ2(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            throw JQx.A10("plaintext too long");
        }
        Cipher cipher = (Cipher) Kza.A01.A00.ArR("AES/CTR/NoPadding");
        byte[] A00 = A00(new byte[]{bArr2, bArr});
        byte[] bArr3 = (byte[]) A00.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.A01, "AES"), new IvParameterSpec(bArr3));
        return L9R.A03((byte[][]) new byte[]{this.A02, A00, cipher.doFinal(bArr)});
    }
}
