package X;

import android.app.Activity;
import android.os.Looper;
import android.view.MotionEvent;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.3zb, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3zb.class */
public final class C03923zb implements 2wL {
    public final LinkedBlockingDeque A00 = new LinkedBlockingDeque(5);

    public void CQz(Activity activity, MotionEvent motionEvent) {
        11T.A0F(motionEvent, 1);
        if (motionEvent.getAction() == 0 && 11T.A0O(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            try {
                LinkedBlockingDeque linkedBlockingDeque = this.A00;
                if (linkedBlockingDeque.remainingCapacity() == 0) {
                    linkedBlockingDeque.pollLast();
                }
                linkedBlockingDeque.offerFirst(MotionEvent.obtain(motionEvent));
            } catch (Exception unused) {
            }
        }
    }
}
