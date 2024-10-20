package X;

import android.media.MediaFormat;
import android.media.MediaMuxer;

/* loaded from: Ij5.class */
public final class Ij5 implements JMi {
    public int A00;
    public int A01;
    public MediaMuxer A02;

    @Override // X.JMi
    public void AHJ(String str) {
        this.A02 = new MediaMuxer(str, 0);
    }

    @Override // X.JMi
    public void Cm1(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A00 = mediaMuxer.addTrack(mediaFormat);
    }

    @Override // X.JMi
    public void Cs6(int i) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.setOrientationHint(i);
    }

    @Override // X.JMi
    public void CwH(MediaFormat mediaFormat) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        this.A01 = mediaMuxer.addTrack(mediaFormat);
    }

    @Override // X.JMi
    public void DAz(JJ8 jj8) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A00, jj8.getByteBuffer(), jj8.Aa8());
    }

    @Override // X.JMi
    public void DBN(JJ8 jj8) {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.writeSampleData(this.A01, jj8.getByteBuffer(), jj8.Aa8());
    }

    @Override // X.JMi
    public void start() {
        MediaMuxer mediaMuxer = this.A02;
        mediaMuxer.getClass();
        mediaMuxer.start();
    }

    @Override // X.JMi
    public void stop() {
        this.A02.getClass();
        this.A02.stop();
        this.A02.release();
    }
}
