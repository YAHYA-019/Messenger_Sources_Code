package X;

import android.media.MediaFormat;
import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.facebook.ffmpeg.FFMpegMediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: Ijd.class */
public final class Ijd implements JN4 {
    public int A00;
    public 5Hg A01;
    public FFMpegMediaDemuxer A02;

    @Override // X.JN4
    public boolean A7l() {
        return this.A02.advance();
    }

    @Override // X.JN4
    public int B8Z() {
        return this.A02.getSampleFlags();
    }

    @Override // X.JN4
    public long B8b() {
        return this.A02.getSampleTime();
    }

    @Override // X.JN4
    public int B8c() {
        return this.A02.getSampleTrackIndex();
    }

    @Override // X.JN4
    public int BGf() {
        return this.A02.getTrackCount();
    }

    @Override // X.JN4
    public MediaFormat BGh(int i) {
        MediaFormat mediaFormat;
        FFMpegMediaFormat trackFormat = this.A02.getTrackFormat(i);
        if (trackFormat != null) {
            if (HBJ.A02.value.equals(AnonymousClass001.A0b("mime", trackFormat.mMap))) {
                trackFormat.setString("mime", HBJ.A01.value);
            }
            mediaFormat = new MediaFormat();
            Iterator A1B = 1BK.A1B(trackFormat.mMap);
            while (A1B.hasNext()) {
                String A0i = AnonymousClass001.A0i(A1B);
                V v = FFMpegMediaFormat.ALL_KEYS.get(A0i);
                if (v == String.class) {
                    mediaFormat.setString(A0i, AnonymousClass001.A0b(A0i, trackFormat.mMap));
                } else if (v == Integer.class) {
                    mediaFormat.setInteger(A0i, 7zR.A05(1BK.A0o(A0i, trackFormat.mMap)));
                } else if (v == Long.class) {
                    mediaFormat.setLong(A0i, 7zS.A08(1BK.A0o(A0i, trackFormat.mMap)));
                } else if (v == Float.class) {
                    Number A0o = 1BK.A0o(A0i, trackFormat.mMap);
                    mediaFormat.setFloat(A0i, A0o != null ? A0o.floatValue() : 0.0f);
                } else if (v == ByteBuffer.class) {
                    mediaFormat.setByteBuffer(A0i, (ByteBuffer) trackFormat.mMap.get(A0i));
                }
            }
        } else {
            mediaFormat = null;
        }
        return mediaFormat;
    }

    @Override // X.JN4
    public int Cb9(ByteBuffer byteBuffer, int i) {
        return this.A02.readSampleData(byteBuffer, 0);
    }

    @Override // X.JN4
    public void CkB(long j, int i) {
        this.A02.seekTo(this.A00, j, i);
    }

    @Override // X.JN4
    public void CkL(int i) {
        this.A02.selectTrack(i);
        this.A00 = i;
    }

    @Override // X.JN4
    public void Cnx(String str) {
        try {
            FFMpegMediaDemuxer fFMpegMediaDemuxer = new FFMpegMediaDemuxer(this.A01, str, new FFMpegMediaDemuxer.Options());
            this.A02 = fFMpegMediaDemuxer;
            fFMpegMediaDemuxer.initialize();
        } catch (Exception e) {
            throw new IOException("create ffmpeg concat file failed", e);
        }
    }

    @Override // X.JN4
    public void release() {
        this.A02.release();
    }
}
