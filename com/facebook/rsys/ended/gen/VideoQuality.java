package com.facebook.rsys.ended.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoQuality.class */
public class VideoQuality {
    public static 2JQ CONVERTER = N6e.A00(30);
    public static long sMcfTypeId;
    public final VideoStats receiverVideoQuality;
    public final VideoStats senderVideoQuality;

    public VideoQuality(VideoStats videoStats, VideoStats videoStats2) {
        videoStats.getClass();
        videoStats2.getClass();
        this.senderVideoQuality = videoStats;
        this.receiverVideoQuality = videoStats2;
    }

    public static native VideoQuality createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof VideoQuality)) {
                return false;
            }
            VideoQuality videoQuality = (VideoQuality) obj;
            if (this.senderVideoQuality.equals(videoQuality.senderVideoQuality) && this.receiverVideoQuality.equals(videoQuality.receiverVideoQuality)) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return AbstractC2326GOr.A03(this.senderVideoQuality.hashCode()) + this.receiverVideoQuality.hashCode();
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoQuality{senderVideoQuality=");
        A0k.append(this.senderVideoQuality);
        A0k.append(",receiverVideoQuality=");
        return AbstractC2327GOs.A0U(this.receiverVideoQuality, A0k);
    }
}
