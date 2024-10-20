package X;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* loaded from: Ijh.class */
public final class Ijh implements JMz {
    public int A00;
    public int A01;
    public MediaMuxer A02;
    public boolean A03;

    @Override // X.JMz
    public void AHJ(String str) {
        this.A02 = new MediaMuxer(str, 0);
        this.A03 = false;
    }

    @Override // X.JMz
    public String Ayf() {
        return "Platform";
    }

    @Override // X.JMz
    public boolean BWK() {
        return this.A03;
    }

    @Override // X.JMz
    public void Cm1(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A00 = mediaMuxer.addTrack(mediaFormat);
    }

    @Override // X.JMz
    public void Cs6(int i) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.setOrientationHint(i);
    }

    @Override // X.JMz
    public void CwH(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A01 = mediaMuxer.addTrack(mediaFormat);
    }

    @Override // X.JMz
    public void DB0(JKa jKa) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A00, jKa.getByteBuffer(), jKa.Aa8());
    }

    @Override // X.JMz
    public void DBO(JKa jKa) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A01, jKa.getByteBuffer(), jKa.Aa8());
    }

    @Override // X.JMz
    public void start() {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.start();
        this.A03 = true;
    }

    @Override // X.JMz
    public void stop() {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.stop();
        this.A03 = false;
        this.A02.release();
    }
}
