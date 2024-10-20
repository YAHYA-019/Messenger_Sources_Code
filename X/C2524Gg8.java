package X;

import com.facebook.rsys.camera.gen.Camera;
import com.facebook.rsys.camera.gen.CameraApi;
import com.facebook.rsys.camera.gen.CameraProxy;
import java.util.ArrayList;

/* renamed from: X.Gg8, reason: case insensitive filesystem */
/* loaded from: Gg8.class */
public final class C2524Gg8 extends GwS {
    public final CameraProxy A00;

    public C2524Gg8(CameraProxy cameraProxy) {
        this.A00 = cameraProxy;
    }

    public ArrayList createAvailableCameras() {
        ArrayList createAvailableCameras = this.A00.createAvailableCameras();
        11T.A0A(createAvailableCameras);
        return createAvailableCameras;
    }

    public void release() {
        this.A00.release();
    }

    public void setApi(CameraApi cameraApi) {
        11T.A0F(cameraApi, 0);
        ((GwS) this).A00 = cameraApi;
        this.A00.setApi(cameraApi);
    }

    public void setCamera(Camera camera) {
        this.A00.setCamera(camera);
    }

    public void setCameraMode(int i) {
        this.A00.setCameraMode(i);
    }

    public void setCameraOn(boolean z, int i) {
        this.A00.setCameraOn(z, i);
    }

    public void setTargetCaptureResolution(int i, int i2) {
        this.A00.setTargetCaptureResolution(i, i2);
    }

    public int setTargetCaptureSettings(int i, int i2, int i3) {
        return this.A00.setTargetCaptureSettings(i, i2, i3);
    }

    public void setTargetFps(int i) {
        this.A00.setTargetFps(i);
    }
}
