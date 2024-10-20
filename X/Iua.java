package X;

import com.facebook.video.subtitles.views.FbSubtitleView;

/* loaded from: Iua.class */
public final class Iua implements Runnable {
    public static final String __redex_internal_original_name = "FbSubtitleView$hideDelayRunnable$1";
    public final /* synthetic */ FbSubtitleView A00;

    public Iua(FbSubtitleView fbSubtitleView) {
        this.A00 = fbSubtitleView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0G.set(false);
    }
}
