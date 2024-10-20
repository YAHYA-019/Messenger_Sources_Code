package X;

import android.view.View;
import com.facebook.video.player.RichVideoPlayer;

/* loaded from: Hrt.class */
public final class Hrt {
    public View.OnLayoutChangeListener A00;
    public H3A A01;
    public final 2Wo A02;

    public Hrt(2Wo r302) {
        this.A02 = r302;
        IlT.A00(r302, this, 3);
    }

    public int A00() {
        2Wo r0 = this.A02;
        if (r0.A00 == null) {
            return 0;
        }
        RichVideoPlayer richVideoPlayer = (RichVideoPlayer) r0.A01();
        GPs gPs = richVideoPlayer.A0D;
        return (gPs == null || !gPs.BUs()) ? richVideoPlayer.Afn() : richVideoPlayer.BJL();
    }

    public void A01() {
        2Wo r0 = this.A02;
        if (r0.A00 != null) {
            ((RichVideoPlayer) r0.A01()).CWm(C52j.A2Z);
        }
    }
}
