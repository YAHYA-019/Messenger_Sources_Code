package com.facebook.rsys.raisehands.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: RaisedHandsE2eeStateCloneActionParams.class */
public class RaisedHandsE2eeStateCloneActionParams {
    public static 2JQ CONVERTER = LVi.A00(56);
    public static long sMcfTypeId;
    public final ArrayList operationalRaisedHandsQueue;

    public RaisedHandsE2eeStateCloneActionParams(ArrayList arrayList) {
        arrayList.getClass();
        this.operationalRaisedHandsQueue = arrayList;
    }

    public static native RaisedHandsE2eeStateCloneActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RaisedHandsE2eeStateCloneActionParams) {
            return this.operationalRaisedHandsQueue.equals(((RaisedHandsE2eeStateCloneActionParams) obj).operationalRaisedHandsQueue);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.operationalRaisedHandsQueue.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RaisedHandsE2eeStateCloneActionParams{operationalRaisedHandsQueue=");
        return AbstractC2327GOs.A0U(this.operationalRaisedHandsQueue, A0k);
    }
}
