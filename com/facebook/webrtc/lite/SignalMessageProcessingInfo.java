package com.facebook.webrtc.lite;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: SignalMessageProcessingInfo.class */
public class SignalMessageProcessingInfo {
    public static 2JQ CONVERTER = new IQz(23);
    public static long sMcfTypeId;
    public final long callId;
    public final boolean didReceiveDuplicateCall;
    public final boolean didReceiveNewCallInvite;
    public final String serverInfoData;
    public final int status;

    public SignalMessageProcessingInfo(long j, String str, boolean z, boolean z2, int i) {
        this.callId = j;
        this.serverInfoData = str;
        this.didReceiveNewCallInvite = z;
        this.didReceiveDuplicateCall = z2;
        this.status = i;
    }

    public static native SignalMessageProcessingInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof SignalMessageProcessingInfo)) {
                return false;
            }
            SignalMessageProcessingInfo signalMessageProcessingInfo = (SignalMessageProcessingInfo) obj;
            if (this.callId != signalMessageProcessingInfo.callId) {
                return false;
            }
            String str = this.serverInfoData;
            String str2 = signalMessageProcessingInfo.serverInfoData;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.didReceiveNewCallInvite != signalMessageProcessingInfo.didReceiveNewCallInvite || this.didReceiveDuplicateCall != signalMessageProcessingInfo.didReceiveDuplicateCall || this.status != signalMessageProcessingInfo.status) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((AbstractC2326GOr.A03(1BL.A01(this.callId)) + 1BL.A05(this.serverInfoData)) * 31) + (this.didReceiveNewCallInvite ? 1 : 0)) * 31) + (this.didReceiveDuplicateCall ? 1 : 0)) * 31) + this.status;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("SignalMessageProcessingInfo{callId=");
        A0k.append(this.callId);
        A0k.append(",serverInfoData=");
        A0k.append(this.serverInfoData);
        A0k.append(",didReceiveNewCallInvite=");
        A0k.append(this.didReceiveNewCallInvite);
        A0k.append(",didReceiveDuplicateCall=");
        A0k.append(this.didReceiveDuplicateCall);
        A0k.append(",status=");
        return AbstractC2327GOs.A0W(A0k, this.status);
    }
}
