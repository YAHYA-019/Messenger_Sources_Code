package com.facebook.wearable.common.comms.hera.shared.callmanager;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Dt;
import X.2aI;
import X.AnonymousClass001;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CallCameraState;
import kotlin.jvm.functions.Function2;

/* loaded from: HeraCallManager$isWearableCameraActive$1.class */
public final class HeraCallManager$isWearableCameraActive$1 extends 0DO implements Function2 {
    public int label;
    public final /* synthetic */ HeraCallManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeraCallManager$isWearableCameraActive$1(HeraCallManager heraCallManager, 0DR r303) {
        super(2, r303);
        this.this$0 = heraCallManager;
    }

    public final 0DR create(Object obj, 0DR r303) {
        return new HeraCallManager$isWearableCameraActive$1(this.this$0, r303);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(2aI r302, 0DR r303) {
        return new HeraCallManager$isWearableCameraActive$1(this.this$0, r303).invokeSuspend(04S.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label != 0) {
            throw AnonymousClass001.A0M();
        }
        0Dt.A00(obj);
        CallCameraState currentCallCameraState = this.this$0.getCurrentCallCameraState();
        boolean z = false;
        if (currentCallCameraState != null && (str = currentCallCameraState.activeDeviceId_) != null && !str.equals(ConstantsKt.DEVICE_ID_HOST) && currentCallCameraState.activeCameraId_ != null) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
