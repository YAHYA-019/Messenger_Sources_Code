package X;

import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;
import com.facebook.video.plugins.SoundTogglePlugin;

/* loaded from: J3E.class */
public final class J3E implements Runnable {
    public static final String __redex_internal_original_name = "SoundTogglePlugin$logVideoMuteUnmuteEvent$2";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 6TN A01;
    public final /* synthetic */ PlayerOrigin A02;
    public final /* synthetic */ VideoPlayerParams A03;
    public final /* synthetic */ SoundTogglePlugin A04;

    public J3E(6TN r302, PlayerOrigin playerOrigin, VideoPlayerParams videoPlayerParams, SoundTogglePlugin soundTogglePlugin, int i) {
        this.A04 = soundTogglePlugin;
        this.A03 = videoPlayerParams;
        this.A01 = r302;
        this.A00 = i;
        this.A02 = playerOrigin;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SoundTogglePlugin soundTogglePlugin = this.A04;
        C52j c52j = SoundTogglePlugin.A08;
        5Kt r0 = (5Kt) 1Br.A0B(soundTogglePlugin.A05);
        VideoPlayerParams videoPlayerParams = this.A03;
        C03353xs c03353xs = videoPlayerParams.A0Y;
        6TN r02 = this.A01;
        String str = C52j.A2Z.value;
        int i = this.A00;
        r0.A0i(r02, this.A02, videoPlayerParams, c03353xs, str, videoPlayerParams.A0k, (String) null, (String) null, i);
    }
}
