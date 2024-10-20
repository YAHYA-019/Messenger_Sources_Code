package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchGesturesDelegateWrapper;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* loaded from: N4i.class */
public final class N4i {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public HandlerThread A04;
    public ScaleGestureDetector A05;
    public N0v A06;
    public N6Q A07;
    public N1M A08;
    public N1A A09;
    public N3f A0A;
    public WeakReference A0C;
    public boolean A0E;
    public final N2W A0G;
    public final Handler A0F = new Handler(Looper.getMainLooper());
    public boolean A0D = false;
    public final TouchGesturesListener$HitTestCallback A0R = new N6W(this);
    public final Set A0Q = AnonymousClass001.A0v();
    public N12 A0B = new N12(false, false, false, false, false, false, false);
    public final java.util.Map A0K = AnonymousClass001.A0u();
    public final java.util.Map A0L = AnonymousClass001.A0u();
    public final java.util.Map A0J = AnonymousClass001.A0u();
    public final java.util.Map A0M = AnonymousClass001.A0u();
    public final List A0I = new LinkedList();
    public final List A0H = new LinkedList();
    public final Set A0O = AnonymousClass001.A0v();
    public final Set A0P = AnonymousClass001.A0v();
    public final Set A0N = new LinkedHashSet();

    public N4i(N2W n2w) {
        this.A0G = n2w;
    }

    public static long A00(N4i n4i, Gesture.GestureType gestureType) {
        long j = n4i.A03;
        n4i.A03 = 1 + j;
        java.util.Map map = n4i.A0K;
        Long valueOf = Long.valueOf(j);
        map.put(gestureType, valueOf);
        n4i.A0L.put(valueOf, EnumC3478Mew.HIT_TESTING);
        return j;
    }

    public static void A01(N4i n4i) {
        List list = n4i.A0I;
        LinkedHashSet<MotionEvent> linkedHashSet = new LinkedHashSet(list);
        list.clear();
        n4i.A0N.addAll(linkedHashSet);
        for (MotionEvent motionEvent : linkedHashSet) {
            WeakReference weakReference = n4i.A0C;
            if (weakReference != null && weakReference.get() != null) {
                ((View) weakReference.get()).dispatchTouchEvent(motionEvent);
            }
        }
    }

    public static void A02(N4i n4i) {
        n4i.A0K.clear();
        n4i.A0L.clear();
        n4i.A0M.clear();
        n4i.A0I.clear();
        n4i.A0O.clear();
        n4i.A0N.clear();
        n4i.A0H.clear();
        n4i.A0D = false;
        n4i.A01 = 0;
        n4i.A00 = 0;
    }

    public static void A03(N4i n4i) {
        Set set = n4i.A0Q;
        set.clear();
        if (n4i.A0B.A05) {
            set.add(Gesture.GestureType.TAP);
        }
        if (n4i.A0B.A01) {
            set.add(Gesture.GestureType.PAN);
        }
        if (n4i.A0B.A02) {
            set.add(Gesture.GestureType.PINCH);
        }
        if (n4i.A0B.A04) {
            set.add(Gesture.GestureType.ROTATE);
        }
        if (n4i.A0B.A00) {
            set.add(Gesture.GestureType.LONG_PRESS);
        }
        if (n4i.A0B.A03) {
            set.add(Gesture.GestureType.RAW_TOUCH);
            N3f n3f = n4i.A0A;
            if (n3f != null) {
                n3f.A08 = AnonymousClass001.A0K();
            }
        }
    }

    public static void A04(N4i n4i, Gesture.GestureType gestureType) {
        Object remove;
        Object remove2;
        java.util.Map map = n4i.A0K;
        if (map.containsKey(gestureType) && (remove = map.remove(gestureType)) != null && (remove2 = n4i.A0L.remove(remove)) != null && remove2 == EnumC3478Mew.GESTURE_IS_HANDLED_BY_ENGINE) {
            n4i.A00--;
        }
        Set set = n4i.A0O;
        if (set.contains(gestureType)) {
            set.remove(gestureType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Long] */
    public static void A05(N4i n4i, Gesture gesture) {
        int ordinal;
        Set set;
        List list;
        java.util.Map map = n4i.A0L;
        if (!map.containsKey(Long.valueOf(gesture.id)) || (ordinal = ((EnumC3478Mew) map.get(Long.valueOf(gesture.id))).ordinal()) == 2) {
            return;
        }
        if (ordinal != 3) {
            if (ordinal == 0) {
                n4i.A01++;
                map.put(Long.valueOf(gesture.id), EnumC3478Mew.WAIT_HIT_TEST_RESULT);
                Iterator it = n4i.A0G.A03.iterator();
                while (it.hasNext()) {
                    ((TouchGesturesDelegateWrapper) it.next()).enqueueForHitTest(gesture, n4i.A0R);
                }
                return;
            }
            java.util.Map map2 = n4i.A0M;
            if (map2.containsKey(Long.valueOf(gesture.id))) {
                list = (List) map2.get(Long.valueOf(gesture.id));
            } else {
                list = new LinkedList();
                map2.put(Long.valueOf(gesture.id), list);
            }
            list.add(gesture);
            return;
        }
        Iterator it2 = n4i.A0G.A03.iterator();
        while (it2.hasNext()) {
            ((TouchGesturesDelegateWrapper) it2.next()).addGestureEvent(gesture);
        }
        Gesture.GestureState gestureState = gesture.gestureState;
        if (gestureState == Gesture.GestureState.ENDED || gestureState == Gesture.GestureState.CANCELLED || gestureState == Gesture.GestureState.FAILED) {
            Gesture.GestureType gestureType = gesture.getGestureType();
            if (gestureType == Gesture.GestureType.RAW_TOUCH) {
                set = n4i.A0P;
                gestureType = Long.valueOf(gesture.id);
            } else {
                set = n4i.A0O;
            }
            set.add(gestureType);
        }
    }

    public static void A06(N4i n4i, TouchEvent touchEvent) {
        Iterator it = n4i.A0G.A03.iterator();
        while (it.hasNext()) {
            ((TouchGesturesDelegateWrapper) it.next()).addTouchEvent(touchEvent);
        }
    }

    public static void A07(N4i n4i, Long l) {
        Object remove = n4i.A0L.remove(l);
        if (remove != null && remove == EnumC3478Mew.GESTURE_IS_HANDLED_BY_ENGINE) {
            n4i.A00--;
        }
        Set set = n4i.A0P;
        if (set.contains(l)) {
            set.remove(l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.get(r0) != X.EnumC3478Mew.GESTURE_IS_HANDLED_BY_CLIENT) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A08(X.N4i r301, long r302) {
        /*
            r0 = r301
            java.util.Map r0 = r0.A0L
            r301 = r0
            r0 = r302
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r304 = r0
            r0 = r301
            r1 = r304
            boolean r0 = r0.containsKey(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2c
            r0 = r301
            r1 = r304
            java.lang.Object r0 = r0.get(r1)
            r301 = r0
            X.Mew r0 = X.EnumC3478Mew.GESTURE_IS_HANDLED_BY_CLIENT
            r304 = r0
            r0 = 1
            r305 = r0
            r0 = r301
            r1 = r304
            if (r0 == r1) goto L2f
        L2c:
            r0 = 0
            r305 = r0
        L2f:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4i.A08(X.N4i, long):boolean");
    }
}
