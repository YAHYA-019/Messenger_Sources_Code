package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: J0c.class */
public final class J0c implements Runnable {
    public static final String __redex_internal_original_name = "MontagePlayerLogger$1";
    public final /* synthetic */ Hb1 A00;
    public final /* synthetic */ PlayerOrigin A01;
    public final /* synthetic */ VideoPlayerParams A02;

    public J0c(Hb1 hb1, PlayerOrigin playerOrigin, VideoPlayerParams videoPlayerParams) {
        this.A00 = hb1;
        this.A01 = playerOrigin;
        this.A02 = videoPlayerParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        Hb1 hb1 = this.A00;
        if (this.A01 != null) {
            1BK.A0N(hb1.A00).AZk(36311685042080993L);
        }
    }
}
