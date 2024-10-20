package com.facebook.rsys.polls.gen;

import X.0Pz;
import X.2JQ;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PollsVoteActionParams.class */
public class PollsVoteActionParams {
    public static 2JQ CONVERTER = LVi.A00(54);
    public static long sMcfTypeId;
    public final String pollOptionId;

    public PollsVoteActionParams(String str) {
        str.getClass();
        this.pollOptionId = str;
    }

    public static native PollsVoteActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollsVoteActionParams) {
            return this.pollOptionId.equals(((PollsVoteActionParams) obj).pollOptionId);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.pollOptionId.hashCode();
    }

    public String toString() {
        return 0Pz.A0j("PollsVoteActionParams{pollOptionId=", this.pollOptionId, "}");
    }
}
