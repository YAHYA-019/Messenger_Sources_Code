package X;

import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsApi;
import com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy;

/* loaded from: Gyf.class */
public final class Gyf extends VideoSubscriptionsProxy {
    public VideoSubscriptionsApi A00;

    public Gyf() {
        if (this.A00 != null) {
            throw 1BK.A0g();
        }
    }

    @Override // com.facebook.rsys.videosubscriptions.gen.VideoSubscriptionsProxy
    public void setApi(VideoSubscriptionsApi videoSubscriptionsApi) {
        11T.A0F(videoSubscriptionsApi, 0);
        this.A00 = videoSubscriptionsApi;
    }
}
