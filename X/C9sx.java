package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9sx, reason: invalid class name */
/* loaded from: 9sx.class */
public final class C9sx implements 3xS {
    public float A00;
    public float A01;

    public Integer C29(MotionEvent motionEvent, RecyclerView recyclerView) {
        boolean A1W = 1BL.A1W(recyclerView, motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A00 = motionEvent.getX();
            this.A01 = motionEvent.getY();
        } else if (action == 2) {
            boolean z = false;
            if (Math.abs(this.A01 - motionEvent.getY()) < Math.abs(this.A00 - motionEvent.getX())) {
                z = true;
            }
            float f = 0.0f / 0.0f;
            boolean canScrollHorizontally = recyclerView.canScrollHorizontally(-1);
            if (z && recyclerView.getParent() != null && canScrollHorizontally) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(A1W);
            }
        }
        return 0S2.A0C;
    }
}
