package X;

import com.bloks.components.bkcomponentsvideo.subtitle.BKBloksSubtitlePlugin;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.engine.api.VideoPlayerParams;

/* loaded from: Iht.class */
public final class Iht implements C6df {
    public final /* synthetic */ BKBloksSubtitlePlugin A00;

    public Iht(BKBloksSubtitlePlugin bKBloksSubtitlePlugin) {
        this.A00 = bKBloksSubtitlePlugin;
    }

    @Override // X.C6df
    public int Afj() {
        BKBloksSubtitlePlugin bKBloksSubtitlePlugin = this.A00;
        GRX grx = ((C6d6) bKBloksSubtitlePlugin).A09;
        int i = 0;
        if (grx != null) {
            VideoPlayerParams videoPlayerParams = bKBloksSubtitlePlugin.A00;
            if (videoPlayerParams != null) {
                String str = videoPlayerParams.A0k;
                PlayerOrigin playerOrigin = ((C6d6) bKBloksSubtitlePlugin).A03;
                playerOrigin.getClass();
                i = grx.A00(playerOrigin, str);
            }
        } else {
            6Tu r0 = ((C6d6) bKBloksSubtitlePlugin).A08;
            if (r0 != null) {
                return r0.Afn();
            }
        }
        return i;
    }
}
