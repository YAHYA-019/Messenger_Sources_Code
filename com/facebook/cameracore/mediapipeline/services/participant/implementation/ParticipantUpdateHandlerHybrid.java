package com.facebook.cameracore.mediapipeline.services.participant.implementation;

import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: ParticipantUpdateHandlerHybrid.class */
public final class ParticipantUpdateHandlerHybrid {
    public final HybridData mHybridData;

    public ParticipantUpdateHandlerHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public final native void onParticipantDataUpdateNative(List list);
}
