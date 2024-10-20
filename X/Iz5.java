package X;

import com.facebook.video.plugins.common.VideoPlugin;

/* loaded from: Iz5.class */
public final class Iz5 implements Runnable {
    public static final String __redex_internal_original_name = "VideoPlugin$PlayerStateChangedEventSubscriber$handleEvent$1";
    public final /* synthetic */ VideoPlugin A00;
    public final /* synthetic */ boolean A01;

    public Iz5(VideoPlugin videoPlugin, boolean z) {
        this.A00 = videoPlugin;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A03.setKeepScreenOn(this.A01);
    }
}
