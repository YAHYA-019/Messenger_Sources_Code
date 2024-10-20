package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

/* loaded from: Gesture.class */
public abstract class Gesture {
    public final GestureState gestureState;
    public final long id;
    public final float x;
    public final float y;

    /* loaded from: Gesture$GestureType.class */
    public enum GestureType {
        TAP,
        PAN,
        PINCH,
        ROTATE,
        LONG_PRESS,
        RAW_TOUCH
    }

    public Gesture(long j, float f, float f2, GestureState gestureState, boolean z, float f3, float f4) {
        this.id = j;
        this.gestureState = gestureState;
        if (z || f3 <= 0.0f || f4 <= 0.0f) {
            this.x = f;
        } else {
            this.x = (f * f3) / f4;
            f2 = (f2 * f4) / f3;
        }
        this.y = f2;
    }

    public String getGestureStateName() {
        return this.gestureState.name();
    }

    public abstract GestureType getGestureType();

    public String getGestureTypeName() {
        return getGestureType().name();
    }
}
