package X;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import android.view.Surface;
import java.io.FileDescriptor;

/* loaded from: Hsy.class */
public final class Hsy {
    public long A00;
    public Huf A01;
    public IEe A02;
    public Gul A03;
    public JOV A04;
    public I1R A05;
    public I50 A06;
    public JKN A07;
    public final IEC A08;
    public final HtV A09;
    public final I5y A0A;
    public volatile CameraDevice A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;

    public Hsy(IEC iec, I5y i5y) {
        this.A0A = i5y;
        this.A08 = iec;
        this.A09 = new HtV(i5y);
    }

    public Exception A00() {
        Surface surface;
        this.A09.A01("Method stopVideoRecording() must be run on the background thread.");
        JKN jkn = this.A07;
        if (jkn != null) {
            try {
                jkn.D2y();
                e = null;
            } catch (Exception e) {
                e = e;
            }
            this.A07 = null;
        } else {
            e = null;
        }
        IEe iEe = this.A02;
        if (iEe != null) {
            HtV htV = iEe.A0J;
            htV.A01("Can only stop video recording on the Optic thread");
            htV.A01("Can only check if the prepared on the Optic thread");
            if (htV.A00) {
                CaptureRequest.Builder builder = iEe.A02;
                if (builder != null && (surface = iEe.A06) != null) {
                    builder.removeTarget(surface);
                }
                iEe.A06 = null;
            }
        }
        this.A06 = null;
        this.A0D = false;
        this.A0C = false;
        return e;
    }

    public void A01(CaptureRequest.Builder builder, Ht4 ht4, JKL jkl, HX1 hx1, Ie3 ie3, JNZ jnz, FileDescriptor fileDescriptor, String str, int i, int i2, int i3, boolean z, boolean z2) {
        Exception A0N;
        IEe iEe = this.A02;
        if (iEe == null || !iEe.A0S || this.A03 == null) {
            A0N = AnonymousClass001.A0N("Cannot start recording video, camera is not ready or has been closed.");
        } else if (this.A0D) {
            A0N = AnonymousClass001.A0N("Cannot start recording video, there is a video already being recorded");
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Gul gul = this.A03;
            HX7 hx7 = I82.A0y;
            Object A05 = gul.A05(hx7);
            Gul gul2 = this.A03;
            if (A05 == null) {
                hx7 = I82.A0q;
            }
            IBB ibb = (IBB) gul2.A05(hx7);
            if (str != null || fileDescriptor != null) {
                this.A0D = true;
                this.A0C = z;
                this.A0A.A00(new GuZ(builder, ht4, this, ie3, z2), "start_video_recording", new J5L(builder, jkl, hx1, this, ie3, ibb, jnz, fileDescriptor, str, i, i2, i3, elapsedRealtime));
                return;
            }
            A0N = AnonymousClass001.A0L("Cannot start recording video, both filePath and fileDescriptor cannot be null, one must contain a valid value");
        }
        ht4.A03(A0N);
    }
}
