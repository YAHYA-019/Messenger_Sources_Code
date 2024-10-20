package X;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.HeaderBehavior;

/* loaded from: Lq7.class */
public final class Lq7 implements Runnable {
    public static final String __redex_internal_original_name = "HeaderBehavior$FlingRunnable";
    public final View A00;
    public final CoordinatorLayout A01;
    public final /* synthetic */ HeaderBehavior A02;

    public Lq7(View view, CoordinatorLayout coordinatorLayout, HeaderBehavior headerBehavior) {
        this.A02 = headerBehavior;
        this.A01 = coordinatorLayout;
        this.A00 = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        HeaderBehavior headerBehavior;
        OverScroller overScroller;
        View view = this.A00;
        if (view == null || (overScroller = (headerBehavior = this.A02).A01) == null) {
            return;
        }
        boolean computeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.A01;
        if (!computeScrollOffset) {
            headerBehavior.A06(view, coordinatorLayout);
        } else {
            headerBehavior.A07(coordinatorLayout, view, headerBehavior.A01.getCurrY());
            view.postOnAnimation(this);
        }
    }
}
