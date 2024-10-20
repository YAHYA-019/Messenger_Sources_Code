package X;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.332, reason: invalid class name */
/* loaded from: 332.class */
public final class AnonymousClass332 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ 2Ok A00;

    public AnonymousClass332(2Ok r302) {
        this.A00 = r302;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C8y c8y = this.A00.A06;
        if (c8y == null) {
            return true;
        }
        c8y.A00();
        return true;
    }
}
