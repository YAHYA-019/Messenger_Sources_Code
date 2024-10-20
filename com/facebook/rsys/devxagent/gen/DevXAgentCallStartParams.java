package com.facebook.rsys.devxagent.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: DevXAgentCallStartParams.class */
public class DevXAgentCallStartParams {
    public static 2JQ CONVERTER = LVi.A00(12);
    public static long sMcfTypeId;
    public final String actorId;
    public final String agentCallId;
    public final boolean creatorAiCall;
    public final String doorId;
    public final boolean isVideo;
    public final boolean mandateE2ee;
    public final boolean metaAiCall;
    public final ArrayList peersToRing;
    public final String roomUrl;
    public final String threadId;
    public final String userid;

    public DevXAgentCallStartParams(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, String str6, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        this.agentCallId = str;
        this.userid = str2;
        this.roomUrl = str3;
        this.doorId = str4;
        this.threadId = str5;
        this.peersToRing = arrayList;
        this.actorId = str6;
        this.isVideo = z;
        this.mandateE2ee = z2;
        this.metaAiCall = z3;
        this.creatorAiCall = z4;
    }

    public static native DevXAgentCallStartParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof DevXAgentCallStartParams)) {
                return false;
            }
            DevXAgentCallStartParams devXAgentCallStartParams = (DevXAgentCallStartParams) obj;
            if (!this.agentCallId.equals(devXAgentCallStartParams.agentCallId)) {
                return false;
            }
            String str = this.userid;
            String str2 = devXAgentCallStartParams.userid;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.roomUrl;
            String str4 = devXAgentCallStartParams.roomUrl;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.doorId;
            String str6 = devXAgentCallStartParams.doorId;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.threadId;
            String str8 = devXAgentCallStartParams.threadId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            ArrayList arrayList = this.peersToRing;
            ArrayList arrayList2 = devXAgentCallStartParams.peersToRing;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            String str9 = this.actorId;
            String str10 = devXAgentCallStartParams.actorId;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            if (this.isVideo != devXAgentCallStartParams.isVideo || this.mandateE2ee != devXAgentCallStartParams.mandateE2ee || this.metaAiCall != devXAgentCallStartParams.metaAiCall || this.creatorAiCall != devXAgentCallStartParams.creatorAiCall) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((AbstractC2326GOr.A07(this.agentCallId) + 1BL.A05(this.userid)) * 31) + 1BL.A05(this.roomUrl)) * 31) + 1BL.A05(this.doorId)) * 31) + 1BL.A05(this.threadId)) * 31) + AnonymousClass001.A02(this.peersToRing)) * 31) + 7zN.A05(this.actorId)) * 31) + (this.isVideo ? 1 : 0)) * 31) + (this.mandateE2ee ? 1 : 0)) * 31) + (this.metaAiCall ? 1 : 0)) * 31) + (this.creatorAiCall ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("DevXAgentCallStartParams{agentCallId=");
        A0k.append(this.agentCallId);
        A0k.append(",userid=");
        A0k.append(this.userid);
        A0k.append(",roomUrl=");
        A0k.append(this.roomUrl);
        A0k.append(",doorId=");
        A0k.append(this.doorId);
        A0k.append(",threadId=");
        A0k.append(this.threadId);
        A0k.append(",peersToRing=");
        A0k.append(this.peersToRing);
        A0k.append(",actorId=");
        A0k.append(this.actorId);
        A0k.append(",isVideo=");
        A0k.append(this.isVideo);
        A0k.append(",mandateE2ee=");
        A0k.append(this.mandateE2ee);
        A0k.append(",metaAiCall=");
        A0k.append(this.metaAiCall);
        A0k.append(",creatorAiCall=");
        return AbstractC2327GOs.A0X(A0k, this.creatorAiCall);
    }
}
