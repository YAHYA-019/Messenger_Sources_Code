package X;

import android.os.Handler;
import org.webrtc.legacy.videoengine.VideoCaptureDeviceInfoAndroid;

/* loaded from: Iy3.class */
public final class Iy3 implements Runnable {
    public static final String __redex_internal_original_name = "RtcCameraState$initCameraIds$1";
    public final /* synthetic */ Handler A00;
    public final /* synthetic */ HsO A01;

    public Iy3(Handler handler, HsO hsO) {
        this.A00 = handler;
        this.A01 = hsO;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoCaptureDeviceInfoAndroid.initDevice();
        int i = VideoCaptureDeviceInfoAndroid.mFrontCameraId;
        int i2 = VideoCaptureDeviceInfoAndroid.mBackCameraId;
        if (i < 0) {
            i = i2;
        }
        if (i2 < 0) {
            i2 = i;
        }
        this.A00.post(new Iy2(new Hbx(i, i2), this.A01));
    }
}
