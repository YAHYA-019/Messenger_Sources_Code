package X;

import android.os.Handler;
import com.facebook.messaging.audio.composer.AudioComposerContentView;
import com.facebook.messaging.audio.composer.VoiceClipKeyboardView;

/* loaded from: Hlp.class */
public final class Hlp {
    public final /* synthetic */ VoiceClipKeyboardView A00;

    public Hlp(VoiceClipKeyboardView voiceClipKeyboardView) {
        this.A00 = voiceClipKeyboardView;
    }

    public void A00() {
        String str;
        VoiceClipKeyboardView voiceClipKeyboardView = this.A00;
        7Fa r0 = voiceClipKeyboardView.A0D;
        if (r0 == null) {
            str = "audioRecorderAsync";
        } else {
            r0.A07();
            Handler handler = voiceClipKeyboardView.A00;
            if (handler == null) {
                str = "handler";
            } else {
                handler.removeCallbacks(voiceClipKeyboardView.A0E);
                AudioComposerContentView audioComposerContentView = voiceClipKeyboardView.A04;
                if (audioComposerContentView != null) {
                    audioComposerContentView.A0D(0.0d);
                    return;
                }
                str = "audioComposerContentView";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
