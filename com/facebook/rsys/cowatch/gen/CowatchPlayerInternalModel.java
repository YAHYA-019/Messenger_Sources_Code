package com.facebook.rsys.cowatch.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: CowatchPlayerInternalModel.class */
public class CowatchPlayerInternalModel {
    public static 2JQ CONVERTER = IR0.A00(80);
    public static long sMcfTypeId;
    public final long audioUpdateCursor;
    public final String cowatchSessionID;
    public final boolean forceToSyncLatestState;
    public final CowatchLoggingModel log;
    public final long mediaPositionMsPerceivedDelta;
    public final String mediaUniqueID;
    public final int mutationSource;
    public final Long startWatchTimestampInMs;
    public final String suggestedContext;
    public final int swipeDirection;
    public final String tabSelectedFromAmdPlayNow;
    public final Map watchedHistory;

    public CowatchPlayerInternalModel(String str, int i, long j, String str2, long j2, boolean z, CowatchLoggingModel cowatchLoggingModel, Long l, String str3, int i2, String str4, Map map) {
        this.cowatchSessionID = str;
        this.mutationSource = i;
        this.mediaPositionMsPerceivedDelta = j;
        this.mediaUniqueID = str2;
        this.audioUpdateCursor = j2;
        this.forceToSyncLatestState = z;
        this.log = cowatchLoggingModel;
        this.startWatchTimestampInMs = l;
        this.tabSelectedFromAmdPlayNow = str3;
        this.swipeDirection = i2;
        this.suggestedContext = str4;
        this.watchedHistory = map;
    }

    public static native CowatchPlayerInternalModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CowatchPlayerInternalModel)) {
                return false;
            }
            CowatchPlayerInternalModel cowatchPlayerInternalModel = (CowatchPlayerInternalModel) obj;
            String str = this.cowatchSessionID;
            String str2 = cowatchPlayerInternalModel.cowatchSessionID;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.mutationSource != cowatchPlayerInternalModel.mutationSource || this.mediaPositionMsPerceivedDelta != cowatchPlayerInternalModel.mediaPositionMsPerceivedDelta) {
                return false;
            }
            String str3 = this.mediaUniqueID;
            String str4 = cowatchPlayerInternalModel.mediaUniqueID;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.audioUpdateCursor != cowatchPlayerInternalModel.audioUpdateCursor || this.forceToSyncLatestState != cowatchPlayerInternalModel.forceToSyncLatestState) {
                return false;
            }
            CowatchLoggingModel cowatchLoggingModel = this.log;
            CowatchLoggingModel cowatchLoggingModel2 = cowatchPlayerInternalModel.log;
            if (cowatchLoggingModel == null) {
                if (cowatchLoggingModel2 != null) {
                    return false;
                }
            } else if (!cowatchLoggingModel.equals(cowatchLoggingModel2)) {
                return false;
            }
            Long l = this.startWatchTimestampInMs;
            Long l2 = cowatchPlayerInternalModel.startWatchTimestampInMs;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            String str5 = this.tabSelectedFromAmdPlayNow;
            String str6 = cowatchPlayerInternalModel.tabSelectedFromAmdPlayNow;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            if (this.swipeDirection != cowatchPlayerInternalModel.swipeDirection) {
                return false;
            }
            String str7 = this.suggestedContext;
            String str8 = cowatchPlayerInternalModel.suggestedContext;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            Map map = this.watchedHistory;
            Map map2 = cowatchPlayerInternalModel.watchedHistory;
            if (map == null) {
                if (map2 != null) {
                    return false;
                }
            } else if (!map.equals(map2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A02 = (((((((((((AnonymousClass002.A02(this.audioUpdateCursor, (AnonymousClass002.A02(this.mediaPositionMsPerceivedDelta, (AbstractC2326GOr.A03(1BL.A05(this.cowatchSessionID)) + this.mutationSource) * 31) + 1BL.A05(this.mediaUniqueID)) * 31) + (this.forceToSyncLatestState ? 1 : 0)) * 31) + AnonymousClass001.A02(this.log)) * 31) + AnonymousClass001.A02(this.startWatchTimestampInMs)) * 31) + 1BL.A05(this.tabSelectedFromAmdPlayNow)) * 31) + this.swipeDirection) * 31) + 1BL.A05(this.suggestedContext)) * 31;
        Map map = this.watchedHistory;
        if (map != null) {
            i = map.hashCode();
        }
        return A02 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("CowatchPlayerInternalModel{cowatchSessionID=");
        A0k.append(this.cowatchSessionID);
        A0k.append(",mutationSource=");
        A0k.append(this.mutationSource);
        A0k.append(",mediaPositionMsPerceivedDelta=");
        A0k.append(this.mediaPositionMsPerceivedDelta);
        A0k.append(",mediaUniqueID=");
        A0k.append(this.mediaUniqueID);
        A0k.append(",audioUpdateCursor=");
        A0k.append(this.audioUpdateCursor);
        A0k.append(",forceToSyncLatestState=");
        A0k.append(this.forceToSyncLatestState);
        A0k.append(",log=");
        A0k.append(this.log);
        A0k.append(",startWatchTimestampInMs=");
        A0k.append(this.startWatchTimestampInMs);
        A0k.append(",tabSelectedFromAmdPlayNow=");
        A0k.append(this.tabSelectedFromAmdPlayNow);
        A0k.append(",swipeDirection=");
        A0k.append(this.swipeDirection);
        A0k.append(",suggestedContext=");
        A0k.append(this.suggestedContext);
        A0k.append(",watchedHistory=");
        return AbstractC2327GOs.A0U(this.watchedHistory, A0k);
    }
}
