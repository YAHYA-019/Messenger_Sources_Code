package com.facebook.cameracore.mediapipeline.engine.provider.messenger;

import X.C0il;
import X.HGo;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.PluginConfigProvider;
import com.facebook.jni.HybridData;

/* loaded from: MessengerPluginConfigProvider.class */
public final class MessengerPluginConfigProvider extends PluginConfigProvider {
    public static final HGo Companion = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [X.HGo, java.lang.Object] */
    static {
        C0il.A0B("graphicsengine-messenger-native");
    }

    public static final native HybridData initHybrid(Context context);
}
