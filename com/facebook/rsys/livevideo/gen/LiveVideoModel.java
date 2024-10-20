package com.facebook.rsys.livevideo.gen;

import X.1BL;
import X.2JQ;
import X.4YU;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

/* loaded from: LiveVideoModel.class */
public class LiveVideoModel {
    public static 2JQ CONVERTER = LVi.A00(24);
    public static long sMcfTypeId;
    public final ArrayList acceptedUsers;
    public final Long broadcastId;
    public final LiveVideoCancelCreatedNotStartedParameters cancelCreatedNotStartedParameters;
    public final LiveVideoCreationParameters creationParameters;
    public final LiveVideoEndParameters endParameters;
    public final Long errorCode;
    public final int liveStreamStatus;
    public final boolean livestreamStateSyncTopicInitialized;
    public final LiveVideoMetadata metadata;
    public final boolean needsStateSyncUnsubscribe;
    public final String negotiationToken;
    public final LiveStreamOptInInfo optInInfo;
    public final LiveVideoStartParameters startParameters;
    public final boolean userAcknowledged;
    public final String videoId;

    public LiveVideoModel(int i, Long l, boolean z, String str, LiveStreamOptInInfo liveStreamOptInInfo, ArrayList arrayList, Long l2, String str2, boolean z2, LiveVideoCreationParameters liveVideoCreationParameters, LiveVideoStartParameters liveVideoStartParameters, LiveVideoEndParameters liveVideoEndParameters, LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters, LiveVideoMetadata liveVideoMetadata, boolean z3) {
        this.liveStreamStatus = i;
        this.errorCode = l;
        this.userAcknowledged = z;
        this.negotiationToken = str;
        this.optInInfo = liveStreamOptInInfo;
        this.acceptedUsers = arrayList;
        this.broadcastId = l2;
        this.videoId = str2;
        this.needsStateSyncUnsubscribe = z2;
        this.creationParameters = liveVideoCreationParameters;
        this.startParameters = liveVideoStartParameters;
        this.endParameters = liveVideoEndParameters;
        this.cancelCreatedNotStartedParameters = liveVideoCancelCreatedNotStartedParameters;
        this.metadata = liveVideoMetadata;
        this.livestreamStateSyncTopicInitialized = z3;
    }

