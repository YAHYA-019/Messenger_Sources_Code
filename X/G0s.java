package X;

import android.view.View;
import com.facebook.quicksilver.webviewprocess.QuicksilverWebViewActivity;

/* loaded from: G0s.class */
public final class G0s implements Runnable {
    public static final String __redex_internal_original_name = "QuicksilverWebViewActivity$onHideBanner$1";
    public final /* synthetic */ QuicksilverWebViewActivity A00;

    public G0s(QuicksilverWebViewActivity quicksilverWebViewActivity) {
        this.A00 = quicksilverWebViewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GIR gir;
        QuicksilverWebViewActivity quicksilverWebViewActivity = this.A00;
        View view = quicksilverWebViewActivity.A01;
        if (view == null || (gir = quicksilverWebViewActivity.A02) == null) {
            return;
        }
        gir.destroyBannerAd(view);
        quicksilverWebViewActivity.A01 = null;
    }
}
