package com.facebook.rsys.crypto.gen;

import X.1BK;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CryptoE2eeModel.class */
public class CryptoE2eeModel {
    public static 2JQ CONVERTER = IR0.A00(94);
    public static long sMcfTypeId;
    public final int mode;
    public final ArrayList participantIdentities;

    public CryptoE2eeModel(int i, ArrayList arrayList) {
        arrayList.getClass();
        this.mode = i;
        this.participantIdentities = arrayList;
    }

    public static native CryptoE2eeModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CryptoE2eeModel)) {
                return false;
            }
            CryptoE2eeModel cryptoE2eeModel = (CryptoE2eeModel) obj;
            if (this.mode == cryptoE2eeModel.mode && this.participantIdentities.equals(cryptoE2eeModel.participantIdentities)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.participantIdentities, AbstractC2326GOr.A03(this.mode));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CryptoE2eeModel{mode=");
        A0k.append(this.mode);
        A0k.append(",participantIdentities=");
        return AbstractC2327GOs.A0U(this.participantIdentities, A0k);
    }
}
