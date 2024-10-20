package X;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;

/* loaded from: Hmp.class */
public final class Hmp {
    public TotalCaptureResult A00;

    public Object A00(CaptureResult.Key key) {
        Object obj = null;
        try {
            TotalCaptureResult totalCaptureResult = this.A00;
            if (totalCaptureResult != null) {
                obj = totalCaptureResult.get(key);
            }
        } catch (Throwable unused) {
        }
        return obj;
    }
}
