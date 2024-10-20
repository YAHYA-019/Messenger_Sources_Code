package X;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: Lxs.class */
public final class Lxs extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        try {
            Cipher cipher = (Cipher) Kza.A01.A00.ArR("AES/GCM-SIV/NoPadding");
            boolean z = false;
            try {
                byte[] bArr = LfX.A05;
                cipher.init(2, new SecretKeySpec(LfX.A04, "AES"), new GCMParameterSpec(128, bArr, 0, bArr.length));
                cipher.updateAAD(LfX.A03);
                byte[] bArr2 = LfX.A07;
                z = MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), LfX.A06);
            } catch (GeneralSecurityException unused) {
            }
            if (!z) {
                cipher = null;
            }
            return cipher;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
