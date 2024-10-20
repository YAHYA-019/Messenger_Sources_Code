package X;

import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;

/* loaded from: Ijg.class */
public final class Ijg implements JMz {
    public int A00;
    public int A01;
    public FFMpegBufferInfo A02;
    public 5Hg A03;
    public String A04;
    public java.util.Map A05;
    public boolean A06;
    public boolean A07;
    public FFMpegAVStream A08;
    public FFMpegAVStream A09;
    public FFMpegMediaMuxer A0A;
    public boolean A0B;

    @Override // X.JMz
    public void AHJ(String str) {
        FFMpegMediaMuxer fFMpegMediaMuxer = new FFMpegMediaMuxer(this.A03, str, this.A06, this.A04, this.A01, this.A07, this.A05, null);
        fFMpegMediaMuxer.initialize();
        this.A0A = fFMpegMediaMuxer;
    }

    @Override // X.JMz
    public String Ayf() {
        return "FFMpeg";
    }

    @Override // X.JMz
    public boolean BWK() {
        return this.A0B;
    }

    @Override // X.JMz
    public void Cm1(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A0A;
        this.A08 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), -1, fFMpegMediaMuxer.A02);
    }

    @Override // X.JMz
    public void Cs6(int i) {
        this.A09.setOrientationHint(i);
    }

    @Override // X.JMz
    public void CwH(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A0A;
        this.A09 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), this.A00, fFMpegMediaMuxer.A02);
    }

    @Override // X.JMz
    public void DB0(JKa jKa) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A02;
            fFMpegBufferInfo.setFrom(jKa.Aa8());
            this.A08.writeFrame(fFMpegBufferInfo, jKa.getByteBuffer());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    @Override // X.JMz
    public void DBO(JKa jKa) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A02;
            fFMpegBufferInfo.setFrom(jKa.Aa8());
            this.A09.writeFrame(fFMpegBufferInfo, jKa.getByteBuffer());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    @Override // X.JMz
    public void start() {
        this.A0A.A00();
        this.A0B = true;
    }

    @Override // X.JMz
    public void stop() {
        this.A0A.A01();
        this.A0B = false;
    }
}
