package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import java.util.LinkedHashMap;

/* renamed from: X.2mr, reason: invalid class name */
/* loaded from: 2mr.class */
public final class C2mr {
    public final 1Br A01 = 1Bq.A00(16634);
    public final 1Br A00 = 1Bq.A00(99390);
    public final java.util.Map A02 = new LinkedHashMap();

    public static final void A00(C2ms c2ms, ThreadSummary threadSummary, C2mr c2mr, int i) {
        A01(c2ms, threadSummary, c2mr, null, 1, i);
        java.util.Map map = c2mr.A02;
        ThreadKey threadKey = threadSummary.A0n;
        11T.A0A(threadKey);
        map.put(threadKey, null);
    }

    public static final void A01(C2ms c2ms, ThreadSummary threadSummary, C2mr c2mr, Long l, int i, int i2) {
        java.util.Map map;
        1UG A00 = 1UD.A00((04J) c2mr.A01.A00.get(), 1ZG.A01, "messenger_thread_tag_events");
        if (A00.isSampled()) {
            int i3 = (-1) << (-1);
            A00.A5q("event_name", Integer.valueOf(i));
            A00.A6H("raw_client_time", Long.valueOf(((C0dp) c2mr.A00.A00.get()).now()));
            A00.A5c(c2ms, FalcoACSProvider.TAG);
            ThreadKey threadKey = threadSummary.A0n;
            A00.A5c(AbstractC03573yf.A00(threadKey), "thread_type");
            A00.A7R("thread_id", String.valueOf(threadSummary.A1e));
            if (i2 != i3) {
                A00.A5q("removal_reason", Integer.valueOf(i2));
            } else {
                A00.A7R("removal_reason", (String) null);
            }
            A00.A6H("group_size", Long.valueOf(threadSummary.A1L.size()));
            A00.A5H("is_e2ee", Boolean.valueOf(threadKey.A0z()));
            if (l != null) {
                map = 1BK.A1D(AbstractC00603o4.A00(21), l.toString());
            } else {
                map = null;
            }
            A00.A6J("extra", map);
            A00.BZL();
        }
    }
}
