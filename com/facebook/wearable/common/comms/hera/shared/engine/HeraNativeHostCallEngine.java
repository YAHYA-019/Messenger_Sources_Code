package com.facebook.wearable.common.comms.hera.shared.engine;

import X.0BY;
import X.0DR;
import X.0Q8;
import X.11T;
import X.7zM;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0Bx;
import X.JHE;
import X.JJN;
import X.JO6;
import X.KFu;
import X.KGw;
import X.KPe;
import X.Lge;
import android.content.Context;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfig;
import com.facebook.wearable.common.comms.hera.shared.intf.HeraCallingCoordinationType;
import com.facebook.wearable.common.comms.hera.shared.lifecycle.ILifecycleObserver;
import com.meta.hera.engine.device.Device;
import com.meta.hera.engine.device.PhonePeripheralState;
import com.meta.wearable.comms.calling.hera.engine.base.Any;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi;
import com.meta.wearable.comms.calling.hera.engine.consensus.DataListener;
import com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary;
import com.meta.wearable.comms.calling.hera.engine.device.FeatureDeviceProxy;
import java.nio.ByteBuffer;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: HeraNativeHostCallEngine.class */
public abstract class HeraNativeHostCallEngine extends HeraNativeCallEngine implements IHeraHostCallEngine {
    public static final Companion Companion = new Object();
    public static boolean haveNativeLibrariesLoaded;
    public Context activityContext;
    public final ILifecycleObserver.LifecycleListener appLifecycleListener;
    public final CallCoordinationBroadcaster broadcaster;
    public final C01i cameraApi$delegate;
    public final HeraCallEngineConfig config;
    public final JJN connection;
    public final HeraNativeHostCallEngine$deviceProxy$1 deviceProxy;
    public EngineEnhancerPrimary primary;
    public final HeraNativeHostCallEngine$primaryListener$1 primaryListener;
    public final JHE remoteManagementEndpoint;
    public final JJN remoteRtcEndpoint;
    public final JO6 remoteRtcEndpointListener;

