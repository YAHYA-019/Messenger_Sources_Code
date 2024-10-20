package X;

import com.facebook.rsys.videorender.gen.VideoRenderApi;

/* loaded from: H42.class */
public final class H42 extends Gyi {
    public final java.util.Map A00 = 1BK.A1C();
    public volatile boolean A01;

    public void setApi(VideoRenderApi videoRenderApi) {
        11T.A0F(videoRenderApi, 0);
        ((GyZ) this).A00 = new GyV(this, videoRenderApi);
        this.A01 = true;
    }
}
