package com.facebook.messenger.securemessage.utils;

import X.0S2;
import X.0fH;
import X.5Xg;
import X.C1UI;
import com.facebook.crypto.module.SecureMessageDEKConfigureSetter;

/* loaded from: SecureMessageMasterKeyManager.class */
public class SecureMessageMasterKeyManager {
    public static boolean isNewMasterKeyGenerated;
    public static byte[] mDecryptedMasterKey;

    public static byte[] copyDecryptedMasterKeyStatic(long j) {
        byte[] bArr;
        synchronized (SecureMessageMasterKeyManager.class) {
            try {
                bArr = tryCopyDecryptedMasterKey(j);
            } catch (SecureMessageKeysSharedPrefs$DEKNotAvailableException unused) {
                bArr = new byte[0];
            }
        }
        return bArr;
    }

    public static byte[] tryCopyDecryptedMasterKey(long j) {
        byte[] bArr;
        byte[] bArr2;
        synchronized (SecureMessageMasterKeyManager.class) {
            bArr = mDecryptedMasterKey;
            if (bArr == null) {
                synchronized (SecureMessageDEKConfigureSetter.class) {
                    try {
                        bArr2 = SecureMessageDEKConfigureSetter.A01;
                        if (bArr2 == null) {
                            bArr2 = new byte[0];
                        }
                    } catch (Throwable th) {
                        th = th;
                    }
                }
                if (bArr2.length == 0) {
                    C1UI.A00("SecureMessageMasterKeyManager", 0S2.A00, "Cannot get DEK");
                    new RuntimeException("Cannot get DEK");
                    throw th;
                }
                String l = Long.toString(j);
                byte[] A06 = 5Xg.A06(l, "masterKey");
                if (A06 != null) {
                    byte[] createCbcHmacDecryptedDataHandler = CryptoProviderHelper.createCbcHmacDecryptedDataHandler(A06, bArr2);
                    mDecryptedMasterKey = createCbcHmacDecryptedDataHandler;
                    if (createCbcHmacDecryptedDataHandler != null && createCbcHmacDecryptedDataHandler.length == 32) {
                        0fH.A0l("SecureMessageMasterKeyManager", "Decrypt master key success");
                        bArr = mDecryptedMasterKey;
                    }
                }
                isNewMasterKeyGenerated = true;
                byte[] bArr3 = new byte[32];
                CryptoProviderHelper.generateRandomBytes(bArr3);
                mDecryptedMasterKey = bArr3;
                byte[] createCbcHmacEncryptedDataHandler = CryptoProviderHelper.createCbcHmacEncryptedDataHandler(bArr3, bArr2);
                if (createCbcHmacEncryptedDataHandler != null) {
                    5Xg.A04(l, "masterKey", createCbcHmacEncryptedDataHandler);
                } else {
                    0fH.A0n("SecureMessageMasterKeyManager", "skip writing null master key into sharedPrefs");
                    C1UI.A00("SecureMessageMasterKeyManager", 0S2.A01, "skip writing null master key into sharedPrefs");
                }
                0fH.A0l("SecureMessageMasterKeyManager", "No valid encryptedMasterKey, generating a new one");
                C1UI.A00("SecureMessageMasterKeyManager", 0S2.A0C, "No valid encryptedMasterKey, generating a new one");
                bArr = mDecryptedMasterKey;
            }
        }
        return bArr;
    }
}
