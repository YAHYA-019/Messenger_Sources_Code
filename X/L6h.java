package X;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;

/* loaded from: L6h.class */
public abstract class L6h {
    public static final AudioAttributes A00 = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int A00(int i, int i2) {
        int i3 = 8;
        while (true) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(Util.A00(i3)).build(), A00)) {
                break;
            }
            i3--;
            if (i3 <= 0) {
                i3 = 0;
                break;
            }
        }
        return i3;
    }

    public static int[] A01() {
        ImmutableList.Builder builder = ImmutableList.builder();
        1Du it = 6WZ.A04.keySet().iterator();
        while (it.hasNext()) {
            Number number = (Number) it.next();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(number.intValue()).setSampleRate(48000).build(), A00)) {
                builder.m11011add((Object) number);
            }
        }
        builder.m11011add((Object) 2);
        return 1NS.A03(builder.build());
    }
}
