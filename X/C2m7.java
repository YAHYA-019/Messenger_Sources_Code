package X;

import android.graphics.Canvas;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2m7, reason: invalid class name */
/* loaded from: 2m7.class */
public final class C2m7 extends RecyclerView implements 2Mp {
    public 3xS A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public List A05;

    public void CcZ(2XR r302) {
        List list = this.A05;
        if (list == null) {
            list = new ArrayList();
            this.A05 = list;
        }
        list.add(r302);
    }

    public void D66(2XR r302) {
        List list = this.A05;
        if (list != null) {
            list.remove(r302);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        List list = this.A05;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((2XR) this.A05.get(i)).CXx(getChildCount());
            }
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (this.A01) {
            return super.getBottomFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (this.A02) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (this.A03) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (this.A04) {
            return super.getTopFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean onInterceptTouchEvent;
        3xS r0 = this.A00;
        if (r0 != null) {
            int intValue = r0.C29(motionEvent, this).intValue();
            onInterceptTouchEvent = false;
            if (intValue == 0) {
                return true;
            }
            if (intValue != 1) {
                if (intValue != 2) {
                    throw 0Pz.A05("Unknown TouchInterceptor.Result: ", "INTERCEPT_TOUCH_EVENT");
                }
            }
            return onInterceptTouchEvent;
        }
        onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        return onInterceptTouchEvent;
    }
}
