package X;

import com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2;

/* loaded from: Hz3.class */
public final class Hz3 {
    public JE3 A00;
    public final IAe A01;
    public final H9F A02;
    public final JQ9 A03;
    public final String A04;

    public Hz3(IAe iAe, H9F h9f, JQ9 jq9, String str) {
        this.A03 = jq9;
        this.A01 = iAe;
        this.A02 = h9f;
        this.A04 = str;
    }

    public static void A00(HAZ haz, IBO ibo, FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2) {
        ibo.A03(new IvM(new HyQ(haz, fbCameraPhysicalDeviceLifecycleWrapperV2.A01.A04), ibo));
    }
}
