package X;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* renamed from: X.6ba, reason: invalid class name */
/* loaded from: 6ba.class */
public final class C6ba {
    public long A00;
    public long A01;
    public long A02;
    public final AudioTimestamp A03 = new AudioTimestamp();
    public final AudioTrack A04;

    public C6ba(AudioTrack audioTrack) {
        this.A04 = audioTrack;
    }
}
