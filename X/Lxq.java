package X;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: Lxq.class */
public final class Lxq extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public /* bridge */ /* synthetic */ Object initialValue() {
        try {
            Cipher cipher = (Cipher) Kza.A01.A00.ArR("ChaCha20-Poly1305");
            ThreadLocal threadLocal = LfW.A02;
            boolean z = false;
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(LfW.A05);
                byte[] bArr = LfW.A04;
                cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                byte[] bArr2 = LfW.A03;
                if (cipher.doFinal(bArr2).length == 0) {
                    cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
                    if (cipher.doFinal(bArr2).length == 0) {
                        z = true;
                    }
                }
            } catch (GeneralSecurityException unused) {
            }
            if (z) {
                return cipher;
            }
            return null;
        } catch (GeneralSecurityException unused2) {
            return null;
        }
    }
}
