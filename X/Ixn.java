package X;

import com.facebook.rsys.audio.gen.AudioApi;

/* loaded from: Ixn.class */
public final class Ixn implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$setAudioOn$runnable$1$audioOnRunnable$1";
    public final /* synthetic */ Gw0 A00;
    public final /* synthetic */ boolean A01;

    public Ixn(Gw0 gw0, boolean z) {
        this.A00 = gw0;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioApi audioApi = this.A00.A00;
        if (audioApi != null) {
            int i = 0;
            if (this.A01) {
                i = 2;
            }
            audioApi.setAudioActivationState(i);
        }
    }
}
