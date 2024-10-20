package X;

import com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2;

/* loaded from: Izg.class */
public final class Izg implements Runnable {
    public static final String __redex_internal_original_name = "FbCameraPhysicalDeviceLifecycleWrapperV2$18";
    public final /* synthetic */ FbCameraPhysicalDeviceLifecycleWrapperV2 A00;
    public final /* synthetic */ JJd A01;
    public final /* synthetic */ Throwable A02;

    public Izg(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, JJd jJd, Throwable th) {
        this.A00 = fbCameraPhysicalDeviceLifecycleWrapperV2;
        this.A01 = jJd;
        this.A02 = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.onError(this.A02);
    }
}
