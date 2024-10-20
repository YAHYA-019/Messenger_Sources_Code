package X;

import com.facebook.rsys.audio.gen.AudioApi;
import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* loaded from: Ixm.class */
public final class Ixm implements Runnable {
    public static final String __redex_internal_original_name = "AndroidAudioProxy$onAudioRouteChanged$audioOutputRunnable$1";
    public final /* synthetic */ AudioOutputRoute A00;
    public final /* synthetic */ Gw0 A01;

    public Ixm(AudioOutputRoute audioOutputRoute, Gw0 gw0) {
        this.A01 = gw0;
        this.A00 = audioOutputRoute;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioApi audioApi = this.A01.A00;
        if (audioApi != null) {
            audioApi.setAudioOutputRoute(this.A00);
        }
        11T.A0O(AudioOutputRoute.UNKNOWN, this.A00);
    }
}
