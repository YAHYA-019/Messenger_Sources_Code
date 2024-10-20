package X;

import com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2;

/* loaded from: Izf.class */
public final class Izf implements Runnable {
    public static final String __redex_internal_original_name = "FbCameraPhysicalDeviceLifecycleWrapperV2$17";
    public final /* synthetic */ FbCameraPhysicalDeviceLifecycleWrapperV2 A00;
    public final /* synthetic */ JJd A01;
    public final /* synthetic */ boolean A02;

    public Izf(FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2, JJd jJd, boolean z) {
        this.A00 = fbCameraPhysicalDeviceLifecycleWrapperV2;
        this.A02 = z;
        this.A01 = jJd;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.A02) {
            FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2 = this.A00;
            if (!fbCameraPhysicalDeviceLifecycleWrapperV2.A06.A04(fbCameraPhysicalDeviceLifecycleWrapperV2.A01.A04)) {
                if (fbCameraPhysicalDeviceLifecycleWrapperV2.A07.A0C.A03 == null) {
                    FbCameraPhysicalDeviceLifecycleWrapperV2.A07(fbCameraPhysicalDeviceLifecycleWrapperV2, "lifecyclewrapper::open::onSuccess::null_camera_characteristics", AnonymousClass001.A0Q("Camera characteristics is null."), false);
                }
            }
            FbCameraPhysicalDeviceLifecycleWrapperV2.A03(fbCameraPhysicalDeviceLifecycleWrapperV2, this.A01);
            return;
        }
        this.A01.onSuccess();
    }
}
