package com.facebook.rsys.videorender.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.GOm;
import X.N6e;
import com.facebook.acra.constants.ActionId;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: VideoRenderItem.class */
public class VideoRenderItem {
    public static 2JQ CONVERTER = N6e.A00(90);
    public static long sMcfTypeId;
    public final int preferredQuality;
    public final StreamInfo streamInfo;
    public final String userId;
    public final VideoRenderFrameCallback videoFrameCallback;

    /* loaded from: VideoRenderItem$Builder.class */
    public class Builder {
        public int preferredQuality;
        public StreamInfo streamInfo;
        public String userId;
        public VideoRenderFrameCallback videoFrameCallback;

        public VideoRenderItem build() {
            return new VideoRenderItem(this);
        }
    }

    public VideoRenderItem(StreamInfo streamInfo, VideoRenderFrameCallback videoRenderFrameCallback, String str, int i) {
        streamInfo.getClass();
        this.userId = str;
        this.streamInfo = streamInfo;
        this.preferredQuality = i;
        this.videoFrameCallback = videoRenderFrameCallback;
    }

    public VideoRenderItem(Builder builder) {
        builder.userId.getClass();
        builder.streamInfo.getClass();
        builder.videoFrameCallback.getClass();
        this.userId = builder.userId;
        this.streamInfo = builder.streamInfo;
        this.preferredQuality = builder.preferredQuality;
        this.videoFrameCallback = builder.videoFrameCallback;
    }

    public static native VideoRenderItem createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoRenderItem)) {
                return false;
            }
            VideoRenderItem videoRenderItem = (VideoRenderItem) obj;
            if (this.userId.equals(videoRenderItem.userId) && this.streamInfo.equals(videoRenderItem.streamInfo) && this.preferredQuality == videoRenderItem.preferredQuality && this.videoFrameCallback.equals(videoRenderItem.videoFrameCallback)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((AnonymousClass002.A05(this.streamInfo, AbstractC2326GOr.A07(this.userId)) + this.preferredQuality) * 31) + this.videoFrameCallback.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoRenderItem{userId=");
        A0k.append(this.userId);
        A0k.append(GOm.A00(ActionId.RTMP_CONNECTION_RELEASE));
        A0k.append(this.streamInfo);
        A0k.append(",preferredQuality=");
        A0k.append(this.preferredQuality);
        A0k.append(",videoFrameCallback=");
        return AbstractC2327GOs.A0U(this.videoFrameCallback, A0k);
    }
}
