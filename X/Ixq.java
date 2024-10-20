package X;

import android.media.AudioManager;

/* loaded from: Ixq.class */
public final class Ixq implements Runnable {
    public static final String __redex_internal_original_name = "RtcAudioOutputManagerBase$setAudioManagerMicrophoneMute$runnable$1";
    public final /* synthetic */ If6 A00;
    public final /* synthetic */ boolean A01;

    public Ixq(If6 if6, boolean z) {
        this.A00 = if6;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HtL A01;
        If6 if6 = this.A00;
        I5D i5d = if6.A03;
        if (i5d != null && (A01 = i5d.A01()) != null) {
            A01.A00(0Pz.A1C("set_microphone_mute ", this.A01));
        }
        AudioManager audioManager = if6.A02;
        boolean isMicrophoneMute = audioManager.isMicrophoneMute();
        boolean z = this.A01;
        if (z != isMicrophoneMute) {
            try {
                audioManager.setMicrophoneMute(z);
                if6.audioManagerQplLogger.Bct("set_microphone_mute", String.valueOf(z));
            } catch (SecurityException e) {
                if6.A05.AQu("RtcAudioOutputManagerBase", "Exception when calling AudioManager#setMicrophoneMute", e, AnonymousClass001.A1Z());
            }
        }
    }
}
