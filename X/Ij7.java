package X;

import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegAVStream;
import com.facebook.ffmpeg.FFMpegBadDataException;
import com.facebook.ffmpeg.FFMpegBufferInfo;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import com.facebook.ffmpeg.FFMpegMediaMuxer;

/* loaded from: Ij7.class */
public final class Ij7 implements JMi {
    public FFMpegAVStream A00;
    public FFMpegAVStream A01;
    public FFMpegBufferInfo A02;
    public FFMpegMediaMuxer A03;
    public String A04;
    public boolean A05;
    public final HQJ A06;

    public Ij7() {
        this.A05 = false;
        this.A04 = null;
        this.A06 = (HQJ) 1Bn.A0A(116372);
        this.A02 = new FFMpegBufferInfo();
    }

    public Ij7(HQJ hqj, String str, boolean z) {
        this.A05 = false;
        this.A04 = null;
        this.A06 = hqj;
        this.A02 = new FFMpegBufferInfo();
        this.A05 = z;
        this.A04 = str;
    }

    @Override // X.JMi
    public void AHJ(String str) {
        HQJ hqj = this.A06;
        FFMpegMediaMuxer fFMpegMediaMuxer = new FFMpegMediaMuxer(hqj.A00, str, this.A05, this.A04, -1, false, null);
        fFMpegMediaMuxer.initialize();
        this.A03 = fFMpegMediaMuxer;
    }

    @Override // X.JMi
    public void Cm1(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A03;
        fFMpegMediaMuxer.getClass();
        this.A00 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), -1, fFMpegMediaMuxer.A02);
    }

    @Override // X.JMi
    public void Cs6(int i) {
        FFMpegAVStream fFMpegAVStream = this.A01;
        fFMpegAVStream.getClass();
        fFMpegAVStream.setOrientationHint(i);
    }

    @Override // X.JMi
    public void CwH(MediaFormat mediaFormat) {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A03;
        fFMpegMediaMuxer.getClass();
        this.A01 = fFMpegMediaMuxer.mNativeWrapper.nativeAddStream(FFMpegMediaFormat.toFFMpegMediaFormat(mediaFormat), -1, fFMpegMediaMuxer.A02);
    }

    @Override // X.JMi
    public void DAz(JJ8 jj8) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A02;
            fFMpegBufferInfo.setFrom(jj8.Aa8());
            FFMpegAVStream fFMpegAVStream = this.A00;
            fFMpegAVStream.getClass();
            fFMpegAVStream.writeFrame(fFMpegBufferInfo, jj8.getByteBuffer());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    @Override // X.JMi
    public void DBN(JJ8 jj8) {
        try {
            FFMpegBufferInfo fFMpegBufferInfo = this.A02;
            fFMpegBufferInfo.setFrom(jj8.Aa8());
            FFMpegAVStream fFMpegAVStream = this.A01;
            fFMpegAVStream.getClass();
            fFMpegAVStream.writeFrame(fFMpegBufferInfo, jj8.getByteBuffer());
        } catch (FFMpegBadDataException e) {
            throw new Exception(e);
        }
    }

    @Override // X.JMi
    public void start() {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A03;
        fFMpegMediaMuxer.getClass();
        fFMpegMediaMuxer.A00();
    }

    @Override // X.JMi
    public void stop() {
        FFMpegMediaMuxer fFMpegMediaMuxer = this.A03;
        fFMpegMediaMuxer.getClass();
        fFMpegMediaMuxer.A01();
    }
}
