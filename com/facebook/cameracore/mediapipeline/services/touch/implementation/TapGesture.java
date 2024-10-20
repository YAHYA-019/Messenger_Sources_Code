package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;

/* loaded from: TapGesture.class */
public class TapGesture extends Gesture {
    @Override // com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture
    public Gesture.GestureType getGestureType() {
        return Gesture.GestureType.TAP;
    }
}
