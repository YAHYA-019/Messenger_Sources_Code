package X;

import com.facebook.video.subtitles.views.FbSubtitleView;

/* loaded from: Ihu.class */
public final class Ihu implements C6df {
    public final FbSubtitleView A00;

    public Ihu(FbSubtitleView fbSubtitleView) {
        this.A00 = fbSubtitleView;
    }

    @Override // X.C6df
    public int Afj() {
        C6df c6df = this.A00.A03;
        if (c6df != null) {
            return c6df.Afj();
        }
        return 0;
    }
}
