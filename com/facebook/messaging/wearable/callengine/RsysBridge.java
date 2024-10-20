package com.facebook.messaging.wearable.callengine;

import X.0QD;
import X.0fH;
import X.1BP;
import X.1BY;
import X.1Br;
import X.1Bu;
import X.1De;
import X.1Lm;
import X.2JM;
import X.7zM;
import X.AnonymousClass001;
import X.C00i;
import X.C0Bd;
import X.C0ty;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.Gyx;
import X.H8d;
import X.H8f;
import X.H8g;
import X.H8i;
import X.IRF;
import X.IY8;
import X.JAi;
import X.JAj;
import X.JBb;
import X.JBh;
import X.KEr;
import X.KGw;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.rsys.camera.gen.CameraModel;
import com.facebook.rsys.state.gen.State;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CameraHardware;
import com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraInfraProxy;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy;
import com.meta.wearable.comms.calling.hera.engine.core.FeatureCoreProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: RsysBridge.class */
public final class RsysBridge {
    public Context A00;
    public Function1 A01;
    public Function1 A02;
    public Function2 A03;
    public C0Bd A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 2JM A0G;
    public final Gyx A0H;
    public final FeatureAudioProxy A0I;
    public final FeatureCameraInfraProxy A0J;
    public final FeatureCameraProviderProxy A0K;
    public final FeatureCoreProxy A0L;
    public final 1BP A0M;
    public final 1De A0N;

    public RsysBridge(1De r302) {
        this.A0N = r302;
        1BY r0 = r302.A00;
        1Br A03 = 1Bu.A03(r0, 16428);
        this.A0F = A03;
        this.A0M = FbInjector.A00;
        FbUserSession A032 = 1Br.A03(A03);
        this.A05 = A032;
        this.A07 = GOn.A0j(A032, r0);
        this.A0C = GOn.A0g(A032, r0);
        this.A0B = 1Bu.A03(r0, 85151);
        this.A08 = GOn.A0i(A032, r0);
        this.A0A = 7zM.A0P();
        this.A09 = 1Lm.A03(A032, r0, 84181);
        this.A0E = 1Lm.A03(A032, r0, 99985);
        this.A06 = 1Bu.A03(r0, 83913);
        this.A0D = 1Lm.A03(A032, r0, 115765);
        this.A0G = IY8.A01(this, 59);
        this.A02 = JAj.A00;
        this.A01 = JAi.A00;
        this.A03 = JBb.A00;
        this.A04 = JBh.A00;
        this.A0H = new Gyx(this, 13);
        this.A0L = new H8i(this);
        this.A0I = new H8d(this);
        this.A0J = new H8f(this);
        this.A0K = new H8g(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A00(com.facebook.messaging.wearable.callengine.RsysBridge r301, com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Call r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.wearable.callengine.RsysBridge.A00(com.facebook.messaging.wearable.callengine.RsysBridge, com.facebook.wearable.common.comms.rtc.callengine2.callcore.proto.Call, X.0DR):java.lang.Object");
    }

    public static final String A01(RsysBridge rsysBridge) {
        CameraModel cameraModel = (CameraModel) GOo.A0p(CameraModel.CONVERTER, GOq.A0p(rsysBridge.A0C));
        String str = null;
        if (cameraModel != null && cameraModel.cameraOn) {
            if (!GOp.A0s(rsysBridge.A07).A1f.A01) {
                return ConstantsKt.CAMERA_ID_FRONT;
            }
            str = ConstantsKt.CAMERA_ID_BACK;
        }
        return str;
    }

    public final List A02() {
        C00i c00i = this.A07.A00;
        if (!((IRF) c00i.get()).A0y()) {
            return C0ty.A00;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        KEr newBuilder = CameraHardware.newBuilder();
        newBuilder.A06();
        ((CameraHardware) ((KGw) newBuilder).A00).deviceId_ = ConstantsKt.DEVICE_ID_HOST;
        newBuilder.A06();
        ((CameraHardware) ((KGw) newBuilder).A00).cameraId_ = ConstantsKt.CAMERA_ID_FRONT;
        A0s.add(newBuilder.A05());
        if (((IRF) c00i.get()).A1f.A01()) {
            KEr newBuilder2 = CameraHardware.newBuilder();
            newBuilder2.A06();
            ((CameraHardware) ((KGw) newBuilder2).A00).deviceId_ = ConstantsKt.DEVICE_ID_HOST;
            newBuilder2.A06();
            ((CameraHardware) ((KGw) newBuilder2).A00).cameraId_ = ConstantsKt.CAMERA_ID_BACK;
            A0s.add(newBuilder2.A05());
        }
        return 0QD.A0V(A0s);
    }

    public final void A03() {
        String str;
        C00i c00i = this.A0C.A00;
        State A0n = GOq.A0n(GOq.A0o(c00i));
        Object obj = null;
        if (A0n == null || (str = A0n.localCallId) == null) {
            0fH.A0k("RsysBridge", "callId is null when invoking notifyActiveCameraUpdated. Call may be ended.");
            return;
        }
        CameraModel cameraModel = (CameraModel) GOo.A0p(CameraModel.CONVERTER, GOq.A0o(c00i));
        if (cameraModel != null && cameraModel.cameraOn) {
            obj = ConstantsKt.DEVICE_ID_HOST;
        }
        this.A04.invoke(str, obj, A01(this));
    }
}
