package com.facebook.rsys.polls.gen;

import X.0Pz;
import X.1BL;
import X.2JQ;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: PollParticipantModel.class */
public class PollParticipantModel {
    public static 2JQ CONVERTER = LVi.A00(45);
    public static long sMcfTypeId;
    public final String fbid;

    public PollParticipantModel(String str) {
        this.fbid = str;
    }

    public static native PollParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof PollParticipantModel)) {
                return false;
            }
            String str = this.fbid;
            String str2 = ((PollParticipantModel) obj).fbid;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 527 + 1BL.A05(this.fbid);
    }

    public String toString() {
        return 0Pz.A0j("PollParticipantModel{fbid=", this.fbid, "}");
    }
}
