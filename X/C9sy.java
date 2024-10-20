package X;

import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;

/* renamed from: X.9sy, reason: invalid class name */
/* loaded from: 9sy.class */
public final class C9sy implements GEy {
    public final /* synthetic */ 66G A00;

    public C9sy(66G r302) {
        this.A00 = r302;
    }

    @Override // X.GEy
    public final boolean C25(MotionEvent motionEvent, NestedScrollView nestedScrollView) {
        if (nestedScrollView.getScrollY() == 0) {
            return this.A00.onTouchEvent(motionEvent);
        }
        return false;
    }
}
