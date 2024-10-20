package X;

import com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2;
import com.facebook.cameracore.camerasdk.common.CameraStateException;

/* loaded from: Izh.class */
public final class Izh implements Runnable {
    public static final String __redex_internal_original_name = "FbCameraPhysicalDeviceLifecycleWrapperV2$20";
    public final /* synthetic */ FbCameraPhysicalDeviceLifecycleWrapperV2 A00;
    public final /* synthetic */ CameraStateException A01;
    public final /* synthetic */ JE3 A02;

    public Izh(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, CameraStateException cameraStateException, JE3 je3) {
        this.A00 = fbCameraPhysicalDeviceLifecycleWrapperV2;
        this.A02 = je3;
        this.A01 = cameraStateException;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A02.BmR(this.A01);
    }
}
