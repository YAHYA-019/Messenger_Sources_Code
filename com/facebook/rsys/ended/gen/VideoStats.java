package com.facebook.rsys.ended.gen;

import X.2JQ;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: VideoStats.class */
public class VideoStats {
    public static 2JQ CONVERTER = N6e.A00(31);
    public static long sMcfTypeId;
    public final Long total1080phdDurationMs;
    public final Long total720phdDurationMs;
    public final Long totalDurationMs;

    public VideoStats(Long l, Long l2, Long l3) {
        this.totalDurationMs = l;
        this.total720phdDurationMs = l2;
        this.total1080phdDurationMs = l3;
    }

    public static native VideoStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof VideoStats)) {
                return false;
            }
            VideoStats videoStats = (VideoStats) obj;
            Long l = this.totalDurationMs;
            Long l2 = videoStats.totalDurationMs;
            if (l == null) {
                if (l2 != null) {
                    return false;
                }
            } else if (!l.equals(l2)) {
                return false;
            }
            Long l3 = this.total720phdDurationMs;
            Long l4 = videoStats.total720phdDurationMs;
            if (l3 == null) {
                if (l4 != null) {
                    return false;
                }
            } else if (!l3.equals(l4)) {
                return false;
            }
            Long l5 = this.total1080phdDurationMs;
            Long l6 = videoStats.total1080phdDurationMs;
            if (l5 == null) {
                if (l6 != null) {
                    return false;
                }
            } else if (!l5.equals(l6)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A03 = (AbstractC2326GOr.A03(AnonymousClass001.A02(this.totalDurationMs)) + AnonymousClass001.A02(this.total720phdDurationMs)) * 31;
        Long l = this.total1080phdDurationMs;
        if (l != null) {
            i = l.hashCode();
        }
        return A03 + i;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("VideoStats{totalDurationMs=");
        A0k.append(this.totalDurationMs);
        A0k.append(",total720phdDurationMs=");
        A0k.append(this.total720phdDurationMs);
        A0k.append(",total1080phdDurationMs=");
        return AbstractC2327GOs.A0U(this.total1080phdDurationMs, A0k);
    }
}