    /* loaded from: HeraNativeHostCallEngine$Companion.class */
    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v44, types: [com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$deviceProxy$1] */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$primaryListener$1] */
    public HeraNativeHostCallEngine(HeraCallEngineConfig heraCallEngineConfig) {
        super(heraCallEngineConfig);
        11T.A0F(heraCallEngineConfig, 1);
        this.config = heraCallEngineConfig;
        HeraContext heraContext = heraCallEngineConfig.heraContext;
        Map map = 0BY.A03;
        String A00 = C0Bx.A00(JJN.class);
        if (A00 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JJN jjn = (JJN) heraContext.getObject(A00);
        if (jjn == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.remoteRtcEndpoint = jjn;
        HeraContext heraContext2 = heraCallEngineConfig.heraContext;
        String A002 = C0Bx.A00(JHE.class);
        if (A002 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        JHE jhe = (JHE) heraContext2.getObject(A002);
        this.remoteManagementEndpoint = jhe;
        CallCoordinationBroadcaster callCoordinationBroadcaster = jhe != null ? new CallCoordinationBroadcaster(jjn, jhe) : null;
        this.broadcaster = callCoordinationBroadcaster;
        this.connection = callCoordinationBroadcaster != null ? callCoordinationBroadcaster : jjn;
        this.cameraApi$delegate = C01g.A00(C03i.A02, new HeraNativeHostCallEngine$cameraApi$2(this));
        this.deviceProxy = new FeatureDeviceProxy() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$deviceProxy$1
            @Override // com.meta.wearable.comms.calling.hera.engine.device.FeatureDeviceProxy
            public Device getDevice() {
                KFu A02 = Lge.A02();
                KPe kPe = KPe.A02;
                ((Device) KGw.A00(A02)).role_ = kPe.getNumber();
                PhonePeripheralState phonePeripheralState = HeraNativeHostCallEngine.this.getPhonePeripheralState();
                Device device = (Device) KGw.A00(A02);
                phonePeripheralState.getClass();
                device.peripheralState_ = phonePeripheralState;
                device.peripheralStateCase_ = 7;
                return (Device) A02.A05();
            }
        };
        this.remoteRtcEndpointListener = new JO6() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$remoteRtcEndpointListener$1
            @Override // X.JO6
            public final void onCoordination(int i, int i2, ByteBuffer byteBuffer) {
                11T.A0F(byteBuffer, 2);
                EngineEnhancerPrimary primary = HeraNativeHostCallEngine.this.getPrimary();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                byteBuffer.flip();
                primary.provideAction(bArr);
            }
        };
        this.primaryListener = new DataListener() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$primaryListener$1
            @Override // com.meta.wearable.comms.calling.hera.engine.consensus.DataListener
            public void onData(byte[] bArr) {
                11T.A0F(bArr, 0);
                JJN connection = HeraNativeHostCallEngine.this.getConnection();
                int ordinal = HeraCallingCoordinationType.CALL_ENGINE.ordinal();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
                allocateDirect.put(bArr);
                allocateDirect.flip();
                connection.sendCoordinationUpdate(0, ordinal, allocateDirect);
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object constructModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$constructModules$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L84
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$constructModules$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$constructModules$1) r0
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
            if (r0 == 0) goto L84
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
            if (r0 == 0) goto L6c
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L94
            r0 = r304
            java.lang.Object r0 = r0.L$0
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine) r0
            r301 = r0
            r0 = r307
            X.0Dt.A00(r0)
        L58:
            com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary r0 = com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary.CppProxy.create()
            r308 = r0
            r0 = r308
            X.11T.A0A(r0)
            r0 = r301
            r1 = r308
            r0.primary = r1
            X.04S r0 = X.04S.A00
            return r0
        L6c:
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
            goto L58
        L84:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$constructModules$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$constructModules$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L94:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine.constructModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object init$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r301, X.0DR r302) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine.init$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object loadNativeLibraries$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$loadNativeLibraries$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L7e
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$loadNativeLibraries$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$loadNativeLibraries$1) r0
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
            boolean r0 = com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine.haveNativeLibrariesLoaded
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L66
            java.lang.String r0 = "callengineconsensus"
            r308 = r0
            r0 = r308
            boolean r0 = X.C0il.A0B(r0)
            r0 = r306
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine.haveNativeLibrariesLoaded = r0
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
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$loadNativeLibraries$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$loadNativeLibraries$1
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine.loadNativeLibraries$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object registerModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$registerModules$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L8a
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$registerModules$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$registerModules$1) r0
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
            if (r0 == 0) goto L8a
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
            if (r0 == 0) goto L72
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L9a
            r0 = r304
            java.lang.Object r0 = r0.L$0
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine) r0
            r301 = r0
            r0 = r307
            X.0Dt.A00(r0)
        L58:
            r0 = r301
            com.meta.wearable.comms.calling.hera.engine.base.Engine r0 = r0.getEngine()
            r308 = r0
            r0 = r301
            com.meta.wearable.comms.calling.hera.engine.consensus.EngineEnhancerPrimary r0 = r0.getPrimary()
            com.meta.wearable.comms.calling.hera.engine.base.EngineEnhancer r0 = r0.getEnhancer()
            r309 = r0
            r0 = r308
            r1 = r309
            r0.attachEnhancer(r1)
            X.04S r0 = X.04S.A00
            return r0
        L72:
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
            goto L58
        L8a:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$registerModules$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$registerModules$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L9a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine.registerModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object setupModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r301, X.0DR r302) {
        /*
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$setupModules$1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L82
            r0 = r302
            r304 = r0
            r0 = r302
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$setupModules$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$setupModules$1) r0
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
            if (r0 == 0) goto L82
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
            if (r0 == 0) goto L70
            r0 = r306
            r1 = r303
            if (r0 != r1) goto L92
            r0 = r304
            java.lang.Object r0 = r0.L$0
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine) r0
            r301 = r0
            r0 = r307
            X.0Dt.A00(r0)
        L58:
            r0 = r301
            com.meta.wearable.comms.calling.hera.engine.device.FeatureDevice r0 = r0.getFeatureDevice()
            r308 = r0
            r0 = r301
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$deviceProxy$1 r0 = r0.deviceProxy
            r309 = r0
            r0 = r308
            r1 = r309
            com.meta.wearable.comms.calling.hera.engine.device.FeatureDevice r0 = r0.setProxy(r1)
            X.04S r0 = X.04S.A00
            return r0
        L70:
            r0 = r307
            X.0Dt.A00(r0)
            r0 = r304
            r1 = r301
            r0.L$0 = r1
            r0 = r304
            r1 = r303
            r0.label = r1
            goto L58
        L82:
            com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$setupModules$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine$setupModules$1
            r304 = r0
            r0 = r304
            r1 = r301
            r2 = r302
            X.0DR r2 = (X.0DR) r2
            r0.<init>(r1, r2)
            goto L32
        L92:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine.setupModules$suspendImpl(com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object constructModules(0DR r302) {
        return constructModules$suspendImpl(this, r302);
    }

    public final void dispatch(Any any) {
        11T.A0F(any, 0);
        getEngine().dispatchBlocking(any);
    }

    public abstract Context getActivityContext();

    public abstract ILifecycleObserver.LifecycleListener getAppLifecycleListener();

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine
    public FeatureCameraApi getCameraApi() {
        return (FeatureCameraApi) 7zM.A1B(this.cameraApi$delegate);
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine
    public JJN getConnection() {
        return this.connection;
    }

    public abstract PhonePeripheralState getPhonePeripheralState();

    public final EngineEnhancerPrimary getPrimary() {
        EngineEnhancerPrimary engineEnhancerPrimary = this.primary;
        if (engineEnhancerPrimary != null) {
            return engineEnhancerPrimary;
        }
        11T.A0L("primary");
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine, X.JKm
    public Object init(0DR r302) {
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object loadNativeLibraries(0DR r302) {
        return loadNativeLibraries$suspendImpl(this, r302);
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object registerModules(0DR r302) {
        return registerModules$suspendImpl(this, r302);
    }

    public abstract void setActivityContext(Context context);

    public final void setPrimary(EngineEnhancerPrimary engineEnhancerPrimary) {
        11T.A0F(engineEnhancerPrimary, 0);
        this.primary = engineEnhancerPrimary;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    public Object setupModules(0DR r302) {
        throw 0Q8.createAndThrow();
    }
}
