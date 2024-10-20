package X;

import android.widget.FrameLayout;

/* loaded from: AF0.class */
public final class AF0 implements Runnable {
    public static final String __redex_internal_original_name = "AiBotNullStateView$updateContainerHeight$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 8Cf A01;

    public AF0(8Cf r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A0I.setLayoutParams(new FrameLayout.LayoutParams(-1, this.A00));
    }
}
