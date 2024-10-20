package X;

import android.os.Handler;
import android.view.View;
import com.facebook.messaging.media.editing.trimmer.VideoEditGalleryTrimmerFilmstripView;
import com.facebook.video.player.RichVideoPlayer;

/* loaded from: Hso.class */
public final class Hso {
    public Handler A00;
    public View A01;
    public VideoEditGalleryTrimmerFilmstripView A02;
    public Runnable A03;
    public boolean A04;
    public final I9P A05;
    public final HsK A06;
    public final Hru A07;
    public final HRd A08;
    public final Runnable A09;

    public Hso(I9P i9p, HsK hsK, Hru hru, HRd hRd) {
        IqP iqP = new IqP(this);
        this.A09 = iqP;
        this.A03 = iqP;
        this.A08 = hRd;
        this.A07 = hru;
        this.A05 = i9p;
        this.A06 = hsK;
        this.A00 = new Handler();
    }

    public void A00() {
        this.A04 = false;
        this.A00.removeCallbacks(this.A03);
        View view = this.A01;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    public void A01(int i) {
        if (this.A02 == null || this.A01 == null) {
            return;
        }
        A00();
        this.A01.setVisibility(0);
        HRd hRd = this.A08;
        if (hRd != null) {
            int A00 = this.A07.A00(i);
            I9P i9p = hRd.A00.A0I;
            I9P.A00(i9p).A01();
            2Wo r0 = I9P.A00(i9p).A02;
            if (r0.A00 != null) {
                ((RichVideoPlayer) r0.A01()).CkD(C52j.A2Z, A00);
            }
            I9P.A01(i9p, A00);
        }
        VideoEditGalleryTrimmerFilmstripView videoEditGalleryTrimmerFilmstripView = this.A02;
        if (videoEditGalleryTrimmerFilmstripView != null) {
            videoEditGalleryTrimmerFilmstripView.A0W(i);
        }
    }
}
