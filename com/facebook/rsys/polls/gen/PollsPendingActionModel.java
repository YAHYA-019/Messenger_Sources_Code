package com.facebook.rsys.polls.gen;

import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PollsPendingActionModel.class */
public class PollsPendingActionModel {
    public static 2JQ CONVERTER = LVi.A00(51);
    public static long sMcfTypeId;
    public final String actionId;
    public final int actionType;
    public final PollsCreateActionParams createActionParams;
    public final PollsRemoveActionParams removeActionParams;
    public final PollsRemoveVoteActionParams removeVoteActionParams;
    public final PollsVoteActionParams voteActionParams;

    public PollsPendingActionModel(String str, int i, PollsCreateActionParams pollsCreateActionParams, PollsRemoveActionParams pollsRemoveActionParams, PollsVoteActionParams pollsVoteActionParams, PollsRemoveVoteActionParams pollsRemoveVoteActionParams) {
        str.getClass();
        this.actionId = str;
        this.actionType = i;
        this.createActionParams = pollsCreateActionParams;
        this.removeActionParams = pollsRemoveActionParams;
        this.voteActionParams = pollsVoteActionParams;
        this.removeVoteActionParams = pollsRemoveVoteActionParams;
    }

    public static native PollsPendingActionModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollsPendingActionModel)) {
                return false;
            }
            PollsPendingActionModel pollsPendingActionModel = (PollsPendingActionModel) obj;
            if (!this.actionId.equals(pollsPendingActionModel.actionId) || this.actionType != pollsPendingActionModel.actionType) {
                return false;
            }
            PollsCreateActionParams pollsCreateActionParams = this.createActionParams;
            PollsCreateActionParams pollsCreateActionParams2 = pollsPendingActionModel.createActionParams;
            if (pollsCreateActionParams == null) {
                if (pollsCreateActionParams2 != null) {
                    return false;
                }
            } else if (!pollsCreateActionParams.equals(pollsCreateActionParams2)) {
                return false;
            }
            PollsRemoveActionParams pollsRemoveActionParams = this.removeActionParams;
            PollsRemoveActionParams pollsRemoveActionParams2 = pollsPendingActionModel.removeActionParams;
            if (pollsRemoveActionParams == null) {
                if (pollsRemoveActionParams2 != null) {
                    return false;
                }
            } else if (!pollsRemoveActionParams.equals(pollsRemoveActionParams2)) {
                return false;
            }
            PollsVoteActionParams pollsVoteActionParams = this.voteActionParams;
            PollsVoteActionParams pollsVoteActionParams2 = pollsPendingActionModel.voteActionParams;
            if (pollsVoteActionParams == null) {
                if (pollsVoteActionParams2 != null) {
                    return false;
                }
            } else if (!pollsVoteActionParams.equals(pollsVoteActionParams2)) {
                return false;
            }
            PollsRemoveVoteActionParams pollsRemoveVoteActionParams = this.removeVoteActionParams;
            PollsRemoveVoteActionParams pollsRemoveVoteActionParams2 = pollsPendingActionModel.removeVoteActionParams;
            if (pollsRemoveVoteActionParams == null) {
                if (pollsRemoveVoteActionParams2 != null) {
                    return false;
                }
            } else if (!pollsRemoveVoteActionParams.equals(pollsRemoveVoteActionParams2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((AbstractC2326GOr.A07(this.actionId) + this.actionType) * 31) + AnonymousClass001.A02(this.createActionParams)) * 31) + AnonymousClass001.A02(this.removeActionParams)) * 31) + AnonymousClass001.A02(this.voteActionParams)) * 31) + 4YU.A03(this.removeVoteActionParams);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("PollsPendingActionModel{actionId=");
        A0k.append(this.actionId);
        A0k.append(",actionType=");
        A0k.append(this.actionType);
        A0k.append(",createActionParams=");
        A0k.append(this.createActionParams);
        A0k.append(",removeActionParams=");
        A0k.append(this.removeActionParams);
        A0k.append(",voteActionParams=");
        A0k.append(this.voteActionParams);
        A0k.append(",removeVoteActionParams=");
        return AbstractC2327GOs.A0U(this.removeVoteActionParams, A0k);
    }
}
