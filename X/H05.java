package X;

import com.facebook.messaging.montage.composer.cameracore.view.CameraRingView;

/* loaded from: H05.class */
public final class H05 extends C66m {
    public final /* synthetic */ J2o A00;

    public H05(J2o j2o) {
        this.A00 = j2o;
    }

    @Override // X.C66m, X.C66n
    public void CMR(C66i c66i) {
        J2o j2o = this.A00;
        if (j2o.A02.A01 != 0.0d) {
            j2o.A04.A01.postDelayed(j2o.A03, 100);
            return;
        }
        HzL hzL = j2o.A04;
        hzL.A04.A02();
        hzL.A00 = false;
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        11T.A0F(c66i, 0);
        ((CameraRingView) this.A00.A04.A04.A01()).setProgress((float) c66i.A09.A00);
    }
}
