package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* loaded from: Gue.class */
public abstract class Gue extends Ht4 {
    public final Handler A00;
    public final JHl A01;

    public Gue(Handler handler, JHl jHl) {
        this.A01 = jHl;
        this.A00 = handler;
    }

    @Override // X.Ht4
    public void A03(Exception exc) {
        String str;
        C2407GcU c2407GcU = (C2407GcU) this;
        int i = c2407GcU.A00;
        INT r0 = (INT) c2407GcU.A01;
        JQ9 jq9 = r0.A01.A01;
        long A0B = GOn.A0B(r0);
        Gtz A01 = Gtz.A01(exc);
        switch (i) {
            case 0:
                str = "FbCameraDeviceWrapper.modifyCaptureSettings()";
                break;
            case 1:
                str = "FbCameraDeviceWrapper.lockCameraFocus()";
                break;
            case 2:
                str = "FbCameraDeviceWrapper.unlockCameraFocus()";
                break;
            case 3:
                str = "FbCameraDeviceWrapper.lockCameraExposureAndFocus()";
                break;
            case 4:
                str = "FbCameraDeviceWrapper.unlockCameraExposureAndFocus()";
                break;
            default:
                str = "FbCameraDeviceWrapper.setRotation()";
                break;
        }
        jq9.BZg(A01, "camera_error", "FbCameraDeviceWrapper", "low", str, null, A0B);
        JHl jHl = this.A01;
        if (jHl != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A00;
            if (myLooper == handler.getLooper()) {
                jHl.onFailure(exc);
            } else {
                handler.post(new SAQ(this, exc));
            }
        }
    }

    @Override // X.Ht4
    public void A04(Object obj) {
        JHl jHl = this.A01;
        if (jHl != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A00;
            if (myLooper == handler.getLooper()) {
                jHl.onSuccess(null);
            } else {
                handler.post(new S6e(this));
            }
        }
    }

    @Override // X.Ht4
    public void A05(CancellationException cancellationException) {
        JHl jHl = this.A01;
        if (jHl != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A00;
            if (myLooper == handler.getLooper()) {
                jHl.onFailure(cancellationException);
            } else {
                handler.post(new SAQ(this, cancellationException));
            }
        }
    }
}
