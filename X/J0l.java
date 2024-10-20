package X;

import com.facebook.messaging.rtc.incall.impl.mediasync.playbackview.MediaSyncPlaybackView;
import com.facebook.rsys.cowatch.gen.CowatchPlayerModel;

/* loaded from: J0l.class */
public final class J0l implements Runnable {
    public static final String __redex_internal_original_name = "MediaSyncPlaybackRsysPresenter$updateVideoPlayerState$1";
    public final /* synthetic */ GrG A00;
    public final /* synthetic */ CowatchPlayerModel A01;
    public final /* synthetic */ boolean A02;

    public J0l(GrG grG, CowatchPlayerModel cowatchPlayerModel, boolean z) {
        this.A00 = grG;
        this.A02 = z;
        this.A01 = cowatchPlayerModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6U2 A01;
        H2D h2c;
        JFq jFq = ((GS2) this.A00).A00;
        if (AbM.A1a(jFq)) {
            boolean z = this.A02;
            I9A i9a = ((MediaSyncPlaybackView) ((JPE) AbM.A0r(jFq))).A0H;
            if (z) {
                if (i9a == null) {
                    return;
                }
                long j = this.A01.mediaPositionMs;
                A01 = i9a.A01();
                if (A01 == null) {
                    return;
                } else {
                    h2c = new H2D(j);
                }
            } else {
                if (i9a == null) {
                    return;
                }
                long j2 = this.A01.mediaPositionMs;
                A01 = i9a.A01();
                if (A01 == null) {
                    return;
                } else {
                    h2c = new H2C(j2);
                }
            }
            A01.A06(h2c);
        }
    }
}
