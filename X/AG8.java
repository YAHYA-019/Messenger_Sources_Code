package X;

import android.view.View;

/* loaded from: AG8.class */
public final class AG8 implements Runnable {
    public static final String __redex_internal_original_name = "PollingXmaButtonCtaHandler$invoke$1$1$1$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ C7sh A01;
    public final /* synthetic */ 7Wh A02;

    public AG8(View view, C7sh c7sh, 7Wh r304) {
        this.A02 = r304;
        this.A01 = c7sh;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.CXA(this.A00, this.A01);
    }
}
