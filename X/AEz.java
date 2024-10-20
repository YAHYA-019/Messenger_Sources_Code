package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;

/* loaded from: AEz.class */
public final class AEz implements Runnable {
    public static final String __redex_internal_original_name = "AiBotCardStackNullStateView$updateContainerHeight$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 8Cd A01;

    public AEz(8Cd r302, int i) {
        this.A01 = r302;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        8Cd r0 = this.A01;
        float f = NestedScrollView.A0T;
        View view = r0.A0C;
        int i = this.A00;
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, i));
        r0.A0D.setLayoutParams(new FrameLayout.LayoutParams(-1, i));
    }
}
