package com.facebook.graphservice.nativeconfigloader;

import X.C0gh;

/* loaded from: GraphServiceNativeConfigLoader.class */
public final class GraphServiceNativeConfigLoader {
    public static final GraphServiceNativeConfigLoader INSTANCE = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.graphservice.nativeconfigloader.GraphServiceNativeConfigLoader, java.lang.Object] */
    static {
        C0gh.A02("graphservice-jni-nativeconfigloader");
    }

    public static final native void loadNativeConfigs();
}
