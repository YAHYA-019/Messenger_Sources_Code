package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: Lql.class */
public final class Lql implements Runnable {
    public static final String __redex_internal_original_name = "BottomSheetBehavior$SettleRunnable";
    public int A00;
    public boolean A01;
    public final View A02;
    public final /* synthetic */ BottomSheetBehavior A03;

    public Lql(View view, BottomSheetBehavior bottomSheetBehavior, int i) {
        this.A03 = bottomSheetBehavior;
        this.A02 = view;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public void run() {
        BottomSheetBehavior bottomSheetBehavior = this.A03;
        5XU r0 = bottomSheetBehavior.A0J;
        if (r0 == null || !r0.A0E()) {
            bottomSheetBehavior.A0C(this.A00);
        } else {
            this.A02.postOnAnimation(this);
        }
        this.A01 = false;
    }
}
