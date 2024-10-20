package com.facebook.rsys.calltransfer.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: CallTransferDeviceModel.class */
public class CallTransferDeviceModel {
    public static 2JQ CONVERTER = LVi.A00(5);
    public static long sMcfTypeId;
    public final boolean canReceiveE2ee;
    public final long deviceId;
    public final int deviceType;
    public final String displayName;

    public CallTransferDeviceModel(long j, String str, int i, boolean z) {
        str.getClass();
        this.deviceId = j;
        this.displayName = str;
        this.deviceType = i;
        this.canReceiveE2ee = z;
    }

    public static native CallTransferDeviceModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof CallTransferDeviceModel)) {
                return false;
            }
            CallTransferDeviceModel callTransferDeviceModel = (CallTransferDeviceModel) obj;
            if (this.deviceId == callTransferDeviceModel.deviceId && this.displayName.equals(callTransferDeviceModel.displayName) && this.deviceType == callTransferDeviceModel.deviceType && this.canReceiveE2ee == callTransferDeviceModel.canReceiveE2ee) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A07(this.displayName, AbstractC2326GOr.A03(1BL.A01(this.deviceId))) + this.deviceType) * 31) + (this.canReceiveE2ee ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallTransferDeviceModel{deviceId=");
        A0k.append(this.deviceId);
        A0k.append(",displayName=");
        A0k.append(this.displayName);
        A0k.append(",deviceType=");
        A0k.append(this.deviceType);
        A0k.append(",canReceiveE2ee=");
        return AbstractC2327GOs.A0X(A0k, this.canReceiveE2ee);
    }
}
