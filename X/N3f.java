package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.PanGesture;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.RawTouchGesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;

/* loaded from: N3f.class */
public final class N3f {
    public static final int A0K = ViewConfiguration.getLongPressTimeout();
    public static final int A0L = ViewConfiguration.getTapTimeout();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public MotionEvent A05;
    public Boolean A09;
    public Float A0A;
    public Float A0B;
    public Float A0C;
    public Float A0D;
    public boolean A0E;
    public final GestureDetector A0G;
    public final N1M A0H;
    public final java.util.Map A0J;
    public final Handler A0F = new Handler(Looper.getMainLooper());
    public Boolean A06 = false;
    public Boolean A07 = false;
    public Boolean A08 = false;
    public final Runnable A0I = new N8f(this);

    public N3f(Context context, Handler handler, N1M n1m) {
        GestureDetector gestureDetector = new GestureDetector(context, new N6P(this), handler);
        this.A0G = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A0H = n1m;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.A04 = scaledTouchSlop * scaledTouchSlop;
        this.A0J = AnonymousClass001.A0u();
    }

    public static void A00(N3f n3f, float f, float f2, float f3, float f4, long j) {
        N1M n1m = n3f.A0H;
        TouchEvent touchEvent = new TouchEvent(f3, f4, j, TouchEvent.TouchEventType.UP, System.currentTimeMillis(), n1m.A02, n1m.A00, n1m.A01);
        N4i n4i = n1m.A03;
        N4i.A06(n4i, touchEvent);
        java.util.Map map = n4i.A0J;
        Number number = (Number) map.remove(Long.valueOf(j));
        if (number != null) {
            if (map.isEmpty() && N4i.A08(n4i, number.longValue())) {
                n4i.A0P.add(number);
            } else {
                N4i.A05(n4i, new RawTouchGesture(number.longValue(), f3 - f, f4 - f2, f3, f4, Gesture.GestureState.ENDED, n1m.A02, n1m.A00, n1m.A01));
            }
        }
    }

    public static void A01(N3f n3f, float f, float f2, long j) {
        N1M n1m = n3f.A0H;
        TouchEvent touchEvent = new TouchEvent(f, f2, j, TouchEvent.TouchEventType.DOWN, System.currentTimeMillis(), n1m.A02, n1m.A00, n1m.A01);
        N4i n4i = n1m.A03;
        N4i.A06(n4i, touchEvent);
        java.util.Map map = n4i.A0J;
        Long valueOf = Long.valueOf(j);
        if (map.containsKey(valueOf)) {
            return;
        }
        long j2 = n4i.A03;
        n4i.A03 = 1 + j2;
        Long valueOf2 = Long.valueOf(j2);
        map.put(valueOf, valueOf2);
        n4i.A0L.put(valueOf2, EnumC3478Mew.HIT_TESTING);
        N4i.A05(n4i, new RawTouchGesture(j2, 0.0f, 0.0f, f, f2, Gesture.GestureState.BEGAN, n1m.A02, n1m.A00, n1m.A01));
    }

    public void A02(float f, float f2, float f3, float f4) {
        long A00;
        Boolean bool = this.A09;
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        float f5 = f - this.A02;
        this.A0A = Float.valueOf(f5);
        float f6 = f2 - this.A03;
        this.A0B = Float.valueOf(f6);
        Float f7 = this.A0C;
        if (f7 == null) {
            f7 = Float.valueOf(f3);
            this.A0C = f7;
            this.A0D = Float.valueOf(f4);
        }
        N1M n1m = this.A0H;
        float floatValue = f7.floatValue();
        float floatValue2 = this.A0D.floatValue();
        N4i n4i = n1m.A03;
        java.util.Map map = n4i.A0K;
        Gesture.GestureType gestureType = Gesture.GestureType.PAN;
        if (map.containsKey(gestureType)) {
            A00 = ((Number) map.get(gestureType)).longValue();
            if (N4i.A08(n4i, A00)) {
                return;
            }
        } else {
            A00 = N4i.A00(n4i, gestureType);
            N4i.A05(n4i, new PanGesture(A00, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.BEGAN, n1m.A02, n1m.A00, n1m.A01));
        }
        N4i.A05(n4i, new PanGesture(A00, f5 - floatValue, f6 - floatValue2, f5, f6, Gesture.GestureState.CHANGED, n1m.A02, n1m.A00, n1m.A01));
    }
}
