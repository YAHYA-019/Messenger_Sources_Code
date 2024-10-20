package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: Lfa.class */
public final class Lfa implements MIz {
    public static final KMC A02 = KMC.A00;
    public final byte[] A00;
    public final byte[] A01;

    public Lfa(byte[] bArr, byte[] bArr2) {
        if (!A02.A00()) {
            throw JQx.A10("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (LfW.A02.get() == null) {
            throw JQx.A10("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public static SecretKeySpec A00(Lfa lfa, byte[] bArr) {
        int[] A04 = LCf.A04(LCf.A03(lfa.A00), LCf.A03(bArr));
        ByteBuffer order = ByteBuffer.allocate(A04.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(A04);
        return new SecretKeySpec(order.array(), "ChaCha20");
    }

    @Override // X.MIz
    public byte[] AMO(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw AnonymousClass001.A0Q("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.A01;
        int length2 = bArr3.length;
        int i = length2 + 24;
        if (length < i + 16) {
            throw JQx.A10("ciphertext too short");
        }
        if (!L9b.A02(bArr3, bArr)) {
            throw JQx.A10("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] A1a = JQx.A1a(bArr, 24, length2);
        SecretKeySpec A00 = A00(this, A1a);
        byte[] bArr4 = new byte[12];
        System.arraycopy(A1a, 16, bArr4, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) LfW.A02.get();
        JQy.A1W(A00, ivParameterSpec, cipher, bArr2, 2);
        return cipher.doFinal(bArr, i, (length - length2) - 24);
    }

    @Override // X.MIz
    public byte[] AQ1(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw AnonymousClass001.A0Q("plaintext is null");
        }
        byte[] A00 = Kxq.A00(24);
        SecretKeySpec A002 = A00(this, A00);
        byte[] bArr3 = new byte[12];
        System.arraycopy(A00, 16, bArr3, 4, 8);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher cipher = (Cipher) LfW.A02.get();
        JQy.A1W(A002, ivParameterSpec, cipher, bArr2, 1);
        int length = bArr.length;
        int outputSize = cipher.getOutputSize(length);
        byte[] bArr4 = this.A01;
        int length2 = bArr4.length;
        if (outputSize > (((-1) >>> 1) - length2) - 24) {
            throw JQx.A10("plaintext too long");
        }
        int i = length2 + 24;
        byte[] copyOf = Arrays.copyOf(bArr4, i + outputSize);
        System.arraycopy(A00, 0, copyOf, length2, 24);
        if (cipher.doFinal(bArr, 0, length, copyOf, i) == outputSize) {
            return copyOf;
        }
        throw JQx.A10("not enough data written");
    }
}
