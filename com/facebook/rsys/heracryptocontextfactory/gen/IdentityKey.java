package com.facebook.rsys.heracryptocontextfactory.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: IdentityKey.class */
public class IdentityKey {
    public static 2JQ CONVERTER = LVi.A00(16);
    public static long sMcfTypeId;
    public final PublicKeyHolder privateKey;
    public final PublicKeyHolder publicKey;

    public IdentityKey(PublicKeyHolder publicKeyHolder, PublicKeyHolder publicKeyHolder2) {
        publicKeyHolder.getClass();
        publicKeyHolder2.getClass();
        this.publicKey = publicKeyHolder;
        this.privateKey = publicKeyHolder2;
    }

    public static native IdentityKey createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof IdentityKey)) {
                return false;
            }
            IdentityKey identityKey = (IdentityKey) obj;
            if (this.publicKey.equals(identityKey.publicKey) && this.privateKey.equals(identityKey.privateKey)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.privateKey, AbstractC2327GOs.A08(this.publicKey));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("IdentityKey{publicKey=");
        A0k.append(this.publicKey);
        A0k.append(",privateKey=");
        return AbstractC2327GOs.A0U(this.privateKey, A0k);
    }
}
