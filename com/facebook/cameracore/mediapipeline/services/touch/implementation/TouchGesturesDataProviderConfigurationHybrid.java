package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.C2443Gdk;
import X.HGy;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: TouchGesturesDataProviderConfigurationHybrid.class */
public final class TouchGesturesDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final HGy Companion = new Object();
    public final C2443Gdk configuration;
    public final TouchGesturesDelegateWrapper delegate;

    public TouchGesturesDataProviderConfigurationHybrid(C2443Gdk c2443Gdk) {
        this.configuration = c2443Gdk;
        TouchGesturesDelegateWrapper touchGesturesDelegateWrapper = new TouchGesturesDelegateWrapper();
        this.delegate = touchGesturesDelegateWrapper;
        c2443Gdk.A00.A03.add(touchGesturesDelegateWrapper);
        this.mHybridData = initHybrid(touchGesturesDelegateWrapper);
    }

    public static final native HybridData initHybrid(TouchGesturesDelegateWrapper touchGesturesDelegateWrapper);
}
