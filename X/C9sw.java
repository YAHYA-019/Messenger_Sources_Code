package X;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9sw, reason: invalid class name */
/* loaded from: 9sw.class */
public final class C9sw implements 3xS {
    public final /* synthetic */ 8eT A00;

    public C9sw(8eT r302) {
        this.A00 = r302;
    }

    public final Integer C29(MotionEvent motionEvent, RecyclerView recyclerView) {
        recyclerView.getParent().requestDisallowInterceptTouchEvent(!this.A00.A0B);
        return 0S2.A0C;
    }
}
