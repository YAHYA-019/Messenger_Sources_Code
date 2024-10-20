package com.facebook.rsys.moderator.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: ModeratorParticipantCapabilityInfo.class */
public class ModeratorParticipantCapabilityInfo {
    public static 2JQ CONVERTER = LVi.A00(35);
    public static long sMcfTypeId;
    public final boolean actionCapabilitiesAsModerator;
    public final boolean actionCapabilitiesAsParticipant;
    public final boolean isModerator;

    public ModeratorParticipantCapabilityInfo(boolean z, boolean z2, boolean z3) {
        this.isModerator = z;
        this.actionCapabilitiesAsModerator = z2;
        this.actionCapabilitiesAsParticipant = z3;
    }

    public static native ModeratorParticipantCapabilityInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof ModeratorParticipantCapabilityInfo)) {
                return false;
            }
            ModeratorParticipantCapabilityInfo moderatorParticipantCapabilityInfo = (ModeratorParticipantCapabilityInfo) obj;
            if (this.isModerator == moderatorParticipantCapabilityInfo.isModerator && this.actionCapabilitiesAsModerator == moderatorParticipantCapabilityInfo.actionCapabilitiesAsModerator && this.actionCapabilitiesAsParticipant == moderatorParticipantCapabilityInfo.actionCapabilitiesAsParticipant) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AbstractC2326GOr.A03(this.isModerator ? 1 : 0) + (this.actionCapabilitiesAsModerator ? 1 : 0)) * 31) + (this.actionCapabilitiesAsParticipant ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ModeratorParticipantCapabilityInfo{isModerator=");
        A0k.append(this.isModerator);
        A0k.append(",actionCapabilitiesAsModerator=");
        A0k.append(this.actionCapabilitiesAsModerator);
        A0k.append(",actionCapabilitiesAsParticipant=");
        return AbstractC2327GOs.A0X(A0k, this.actionCapabilitiesAsParticipant);
    }
}
