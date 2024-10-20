package com.facebook.rsys.polls.gen;

import X.1BK;
import X.2JQ;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: PollsFeatureModel.class */
public class PollsFeatureModel {
    public static 2JQ CONVERTER = LVi.A00(49);
    public static long sMcfTypeId;
    public final ArrayList pendingActionsQueue;
    public final PollsFeaturePermissionsModel permissions;
    public final Map polls;

    public PollsFeatureModel(Map map, PollsFeaturePermissionsModel pollsFeaturePermissionsModel, ArrayList arrayList) {
        7zP.A1S(map, pollsFeaturePermissionsModel, arrayList);
        this.polls = map;
        this.permissions = pollsFeaturePermissionsModel;
        this.pendingActionsQueue = arrayList;
    }

    public static native PollsFeatureModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof PollsFeatureModel)) {
                return false;
            }
            PollsFeatureModel pollsFeatureModel = (PollsFeatureModel) obj;
            if (this.polls.equals(pollsFeatureModel.polls) && this.permissions.equals(pollsFeatureModel.permissions) && this.pendingActionsQueue.equals(pollsFeatureModel.pendingActionsQueue)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return 1BK.A03(this.pendingActionsQueue, AnonymousClass002.A05(this.permissions, AbstractC2326GOr.A03(this.polls.hashCode())));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PollsFeatureModel{polls=");
        A0k.append(this.polls);
        A0k.append(",permissions=");
        A0k.append(this.permissions);
        A0k.append(",pendingActionsQueue=");
        return AbstractC2327GOs.A0U(this.pendingActionsQueue, A0k);
    }
}
