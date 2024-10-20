package X;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.facebook.messaging.rtc.incall.impl.active.drawer.ui.sheet.DrawerBehavior;

/* loaded from: Hsi.class */
public final class Hsi {
    public int A00;
    public VelocityTracker A01;
    public boolean A02 = true;
    public boolean A03;
    public int A04;
    public boolean A05;
    public final boolean A06;
    public final /* synthetic */ DrawerBehavior A07;

    public Hsi(DrawerBehavior drawerBehavior, boolean z) {
        this.A07 = drawerBehavior;
        this.A06 = z;
    }

    public boolean A00(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (view.isShown() && this.A02) {
            int actionMasked = motionEvent.getActionMasked();
            DrawerBehavior drawerBehavior = this.A07;
            if (drawerBehavior.A04 == 1 && actionMasked == 0) {
                return true;
            }
            5XU r0 = drawerBehavior.A08;
            if (r0 != null) {
                drawerBehavior.A0C = !this.A06;
                try {
                    r0.A0C(motionEvent);
                } catch (IllegalArgumentException e) {
                    4zI.A01("DrawerBehavior", "Catching to prevent a 'pointerIndex out of range' crash.", new Object[]{e});
                    return false;
                }
            }
            if (actionMasked == 0) {
                float f = 0.0f / 0.0f;
                this.A00 = -1;
                VelocityTracker velocityTracker = this.A01;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.A01 = null;
                }
            }
            VelocityTracker velocityTracker2 = this.A01;
            if (velocityTracker2 == null) {
                velocityTracker2 = VelocityTracker.obtain();
                this.A01 = velocityTracker2;
            }
            velocityTracker2.addMovement(motionEvent);
            if (actionMasked == 2 && !this.A05 && drawerBehavior.A08 != null) {
                float A01 = DKC.A01(this.A04, motionEvent.getY());
                5XU r02 = drawerBehavior.A08;
                if (A01 > r02.A06) {
                    r02.A0D(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
                }
            }
            z = !this.A05;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b2, code lost:
    
        if (r301.A03 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0178, code lost:
    
        if ((r302.A0E(r303, r0, r301.A04) ^ r301.A06) != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(androidx.coordinatorlayout.widget.CoordinatorLayout r302, android.view.View r303, android.view.MotionEvent r304) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Hsi.A01(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }
}
