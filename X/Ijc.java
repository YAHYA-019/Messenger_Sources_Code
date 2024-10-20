package X;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: Ijc.class */
public class Ijc implements JN4 {
    public MediaExtractor A00;

    @Override // X.JN4
    public boolean A7l() {
        return this.A00.advance();
    }

    @Override // X.JN4
    public int B8Z() {
        return this.A00.getSampleFlags();
    }

    @Override // X.JN4
    public long B8b() {
        return this.A00.getSampleTime();
    }

    @Override // X.JN4
    public int B8c() {
        return this.A00.getSampleTrackIndex();
    }

    @Override // X.JN4
    public int BGf() {
        return this.A00.getTrackCount();
    }

    @Override // X.JN4
    public MediaFormat BGh(int i) {
        return this.A00.getTrackFormat(i);
    }

    @Override // X.JN4
    public int Cb9(ByteBuffer byteBuffer, int i) {
        return this.A00.readSampleData(byteBuffer, 0);
    }

    @Override // X.JN4
    public void CkB(long j, int i) {
        this.A00.seekTo(j, i);
    }

    @Override // X.JN4
    public void CkL(int i) {
        this.A00.selectTrack(i);
    }

    @Override // X.JN4
    public void Cnx(String str) {
        this.A00.setDataSource(str);
    }

    @Override // X.JN4
    public void release() {
        this.A00.release();
    }
}
