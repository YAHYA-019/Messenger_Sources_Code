package com.facebook.rsys.grid.gen;

import X.1BK;
import X.1BL;
import X.2JQ;
import X.7zN;
import X.7zP;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* loaded from: GridModel.class */
public class GridModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.VIEW_WILL_APPEAR_BEGIN);
    public static long sMcfTypeId;
    public final HashSet explicitlyPinnedPeerIds;
    public final String gridDominantSpeakerId;
    public final Map groups;
    public final String newParticipantsDefaultGridGroupId;
    public final ArrayList operationalRaisedHandsQueueUserIds;
    public final GridOrderingParameters orderingParameters;
    public final Map participantsToGroup;
    public final ArrayList peerIdsOrdered;
    public final ArrayList recencyQueue;

    public GridModel(ArrayList arrayList, HashSet hashSet, GridOrderingParameters gridOrderingParameters, ArrayList arrayList2, Map map, Map map2, String str, String str2, ArrayList arrayList3) {
        7zP.A1S(arrayList, hashSet, gridOrderingParameters);
        7zP.A1S(arrayList2, map, map2);
        arrayList3.getClass();
        this.peerIdsOrdered = arrayList;
        this.explicitlyPinnedPeerIds = hashSet;
        this.orderingParameters = gridOrderingParameters;
        this.recencyQueue = arrayList2;
        this.groups = map;
        this.participantsToGroup = map2;
        this.newParticipantsDefaultGridGroupId = str;
        this.gridDominantSpeakerId = str2;
        this.operationalRaisedHandsQueueUserIds = arrayList3;
    }

    public static native GridModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof GridModel)) {
                return false;
            }
            GridModel gridModel = (GridModel) obj;
            if (!this.peerIdsOrdered.equals(gridModel.peerIdsOrdered) || !this.explicitlyPinnedPeerIds.equals(gridModel.explicitlyPinnedPeerIds) || !this.orderingParameters.equals(gridModel.orderingParameters) || !this.recencyQueue.equals(gridModel.recencyQueue) || !this.groups.equals(gridModel.groups) || !this.participantsToGroup.equals(gridModel.participantsToGroup)) {
                return false;
            }
            String str = this.newParticipantsDefaultGridGroupId;
            String str2 = gridModel.newParticipantsDefaultGridGroupId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.gridDominantSpeakerId;
            String str4 = gridModel.gridDominantSpeakerId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (!this.operationalRaisedHandsQueueUserIds.equals(gridModel.operationalRaisedHandsQueueUserIds)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.operationalRaisedHandsQueueUserIds, (((((((AnonymousClass002.A05(this.recencyQueue, AnonymousClass002.A05(this.orderingParameters, AnonymousClass002.A05(this.explicitlyPinnedPeerIds, AbstractC2327GOs.A08(this.peerIdsOrdered)))) + this.groups.hashCode()) * 31) + this.participantsToGroup.hashCode()) * 31) + 1BL.A05(this.newParticipantsDefaultGridGroupId)) * 31) + 7zN.A05(this.gridDominantSpeakerId)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GridModel{peerIdsOrdered=");
        A0k.append(this.peerIdsOrdered);
        A0k.append(",explicitlyPinnedPeerIds=");
        A0k.append(this.explicitlyPinnedPeerIds);
        A0k.append(",orderingParameters=");
        A0k.append(this.orderingParameters);
        A0k.append(",recencyQueue=");
        A0k.append(this.recencyQueue);
        A0k.append(",groups=");
        A0k.append(this.groups);
        A0k.append(",participantsToGroup=");
        A0k.append(this.participantsToGroup);
        A0k.append(",newParticipantsDefaultGridGroupId=");
        A0k.append(this.newParticipantsDefaultGridGroupId);
        A0k.append(",gridDominantSpeakerId=");
        A0k.append(this.gridDominantSpeakerId);
        A0k.append(",operationalRaisedHandsQueueUserIds=");
        return AbstractC2327GOs.A0U(this.operationalRaisedHandsQueueUserIds, A0k);
    }
}
