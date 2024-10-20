package com.facebook.rsys.raisehands.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.GOm;
import X.LVi;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: RaisedHandsActionModel.class */
public class RaisedHandsActionModel {
    public static 2JQ CONVERTER = LVi.A00(55);
    public static long sMcfTypeId;
    public final int actionType;
    public final RaisedHandsE2eeStateCloneActionParams e2eeStateCloneActionParams;
    public final String id;
    public final ArrayList raisedHandsQueue;

    public RaisedHandsActionModel(String str, int i, RaisedHandsE2eeStateCloneActionParams raisedHandsE2eeStateCloneActionParams, ArrayList arrayList) {
        str.getClass();
        this.id = str;
        this.actionType = i;
        this.e2eeStateCloneActionParams = raisedHandsE2eeStateCloneActionParams;
        this.raisedHandsQueue = arrayList;
    }

    public static native RaisedHandsActionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof RaisedHandsActionModel)) {
                return false;
            }
            RaisedHandsActionModel raisedHandsActionModel = (RaisedHandsActionModel) obj;
            if (!this.id.equals(raisedHandsActionModel.id) || this.actionType != raisedHandsActionModel.actionType) {
                return false;
            }
            RaisedHandsE2eeStateCloneActionParams raisedHandsE2eeStateCloneActionParams = this.e2eeStateCloneActionParams;
            RaisedHandsE2eeStateCloneActionParams raisedHandsE2eeStateCloneActionParams2 = raisedHandsActionModel.e2eeStateCloneActionParams;
            if (raisedHandsE2eeStateCloneActionParams == null) {
                if (raisedHandsE2eeStateCloneActionParams2 != null) {
                    return false;
                }
            } else if (!raisedHandsE2eeStateCloneActionParams.equals(raisedHandsE2eeStateCloneActionParams2)) {
                return false;
            }
            ArrayList arrayList = this.raisedHandsQueue;
            ArrayList arrayList2 = raisedHandsActionModel.raisedHandsQueue;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A07(this.id) + this.actionType) * 31) + AnonymousClass001.A02(this.e2eeStateCloneActionParams)) * 31) + 4YU.A03(this.raisedHandsQueue);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RaisedHandsActionModel{id=");
        A0k.append(this.id);
        A0k.append(",actionType=");
        A0k.append(this.actionType);
        A0k.append(",e2eeStateCloneActionParams=");
        A0k.append(this.e2eeStateCloneActionParams);
        A0k.append(GOm.A00(ActionId.RTMP_PACKET_RECEIVED));
        return AbstractC2327GOs.A0U(this.raisedHandsQueue, A0k);
    }
}
