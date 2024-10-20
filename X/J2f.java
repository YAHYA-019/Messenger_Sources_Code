package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: J2f.class */
public final class J2f implements Runnable {
    public static final String __redex_internal_original_name = "InboxAdsPostClickVideoSoundTogglePlugin$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ H2v A01;
    public final /* synthetic */ 6TN A02;
    public final /* synthetic */ PlayerOrigin A03;
    public final /* synthetic */ VideoPlayerParams A04;

    public J2f(H2v h2v, 6TN r303, PlayerOrigin playerOrigin, VideoPlayerParams videoPlayerParams, int i) {
        this.A01 = h2v;
        this.A04 = videoPlayerParams;
        this.A02 = r303;
        this.A00 = i;
        this.A03 = playerOrigin;
    }

    @Override // java.lang.Runnable
    public void run() {
        5Kt r0 = this.A01.A03;
        VideoPlayerParams videoPlayerParams = this.A04;
        C03353xs c03353xs = videoPlayerParams.A0Y;
        6TN r02 = this.A02;
        String str = C52j.A2Z.value;
        int i = this.A00;
        r0.A0h(r02, this.A03, videoPlayerParams, c03353xs, str, videoPlayerParams.A0k, (String) null, (String) null, i);
    }
}
