package com.facebook.messaging.wearable.callengine;

import X.04S;
import X.0BY;
import X.0DK;
import X.0DR;
import X.0Pz;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2JN;
import X.2QZ;
import X.2Zs;
import X.2aG;
import X.2aH;
import X.2aI;
import X.AnonymousClass001;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C0Bx;
import X.C0ty;
import X.C2a0;
import X.DCy;
import X.Hxu;
import X.JQy;
import X.KEk;
import X.KFy;
import X.KG1;
import X.KGw;
import X.KPf;
import X.KPi;
import X.KPl;
import X.Kcx;
import X.KdM;
import X.LYu;
import X.Lge;
import X.LyC;
import X.MRR;
import X.RCl;
import android.content.Context;
import com.facebook.wearable.common.comms.hera.shared.context.HeraContext;
import com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine;
import com.facebook.wearable.common.comms.hera.shared.engine.config.HeraCallEngineConfig;
import com.facebook.wearable.common.comms.hera.shared.lifecycle.ILifecycleObserver;
import com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.CallCoreActions$CallDelta;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CameraActions$RegisterCameraHardware;
import com.facebook.wearable.common.comms.rtc.callengine2.video.proto.VideoCallState;
import com.meta.hera.engine.device.DeviceActions$UpdatePeripheralState;
import com.meta.hera.engine.device.PhonePeripheralState;
import java.util.List;
import java.util.Map;

/* loaded from: HeraMessengerHostCallEngine.class */
public final class HeraMessengerHostCallEngine extends HeraNativeHostCallEngine {
    public KPi A00;
    public CallCoreActions$CallDelta A01;
    public KPl A02;
    public VideoCallState A03;
    public KPf A04;
    public String A05;
    public List A06;
    public Context A07;
    public final 1Br A08;
    public final HeraCallEngineConfig A09;
    public final C01i A0A;
    public final 2aI A0B;
    public final Context A0C;
    public final HeraContext A0D;
    public final ILifecycleObserver.LifecycleListener A0E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraMessengerHostCallEngine(Context context, HeraCallEngineConfig heraCallEngineConfig) {
        super(heraCallEngineConfig);
        11T.A0F(heraCallEngineConfig, 2);
        this.A0C = context;
        this.A09 = heraCallEngineConfig;
        HeraContext heraContext = heraCallEngineConfig.heraContext;
        Map map = 0BY.A03;
        String A00 = C0Bx.A00(2aI.class);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        2aH r307 = (2aI) heraContext.getObject(A00);
        if (r307 == null) {
            2Zs r0 = RCl.A00;
            if (r0 == null) {
                11T.A0L("Background");
                throw 0Q8.createAndThrow();
            }
            r307 = 2aG.A02(0DK.A02(r0, new C2a0(null)));
        }
        this.A0B = r307;
        this.A08 = 1Bu.A01(context, 115760);
        this.A0D = heraCallEngineConfig.heraContext;
        this.A06 = C0ty.A00;
        this.A0A = C01g.A00(C03i.A02, new DCy(this, 18));
        this.A0E = new LYu(this);
        this.A00 = KPi.A05;
        this.A02 = KPl.A07;
        VideoCallState videoCallState = VideoCallState.DEFAULT_INSTANCE;
        11T.A0A(videoCallState);
        this.A03 = videoCallState;
        CallCoreActions$CallDelta callCoreActions$CallDelta = CallCoreActions$CallDelta.DEFAULT_INSTANCE;
        11T.A0A(callCoreActions$CallDelta);
        this.A01 = callCoreActions$CallDelta;
    }

