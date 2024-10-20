package X;

import android.os.Handler;
import com.facebook.messaging.audio.composer.AudioComposerContentView;
import com.facebook.messaging.audio.composer.VoiceClipKeyboardView;

/* loaded from: Ipt.class */
public final class Ipt implements Runnable {
    public static final String __redex_internal_original_name = "VoiceClipKeyboardView$updateVolumeAmplitudeRunnable$1";
    public final /* synthetic */ VoiceClipKeyboardView A00;

    public Ipt(VoiceClipKeyboardView voiceClipKeyboardView) {
        this.A00 = voiceClipKeyboardView;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        VoiceClipKeyboardView voiceClipKeyboardView = this.A00;
        AudioComposerContentView audioComposerContentView = voiceClipKeyboardView.A04;
        if (audioComposerContentView == null || voiceClipKeyboardView.A00 == null) {
            return;
        }
        7Fa r0 = voiceClipKeyboardView.A0D;
        if (r0 == null) {
            str = "audioRecorderAsync";
        } else {
            audioComposerContentView.A0D(r0.A06());
            Handler handler = voiceClipKeyboardView.A00;
            if (handler != null) {
                handler.postDelayed(this, 50);
                return;
            }
            str = "handler";
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
