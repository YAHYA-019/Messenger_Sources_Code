package com.facebook.wearable.common.comms.hera.shared.callmanager;

import X.03Y;
import X.04S;
import X.0DK;
import X.0DL;
import X.0DP;
import X.0DR;
import X.0Ds;
import X.0Jz;
import X.0KV;
import X.0KW;
import X.0KX;
import X.0N2;
import X.0PX;
import X.0Q8;
import X.0S2;
import X.0oO;
import X.0zF;
import X.0zL;
import X.0zU;
import X.0zV;
import X.11T;
import X.1BK;
import X.2Zs;
import X.2aG;
import X.2aH;
import X.2aI;
import X.2aK;
import X.44X;
import X.4YV;
import X.7zL;
import X.AnonymousClass001;
import X.C0oe;
import X.C0ty;
import X.C0zE;
import X.C0zG;
import X.C11i;
import X.C11w;
import X.C15t;
import X.C2a0;
import X.C2a2;
import X.KPl;
import X.KXZ;
import X.KXa;
import X.RCl;
import android.util.Log;
import com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager;
import com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt;
import com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.hera.shared.intf.Camera;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CameraState;
import com.facebook.wearable.common.util.queue.JobQueue;
import com.meta.wearable.comms.calling.hera.engine.base.EngineState;
import java.util.Set;
import kotlin.jvm.functions.Function2;

/* loaded from: HeraCallManager.class */
public final class HeraCallManager implements IHeraCallManager {
    public EngineState cachedState;
    public final Set callStateEventListeners;
    public String cameraDebugStats;
    public C15t cameraSourceFlow;
    public final Set cameraStateEventListeners;
    public final C15t currentCallFlow;
    public final Set deviceStateEventListeners;
    public final IHeraHostCallEngine engine;
    public C2a2 job;
    public final Set peerVideoStreamEventListeners;
    public final JobQueue queue;
    public final 2aI scope;

