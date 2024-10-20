package com.facebook.rsys.stream.gen;

import X.2JQ;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.LVi;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: VideoStreamParams.class */
public class VideoStreamParams {
    public static 2JQ CONVERTER = LVi.A00(64);
    public static long sMcfTypeId;
    public final int preferredCodec;
    public final StreamCallbacks streamCallbacks;
    public final int syncGroup;
    public final StreamInfo videoStreamInfo;

    public VideoStreamParams(StreamInfo streamInfo, int i, int i2, StreamCallbacks streamCallbacks) {
        streamInfo.getClass();
        this.videoStreamInfo = streamInfo;
        this.syncGroup = i;
        this.preferredCodec = i2;
        this.streamCallbacks = streamCallbacks;
    }

    public static native VideoStreamParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStreamParams)) {
                return false;
            }
            VideoStreamParams videoStreamParams = (VideoStreamParams) obj;
            if (!this.videoStreamInfo.equals(videoStreamParams.videoStreamInfo) || this.syncGroup != videoStreamParams.syncGroup || this.preferredCodec != videoStreamParams.preferredCodec) {
                return false;
            }
            StreamCallbacks streamCallbacks = this.streamCallbacks;
            StreamCallbacks streamCallbacks2 = videoStreamParams.streamCallbacks;
            if (streamCallbacks == null) {
                if (streamCallbacks2 != null) {
                    return false;
                }
            } else if (!streamCallbacks.equals(streamCallbacks2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AbstractC2327GOs.A08(this.videoStreamInfo) + this.syncGroup) * 31) + this.preferredCodec) * 31) + AnonymousClass001.A02(this.streamCallbacks);
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoStreamParams{videoStreamInfo=");
        A0k.append(this.videoStreamInfo);
        A0k.append(",syncGroup=");
        A0k.append(this.syncGroup);
        A0k.append(",preferredCodec=");
        A0k.append(this.preferredCodec);
        A0k.append(",streamCallbacks=");
        return AbstractC2327GOs.A0U(this.streamCallbacks, A0k);
    }
}
