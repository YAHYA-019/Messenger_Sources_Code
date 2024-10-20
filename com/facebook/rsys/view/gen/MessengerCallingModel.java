package com.facebook.rsys.view.gen;

import X.0Pz;
import X.2JQ;
import X.AbstractC2326GOr;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: MessengerCallingModel.class */
public class MessengerCallingModel {
    public static 2JQ CONVERTER = new IQz(22);
    public static long sMcfTypeId;
    public final boolean isInVideoCall;
    public final boolean isLinkBasedCall;

    public MessengerCallingModel(boolean z, boolean z2) {
        this.isInVideoCall = z;
        this.isLinkBasedCall = z2;
    }

    public static native MessengerCallingModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof MessengerCallingModel)) {
                return false;
            }
            MessengerCallingModel messengerCallingModel = (MessengerCallingModel) obj;
            if (this.isInVideoCall == messengerCallingModel.isInVideoCall && this.isLinkBasedCall == messengerCallingModel.isLinkBasedCall) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.isInVideoCall ? 1 : 0) + (this.isLinkBasedCall ? 1 : 0);
    }

    public String toString() {
        return 0Pz.A18("MessengerCallingModel{isInVideoCall=", ",isLinkBasedCall=", "}", this.isInVideoCall, this.isLinkBasedCall);
    }
}
