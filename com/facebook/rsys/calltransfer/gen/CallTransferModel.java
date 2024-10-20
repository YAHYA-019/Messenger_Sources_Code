package com.facebook.rsys.calltransfer.gen;

import X.1BJ;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CallTransferModel.class */
public class CallTransferModel {
    public static 2JQ CONVERTER = LVi.A00(6);
    public static long sMcfTypeId;
    public final ArrayList allDevices;
    public final ArrayList availableDevices;
    public final boolean canStartCallTransfer;
    public final boolean isE2eeMandated;
    public final int lastCancelReason;
    public final CallTransferDeviceModel transferDestination;
    public final int transferState;

    public CallTransferModel(ArrayList arrayList, ArrayList arrayList2, int i, CallTransferDeviceModel callTransferDeviceModel, int i2, boolean z, boolean z2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.availableDevices = arrayList;
        this.allDevices = arrayList2;
        this.transferState = i;
        this.transferDestination = callTransferDeviceModel;
        this.lastCancelReason = i2;
        this.canStartCallTransfer = z;
        this.isE2eeMandated = z2;
    }

    public static native CallTransferModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallTransferModel)) {
                return false;
            }
            CallTransferModel callTransferModel = (CallTransferModel) obj;
            if (!this.availableDevices.equals(callTransferModel.availableDevices) || !this.allDevices.equals(callTransferModel.allDevices) || this.transferState != callTransferModel.transferState) {
                return false;
            }
            CallTransferDeviceModel callTransferDeviceModel = this.transferDestination;
            CallTransferDeviceModel callTransferDeviceModel2 = callTransferModel.transferDestination;
            if (callTransferDeviceModel == null) {
                if (callTransferDeviceModel2 != null) {
                    return false;
                }
            } else if (!callTransferDeviceModel.equals(callTransferDeviceModel2)) {
                return false;
            }
            if (this.lastCancelReason != callTransferModel.lastCancelReason || this.canStartCallTransfer != callTransferModel.canStartCallTransfer || this.isE2eeMandated != callTransferModel.isE2eeMandated) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AnonymousClass002.A05(this.allDevices, AbstractC2327GOs.A08(this.availableDevices)) + this.transferState) * 31) + AnonymousClass001.A02(this.transferDestination)) * 31) + this.lastCancelReason) * 31) + (this.canStartCallTransfer ? 1 : 0)) * 31) + (this.isE2eeMandated ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallTransferModel{availableDevices=");
        A0k.append(this.availableDevices);
        A0k.append(",allDevices=");
        A0k.append(this.allDevices);
        A0k.append(1BJ.A00(620));
        A0k.append(this.transferState);
        A0k.append(",transferDestination=");
        A0k.append(this.transferDestination);
        A0k.append(",lastCancelReason=");
        A0k.append(this.lastCancelReason);
        A0k.append(",canStartCallTransfer=");
        A0k.append(this.canStartCallTransfer);
        A0k.append(",isE2eeMandated=");
        return AbstractC2327GOs.A0X(A0k, this.isE2eeMandated);
    }
}
