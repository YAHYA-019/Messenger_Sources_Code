package X;

import java.nio.charset.Charset;

/* loaded from: Ky2.class */
public abstract class Ky2 {
    public static final Charset A00 = Charset.forName("UTF-8");

    public static void A00(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw JQx.A0l("size=%s offset=%s byteCount=%s", JQy.A1b(Long.valueOf(j), j2, j3));
        }
    }
}
