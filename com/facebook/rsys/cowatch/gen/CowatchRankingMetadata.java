package com.facebook.rsys.cowatch.gen;

import X.1BJ;
import X.1BK;
import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CowatchRankingMetadata.class */
public class CowatchRankingMetadata {
    public static 2JQ CONVERTER = IR0.A00(82);
    public static long sMcfTypeId;
    public final String callType;
    public final ArrayList connectedPeerIds;
    public final String cowatchSessionId;
    public final String localCallId;
    public final String serverInfoData;
    public final String sharedCallId;

    public CowatchRankingMetadata(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
        str4.getClass();
        arrayList.getClass();
        this.localCallId = str;
        this.sharedCallId = str2;
        this.serverInfoData = str3;
        this.callType = str4;
        this.cowatchSessionId = str5;
        this.connectedPeerIds = arrayList;
    }

    public static native CowatchRankingMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchRankingMetadata)) {
                return false;
            }
            CowatchRankingMetadata cowatchRankingMetadata = (CowatchRankingMetadata) obj;
            String str = this.localCallId;
            String str2 = cowatchRankingMetadata.localCallId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.sharedCallId;
            String str4 = cowatchRankingMetadata.sharedCallId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.serverInfoData;
            String str6 = cowatchRankingMetadata.serverInfoData;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (!this.callType.equals(cowatchRankingMetadata.callType)) {
                return false;
            }
            String str7 = this.cowatchSessionId;
            String str8 = cowatchRankingMetadata.cowatchSessionId;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            if (!this.connectedPeerIds.equals(cowatchRankingMetadata.connectedPeerIds)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.connectedPeerIds, (AnonymousClass002.A07(this.callType, (((AbstractC2326GOr.A03(1BL.A05(this.localCallId)) + 1BL.A05(this.sharedCallId)) * 31) + 1BL.A05(this.serverInfoData)) * 31) + 7zN.A05(this.cowatchSessionId)) * 31);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchRankingMetadata{localCallId=");
        A0k.append(this.localCallId);
        A0k.append(1BJ.A00(245));
        A0k.append(this.sharedCallId);
        A0k.append(",serverInfoData=");
        A0k.append(this.serverInfoData);
        A0k.append(",callType=");
        A0k.append(this.callType);
        A0k.append(",cowatchSessionId=");
        A0k.append(this.cowatchSessionId);
        A0k.append(",connectedPeerIds=");
        return AbstractC2327GOs.A0U(this.connectedPeerIds, A0k);
    }
}
