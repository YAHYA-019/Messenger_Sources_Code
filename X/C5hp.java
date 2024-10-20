package X;

import android.media.MediaCodec;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.5hp, reason: invalid class name */
/* loaded from: 5hp.class */
public final class C5hp {
    public boolean A00 = false;
    public final ConcurrentLinkedQueue A01 = new ConcurrentLinkedQueue();
    public final /* synthetic */ C5ho A02;

    public C5hp(C5ho c5ho) {
        this.A02 = c5ho;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.6bI] */
    public static 6bI A00(String str, boolean z) {
        ?? equals;
        if (z && (equals = str.equals("meta.dav1d.av1.decoder")) != 0) {
            try {
                equals = (6bI) Class.forName("exoplayer2.av1.src.Dav1dMediaCodecAdapter").getConstructor(new Class[0]).newInstance(new Object[0]);
                return equals;
            } catch (Exception unused) {
                android.util.Log.w(JQw.A00(175), String.format("Exception when trying to instantiate %s: %s", "exoplayer2.av1.src.Dav1dMediaCodecAdapter", equals.getMessage()));
            }
        }
        return new 6bH(MediaCodec.createByCodecName(str));
    }

    public static void A01(6Vz r301, 6bI r302, C5hp c5hp, Boolean bool) {
        try {
            if (!r301.A0M || (!bool.booleanValue() && !r301.A0L)) {
                r302.stop();
            }
        } finally {
            C5ho c5ho = c5hp.A02;
            5LA r307 = c5ho.A01;
            if (r307 == null) {
                r307 = C7gg.A00;
            }
            r307.A01(r302.hashCode());
            r302.release();
            5LA r3072 = c5ho.A01;
            if (r3072 == null) {
                r3072 = C7gg.A00;
            }
            r3072.A00(r302.hashCode());
        }
    }

    public static void A02(6bI r301, C5hp c5hp, String str) {
        Set set;
        C5ho c5ho = c5hp.A02;
        synchronized (c5ho.A05) {
            set = (Set) c5ho.A05.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(r301)) {
                    c5ho.A00--;
                }
            }
        }
    }
}
