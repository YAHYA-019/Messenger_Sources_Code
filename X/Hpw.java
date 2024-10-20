package X;

import android.os.Handler;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;

/* loaded from: Hpw.class */
public final class Hpw {
    public final Handler A00;
    public final HYH A01;
    public final HeroPlayerSetting A02;
    public final Runnable A03;
    public volatile long A04;
    public volatile long A05;

    public Hpw(Handler handler, HYH hyh, HeroPlayerSetting heroPlayerSetting) {
        11T.A0F(handler, 2);
        this.A02 = heroPlayerSetting;
        this.A00 = handler;
        this.A01 = hyh;
        long j = -1;
        this.A05 = j;
        this.A04 = j;
        this.A03 = new Itt(this);
    }

    public final void A00() {
        if (this.A02.enableBlackscreenDetector) {
            this.A00.removeCallbacks(this.A03);
        }
    }
}
