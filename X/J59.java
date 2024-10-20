package X;

import android.hardware.camera2.CameraDevice;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: J59.class */
public final class J59 implements Callable {
    public final /* synthetic */ IEe A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public J59(IEe iEe, List list, boolean z, boolean z2, boolean z3) {
        this.A00 = iEe;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = list;
        this.A04 = z3;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        IEe iEe = this.A00;
        0RZ.A03(iEe.A01, "CameraDevice should not be null for createCaptureSession!");
        0RZ.A03(iEe.A0E, "mPreviewSetupDelegate should not be null for createCaptureSession!");
        0R7 r0 = new 0R7(iEe.A0P.A02);
        boolean z = this.A03;
        if (!z && !this.A02) {
            CameraDevice cameraDevice = iEe.A01;
            List list = this.A01;
            boolean z2 = this.A04;
            Iea iea = iEe.A0M;
            Ie4.A01(cameraDevice, iea, list, r0, z2);
            return iea;
        }
        CameraDevice cameraDevice2 = iEe.A01;
        List list2 = this.A01;
        Iea iea2 = iEe.A0M;
        int i = 2;
        if (z) {
            i = 4;
        }
        Ie5.A01(cameraDevice2, iea2, list2, r0, i);
        return iea2;
    }
}