    public static final void A00(HeraMessengerHostCallEngine heraMessengerHostCallEngine) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("App foreground state change: ");
        0fH.A0j("HeraMessengerHostCallEngine", AnonymousClass001.A0a(heraMessengerHostCallEngine.A04, A0k));
        KG1 newBuilder = PhonePeripheralState.newBuilder();
        KPf kPf = heraMessengerHostCallEngine.A04;
        PhonePeripheralState phonePeripheralState = (PhonePeripheralState) KGw.A00(newBuilder);
        phonePeripheralState.phoneApplicationLifecycleState_ = kPf.getNumber();
        phonePeripheralState.bitField0_ |= 1;
        KFy newBuilder2 = DeviceActions$UpdatePeripheralState.newBuilder();
        ((DeviceActions$UpdatePeripheralState) KGw.A00(newBuilder2)).deviceId_ = String.valueOf(Hxu.A01.A00.nodeId);
        DeviceActions$UpdatePeripheralState deviceActions$UpdatePeripheralState = (DeviceActions$UpdatePeripheralState) KGw.A00(newBuilder2);
        deviceActions$UpdatePeripheralState.delta_ = newBuilder.A05();
        deviceActions$UpdatePeripheralState.deltaCase_ = 3;
        heraMessengerHostCallEngine.dispatch(Kcx.A00.A00(newBuilder2.A05()));
    }

    public static final void A01(HeraMessengerHostCallEngine heraMessengerHostCallEngine, List list) {
        0fH.A0j("HeraMessengerHostCallEngine", 0Pz.A0T("register cameras: ", list.size()));
        if (1BK.A1Y(list)) {
            heraMessengerHostCallEngine.A06 = list;
        }
        KEk newBuilder = CameraActions$RegisterCameraHardware.newBuilder();
        CameraActions$RegisterCameraHardware cameraActions$RegisterCameraHardware = (CameraActions$RegisterCameraHardware) KGw.A00(newBuilder);
        MRR mrr = cameraActions$RegisterCameraHardware.cameras_;
        if (!((LyC) mrr).A00) {
            mrr = mrr.Bel(JQy.A0J(mrr));
            cameraActions$RegisterCameraHardware.cameras_ = mrr;
        }
        Lge.A03(list, mrr);
        heraMessengerHostCallEngine.dispatch(KdM.A01.A00(newBuilder.A05()));
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine
    public Context getActivityContext() {
        return this.A07;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine
    public ILifecycleObserver.LifecycleListener getAppLifecycleListener() {
        return this.A0E;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine
    public String getCurrentCallId() {
        return this.A05;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine
    public PhonePeripheralState getPhonePeripheralState() {
        KG1 newBuilder = PhonePeripheralState.newBuilder();
        KPf kPf = this.A04;
        if (kPf != null) {
            11T.A0D(newBuilder);
            PhonePeripheralState phonePeripheralState = (PhonePeripheralState) KGw.A00(newBuilder);
            phonePeripheralState.phoneApplicationLifecycleState_ = kPf.getNumber();
            phonePeripheralState.bitField0_ |= 1;
        }
        return (PhonePeripheralState) newBuilder.A05();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0052  */
    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine, X.JKm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object init(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine.init(X.0DR):java.lang.Object");
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine, X.JKm
    public Object release(0DR r302) {
        RsysBridge rsysBridge = (RsysBridge) 1Br.A0B(this.A08);
        ((2JN) 1Br.A0B(rsysBridge.A0C)).A02(rsysBridge.A0G);
        ((2QZ) 1Br.A0B(rsysBridge.A0E)).A02(rsysBridge.A0H);
        return 04S.A00;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, com.facebook.wearable.common.comms.hera.shared.engine.IHeraHostCallEngine
    public void setActivityContext(Context context) {
        this.A07 = context;
        ((RsysBridge) 1Br.A0B(this.A08)).A00 = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    @Override // com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeHostCallEngine, com.facebook.wearable.common.comms.hera.shared.engine.HeraNativeCallEngine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object setupModules(X.0DR r302) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wearable.callengine.HeraMessengerHostCallEngine.setupModules(X.0DR):java.lang.Object");
    }
}
