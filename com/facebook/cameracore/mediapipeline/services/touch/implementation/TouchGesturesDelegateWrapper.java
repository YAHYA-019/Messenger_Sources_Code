package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.11T;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import com.facebook.jni.HybridData;

/* loaded from: TouchGesturesDelegateWrapper.class */
public final class TouchGesturesDelegateWrapper {
    public final HybridData mHybridData = initHybrid();

    private final native void addGestureEventNative(Gesture gesture);

    private final native void addTouchEventNative(TouchEvent touchEvent);

    private final native void dispatchUnconsumedGesturesNative();

    private final native void enqueueForHitTestNative(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback);

    private final native HybridData initHybrid();

    public void addGestureEvent(Gesture gesture) {
        11T.A0F(gesture, 0);
        addGestureEventNative(gesture);
    }

    public void addTouchEvent(TouchEvent touchEvent) {
        addTouchEventNative(touchEvent);
    }

    public void dispatchUnconsumedGestures() {
        dispatchUnconsumedGesturesNative();
    }

    public void enqueueForHitTest(Gesture gesture, TouchGesturesListener$HitTestCallback touchGesturesListener$HitTestCallback) {
        11T.A0F(touchGesturesListener$HitTestCallback, 1);
        enqueueForHitTestNative(gesture, touchGesturesListener$HitTestCallback);
    }
}
