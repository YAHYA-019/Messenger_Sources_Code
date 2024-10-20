package X;

import com.facebook.common.callercontext.CallerContext;

/* loaded from: Iqg.class */
public final class Iqg implements Runnable {
    public static final String __redex_internal_original_name = "CircularArtItemView$SetDownloadProgressRunnable";
    public final /* synthetic */ H51 A00;

    public Iqg(H51 h51) {
        this.A00 = h51;
    }

    @Override // java.lang.Runnable
    public void run() {
        H51 h51 = this.A00;
        CallerContext callerContext = H51.A08;
        h51.A05.setProgress(0.0d);
    }
}
