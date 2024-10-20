package com.facebook.rsys.polls.gen;

import X.0Pz;
import X.2JQ;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PollsRemoveVoteActionParams.class */
public class PollsRemoveVoteActionParams {
    public static 2JQ CONVERTER = LVi.A00(53);
    public static long sMcfTypeId;
    public final String pollOptionId;

    public PollsRemoveVoteActionParams(String str) {
        str.getClass();
        this.pollOptionId = str;
    }

    public static native PollsRemoveVoteActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollsRemoveVoteActionParams) {
            return this.pollOptionId.equals(((PollsRemoveVoteActionParams) obj).pollOptionId);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.pollOptionId.hashCode();
    }

    public String toString() {
        return 0Pz.A0j("PollsRemoveVoteActionParams{pollOptionId=", this.pollOptionId, "}");
    }
}
