package X;

import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3rm, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3rm.class */
public final class C01573rm {
    public static C01573rm A04 = new C01573rm();
    public static final java.util.Map A05;
    public List A01 = new ArrayList();
    public final List A02 = new ArrayList();
    public int A00 = 0;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("drawee_request_id", "drawee_request_id");
        hashMap.put("videoId", TraceFieldType.VideoId);
        hashMap.put(TraceFieldType.Bitrate, "video_bitrate");
        hashMap.put("streamType", "video_stream_type");
        hashMap.put("startMs", "video_start_ms");
        hashMap.put("durationMs", "video_duration_ms");
        hashMap.put("bufferDurationMs", "bufferDurationMs");
        hashMap.put("isPrefetch", "video_is_prefetch");
        hashMap.put("rlrInKbps", "rlr_in_kbps");
        hashMap.put("videoRequestType", "video_request_type");
        A05 = Collections.unmodifiableMap(hashMap);
    }

    public static Pair A00() {
        Pair pair;
        synchronized (C01573rm.class) {
            C01573rm c01573rm = A04;
            pair = new Pair(c01573rm.A01, Integer.valueOf(c01573rm.A00));
            c01573rm.A01 = AnonymousClass001.A0s();
            c01573rm.A00 = 0;
        }
        return pair;
    }
}
