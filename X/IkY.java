package X;

import com.facebook.messaging.wearable.plugins.hera.impl.HeraMessengerPluginImplementation;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.facebook.wearable.common.comms.hera.shared.intf.Camera;
import com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: IkY.class */
public final class IkY implements IHeraCallEngineStateListener.ICameraStateListener {
    public final /* synthetic */ HeraMessengerPluginImplementation A00;

    public IkY(HeraMessengerPluginImplementation heraMessengerPluginImplementation) {
        this.A00 = heraMessengerPluginImplementation;
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.ICameraStateListener
    public void onActiveCameraChanged(Camera camera) {
        JN7 jn7 = this.A00.A03;
        if (jn7 != null) {
            jn7.ClY(camera);
        }
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.ICameraStateListener
    public void onAvailableCameraChanged(List list) {
        String str;
        ArrayList A0z = 7zO.A0z(list, 0);
        for (Object obj : list) {
            Camera camera = (Camera) obj;
            if (!11T.A0O(camera.deviceId, ConstantsKt.DEVICE_ID_HOST) && (str = camera.deviceId) != null && !0CU.A0O(str)) {
                A0z.add(obj);
            }
        }
        boolean A1Y = 1BK.A1Y(A0z);
        HeraMessengerPluginImplementation heraMessengerPluginImplementation = this.A00;
        JN7 jn7 = heraMessengerPluginImplementation.A03;
        if (jn7 != null) {
            jn7.CwX(A1Y);
        }
        heraMessengerPluginImplementation.A09 = Boolean.valueOf(A1Y);
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.ICameraStateListener
    public void onCameraSwitchComplete(Camera camera) {
        JN7 jn7 = this.A00.A03;
        if (jn7 != null) {
            jn7.Bme();
        }
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.ICameraStateListener
    public void onCameraSwitchInProgress(Camera camera, Camera camera2) {
        JN7 jn7 = this.A00.A03;
        if (jn7 != null) {
            jn7.Bmf();
        }
    }

    @Override // com.facebook.wearable.common.comms.hera.shared.intf.IHeraCallEngineStateListener.ICameraStateListener
    public void onDesiredCameraChanged(Camera camera) {
    }
}
