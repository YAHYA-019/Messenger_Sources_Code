package com.facebook.rsys.videosubscriptions.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Map;

/* loaded from: VideoSubscriptionsModel.class */
public class VideoSubscriptionsModel {
    public static 2JQ CONVERTER = LVi.A00(67);
    public static long sMcfTypeId;
    public final Map renderSubscriptionsMap;
    public final Map streamIdToQuality;
    public final VideoSubscriptions videoSubscriptions;

    public VideoSubscriptionsModel(Builder builder) {
        builder.videoSubscriptions.getClass();
        builder.renderSubscriptionsMap.getClass();
        builder.streamIdToQuality.getClass();
        this.videoSubscriptions = builder.videoSubscriptions;
        this.renderSubscriptionsMap = builder.renderSubscriptionsMap;
        this.streamIdToQuality = builder.streamIdToQuality;
    }

    public static native VideoSubscriptionsModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoSubscriptionsModel)) {
                return false;
            }
            VideoSubscriptionsModel videoSubscriptionsModel = (VideoSubscriptionsModel) obj;
            if (this.videoSubscriptions.equals(videoSubscriptionsModel.videoSubscriptions) && this.renderSubscriptionsMap.equals(videoSubscriptionsModel.renderSubscriptionsMap) && this.streamIdToQuality.equals(videoSubscriptionsModel.streamIdToQuality)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AbstractC2327GOs.A08(this.videoSubscriptions) + this.renderSubscriptionsMap.hashCode()) * 31) + this.streamIdToQuality.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoSubscriptionsModel{videoSubscriptions=");
        A0k.append(this.videoSubscriptions);
        A0k.append(",renderSubscriptionsMap=");
        A0k.append(this.renderSubscriptionsMap);
        A0k.append(",streamIdToQuality=");
        return AbstractC2327GOs.A0U(this.streamIdToQuality, A0k);
    }
}
