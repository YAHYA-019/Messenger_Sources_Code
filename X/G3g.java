package X;

import android.view.View;

/* loaded from: G3g.class */
public final class G3g implements Runnable {
    public static final String __redex_internal_original_name = "DialtoneBannerTooltipUtil$2";
    public final /* synthetic */ View A00;
    public final /* synthetic */ FFI A01;
    public final /* synthetic */ Fik A02;

    public G3g(View view, FFI ffi, Fik fik) {
        this.A01 = ffi;
        this.A00 = view;
        this.A02 = fik;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        View view = this.A00;
        view.getLocationInWindow(iArr);
        if (iArr[0] == 0 && iArr[1] == 0) {
            view.removeCallbacks(this);
        } else {
            view.removeCallbacks(this);
            this.A02.A01(view);
        }
    }
}
