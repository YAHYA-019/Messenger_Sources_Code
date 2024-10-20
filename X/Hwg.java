package X;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import java.util.Collections;
import java.util.Set;

/* loaded from: Hwg.class */
public final class Hwg {
    public static Set A00;
    public static boolean A01;

    public static Set A00(PackageManager packageManager) {
        Set unmodifiableSet;
        synchronized (Hwg.class) {
            Set set = A00;
            if (set == null || set.isEmpty() || A01) {
                A00 = AnonymousClass001.A0v();
                A01 = false;
                if (packageManager != null) {
                    if (packageManager.hasSystemFeature("android.hardware.camera")) {
                        A00.add(H9F.BACK);
                    }
                    if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                        A00.add(H9F.FRONT);
                    }
                } else {
                    int numberOfCameras = Camera.getNumberOfCameras();
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    for (int i = 0; i < numberOfCameras; i++) {
                        try {
                            Camera.getCameraInfo(i, cameraInfo);
                            int i2 = cameraInfo.facing;
                            if (i2 == 1) {
                                A00.add(H9F.FRONT);
                            } else if (i2 == 0) {
                                A00.add(H9F.BACK);
                            }
                        } catch (Exception unused) {
                            A01 = true;
                        }
                    }
                }
            }
            unmodifiableSet = Collections.unmodifiableSet(A00);
        }
        return unmodifiableSet;
    }
}
