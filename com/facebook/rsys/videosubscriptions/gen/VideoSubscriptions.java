package com.facebook.rsys.videosubscriptions.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: VideoSubscriptions.class */
public class VideoSubscriptions {
    public static 2JQ CONVERTER = LVi.A00(66);
    public static long sMcfTypeId;
    public final boolean dominantIncludeSelf;
    public final int dominantStreamQuality;
    public final Map subscriptionsMap;
    public final int videoSubscriptionsMode;

    /* loaded from: VideoSubscriptions$Builder.class */
    public class Builder {
        public boolean dominantIncludeSelf;
        public int dominantStreamQuality;
        public Map subscriptionsMap;
        public int videoSubscriptionsMode;

        public VideoSubscriptions build() {
            return new VideoSubscriptions(this);
        }
    }

    public VideoSubscriptions(Builder builder) {
        builder.subscriptionsMap.getClass();
        this.videoSubscriptionsMode = builder.videoSubscriptionsMode;
        this.subscriptionsMap = builder.subscriptionsMap;
        this.dominantStreamQuality = builder.dominantStreamQuality;
        this.dominantIncludeSelf = builder.dominantIncludeSelf;
    }

    public VideoSubscriptions(Map map, int i, boolean z) {
        this.videoSubscriptionsMode = 2;
        this.subscriptionsMap = map;
        this.dominantStreamQuality = i;
        this.dominantIncludeSelf = z;
    }

    public static native VideoSubscriptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoSubscriptions)) {
                return false;
            }
            VideoSubscriptions videoSubscriptions = (VideoSubscriptions) obj;
            if (this.videoSubscriptionsMode == videoSubscriptions.videoSubscriptionsMode && this.subscriptionsMap.equals(videoSubscriptions.subscriptionsMap) && this.dominantStreamQuality == videoSubscriptions.dominantStreamQuality && this.dominantIncludeSelf == videoSubscriptions.dominantIncludeSelf) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((((AbstractC2326GOr.A03(this.videoSubscriptionsMode) + this.subscriptionsMap.hashCode()) * 31) + this.dominantStreamQuality) * 31) + (this.dominantIncludeSelf ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoSubscriptions{videoSubscriptionsMode=");
        A0k.append(this.videoSubscriptionsMode);
        A0k.append(",subscriptionsMap=");
        A0k.append(this.subscriptionsMap);
        A0k.append(",dominantStreamQuality=");
        A0k.append(this.dominantStreamQuality);
        A0k.append(",dominantIncludeSelf=");
        return AbstractC2327GOs.A0X(A0k, this.dominantIncludeSelf);
    }
}
