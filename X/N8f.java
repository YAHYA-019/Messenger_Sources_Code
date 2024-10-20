package X;

import android.view.MotionEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import java.util.Set;

/* loaded from: N8f.class */
public final class N8f implements Runnable {
    public static final String __redex_internal_original_name = "SingleTouchGestureDetector$1";
    public final /* synthetic */ N3f A00;

    public N8f(N3f n3f) {
        this.A00 = n3f;
    }

    @Override // java.lang.Runnable
    public void run() {
        MotionEvent motionEvent;
        long A00;
        N3f n3f = this.A00;
        Boolean A0d = 1BK.A0d();
        int i = N3f.A0K;
        n3f.A07 = A0d;
        N1M n1m = n3f.A0H;
        N4i n4i = n1m.A03;
        boolean z = true;
        n4i.A0E = true;
        Set set = n4i.A0Q;
        Gesture.GestureType gestureType = Gesture.GestureType.LONG_PRESS;
        if (!set.contains(gestureType)) {
            if (n4i.A00 == 0 && n4i.A01 == 0) {
                N4i.A01(n4i);
            }
            z = false;
        }
        Boolean valueOf = Boolean.valueOf(z);
        n3f.A06 = valueOf;
        if (!valueOf.booleanValue() || (motionEvent = n3f.A05) == null) {
            return;
        }
        n3f.A00 = motionEvent.getX();
        float y = n3f.A05.getY();
        n3f.A01 = y;
        float f = n3f.A00;
        java.util.Map map = n4i.A0K;
        if (map.containsKey(gestureType)) {
            A00 = ((Number) map.get(gestureType)).longValue();
            if (N4i.A08(n4i, A00)) {
                return;
            }
        } else {
            A00 = N4i.A00(n4i, gestureType);
            N4i.A05(n4i, new Gesture(A00, f, y, Gesture.GestureState.BEGAN, n1m.A02, n1m.A00, n1m.A01));
        }
        N4i.A05(n4i, new Gesture(A00, f, y, Gesture.GestureState.CHANGED, n1m.A02, n1m.A00, n1m.A01));
    }
}
