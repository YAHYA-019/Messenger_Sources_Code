package X;

import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.litecamera.LiteCameraProxy;

/* loaded from: IO6.class */
public final class IO6 implements JKr {
    public final /* synthetic */ LiteCameraProxy A00;

    public IO6(LiteCameraProxy liteCameraProxy) {
        this.A00 = liteCameraProxy;
    }

    @Override // X.JKr
    public void BmS(Exception exc) {
        0fH.A0r("LiteCameraProxy", "onCameraError", exc);
        LiteCameraProxy liteCameraProxy = this.A00;
        String message = exc.getMessage();
        CameraApi cameraApi = liteCameraProxy.A03;
        if (cameraApi != null) {
            cameraApi.handleCameraEviction(message);
        }
    }

    @Override // X.JKr
    public void BmW() {
        0fH.A0j("LiteCameraProxy", "onCameraInitialised");
        CameraApi cameraApi = this.A00.A03;
        if (cameraApi != null) {
            cameraApi.setCameraState(2);
        }
    }

    @Override // X.JKr
    public void Bma(String str, String str2) {
        0fH.A0d(str, str2, "LiteCameraProxy", "onCameraLocallyEvicted from: %s to %s");
        CameraApi cameraApi = this.A00.A03;
        if (cameraApi != null) {
            cameraApi.handleCameraEviction(str2);
        }
    }

    @Override // X.JKr
    public void Bmg() {
        0fH.A0j("LiteCameraProxy", "onCameraSwitched");
    }
}
