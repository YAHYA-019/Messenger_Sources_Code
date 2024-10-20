package X;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: X.80t, reason: invalid class name */
/* loaded from: 80t.class */
public final class C80t implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout A00;

    public C80t(CoordinatorLayout coordinatorLayout) {
        this.A00 = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        this.A00.A0B(0);
        return true;
    }
}
