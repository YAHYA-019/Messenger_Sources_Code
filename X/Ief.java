package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* loaded from: Ief.class */
public final class Ief implements JKN {
    public MediaRecorder A00;
    public final JKL A01;
    public final boolean A04;
    public final MediaRecorder.OnInfoListener A03 = new IHK(this);
    public final MediaRecorder.OnErrorListener A02 = new IHJ(this);

    public Ief(JKL jkl, boolean z) {
        this.A04 = z;
        this.A01 = jkl;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A00(android.media.CamcorderProfile r302, java.io.FileDescriptor r303, int r304, boolean r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ief.A00(android.media.CamcorderProfile, java.io.FileDescriptor, int, boolean, boolean):void");
    }

    @Override // X.JKN
    public I50 D2O(CamcorderProfile camcorderProfile, Hbr hbr, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
        A00(camcorderProfile, fileDescriptor, i2, true, z3);
        I2t i2t = new I2t(fileDescriptor, null, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i2, i);
        i2t.A01(I50.A0W, GOo.A0m());
        return new I50(i2t);
    }

    @Override // X.JKN
    public I50 D2P(CamcorderProfile camcorderProfile, Hbr hbr, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        A00(camcorderProfile, new RandomAccessFile(str, "rws").getFD(), i2, z, z3);
        I2t i2t = new I2t(null, str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i2, i);
        I2t.A00(camcorderProfile, i2t, I50.A0N, camcorderProfile.audioCodec);
        i2t.A01(I50.A0W, GOo.A0m());
        return new I50(i2t);
    }

    @Override // X.JKN
    public void D2y() {
        MediaRecorder mediaRecorder = this.A00;
        if (mediaRecorder != null) {
            try {
                try {
                    mediaRecorder.stop();
                } catch (RuntimeException e) {
                    android.util.Log.e("SimpleVideoCapture", "stopVideoRecording", e);
                    throw AnonymousClass001.A0U(e);
                }
            } finally {
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
            }
        }
    }
}
