package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9r3, reason: invalid class name */
/* loaded from: 9r3.class */
public final class C9r3 implements 2Nv {
    public final int A00;
    public final Object A01;

    public C9r3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean C2A(MotionEvent motionEvent, RecyclerView recyclerView) {
        if (this.A00 == 0) {
            11T.A0F(motionEvent, 1);
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                return false;
            }
            ((View) this.A01).getParent().requestDisallowInterceptTouchEvent(false);
            return false;
        }
        11T.A0H(recyclerView, motionEvent);
        if (motionEvent.getAction() != 0 || recyclerView.A0d() != 2) {
            return false;
        }
        8Cf r0 = (8Cf) this.A01;
        float f = NestedScrollView.A0T;
        r0.A0I();
        8Cf.A02(r0, 1000L);
        return false;
    }

    public void CGu(boolean z) {
    }

    public void CR4(MotionEvent motionEvent, RecyclerView recyclerView) {
    }
}
