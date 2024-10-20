package X;

import java.util.AbstractMap;
import java.util.HashMap;

/* loaded from: I8p.class */
public final class I8p {
    public final long A0B;
    public final long A0C;
    public long A07 = 0;
    public long A06 = 0;
    public boolean A09 = false;
    public boolean A0A = false;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public String A08 = "";
    public long A00 = 0;

    public I8p(long j, long j2) {
        this.A0C = j;
        this.A0B = j2;
    }

    public static HashMap A00(I8p i8p, Object obj, Object obj2, Object obj3) {
        0fH.A13("AudioPlayer", "Avg processing time playback: %f [ms], frame size %.2f [ms] = %d samples, total number of frames processed %d,  was effect on: %b, was recording: %b,  num deadline missed %d", new Object[]{obj, obj2, obj3, Long.valueOf(i8p.A06), Boolean.valueOf(i8p.A09), Boolean.valueOf(i8p.A0A), Long.valueOf(i8p.A01)});
        return new HashMap(6);
    }

    public static void A01(I8p i8p, AbstractMap abstractMap, float f) {
        abstractMap.put("render_audio_frame_size_ms", String.valueOf(Math.round(f)));
        abstractMap.put("render_audio_num_frames", String.valueOf(i8p.A06));
    }

    public float A02() {
        long j = this.A06;
        if (j != 0) {
            return (((float) this.A07) / 1000000.0f) / ((float) j);
        }
        return 0.0f;
    }

    public void A03() {
        this.A06 = 0L;
        this.A07 = 0L;
        this.A09 = false;
        this.A0A = false;
        this.A01 = 0L;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A04 = 0L;
        this.A05 = 0L;
        this.A08 = "";
    }
}
