package X;

import android.media.AudioManager;

/* loaded from: Ixr.class */
public final class Ixr implements Runnable {
    public static final String __redex_internal_original_name = "VolumeChangeAnnouncer$MyContentObserver$createOnVolumeChangeRunnable$1";
    public final /* synthetic */ GSR A00;
    public final /* synthetic */ Hj3 A01;

    public Ixr(GSR gsr, Hj3 hj3) {
        this.A01 = hj3;
        this.A00 = gsr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioManager audioManager = this.A01.A04;
        int i = 0;
        if (audioManager.isBluetoothScoOn()) {
            i = 6;
        }
        int streamVolume = audioManager.getStreamVolume(i);
        GSR gsr = this.A00;
        if (streamVolume != gsr.A00) {
            gsr.A00 = streamVolume;
            int streamMaxVolume = audioManager.getStreamMaxVolume(i);
            float f = streamMaxVolume > 0 ? streamVolume / streamMaxVolume : -1.0f;
            If6 if6 = gsr.A01.A00;
            if6.A05.ALc("RtcAudioOutputManagerBase", "Volume level changed to %f", Float.valueOf(f));
            if6.audioManagerQplLogger.Bct("set_volume", String.valueOf(f));
        }
    }
}