    public HeraCallManager(IHeraHostCallEngine iHeraHostCallEngine) {
        11T.A0F(iHeraHostCallEngine, 1);
        this.engine = iHeraHostCallEngine;
        2Zs r0 = RCl.A00;
        if (r0 == null) {
            11T.A0L("Background");
            throw 0Q8.createAndThrow();
        }
        2aH A02 = 2aG.A02(0DK.A02(r0, new C2a0(null)));
        this.scope = A02;
        this.queue = new JobQueue();
        this.callStateEventListeners = 7zL.A15();
        this.cameraStateEventListeners = 7zL.A15();
        this.peerVideoStreamEventListeners = 7zL.A15();
        this.deviceStateEventListeners = 7zL.A15();
        this.cameraDebugStats = "";
        final C11i engineStateFlow = getEngineStateFlow();
        this.currentCallFlow = 0zL.A01((Object) null, A02, new 0zV() { // from class: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$special$$inlined$map$1

            /* renamed from: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: HeraCallManager$special$$inlined$map$1$2.class */
            public final class AnonymousClass2 implements 0zU {
                public final /* synthetic */ 0zU $this_unsafeFlow;
                public final /* synthetic */ HeraCallManager this$0;

                /* renamed from: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: HeraCallManager$special$$inlined$map$1$2$1.class */
                public final class AnonymousClass1 extends 0DP {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(0DR r303) {
                        super(r303);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= (-1) << (-1);
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(0zU r302, HeraCallManager heraCallManager) {
                    this.$this_unsafeFlow = r302;
                    this.this$0 = heraCallManager;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
                /* JADX WARN: Type inference failed for: r0v45, types: [com.meta.wearable.comms.calling.hera.engine.base.Any, X.Lgd] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
                    /*
                        Method dump skipped, instructions count: 473
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.0DR):java.lang.Object");
                }
            }

            public Object collect(0zU r302, 0DR r303) {
                Object collect = engineStateFlow.collect(new AnonymousClass2(r302, this), r303);
                if (collect != 0Ds.A02) {
                    collect = 04S.A00;
                }
                return collect;
            }
        }, 0zF.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Camera getCamera(String str, String str2) {
        if (str == null && str2 == null) {
            return null;
        }
        return new Camera(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C11i getEngineStateFlow() {
        IHeraHostCallEngine iHeraHostCallEngine = this.engine;
        11T.A0I(iHeraHostCallEngine, "null cannot be cast to non-null type com.facebook.wearable.common.comms.hera.shared.engine.IHeraCallEngine");
        C15t stateFlow = iHeraHostCallEngine.getStateFlow();
        Integer num = 0S2.A00;
        0Jz ATz = stateFlow instanceof C11w ? ((C11w) stateFlow).ATz(num, 0DL.A00, 100) : new 0Jz(num, 0DL.A00, stateFlow, 100);
        2aI r0 = this.scope;
        C0zE c0zE = 0zF.A00;
        C0zG A02 = 0zL.A02(ATz);
        0KW A00 = 0KV.A00(A02.A01, 1, A02.A00);
        return new 0PX(0zL.A00(0KV.A00, A02.A02, r0, A02.A03, A00, c0zE), A00);
    }

    private final void handleCallStateChange() {
        0N2.A03(this.scope, new 0oO(0, (Object) null, new HeraCallManager$handleCallStateChange$1(this, null), this.currentCallFlow));
    }

    private final void handleCameraStateChanges() {
        0N2.A03(this.scope, new 0oO(0, (Object) null, new HeraCallManager$handleCameraStateChanges$1(this, null), getEngineStateFlow()));
    }

    private final void handleDeviceStateChanges() {
        final C11i engineStateFlow = getEngineStateFlow();
        0N2.A03(this.scope, new C0oe((Function2) new HeraCallManager$handleDeviceStateChanges$2(this, null), 0KX.A00(new 0zV() { // from class: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handleDeviceStateChanges$$inlined$mapNotNull$1

            /* renamed from: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handleDeviceStateChanges$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* loaded from: HeraCallManager$handleDeviceStateChanges$$inlined$mapNotNull$1$2.class */
            public final class AnonymousClass2 implements 0zU {
                public final /* synthetic */ 0zU $this_unsafeFlow;

                /* renamed from: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handleDeviceStateChanges$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                /* loaded from: HeraCallManager$handleDeviceStateChanges$$inlined$mapNotNull$1$2$1.class */
                public final class AnonymousClass1 extends 0DP {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(0DR r303) {
                        super(r303);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= (-1) << (-1);
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(0zU r302) {
                    this.$this_unsafeFlow = r302;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
                /* JADX WARN: Type inference failed for: r0v31, types: [com.meta.wearable.comms.calling.hera.engine.base.Any, X.Lgd] */
                /* JADX WARN: Type inference failed for: r0v72, types: [X.KJb] */
                /* JADX WARN: Type inference failed for: r0v81, types: [X.KJb] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
                    /*
                        Method dump skipped, instructions count: 449
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handleDeviceStateChanges$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, X.0DR):java.lang.Object");
                }
            }

            public Object collect(0zU r302, 0DR r303) {
                Object collect = engineStateFlow.collect(new AnonymousClass2(r302), r303);
                if (collect != 0Ds.A02) {
                    collect = 04S.A00;
                }
                return collect;
            }
        }), 3));
    }

    private final void handlePeerVideoStateChanges() {
        final C11i engineStateFlow = getEngineStateFlow();
        0N2.A03(this.scope, new 0oO(0, C0ty.A00, new HeraCallManager$handlePeerVideoStateChanges$2(this, null), 0KX.A00(new 0zV() { // from class: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handlePeerVideoStateChanges$$inlined$map$1

            /* renamed from: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handlePeerVideoStateChanges$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: HeraCallManager$handlePeerVideoStateChanges$$inlined$map$1$2.class */
            public final class AnonymousClass2 implements 0zU {
                public final /* synthetic */ 0zU $this_unsafeFlow;
                public final /* synthetic */ HeraCallManager this$0;

                /* renamed from: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handlePeerVideoStateChanges$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: HeraCallManager$handlePeerVideoStateChanges$$inlined$map$1$2$1.class */
                public final class AnonymousClass1 extends 0DP {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(0DR r303) {
                        super(r303);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= (-1) << (-1);
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(0zU r302, HeraCallManager heraCallManager) {
                    this.$this_unsafeFlow = r302;
                    this.this$0 = heraCallManager;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
                /* JADX WARN: Type inference failed for: r0v44, types: [com.meta.wearable.comms.calling.hera.engine.base.Any, X.Lgd] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
                    /*
                        Method dump skipped, instructions count: 677
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.callmanager.HeraCallManager$handlePeerVideoStateChanges$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.0DR):java.lang.Object");
                }
            }

            public Object collect(0zU r302, 0DR r303) {
                Object collect = engineStateFlow.collect(new AnonymousClass2(r302, this), r303);
                if (collect != 0Ds.A02) {
                    collect = 04S.A00;
                }
                return collect;
            }
        })));
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void addCallStateEventListener(IHeraCallEngineStateListener.ICallStateListener iCallStateListener) {
        11T.A0F(iCallStateListener, 0);
        this.callStateEventListeners.add(iCallStateListener);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void addCameraStateEventListener(IHeraCallEngineStateListener.ICameraStateListener iCameraStateListener) {
        11T.A0F(iCameraStateListener, 0);
        this.cameraStateEventListeners.add(iCameraStateListener);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void addDeviceStateEventListener(IHeraCallEngineStateListener.IDeviceStateListener iDeviceStateListener) {
        11T.A0F(iDeviceStateListener, 0);
        this.deviceStateEventListeners.add(iDeviceStateListener);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void addPeerVideoStreamEventListener(IHeraCallEngineStateListener.IPeerVideoStreamListener iPeerVideoStreamListener) {
        11T.A0F(iPeerVideoStreamListener, 0);
        this.peerVideoStreamEventListeners.add(iPeerVideoStreamListener);
    }

    public final CallCameraState getCurrentCallCameraState() {
        String currentCallId;
        CameraState A00;
        EngineState engineState = this.cachedState;
        CallCameraState callCameraState = null;
        if (engineState != null && (currentCallId = this.engine.getCurrentCallId()) != null && (A00 = KXZ.A00(engineState)) != null) {
            callCameraState = KXa.A00(A00, currentCallId);
        }
        return callCameraState;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public 03Y getCurrentDesiredCamera() {
        CallCameraState currentCallCameraState = getCurrentCallCameraState();
        String str = null;
        String str2 = currentCallCameraState != null ? currentCallCameraState.deviceIdDesired_ : null;
        CallCameraState currentCallCameraState2 = getCurrentCallCameraState();
        if (currentCallCameraState2 != null) {
            str = currentCallCameraState2.cameraIdDesired_;
        }
        return 1BK.A1G(str2, str);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public String getDebugStats() {
        return this.cameraDebugStats;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public Object init(0DR r302) {
        this.job = 2aK.A04(new HeraCallManager$init$2(this, null), this.scope);
        handleCallStateChange();
        handleCameraStateChanges();
        handlePeerVideoStateChanges();
        handleDeviceStateChanges();
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public Object isCameraEnabled(String str, String str2, String str3, 0DR r305) {
        CallCameraState currentCallCameraState = getCurrentCallCameraState();
        boolean z = false;
        if (currentCallCameraState != null && 11T.A0O(currentCallCameraState.activeCameraId_, str2)) {
            z = 4YV.A1a(currentCallCameraState.activeDeviceId_, str3, false);
        }
        return Boolean.valueOf(z);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public Object isSelfVideoEnabled(0DR r302) {
        boolean z;
        EngineState engineState;
        CallCameraState A00;
        String currentCallId = this.engine.getCurrentCallId();
        if (currentCallId != null && (engineState = this.cachedState) != null) {
            CameraState A002 = KXZ.A00(engineState);
            if (A002 != null && (A00 = KXa.A00(A002, currentCallId)) != null) {
                KPl forNumber = KPl.forNumber(A00.defaultVideoStreamState_);
                if (forNumber == null) {
                    forNumber = KPl.A01;
                }
                z = HeraCallEngineStateKt.isOn(forNumber);
                return Boolean.valueOf(z);
            }
            Log.d(HeraCallManagerKt.TAG, "call camera state not found for call id, unknown self video stream state");
        }
        z = false;
        return Boolean.valueOf(z);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public boolean isWearableCameraActive() {
        return AnonymousClass001.A1V(44X.A00(0DL.A00, new HeraCallManager$isWearableCameraActive$1(this, null)));
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public boolean isWearableCameraEnabled() {
        CallCameraState currentCallCameraState = getCurrentCallCameraState();
        if (currentCallCameraState == null) {
            return false;
        }
        return HeraCallEngineStateKt.isWearableCameraEnabled(currentCallCameraState);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public Object release(0DR r302) {
        C2a2 c2a2 = this.job;
        if (c2a2 != null) {
            c2a2.AE0(null);
        }
        this.job = null;
        this.cachedState = null;
        this.callStateEventListeners.clear();
        this.cameraStateEventListeners.clear();
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void removeCallStateEventListener(IHeraCallEngineStateListener.ICallStateListener iCallStateListener) {
        11T.A0F(iCallStateListener, 0);
        this.callStateEventListeners.remove(iCallStateListener);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void removeCameraStateEventListener(IHeraCallEngineStateListener.ICameraStateListener iCameraStateListener) {
        11T.A0F(iCameraStateListener, 0);
        this.cameraStateEventListeners.remove(iCameraStateListener);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void removeDeviceStateEventListener(IHeraCallEngineStateListener.IDeviceStateListener iDeviceStateListener) {
        11T.A0F(iDeviceStateListener, 0);
        this.deviceStateEventListeners.remove(iDeviceStateListener);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void removePeerVideoStreamEventListener(IHeraCallEngineStateListener.IPeerVideoStreamListener iPeerVideoStreamListener) {
        11T.A0F(iPeerVideoStreamListener, 0);
        this.peerVideoStreamEventListeners.remove(iPeerVideoStreamListener);
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void setCameraSourceFlow(C15t c15t) {
        11T.A0F(c15t, 0);
        this.cameraSourceFlow = c15t;
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void toggleCamera() {
        String currentCallId = this.engine.getCurrentCallId();
        if (currentCallId != null) {
            this.engine.getCameraApi().toggleCamera(currentCallId, ConstantsKt.DEVICE_ID_HOST);
        }
    }

    @Override // com.facebook.wearable.common.comms.hera.host.intf.IHeraCallManager
    public void updateActiveCamera(String str) {
        String currentCallId = this.engine.getCurrentCallId();
        if (currentCallId != null) {
            this.engine.getCameraApi().updateActiveCamera(currentCallId, ConstantsKt.DEVICE_ID_HOST, str);
        }
    }
}
