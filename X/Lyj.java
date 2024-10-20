package X;

import android.media.AudioManager;
import java.util.TimerTask;
import org.webrtc.voiceengine.WebRtcAudioManager;

/* loaded from: Lyj.class */
public final class Lyj extends TimerTask {
    public static final String __redex_internal_original_name = "WebRtcAudioManager$VolumeLogger$LogVolumeTask";
    public final int A00;
    public final int A01;
    public final /* synthetic */ KiM A02;

    public Lyj(KiM kiM, int i, int i2) {
        this.A02 = kiM;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        StringBuilder A0k;
        int i;
        AudioManager audioManager = this.A02.A01;
        int mode = audioManager.getMode();
        if (mode == 1) {
            A0k = AnonymousClass001.A0k();
            A0k.append("STREAM_RING stream volume: ");
            A0k.append(audioManager.getStreamVolume(2));
            A0k.append(" (max=");
            i = this.A00;
        } else {
            if (mode != 3) {
                return;
            }
            A0k = AnonymousClass001.A0k();
            A0k.append("VOICE_CALL stream volume: ");
            A0k.append(audioManager.getStreamVolume(0));
            A0k.append(" (max=");
            i = this.A01;
        }
        A0k.append(i);
        JQy.A1R(")", WebRtcAudioManager.TAG, A0k);
    }
}
