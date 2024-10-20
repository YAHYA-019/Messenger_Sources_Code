package com.facebook.rsys.video.gen;

import X.1BL;
import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IQz;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.video.VideoSource;

/* loaded from: VideoStream.class */
public class VideoStream {
    public static 2JQ CONVERTER = new IQz(8);
    public static long sMcfTypeId;
    public final boolean isFrozen;
    public final boolean isSuppressedByUser;
    public final String streamId;
    public final StreamInfo streamInfo;
    public final int streamState;
    public final VideoSource videoSource;

    public VideoStream(VideoSource videoSource, boolean z, StreamInfo streamInfo, String str, int i, boolean z2) {
        videoSource.getClass();
        streamInfo.getClass();
        this.videoSource = videoSource;
        this.isFrozen = z;
        this.streamInfo = streamInfo;
        this.streamId = str;
        this.streamState = i;
        this.isSuppressedByUser = z2;
    }

    public static native VideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStream)) {
                return false;
            }
            VideoStream videoStream = (VideoStream) obj;
            if (!this.videoSource.equals(videoStream.videoSource) || this.isFrozen != videoStream.isFrozen || !this.streamInfo.equals(videoStream.streamInfo)) {
                return false;
            }
            String str = this.streamId;
            String str2 = videoStream.streamId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            if (this.streamState != videoStream.streamState || this.isSuppressedByUser != videoStream.isSuppressedByUser) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.streamInfo, (AbstractC2327GOs.A08(this.videoSource) + (this.isFrozen ? 1 : 0)) * 31) + 1BL.A05(this.streamId)) * 31) + this.streamState) * 31) + (this.isSuppressedByUser ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoStream{videoSource=");
        A0k.append(this.videoSource);
        A0k.append(",isFrozen=");
        A0k.append(this.isFrozen);
        A0k.append(",streamInfo=");
        A0k.append(this.streamInfo);
        A0k.append(",streamId=");
        A0k.append(this.streamId);
        A0k.append(",streamState=");
        A0k.append(this.streamState);
        A0k.append(",isSuppressedByUser=");
        return AbstractC2327GOs.A0X(A0k, this.isSuppressedByUser);
    }
}
