package X;

import android.media.MediaRecorder;

/* loaded from: Ids.class */
public final class Ids implements JKL {
    public final /* synthetic */ IeQ A00;

    public Ids(IeQ ieQ) {
        this.A00 = ieQ;
    }

    public void C6I(MediaRecorder mediaRecorder, int i, int i2, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void CL6(MediaRecorder mediaRecorder) {
        try {
            mediaRecorder.setVideoSource(2);
        } catch (Exception unused) {
            ID3.A02("Camera2Device.setVideoRecordingSource", DKE.A12(mediaRecorder));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        if (r303 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CMq(android.media.MediaRecorder r302, boolean r303) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ids.CMq(android.media.MediaRecorder, boolean):void");
    }
}
