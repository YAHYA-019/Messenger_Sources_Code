package com.facebook.rsys.call.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.7zP;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;

/* loaded from: CallParticipant.class */
public class CallParticipant {
    public static 2JQ CONVERTER = IR0.A00(26);
    public static long sMcfTypeId;
    public final String aliasId;
    public final boolean isCaller;
    public final ParticipantMediaState mediaState;
    public final String representativeId;
    public final Long sctpNodeId;
    public final int state;
    public final String userId;
    public final UserProfile userProfile;
    public final String username;

    public CallParticipant(String str, String str2, String str3, String str4, UserProfile userProfile, boolean z, ParticipantMediaState participantMediaState, int i, Long l) {
        7zP.A1S(str, userProfile, participantMediaState);
        this.userId = str;
        this.representativeId = str2;
        this.aliasId = str3;
        this.username = str4;
        this.userProfile = userProfile;
        this.isCaller = z;
        this.mediaState = participantMediaState;
        this.state = i;
        this.sctpNodeId = l;
    }

    public static native CallParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CallParticipant)) {
                return false;
            }
            CallParticipant callParticipant = (CallParticipant) obj;
            if (!this.userId.equals(callParticipant.userId)) {
                return false;
            }
            String str = this.representativeId;
            String str2 = callParticipant.representativeId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.aliasId;
            String str4 = callParticipant.aliasId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.username;
            String str6 = callParticipant.username;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.userProfile.equals(callParticipant.userProfile) || this.isCaller != callParticipant.isCaller || !this.mediaState.equals(callParticipant.mediaState) || this.state != callParticipant.state) {
                return false;
            }
            Long l = this.sctpNodeId;
            Long l2 = callParticipant.sctpNodeId;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.mediaState, (AnonymousClass002.A05(this.userProfile, (((((AbstractC2326GOr.A07(this.userId) + 1BL.A05(this.representativeId)) * 31) + 1BL.A05(this.aliasId)) * 31) + 1BL.A05(this.username)) * 31) + (this.isCaller ? 1 : 0)) * 31) + this.state) * 31) + 4YU.A03(this.sctpNodeId);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CallParticipant{userId=");
        A0k.append(this.userId);
        A0k.append(",representativeId=");
        A0k.append(this.representativeId);
        A0k.append(",aliasId=");
        A0k.append(this.aliasId);
        A0k.append(",username=");
        A0k.append(this.username);
        A0k.append(",userProfile=");
        A0k.append(this.userProfile);
        A0k.append(",isCaller=");
        A0k.append(this.isCaller);
        A0k.append(",mediaState=");
        A0k.append(this.mediaState);
        A0k.append(",state=");
        A0k.append(this.state);
        A0k.append(",sctpNodeId=");
        return AbstractC2327GOs.A0U(this.sctpNodeId, A0k);
    }
}
