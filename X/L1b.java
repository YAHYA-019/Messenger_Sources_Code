package X;

import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: L1b.class */
public abstract class L1b {
    public static final KOV A01 = KOV.A02;
    public static final KOV A02 = KOV.A03;
    public final int A00;

    public L1b(int i) {
        if (i != A01.mNk && i != A02.mNk) {
            throw new Exception(0Pz.A0T("Unsupported key length: ", i));
        }
        this.A00 = i;
    }

    public byte[] A00(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length != this.A00) {
            throw new InvalidAlgorithmParameterException(0Pz.A0T("Key has invalid length: ", length));
        }
        int length2 = bArr2.length;
        KOV kov = A02;
        if (length2 != kov.mNn) {
            throw new InvalidAlgorithmParameterException(0Pz.A0T("Nonce has invalid length: ", length2));
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(kov.mNt * 8, bArr2);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, secretKeySpec, gCMParameterSpec);
        cipher.updateAAD(bArr3);
        return cipher.doFinal(bArr4);
    }
}
