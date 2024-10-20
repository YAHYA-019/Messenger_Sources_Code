package com.facebook.rsys.polls.gen;

import X.0Pz;
import X.2JQ;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PollsRemoveActionParams.class */
public class PollsRemoveActionParams {
    public static 2JQ CONVERTER = LVi.A00(52);
    public static long sMcfTypeId;
    public final String pollId;

    public PollsRemoveActionParams(String str) {
        str.getClass();
        this.pollId = str;
    }

    public static native PollsRemoveActionParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PollsRemoveActionParams) {
            return this.pollId.equals(((PollsRemoveActionParams) obj).pollId);
        }
        return false;
    }

    public int hashCode() {
        return 527 + this.pollId.hashCode();
    }

    public String toString() {
        return 0Pz.A0j("PollsRemoveActionParams{pollId=", this.pollId, "}");
    }
}
