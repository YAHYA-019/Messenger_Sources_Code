package X;

import android.media.MediaCodec;

/* loaded from: Hw3.class */
public abstract class Hw3 {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, long] */
    public static final Exception A00(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            mediaCodec.release();
            return null;
        } catch (Exception e) {
            ?? r0 = 10;
            try {
                Thread.sleep(r0);
                mediaCodec.release();
                return null;
            } catch (Exception unused) {
                return new Exception(r0.getMessage(), e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, long] */
    public static final Exception A01(MediaCodec mediaCodec) {
        if (mediaCodec == null) {
            return null;
        }
        try {
            mediaCodec.stop();
            return null;
        } catch (Exception e) {
            ?? r0 = 10;
            try {
                Thread.sleep(r0);
                mediaCodec.stop();
                return null;
            } catch (Exception unused) {
                return new Exception(r0.getMessage(), e);
            }
        }
    }
}
