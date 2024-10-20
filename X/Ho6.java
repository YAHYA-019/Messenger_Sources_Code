package X;

import com.facebook.ffmpeg.FFMpegMediaDemuxer;
import com.google.common.base.Throwables;
import java.io.File;

/* loaded from: Ho6.class */
public final class Ho6 {
    public final I87 A01 = (I87) 1Bn.A0A(116368);
    public final HQH A00 = (HQH) 1Bn.A0A(116370);

    public final Hxo A00(File file) {
        Hxo hxo;
        FFMpegMediaDemuxer fFMpegMediaDemuxer = null;
        try {
            HQH hqh = this.A00;
            FFMpegMediaDemuxer fFMpegMediaDemuxer2 = new FFMpegMediaDemuxer(hqh.A00, file.getPath());
            fFMpegMediaDemuxer2.initialize();
            HfE A01 = this.A01.A01(fFMpegMediaDemuxer2);
            if (A01 != null) {
                new Hxo(A01.A02);
            } else {
                new Hxo();
            }
            fFMpegMediaDemuxer2.release();
            return hxo;
        } catch (Throwable th) {
            try {
                0fH.A0K(Ho6.class, "Exception", th);
                Throwables.propagate(th);
                throw 0Q8.createAndThrow();
            } catch (Throwable th2) {
                if (0 != 0) {
                    fFMpegMediaDemuxer.release();
                }
                throw th2;
            }
        }
    }
}
