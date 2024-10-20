package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import X.H9S;
import X.HAt;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: EffectManifest.class */
public class EffectManifest {
    public final boolean frameDataNeeded;
    public final HAt frameFormatForPostProcessing;
    public final boolean horizontalTrackableDetectionNeeded;
    public HybridData mHybridData;
    public final boolean multipleOutputsSupported;
    public final boolean platformAlgorithmDataNeeded;
    public final boolean realScaleEstimationNeeded;
    public final boolean sLAMNeeded;
    public final H9S specifiedCameraFacing;
    public final boolean supportsLandscape;
    public final boolean supportsLongPressGesture;
    public final boolean supportsPanGesture;
    public final boolean supportsPinchGesture;
    public final boolean supportsPortrait;
    public final boolean supportsRawTouchGesture;
    public final boolean supportsRotateGesture;
    public final boolean supportsTapGesture;
    public final boolean usesAssistantCapability;
    public final boolean usesGalleryPicker;
    public final boolean usesGeoanchorCapability;
    public final boolean usesMultiplane;
    public final boolean usesPickerCapability;
    public final boolean usesSceneDepth;
    public final boolean usesSliderCapability;
    public final boolean usesTouchService;
    public final boolean usesWOLF;
    public final boolean usesWorldTracking;
    public final boolean usesWorldTrackingEnvironmentLight;
    public final boolean verticalTrackableDetectionNeeded;

    public EffectManifest() {
        this(null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EffectManifest(com.facebook.jni.HybridData r302, boolean r303, boolean r304, boolean r305, boolean r306, boolean r307, boolean r308, boolean r309, boolean r310, boolean r311, boolean r312, boolean r313, boolean r314, boolean r315, boolean r316, boolean r317, boolean r318, boolean r319, boolean r320, boolean r321, boolean r322, boolean r323, boolean r324, boolean r325, boolean r326, boolean r327, boolean r328, int r329, int r330) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectManifest.<init>(com.facebook.jni.HybridData, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, int):void");
    }

    public static native EffectManifest createFromDir(String str);

    private native List nativeGetEnabledCapabilities();

    private native boolean nativeGetServiceNeeded(int i);
}
