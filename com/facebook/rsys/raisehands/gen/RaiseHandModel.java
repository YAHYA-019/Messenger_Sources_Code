package com.facebook.rsys.raisehands.gen;

import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: RaiseHandModel.class */
public class RaiseHandModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.FILE_SYSTEM_FAIL);
    public static long sMcfTypeId;
    public final boolean isEnabled;
    public final boolean isRaised;
    public final int lowerHandReminderState;
    public final ArrayList operationalRaisedHandsQueue;
    public final ArrayList pendingActions;
    public final ArrayList raisedHandsQueue;

    public RaiseHandModel(boolean z, boolean z2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i) {
        7zP.A1S(arrayList, arrayList2, arrayList3);
        this.isEnabled = z;
        this.isRaised = z2;
        this.raisedHandsQueue = arrayList;
        this.operationalRaisedHandsQueue = arrayList2;
        this.pendingActions = arrayList3;
        this.lowerHandReminderState = i;
    }

    public static native RaiseHandModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof RaiseHandModel)) {
                return false;
            }
            RaiseHandModel raiseHandModel = (RaiseHandModel) obj;
            if (this.isEnabled == raiseHandModel.isEnabled && this.isRaised == raiseHandModel.isRaised && this.raisedHandsQueue.equals(raiseHandModel.raisedHandsQueue) && this.operationalRaisedHandsQueue.equals(raiseHandModel.operationalRaisedHandsQueue) && this.pendingActions.equals(raiseHandModel.pendingActions) && this.lowerHandReminderState == raiseHandModel.lowerHandReminderState) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.pendingActions, AnonymousClass002.A05(this.operationalRaisedHandsQueue, AnonymousClass002.A05(this.raisedHandsQueue, (AbstractC2326GOr.A03(this.isEnabled ? 1 : 0) + (this.isRaised ? 1 : 0)) * 31))) + this.lowerHandReminderState;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RaiseHandModel{isEnabled=");
        A0k.append(this.isEnabled);
        A0k.append(",isRaised=");
        A0k.append(this.isRaised);
        A0k.append(",raisedHandsQueue=");
        A0k.append(this.raisedHandsQueue);
        A0k.append(",operationalRaisedHandsQueue=");
        A0k.append(this.operationalRaisedHandsQueue);
        A0k.append(",pendingActions=");
        A0k.append(this.pendingActions);
        A0k.append(",lowerHandReminderState=");
        return AbstractC2327GOs.A0W(A0k, this.lowerHandReminderState);
    }
}
