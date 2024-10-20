package X;

import com.facebook.video.subtitles.views.FbSubtitleView;

/* loaded from: Iz9.class */
public final class Iz9 implements Runnable {
    public static final String __redex_internal_original_name = "FbSubtitleView$onHandleSubtitle$1";
    public final /* synthetic */ HcR A00;
    public final /* synthetic */ FbSubtitleView A01;

    public Iz9(HcR hcR, FbSubtitleView fbSubtitleView) {
        this.A01 = fbSubtitleView;
        this.A00 = hcR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FbSubtitleView fbSubtitleView = this.A01;
        fbSubtitleView.A00++;
        HcR hcR = this.A00;
        FbSubtitleView.A00(fbSubtitleView, hcR.A01);
        long j = hcR.A00;
        if (j != Long.MIN_VALUE) {
            AbG.A0B(fbSubtitleView.A0D).CY4(fbSubtitleView.A0F, j);
        }
    }
}
