package X;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: Lq9.class */
public final class Lq9 implements Runnable {
    public static final String __redex_internal_original_name = "BottomSheetBehavior$1";
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup.LayoutParams A01;
    public final /* synthetic */ BottomSheetBehavior A02;

    public Lq9(View view, ViewGroup.LayoutParams layoutParams, BottomSheetBehavior bottomSheetBehavior) {
        this.A02 = bottomSheetBehavior;
        this.A00 = view;
        this.A01 = layoutParams;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.setLayoutParams(this.A01);
    }
}
