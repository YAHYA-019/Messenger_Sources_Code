package X;

import android.os.Handler;
import com.facebook.cameracore.camerasdk.camera.FbCameraPhysicalDeviceLifecycleWrapperV2;

/* loaded from: I6x.class */
public final class I6x {
    public static Handler A00;
    public static Runnable A01;
    public static volatile FbCameraPhysicalDeviceLifecycleWrapperV2 A02;
    public static volatile boolean A03;
    public static volatile boolean A04;

    public static void A00() {
        synchronized (I6x.class) {
            A04 = false;
            Handler handler = A00;
            if (handler != null) {
                Runnable runnable = A01;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                A00 = null;
                A01 = null;
            }
        }
    }

    public static void A01(boolean z) {
        synchronized (I6x.class) {
            A03 = false;
            if (A02 != null) {
                FbCameraPhysicalDeviceLifecycleWrapperV2 fbCameraPhysicalDeviceLifecycleWrapperV2 = A02;
                A02 = null;
                A00();
                if (z) {
                    fbCameraPhysicalDeviceLifecycleWrapperV2.close();
                }
            }
        }
    }
}
