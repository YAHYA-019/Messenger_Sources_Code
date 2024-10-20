package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.view.Surface;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: Iee.class */
public final class Iee implements JKN {
    public MediaRecorder A00;
    public Surface A01;
    public I5d A02;
    public RandomAccessFile A03;
    public final /* synthetic */ C2426Gcn A04;

    public Iee(C2426Gcn c2426Gcn) {
        this.A04 = c2426Gcn;
    }

    private I50 A00(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, String str, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (i2 == 90 || i2 == 270) {
            i3 = camcorderProfile.videoFrameHeight;
            i4 = camcorderProfile.videoFrameWidth;
        } else {
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        }
        C2426Gcn c2426Gcn = this.A04;
        int i7 = c2426Gcn.A02 + c2426Gcn.A00;
        if (i7 % 180 != 0) {
            i5 = c2426Gcn.A01;
            i6 = c2426Gcn.A03;
        } else {
            i5 = c2426Gcn.A03;
            i6 = c2426Gcn.A01;
        }
        float f = i3;
        float f2 = i4;
        float f3 = f / f2;
        float f4 = i5 / i6;
        if (f3 > f4) {
            i3 = (int) (f2 * f4);
        } else {
            i4 = (int) (f / f4);
        }
        int i8 = i3 - (i3 % 16);
        int i9 = i4 - (i4 % 16);
        int i10 = i7 % HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH;
        boolean z2 = false;
        int i11 = i8;
        if (i10 % 180 != 0) {
            z2 = true;
            i11 = i9;
        }
        camcorderProfile.videoFrameWidth = i11;
        if (!z2) {
            i8 = i9;
        }
        camcorderProfile.videoFrameHeight = i8;
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        mediaRecorder.setVideoSource(2);
        MediaRecorder mediaRecorder2 = this.A00;
        if (z) {
            mediaRecorder2.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        this.A00.setOrientationHint(i10);
        if (str != null) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rws");
            this.A03 = randomAccessFile;
            this.A00.setOutputFile(randomAccessFile.getFD());
        } else {
            if (fileDescriptor == null) {
                throw AnonymousClass001.A0T("MediaRecorder cannot be prepared without an output destination.");
            }
            this.A00.setOutputFile(fileDescriptor);
        }
        this.A00.prepare();
        Surface surface = this.A00.getSurface();
        this.A01 = surface;
        I5d i5d = new I5d(surface, false);
        this.A02 = i5d;
        i5d.A0A = 1;
        this.A02.A08 = 1;
        c2426Gcn.A04.A6y(this.A02);
        this.A00.start();
        I2t i2t = new I2t(fileDescriptor, str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i10, i);
        I2t.A00(camcorderProfile, i2t, I50.A0N, camcorderProfile.audioCodec);
        i2t.A01(I50.A0W, GOo.A0m());
        return new I50(i2t);
    }

    @Override // X.JKN
    public I50 D2O(CamcorderProfile camcorderProfile, Hbr hbr, FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, int i, int i2, boolean z, boolean z2, boolean z3) {
        return A00(camcorderProfile, fileDescriptor, null, i, i2, z2);
    }

    @Override // X.JKN
    public I50 D2P(CamcorderProfile camcorderProfile, Hbr hbr, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        return A00(camcorderProfile, null, str, i, i2, z2);
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.JKN
    public void D2y() {
        try {
            try {
                MediaRecorder mediaRecorder = this.A00;
                if (mediaRecorder != null) {
                    mediaRecorder.stop();
                }
                MediaRecorder mediaRecorder2 = this.A00;
                if (mediaRecorder2 != null) {
                    mediaRecorder2.reset();
                    this.A00.release();
                    this.A00 = null;
                }
                I5d i5d = this.A02;
                if (i5d != null) {
                    this.A04.A04.Ceu(i5d);
                    this.A02 = null;
                }
                Surface surface = this.A01;
                if (surface != null) {
                    surface.release();
                    this.A01 = null;
                }
                RandomAccessFile randomAccessFile = this.A03;
                if (randomAccessFile != null) {
                    try {
                        randomAccessFile.close();
                    } catch (IOException unused) {
                    }
                    this.A03 = null;
                }
            } catch (RuntimeException e) {
                throw AnonymousClass001.A0U(e);
            }
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A00;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A00.release();
                this.A00 = null;
            }
            I5d i5d2 = this.A02;
            if (i5d2 != null) {
                this.A04.A04.Ceu(i5d2);
                this.A02 = null;
            }
            Surface surface2 = this.A01;
            if (surface2 != null) {
                surface2.release();
                this.A01 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A03;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A03 = null;
            }
            throw th;
        }
    }
}
