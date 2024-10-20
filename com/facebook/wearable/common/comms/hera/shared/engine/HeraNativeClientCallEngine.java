package com.facebook.wearable.common.comms.hera.shared.engine;

import X.0DR;
import X.0Q8;
import X.AnonymousClass001;
import X.C01i;
import X.JHE;
import X.JO6;
import X.MQc;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfig;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioApi;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi;
import com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica;
import com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreApi;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: HeraNativeClientCallEngine.class */
public abstract class HeraNativeClientCallEngine extends HeraNativeCallEngine implements IHeraClientCallEngine {
    public static final Companion Companion = new Object();
    public static boolean haveNativeLibrariesLoaded;
    public final MQc connection;
    public final HeraNativeClientCallEngine$deviceProxy$1 deviceProxy;
    public final C01i featureAudioApi$delegate;
    public final C01i featureCameraApi$delegate;
    public final C01i featureCoreApi$delegate;
    public JHE remoteManagementEndpoint;
    public final JO6 remoteRtcEndpointListener;
    public EngineEnhancerReplica replica;
    public final HeraNativeClientCallEngine$replicaListener$1 replicaListener;

    /* loaded from: HeraNativeClientCallEngine$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public HeraNativeClientCallEngine(HeraCallEngineConfig heraCallEngineConfig) {
        throw 0Q8.createAndThrow();
    }

    public static final /* synthetic */ MQc access$getConnection$p(HeraNativeClientCallEngine heraNativeClientCallEngine) {
        throw AnonymousClass001.A0Q("connection");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object constructModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$constructModules$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L74
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$constructModules$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$constructModules$1) r0
            r304 = r0
            r0 = r304
            int r0 = r0.label
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L74
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.label = r1
        L32:
            r0 = r304
            java.lang.Object r0 = r0.result
            r307 = r0
            r0 = r304
            int r0 = r0.label
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 == 0) goto L5c
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L84
            r0 = r307
            X.0Dt.A00(r0)
        L50:
            com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica r0 = com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerReplica.CppProxy.create()
            X.11T.A0A(r0)
            java.lang.String r0 = "setReplica"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)
            throw r0
        L5c:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r304
            r1 = r301
            r0.L$0 = r1
            r0 = r304
            r1 = r303
            r0.label = r1
            r0 = r301
            r1 = r304
            java.lang.Object r0 = com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine.constructModules$suspendImpl(r0, r1)
            goto L50
        L74:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$constructModules$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$constructModules$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L84:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine.constructModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object init$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$init$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7b
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$init$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$init$1) r0
            r304 = r0
            r0 = r304
            int r0 = r0.label
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7b
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.label = r1
        L32:
            r0 = r304
            java.lang.Object r0 = r0.result
            r307 = r0
            X.0Ds r0 = X.0Ds.A02
            r308 = r0
            r0 = r304
            int r0 = r0.label
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 == 0) goto L5b
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L8b
            r0 = r307
            X.0Dt.A00(r0)
        L55:
            java.lang.String r0 = "getReplica"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)
            throw r0
        L5b:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r304
            r1 = r301
            r0.L$0 = r1
            r0 = r304
            r1 = r303
            r0.label = r1
            r0 = r301
            r1 = r304
            java.lang.Object r0 = com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine.init$suspendImpl(r0, r1)
            r309 = r0
            r0 = r309
            r1 = r308
            if (r0 != r1) goto L55
            r0 = r308
            return r0
        L7b:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$init$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$init$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine.init$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object loadNativeLibraries$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$loadNativeLibraries$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7e
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$loadNativeLibraries$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$loadNativeLibraries$1) r0
            r304 = r0
            r0 = r304
            int r0 = r0.label
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7e
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.label = r1
        L32:
            r0 = r304
            java.lang.Object r0 = r0.result
            r307 = r0
            r0 = r304
            int r0 = r0.label
            r303 = r0
            r0 = 1
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L6a
            r0 = r303
            r1 = r306
            if (r0 != r1) goto L8e
            r0 = r307
            X.0Dt.A00(r0)
        L4f:
            boolean r0 = com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine.haveNativeLibrariesLoaded
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L66
            java.lang.String r0 = "callengineconsensus"
            r308 = r0
            r0 = r308
            boolean r0 = X.C0il.A0B(r0)
            r0 = r306
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine.haveNativeLibrariesLoaded = r0
        L66:
            X.04S r0 = X.04S.A00
            return r0
        L6a:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r304
            r1 = r306
            r0.label = r1
            r0 = r301
            r1 = r304
            java.lang.Object r0 = com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine.loadNativeLibraries$suspendImpl(r0, r1)
            goto L4f
        L7e:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$loadNativeLibraries$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$loadNativeLibraries$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L8e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine.loadNativeLibraries$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object registerModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$registerModules$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6e
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$registerModules$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$registerModules$1) r0
            r304 = r0
            r0 = r304
            int r0 = r0.label
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L6e
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.label = r1
        L32:
            r0 = r304
            java.lang.Object r0 = r0.result
            r307 = r0
            r0 = r304
            int r0 = r0.label
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 == 0) goto L56
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L7e
            r0 = r307
            X.0Dt.A00(r0)
        L50:
            java.lang.String r0 = "getEngine"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)
            throw r0
        L56:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r304
            r1 = r301
            r0.L$0 = r1
            r0 = r304
            r1 = r303
            r0.label = r1
            r0 = r301
            r1 = r304
            java.lang.Object r0 = com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine.registerModules$suspendImpl(r0, r1)
            goto L50
        L6e:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$registerModules$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$registerModules$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L7e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine.registerModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object setupModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$setupModules$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L68
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$setupModules$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$setupModules$1) r0
            r304 = r0
            r0 = r304
            int r0 = r0.label
            r305 = r0
            r0 = -1
            r1 = -1
            int r0 = r0 << r1
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L68
            r0 = r305
            r1 = r306
            int r0 = r0 - r1
            r305 = r0
            r0 = r304
            r1 = r305
            r0.label = r1
        L32:
            r0 = r304
            java.lang.Object r0 = r0.result
            r307 = r0
            r0 = r304
            int r0 = r0.label
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 == 0) goto L56
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L78
            r0 = r307
            X.0Dt.A00(r0)
        L50:
            java.lang.String r0 = "getFeatureDevice"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0Q(r0)
            throw r0
        L56:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r304
            r1 = r301
            r0.L$0 = r1
            r0 = r304
            r1 = r303
            r0.label = r1
            goto L50
        L68:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$setupModules$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine$setupModules$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L78:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine.setupModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeClientCallEngine, X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object constructModules(0DR r302) {
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraClientCallEngine
    public abstract FeatureAudioApi getFeatureAudioApi();

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraClientCallEngine
    public abstract FeatureCameraApi getFeatureCameraApi();

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraClientCallEngine
    public abstract FeatureCoreApi getFeatureCoreApi();

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraClientCallEngine
    public abstract JHE getRemoteManagementEndpoint();

    public abstract EngineEnhancerReplica getReplica();

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine, X.JKm
    public Object init(0DR r302) {
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object loadNativeLibraries(0DR r302) {
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraClientCallEngine
    public abstract void registerCameras();

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraClientCallEngine
    public abstract void registerDevice();

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object registerModules(0DR r302) {
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraClientCallEngine
    public abstract void setRemoteManagementEndpoint(JHE jhe);

    public abstract void setReplica(EngineEnhancerReplica engineEnhancerReplica);

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object setupModules(0DR r302) {
        throw 0Q8.createAndThrow();
    }
}
