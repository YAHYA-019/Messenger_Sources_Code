package com.facebook.rsys.moderator.gen;

import X.1BK;
import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: ModeratorModel.class */
public class ModeratorModel {
    public static 2JQ CONVERTER = IR0.A00(ActionId.APP_FIRST_VIEW_CONTROLLER);
    public static long sMcfTypeId;
    public final boolean allowsJoinRequestApproval;
    public final boolean allowsKickAndEndCall;
    public final boolean allowsRemoveUser;
    public final boolean allowsScreenShare;
    public final String allowsScreenShareActorId;
    public final ArrayList callModeratorsUuids;
    public final boolean desiredAllowsScreenShare;
    public final ArrayList softMutableUsers;

    public ModeratorModel(boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.allowsScreenShare = z;
        this.allowsScreenShareActorId = str;
        this.desiredAllowsScreenShare = z2;
        this.allowsJoinRequestApproval = z3;
        this.allowsKickAndEndCall = z4;
        this.allowsRemoveUser = z5;
        this.callModeratorsUuids = arrayList;
        this.softMutableUsers = arrayList2;
    }

    public static native ModeratorModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ModeratorModel)) {
                return false;
            }
            ModeratorModel moderatorModel = (ModeratorModel) obj;
            if (this.allowsScreenShare != moderatorModel.allowsScreenShare) {
                return false;
            }
            String str = this.allowsScreenShareActorId;
            String str2 = moderatorModel.allowsScreenShareActorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.desiredAllowsScreenShare != moderatorModel.desiredAllowsScreenShare || this.allowsJoinRequestApproval != moderatorModel.allowsJoinRequestApproval || this.allowsKickAndEndCall != moderatorModel.allowsKickAndEndCall || this.allowsRemoveUser != moderatorModel.allowsRemoveUser || !this.callModeratorsUuids.equals(moderatorModel.callModeratorsUuids) || !this.softMutableUsers.equals(moderatorModel.softMutableUsers)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.softMutableUsers, AnonymousClass002.A05(this.callModeratorsUuids, (((((((((AbstractC2326GOr.A03(this.allowsScreenShare ? 1 : 0) + 1BL.A05(this.allowsScreenShareActorId)) * 31) + (this.desiredAllowsScreenShare ? 1 : 0)) * 31) + (this.allowsJoinRequestApproval ? 1 : 0)) * 31) + (this.allowsKickAndEndCall ? 1 : 0)) * 31) + (this.allowsRemoveUser ? 1 : 0)) * 31));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ModeratorModel{allowsScreenShare=");
        A0k.append(this.allowsScreenShare);
        A0k.append(",allowsScreenShareActorId=");
        A0k.append(this.allowsScreenShareActorId);
        A0k.append(",desiredAllowsScreenShare=");
        A0k.append(this.desiredAllowsScreenShare);
        A0k.append(",allowsJoinRequestApproval=");
        A0k.append(this.allowsJoinRequestApproval);
        A0k.append(",allowsKickAndEndCall=");
        A0k.append(this.allowsKickAndEndCall);
        A0k.append(",allowsRemoveUser=");
        A0k.append(this.allowsRemoveUser);
        A0k.append(",callModeratorsUuids=");
        A0k.append(this.callModeratorsUuids);
        A0k.append(",softMutableUsers=");
        return AbstractC2327GOs.A0U(this.softMutableUsers, A0k);
    }
}
