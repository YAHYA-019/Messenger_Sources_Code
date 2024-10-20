package com.facebook.rsys.coplay.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOq;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: CoplayMatchState.class */
public class CoplayMatchState {
    public static 2JQ CONVERTER = IR0.A00(56);
    public static long sMcfTypeId;
    public final String appIconUrl;
    public final long appId;
    public final String appName;
    public final long creatorId;
    public final long matchId;
    public final int matchStatus;
    public final int minPlayers;
    public final ArrayList participants;
    public final String supportedOrientation;

    public CoplayMatchState(long j, long j2, int i, ArrayList arrayList, long j3, int i2, String str, String str2, String str3) {
        arrayList.getClass();
        this.matchId = j;
        this.appId = j2;
        this.matchStatus = i;
        this.participants = arrayList;
        this.creatorId = j3;
        this.minPlayers = i2;
        this.appName = str;
        this.appIconUrl = str2;
        this.supportedOrientation = str3;
    }

    public static native CoplayMatchState createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CoplayMatchState)) {
                return false;
            }
            CoplayMatchState coplayMatchState = (CoplayMatchState) obj;
            if (this.matchId != coplayMatchState.matchId || this.appId != coplayMatchState.appId || this.matchStatus != coplayMatchState.matchStatus || !this.participants.equals(coplayMatchState.participants) || this.creatorId != coplayMatchState.creatorId || this.minPlayers != coplayMatchState.minPlayers) {
                return false;
            }
            String str = this.appName;
            String str2 = coplayMatchState.appName;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.appIconUrl;
            String str4 = coplayMatchState.appIconUrl;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.supportedOrientation;
            String str6 = coplayMatchState.supportedOrientation;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        long j = this.matchId;
        int A05 = AnonymousClass002.A05(this.participants, (AnonymousClass002.A02(this.appId, AbstractC2326GOr.A03((int) (j ^ (j >>> 32)))) + this.matchStatus) * 31);
        long j2 = this.creatorId;
        return ((((((((A05 + ((int) ((j2 >>> 32) ^ j2))) * 31) + this.minPlayers) * 31) + 1BL.A05(this.appName)) * 31) + 1BL.A05(this.appIconUrl)) * 31) + 7zN.A05(this.supportedOrientation);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CoplayMatchState{matchId=");
        A0k.append(this.matchId);
        A0k.append(",appId=");
        A0k.append(this.appId);
        A0k.append(",matchStatus=");
        A0k.append(this.matchStatus);
        A0k.append(",participants=");
        A0k.append(this.participants);
        A0k.append(",creatorId=");
        A0k.append(this.creatorId);
        A0k.append(",minPlayers=");
        A0k.append(this.minPlayers);
        A0k.append(",appName=");
        A0k.append(this.appName);
        A0k.append(",appIconUrl=");
        A0k.append(this.appIconUrl);
        A0k.append(",supportedOrientation=");
        return GOq.A12(this.supportedOrientation, A0k);
    }
}
