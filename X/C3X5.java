package X;

import com.facebook.crypto.keychain.KeyChain;
import java.security.SecureRandom;

/* renamed from: X.3X5, reason: invalid class name */
/* loaded from: 3X5.class */
public final class C3X5 implements KeyChain {
    public final SecureRandom A00;
    public final byte[] A01;

    public C3X5(SecureRandom secureRandom, byte[] bArr) {
        this.A00 = secureRandom;
        this.A01 = bArr;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getCipherKey() {
        return this.A01;
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getMacKey() {
        throw AnonymousClass001.A0p();
    }

    @Override // com.facebook.crypto.keychain.KeyChain
    public byte[] getNewIV() {
        byte[] bArr = new byte[12];
        this.A00.nextBytes(bArr);
        return bArr;
    }
}
