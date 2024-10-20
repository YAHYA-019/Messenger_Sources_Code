package com.facebook.cameracore.mediapipeline.arengineservices.utils;

import X.C0il;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;

/* loaded from: ManifestUtils.class */
public final class ManifestUtils {
    public static final ManifestUtils INSTANCE = new Object();
    public static boolean forceSOLoad;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.cameracore.mediapipeline.arengineservices.utils.ManifestUtils, java.lang.Object] */
    static {
        C0il.A0B("arengineservicesutils");
    }

    public static final native int[] filterNeededServicesNative(String str, String str2, int[] iArr, ARExperimentConfig aRExperimentConfig);
}
