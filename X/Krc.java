package X;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.audio.DefaultAudioSink;

/* loaded from: Krc.class */
public final class Krc {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler(Looper.myLooper());
    public final /* synthetic */ DefaultAudioSink A02;

    public Krc(DefaultAudioSink defaultAudioSink) {
        this.A02 = defaultAudioSink;
        this.A00 = new JVh(this, defaultAudioSink);
    }

    public void A00(AudioTrack audioTrack) {
        Handler handler = this.A01;
        handler.getClass();
        audioTrack.registerStreamEventCallback(new G7A(handler, 1), this.A00);
    }

    public void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages(null);
    }
}
