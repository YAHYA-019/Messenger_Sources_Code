package X;

import com.google.android.exoplayer2.Timeline;

/* loaded from: KR1.class */
public final class KR1 extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public KR1(Timeline timeline, int i, long j) {
        this.timeline = timeline;
        this.windowIndex = i;
        this.positionMs = j;
    }
}
