package X;

import com.facebook.messaging.wearable.callengine.RsysBridge;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.rtc.callengine2.camera.proto.CameraHardware;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy;

/* loaded from: H8g.class */
public final class H8g extends FeatureCameraProviderProxy {
    public final /* synthetic */ RsysBridge A00;

    public H8g(RsysBridge rsysBridge) {
        this.A00 = rsysBridge;
    }

    @Override // com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraProviderProxy
    public void switchCamera2(CameraHardware cameraHardware, CameraHardware cameraHardware2) {
        if (cameraHardware == null || cameraHardware2 == null || !11T.A0O(cameraHardware.deviceId_, ConstantsKt.DEVICE_ID_HOST) || !11T.A0O(cameraHardware2.deviceId_, ConstantsKt.DEVICE_ID_HOST) || 11T.A0O(cameraHardware.cameraId_, cameraHardware2.cameraId_)) {
            return;
        }
        String str = cameraHardware.cameraId_;
        RsysBridge rsysBridge = this.A00;
        if (11T.A0O(str, RsysBridge.A01(rsysBridge))) {
            4YV.A11(rsysBridge.A0A).execute(new IsQ(rsysBridge));
        }
    }
}
