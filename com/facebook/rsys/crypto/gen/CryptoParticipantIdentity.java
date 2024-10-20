package com.facebook.rsys.crypto.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: CryptoParticipantIdentity.class */
public class CryptoParticipantIdentity {
    public static 2JQ CONVERTER = IR0.A00(95);
    public static long sMcfTypeId;
    public final boolean isNewIdentityKey;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public CryptoParticipantIdentity(String str, byte[] bArr, boolean z) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
        this.isNewIdentityKey = z;
    }

    public static native CryptoParticipantIdentity createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CryptoParticipantIdentity)) {
                return false;
            }
            CryptoParticipantIdentity cryptoParticipantIdentity = (CryptoParticipantIdentity) obj;
            if (this.participantId.equals(cryptoParticipantIdentity.participantId) && Arrays.equals(this.publicIdentityKey, cryptoParticipantIdentity.publicIdentityKey) && this.isNewIdentityKey == cryptoParticipantIdentity.isNewIdentityKey) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A07(this.participantId) + Arrays.hashCode(this.publicIdentityKey)) * 31) + (this.isNewIdentityKey ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CryptoParticipantIdentity{participantId=");
        A0k.append(this.participantId);
        A0k.append(",publicIdentityKey=");
        A0k.append(this.publicIdentityKey);
        A0k.append(",isNewIdentityKey=");
        return AbstractC2327GOs.A0X(A0k, this.isNewIdentityKey);
    }
}