    public static native LiveVideoModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof LiveVideoModel)) {
                return false;
            }
            LiveVideoModel liveVideoModel = (LiveVideoModel) obj;
            if (this.liveStreamStatus != liveVideoModel.liveStreamStatus) {
                return false;
            }
            Long l = this.errorCode;
            Long l2 = liveVideoModel.errorCode;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            if (this.userAcknowledged != liveVideoModel.userAcknowledged) {
                return false;
            }
            String str = this.negotiationToken;
            String str2 = liveVideoModel.negotiationToken;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            LiveStreamOptInInfo liveStreamOptInInfo = this.optInInfo;
            LiveStreamOptInInfo liveStreamOptInInfo2 = liveVideoModel.optInInfo;
            if (liveStreamOptInInfo == null) {
                if (liveStreamOptInInfo2 != null) {
                    return false;
                }
            } else if (!liveStreamOptInInfo.equals(liveStreamOptInInfo2)) {
                return false;
            }
            ArrayList arrayList = this.acceptedUsers;
            ArrayList arrayList2 = liveVideoModel.acceptedUsers;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            Long l3 = this.broadcastId;
            Long l4 = liveVideoModel.broadcastId;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            String str3 = this.videoId;
            String str4 = liveVideoModel.videoId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            if (this.needsStateSyncUnsubscribe != liveVideoModel.needsStateSyncUnsubscribe) {
                return false;
            }
            LiveVideoCreationParameters liveVideoCreationParameters = this.creationParameters;
            LiveVideoCreationParameters liveVideoCreationParameters2 = liveVideoModel.creationParameters;
            if (liveVideoCreationParameters == null) {
                if (liveVideoCreationParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoCreationParameters.equals(liveVideoCreationParameters2)) {
                return false;
            }
            LiveVideoStartParameters liveVideoStartParameters = this.startParameters;
            LiveVideoStartParameters liveVideoStartParameters2 = liveVideoModel.startParameters;
            if (liveVideoStartParameters == null) {
                if (liveVideoStartParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoStartParameters.equals(liveVideoStartParameters2)) {
                return false;
            }
            LiveVideoEndParameters liveVideoEndParameters = this.endParameters;
            LiveVideoEndParameters liveVideoEndParameters2 = liveVideoModel.endParameters;
            if (liveVideoEndParameters == null) {
                if (liveVideoEndParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoEndParameters.equals(liveVideoEndParameters2)) {
                return false;
            }
            LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters = this.cancelCreatedNotStartedParameters;
            LiveVideoCancelCreatedNotStartedParameters liveVideoCancelCreatedNotStartedParameters2 = liveVideoModel.cancelCreatedNotStartedParameters;
            if (liveVideoCancelCreatedNotStartedParameters == null) {
                if (liveVideoCancelCreatedNotStartedParameters2 != null) {
                    return false;
                }
            } else if (!liveVideoCancelCreatedNotStartedParameters.equals(liveVideoCancelCreatedNotStartedParameters2)) {
                return false;
            }
            LiveVideoMetadata liveVideoMetadata = this.metadata;
            LiveVideoMetadata liveVideoMetadata2 = liveVideoModel.metadata;
            if (liveVideoMetadata == null) {
                if (liveVideoMetadata2 != null) {
                    return false;
                }
            } else if (!liveVideoMetadata.equals(liveVideoMetadata2)) {
                return false;
            }
            if (this.livestreamStateSyncTopicInitialized != liveVideoModel.livestreamStateSyncTopicInitialized) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((AbstractC2326GOr.A03(this.liveStreamStatus) + AnonymousClass001.A02(this.errorCode)) * 31) + (this.userAcknowledged ? 1 : 0)) * 31) + 1BL.A05(this.negotiationToken)) * 31) + AnonymousClass001.A02(this.optInInfo)) * 31) + AnonymousClass001.A02(this.acceptedUsers)) * 31) + AnonymousClass001.A02(this.broadcastId)) * 31) + 1BL.A05(this.videoId)) * 31) + (this.needsStateSyncUnsubscribe ? 1 : 0)) * 31) + AnonymousClass001.A02(this.creationParameters)) * 31) + AnonymousClass001.A02(this.startParameters)) * 31) + AnonymousClass001.A02(this.endParameters)) * 31) + AnonymousClass001.A02(this.cancelCreatedNotStartedParameters)) * 31) + 4YU.A03(this.metadata)) * 31) + (this.livestreamStateSyncTopicInitialized ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("LiveVideoModel{liveStreamStatus=");
        A0k.append(this.liveStreamStatus);
        A0k.append(",errorCode=");
        A0k.append(this.errorCode);
        A0k.append(",userAcknowledged=");
        A0k.append(this.userAcknowledged);
        A0k.append(",negotiationToken=");
        A0k.append(this.negotiationToken);
        A0k.append(",optInInfo=");
        A0k.append(this.optInInfo);
        A0k.append(",acceptedUsers=");
        A0k.append(this.acceptedUsers);
        A0k.append(",broadcastId=");
        A0k.append(this.broadcastId);
        A0k.append(",videoId=");
        A0k.append(this.videoId);
        A0k.append(",needsStateSyncUnsubscribe=");
        A0k.append(this.needsStateSyncUnsubscribe);
        A0k.append(",creationParameters=");
        A0k.append(this.creationParameters);
        A0k.append(",startParameters=");
        A0k.append(this.startParameters);
        A0k.append(",endParameters=");
        A0k.append(this.endParameters);
        A0k.append(",cancelCreatedNotStartedParameters=");
        A0k.append(this.cancelCreatedNotStartedParameters);
        A0k.append(",metadata=");
        A0k.append(this.metadata);
        A0k.append(",livestreamStateSyncTopicInitialized=");
        return AbstractC2327GOs.A0X(A0k, this.livestreamStateSyncTopicInitialized);
    }
}
