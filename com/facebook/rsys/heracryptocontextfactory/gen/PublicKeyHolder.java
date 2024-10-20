package com.facebook.rsys.heracryptocontextfactory.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: PublicKeyHolder.class */
public class PublicKeyHolder {
    public static 2JQ CONVERTER = LVi.A00(17);
    public static long sMcfTypeId;
    public final byte[] data;
    public final long size;

    public PublicKeyHolder(byte[] bArr, long j) {
        bArr.getClass();
        this.data = bArr;
        this.size = j;
    }

    public static native PublicKeyHolder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PublicKeyHolder)) {
                return false;
            }
            PublicKeyHolder publicKeyHolder = (PublicKeyHolder) obj;
            if (Arrays.equals(this.data, publicKeyHolder.data) && this.size == publicKeyHolder.size) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(Arrays.hashCode(this.data)) + 1BL.A01(this.size);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PublicKeyHolder{data=");
        A0k.append(this.data);
        A0k.append(",size=");
        A0k.append(this.size);
        return 1BL.A0v(A0k);
    }
}
