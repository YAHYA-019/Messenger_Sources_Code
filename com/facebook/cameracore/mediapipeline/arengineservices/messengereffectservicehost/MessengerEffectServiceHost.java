package com.facebook.cameracore.mediapipeline.arengineservices.messengereffectservicehost;

import X.0fH;
import X.AnonymousClass000;
import X.C0il;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.snapshotter.interfaces.EffectDataSnapshotterCreatorFactory;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: MessengerEffectServiceHost.class */
public class MessengerEffectServiceHost extends EffectServiceHost {
    public static volatile boolean sIsLibraryLoaded;
    public ARExperimentConfig mARExperimentConfig;
    public AnalyticsLogger mAnalyticsLogger;
    public NetworkClient mNetworkClient;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.HGi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MessengerEffectServiceHost(android.content.Context r302, X.FbP r303, X.HpG r304, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r305, X.C01s r306, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r307, java.lang.String r308, X.I8T r309, com.facebook.cameracore.mediapipeline.snapshotter.interfaces.EffectDataSnapshotterCreatorFactory r310) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.messengereffectservicehost.MessengerEffectServiceHost.<init>(android.content.Context, X.FbP, X.HpG, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.01s, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, java.lang.String, X.I8T, com.facebook.cameracore.mediapipeline.snapshotter.interfaces.EffectDataSnapshotterCreatorFactory):void");
    }

    public static void ensureLibraryLoaded() {
        synchronized (MessengerEffectServiceHost.class) {
            if (!sIsLibraryLoaded) {
                C0il.A0B("graphicsengine-arengineservices-messengereffectservicehost-native");
                try {
                    C0il.A0C("dynamic_pytorch_impl", 16);
                    C0il.A0C("torch-code-gen", 16);
                    C0il.A0C("pytorch_jni_lite", 16);
                    C0il.A0C(AnonymousClass000.A00(94), 16);
                } catch (Throwable th) {
                    0fH.A0w("MessengerEffectServiceHost", "SoLoader pytorch library exception:", th);
                }
                sIsLibraryLoaded = true;
            }
        }
    }

    private native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger, NetworkClient networkClient, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list, EffectDataSnapshotterCreatorFactory effectDataSnapshotterCreatorFactory);

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost
    public void destroy() {
        HybridData hybridData;
        super.destroy();
        HybridData hybridData2 = this.mARExperimentConfig.mHybridData;
        if (hybridData2 != null) {
            hybridData2.resetNative();
        }
        AnalyticsLogger analyticsLogger = this.mAnalyticsLogger;
        if (analyticsLogger != null) {
            AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) analyticsLogger;
            analyticsLoggerImpl.mHybridData.resetNative();
            analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        }
        NetworkClient networkClient = this.mNetworkClient;
        if (networkClient != null && (hybridData = networkClient.mHybridData) != null) {
            hybridData.resetNative();
        }
        this.mNetworkClient = null;
        this.mAnalyticsLogger = null;
    }
}
