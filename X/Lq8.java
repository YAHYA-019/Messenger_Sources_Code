package X;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: Lq8.class */
public final class Lq8 implements Runnable {
    public static final String __redex_internal_original_name = "SwipeDismissBehavior$SettleRunnable";
    public final View A00;
    public final boolean A01;
    public final /* synthetic */ SwipeDismissBehavior A02;

    public Lq8(View view, SwipeDismissBehavior swipeDismissBehavior, boolean z) {
        this.A02 = swipeDismissBehavior;
        this.A00 = view;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        MGN mgn;
        SwipeDismissBehavior swipeDismissBehavior = this.A02;
        5XU r0 = swipeDismissBehavior.A03;
        if (r0 != null && r0.A0E()) {
            this.A00.postOnAnimation(this);
        } else {
            if (!this.A01 || (mgn = swipeDismissBehavior.A04) == null) {
                return;
            }
            mgn.Bu2(this.A00);
        }
    }
}
