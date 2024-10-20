package X;

import android.view.ViewGroup;

/* loaded from: Lm6.class */
public final class Lm6 implements Runnable {
    public static final String __redex_internal_original_name = "ReboundViewPagerAccessibilityDelegate$onRequestSendAccessibilityEvent$1";
    public final /* synthetic */ ViewGroup A00;

    public Lm6(ViewGroup viewGroup) {
        this.A00 = viewGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup = this.A00;
        viewGroup.announceForAccessibility(viewGroup.getResources().getString(2131962934));
    }
}
