package X;

import android.os.Handler;
import com.facebook.messaging.audio.composer.AudioComposerContentView;
import com.facebook.messaging.audio.composer.VoiceClipKeyboardView;

/* loaded from: Ips.class */
public final class Ips implements Runnable {
    public static final String __redex_internal_original_name = "AudioComposerContentView$onTouchUp$1";
    public final /* synthetic */ AudioComposerContentView A00;

    public Ips(AudioComposerContentView audioComposerContentView) {
        this.A00 = audioComposerContentView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        AudioComposerContentView audioComposerContentView = this.A00;
        C66h c66h = AudioComposerContentView.A0h;
        Hlp hlp = audioComposerContentView.A0G;
        if (hlp == null) {
            throw 1BK.A0h();
        }
        VoiceClipKeyboardView voiceClipKeyboardView = hlp.A00;
        7Fa r0 = voiceClipKeyboardView.A0D;
        if (r0 == null) {
            str = "audioRecorderAsync";
        } else {
            r0.A08();
            Handler handler = voiceClipKeyboardView.A00;
            if (handler == null) {
                str = "handler";
            } else {
                handler.removeCallbacks(voiceClipKeyboardView.A0E);
                AudioComposerContentView audioComposerContentView2 = voiceClipKeyboardView.A04;
                if (audioComposerContentView2 != null) {
                    audioComposerContentView2.A0D(0.0d);
                    return;
                }
                str = "audioComposerContentView";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
