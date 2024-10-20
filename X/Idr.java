package X;

import android.media.MediaRecorder;

/* loaded from: Idr.class */
public final class Idr implements JKL {
    public final /* synthetic */ IeR A00;

    public Idr(IeR ieR) {
        this.A00 = ieR;
    }

    public void C6I(MediaRecorder mediaRecorder, int i, int i2, boolean z) {
        int i3 = ID3.A00;
        ID3.A00(z ? 28 : 29, 0, GOp.A0B(Integer.valueOf(i), i2));
    }

    public void CL6(MediaRecorder mediaRecorder) {
        IeR ieR;
        try {
            ieR = this.A00;
            ieR.A0C(mediaRecorder);
        } catch (Exception unused) {
            ID3.A02("Camera1Device.setVideoRecordingSource", DKE.A12(ieR));
        }
    }

    public void CMq(MediaRecorder mediaRecorder, boolean z) {
    }
}
