package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.smartcapture.logging.SmartCaptureQpl;
import java.util.concurrent.CancellationException;

/* loaded from: Guf.class */
public abstract class Guf extends Ht4 {
    public final Handler A00;
    public final JJd A01;
    public final Ide A02;
    public final boolean A03;
    public final boolean A04;

    public Guf(Handler handler, JJd jJd, Ide ide) {
        this.A01 = jJd;
        this.A00 = handler;
        this.A02 = ide;
        this.A04 = true;
        this.A03 = false;
    }

    public Guf(Handler handler, JJd jJd, Ide ide, boolean z) {
        this.A01 = jJd;
        this.A00 = handler;
        this.A02 = ide;
        this.A04 = z;
        this.A03 = z;
    }

    public static void A00(Guf guf) {
        if (guf.A04 && !guf.A02.A0F.A00.A06) {
            JJd jJd = guf.A01;
            if (jJd != null) {
                jJd.C2G();
                return;
            }
            return;
        }
        if (!(guf instanceof C2409GcW)) {
            ((C2408GcV) guf).A01.set("camera_close_success");
        }
        JJd jJd2 = guf.A01;
        if (jJd2 != null) {
            jJd2.onSuccess();
        }
    }

    public static void A01(Guf guf, Exception exc) {
        String str;
        String str2;
        if (guf.A03 && !guf.A02.A0F.A00.A06) {
            JJd jJd = guf.A01;
            if (jJd != null) {
                jJd.C2G();
                return;
            }
            return;
        }
        if (guf instanceof C2409GcW) {
            C2409GcW c2409GcW = (C2409GcW) guf;
            int i = c2409GcW.A00;
            INT r0 = (INT) c2409GcW.A01;
            JQ9 jq9 = r0.A01.A01;
            long A0B = GOn.A0B(r0);
            Gtz A01 = Gtz.A01(exc);
            switch (i) {
                case 0:
                    str = "high";
                    str2 = "FbCameraDeviceWrapper.open()";
                    break;
                case 1:
                    str = "high";
                    str2 = "FbCameraDeviceWrapper.startPreview()";
                    break;
                case 2:
                    str = "high";
                    str2 = "FbCameraDeviceWrapper.openAndStartPreview()";
                    break;
                case 3:
                    str = SmartCaptureQpl.ANNOTATION_KEY_MEDIUM;
                    str2 = "FbCameraDeviceWrapper.switchCamera()";
                    break;
                default:
                    str = "low";
                    str2 = "FbCameraDeviceWrapper.stopPreview()";
                    break;
            }
            jq9.BZg(A01, "camera_error", "FbCameraDeviceWrapper", str, str2, null, A0B);
        } else {
            C2408GcV c2408GcV = (C2408GcV) guf;
            INT r02 = c2408GcV.A00;
            r02.A01.A01.BZg(Gtz.A01(exc), "camera_error", "FbCameraDeviceWrapper", "low", "FbCameraDeviceWrapper.close()", null, GOn.A0B(r02));
            c2408GcV.A01.setException(exc);
        }
        JJd jJd2 = guf.A01;
        if (jJd2 != null) {
            jJd2.onError(exc);
        }
    }

    @Override // X.Ht4
    public void A03(Exception exc) {
        if (this.A01 != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A00;
            if (myLooper != handler.getLooper()) {
                handler.post(new SAT(this, exc));
                return;
            }
        }
        A01(this, exc);
    }

    @Override // X.Ht4
    public void A04(Object obj) {
        JJd jJd = this.A01;
        if (jJd != null && !(jJd instanceof JOi)) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A00;
            if (myLooper != handler.getLooper()) {
                handler.post(new S6f(this));
                return;
            }
        }
        A00(this);
    }

    @Override // X.Ht4
    public void A05(CancellationException cancellationException) {
        JJd jJd = this.A01;
        if (jJd != null) {
            Looper myLooper = Looper.myLooper();
            Handler handler = this.A00;
            if (myLooper == handler.getLooper()) {
                jJd.C2G();
            } else {
                handler.post(new S6g(this));
            }
        }
    }
}
