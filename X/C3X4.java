package X;

import com.facebook.crypto.keychain.KeyChain;
import com.facebook.crypto.keychain.UserStorageKeyChainV2;

/* renamed from: X.3X4, reason: invalid class name */
/* loaded from: 3X4.class */
public final class C3X4 implements KeyChain {
    public final /* synthetic */ UserStorageKeyChainV2 A00;
    public final /* synthetic */ byte[] A01;

    public C3X4(UserStorageKeyChainV2 userStorageKeyChainV2, byte[] bArr) {
        this.A00 = userStorageKeyChainV2;
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
        boolean z = UserStorageKeyChainV2.A0B;
        byte[] bArr = new byte[12];
        this.A00.A0A.nextBytes(bArr);
        return bArr;
    }
}
