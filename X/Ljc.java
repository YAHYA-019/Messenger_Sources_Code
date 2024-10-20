package X;

import android.view.View;

/* loaded from: Ljc.class */
public final class Ljc implements Runnable {
    public static final String __redex_internal_original_name = "ListPopupWindow$2";
    public final /* synthetic */ LLd A00;

    public Ljc(LLd lLd) {
        this.A00 = lLd;
    }

    @Override // java.lang.Runnable
    public void run() {
        LLd lLd = this.A00;
        View view = lLd.A06;
        if (view == null || view.getWindowToken() == null) {
            return;
        }
        lLd.CzI();
    }
}
