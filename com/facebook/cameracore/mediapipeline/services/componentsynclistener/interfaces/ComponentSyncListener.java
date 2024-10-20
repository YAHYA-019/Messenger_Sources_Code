package com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces;

import X.0Q8;
import com.facebook.jni.HybridData;

/* loaded from: ComponentSyncListener.class */
public abstract class ComponentSyncListener {
    public HybridData mHybridData;

    public ComponentSyncListener() {
        throw 0Q8.createAndThrow();
    }

    public final native void flushLogs();
}
