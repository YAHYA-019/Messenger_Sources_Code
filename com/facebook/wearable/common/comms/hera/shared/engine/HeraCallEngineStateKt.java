package com.facebook.wearable.common.comms.hera.shared.engine;

import X.04S;
import X.0DP;
import X.0DR;
import X.0Ds;
import X.0zF;
import X.0zL;
import X.0zU;
import X.0zV;
import X.11T;
import X.2aI;
import X.C15t;
import X.JQx;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState;

/* loaded from: HeraCallEngineStateKt.class */
public abstract class HeraCallEngineStateKt {
    public static final C15t getCurrentCallCameraStateFlow(final 0zV r301, 2aI r302) {
        11T.A0H(r301, r302);
        return 0zL.A01((Object) null, r302, new 0zV() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallCameraStateFlow$$inlined$map$1

            /* renamed from: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallCameraStateFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: HeraCallEngineStateKt$getCurrentCallCameraStateFlow$$inlined$map$1$2.class */
            public final class AnonymousClass2 implements 0zU {
                public final /* synthetic */ 0zU $this_unsafeFlow;

                /* renamed from: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallCameraStateFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: HeraCallEngineStateKt$getCurrentCallCameraStateFlow$$inlined$map$1$2$1.class */
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

                /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
                    /*
                        Method dump skipped, instructions count: 238
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallCameraStateFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.0DR):java.lang.Object");
                }
            }

            public Object collect(0zU r3022, 0DR r303) {
                Object collect = r301.collect(new AnonymousClass2(r3022), r303);
                if (collect != 0Ds.A02) {
                    collect = 04S.A00;
                }
                return collect;
            }
        }, 0zF.A00);
    }

    public static final C15t getCurrentCallFlow(final 0zV r301, 2aI r302) {
        11T.A0H(r301, r302);
        return 0zL.A01((Object) null, r302, new 0zV() { // from class: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1

            /* renamed from: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1$2.class */
            public final class AnonymousClass2 implements 0zU {
                public final /* synthetic */ 0zU $this_unsafeFlow;

                /* renamed from: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1$2$1.class */
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

                /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x004f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r302, X.0DR r303) {
                    /*
                        r301 = this;
                        r0 = r303
                        boolean r0 = r0 instanceof com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        r304 = r0
                        r0 = r304
                        if (r0 == 0) goto Lb2
                        r0 = r303
                        r305 = r0
                        r0 = r303
                        com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1$2$1 r0 = (com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r305 = r0
                        r0 = r305
                        int r0 = r0.label
                        r306 = r0
                        r0 = -1
                        r1 = -1
                        int r0 = r0 << r1
                        r307 = r0
                        r0 = r306
                        r1 = r307
                        r0 = r0 & r1
                        r304 = r0
                        r0 = r304
                        if (r0 == 0) goto Lb2
                        r0 = r306
                        r1 = r307
                        int r0 = r0 - r1
                        r306 = r0
                        r0 = r305
                        r1 = r306
                        r0.label = r1
                    L36:
                        r0 = r305
                        java.lang.Object r0 = r0.result
                        r308 = r0
                        X.0Ds r0 = X.0Ds.A02
                        r309 = r0
                        r0 = r305
                        int r0 = r0.label
                        r304 = r0
                        r0 = 1
                        r306 = r0
                        r0 = r304
                        if (r0 == 0) goto L5e
                        r0 = r304
                        r1 = r306
                        if (r0 != r1) goto Lc4
                        r0 = r308
                        X.0Dt.A00(r0)
                    L5a:
                        X.04S r0 = X.04S.A00
                        return r0
                    L5e:
                        r0 = r308
                        X.0Dt.A00(r0)
                        r0 = r301
                        X.0zU r0 = r0.$this_unsafeFlow
                        r308 = r0
                        r0 = r302
                        com.meta.wearable.comms.calling.hera.engine.base.EngineState r0 = (com.meta.wearable.comms.calling.hera.engine.base.EngineState) r0
                        r302 = r0
                        r0 = r302
                        com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.CallCoreState r0 = X.KXY.A00(r0)
                        r310 = r0
                        r0 = r310
                        if (r0 == 0) goto Laa
                        r0 = r310
                        X.MRR r0 = r0.calls_
                        r310 = r0
                        r0 = r310
                        if (r0 == 0) goto Laa
                        r0 = r310
                        java.lang.Object r0 = X.0QD.A0E(r0)
                        r310 = r0
                    L8c:
                        r0 = r305
                        r1 = r306
                        r0.label = r1
                        r0 = r308
                        r1 = r310
                        r2 = r305
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r310 = r0
                        r0 = r310
                        r1 = r309
                        if (r0 != r1) goto L5a
                        r0 = r309
                        return r0
                    Laa:
                        r0 = 0
                        r304 = r0
                        r0 = 0
                        r310 = r0
                        goto L8c
                    Lb2:
                        com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1$2$1 r0 = new com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1$2$1
                        r305 = r0
                        r0 = r305
                        r1 = r301
                        r2 = r303
                        X.0DR r2 = (X.0DR) r2
                        r0.<init>(r2)
                        goto L36
                    Lc4:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0M()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt$getCurrentCallFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, X.0DR):java.lang.Object");
                }
            }

            public Object collect(0zU r3022, 0DR r303) {
                Object collect = r301.collect(new AnonymousClass2(r3022), r303);
                if (collect != 0Ds.A02) {
                    collect = 04S.A00;
                }
                return collect;
            }
        }, 0zF.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r301 == X.KPl.A04) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isOn(X.KPl r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            X.KPl r0 = X.KPl.A06
            r303 = r0
            r0 = r301
            r1 = r303
            if (r0 == r1) goto L26
            X.KPl r0 = X.KPl.A03
            r303 = r0
            r0 = r301
            r1 = r303
            if (r0 == r1) goto L26
            X.KPl r0 = X.KPl.A04
            r304 = r0
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = r304
            if (r0 != r1) goto L28
        L26:
            r0 = 1
            r302 = r0
        L28:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt.isOn(X.KPl):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0030, code lost:
    
        if (X.11T.A0O(r301.deviceIdDesired_, r301.activeDeviceId_) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isSwitchCameraInProgress(com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState r301) {
        /*
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            java.lang.String r0 = r0.cameraIdDesired_
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.activeCameraId_
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L33
            r0 = r301
            java.lang.String r0 = r0.deviceIdDesired_
            r302 = r0
            r0 = r301
            java.lang.String r0 = r0.activeDeviceId_
            r303 = r0
            r0 = r302
            r1 = r303
            boolean r0 = X.11T.A0O(r0, r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 != 0) goto L35
        L33:
            r0 = 1
            r304 = r0
        L35:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt.isSwitchCameraInProgress(com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r301.activeCameraId_ == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean isWearableCameraActive(com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState r301) {
        /*
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            java.lang.String r0 = r0.activeDeviceId_
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L2a
            java.lang.String r0 = "host"
            r303 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.equals(r1)
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L2a
            r0 = r301
            java.lang.String r0 = r0.activeCameraId_
            r304 = r0
            r0 = 1
            r302 = r0
            r0 = r304
            if (r0 != 0) goto L2e
        L2a:
            r0 = 0
            r302 = r0
            r0 = 0
            r303 = r0
        L2e:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.common.comms.hera.shared.engine.HeraCallEngineStateKt.isWearableCameraActive(com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState):boolean");
    }

    public static final boolean isWearableCameraEnabled(CallCameraState callCameraState) {
        11T.A0F(callCameraState, 0);
        return ((callCameraState.bitField0_ & 4) == 0 || JQx.A0K(callCameraState.deviceIdDesired_) <= 0 || 11T.A0O(callCameraState.deviceIdDesired_, ConstantsKt.DEVICE_ID_HOST)) ? false : true;
    }
}
