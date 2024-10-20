package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadParticipant;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.6hi, reason: invalid class name */
/* loaded from: 6hi.class */
public abstract class C6hi {
    public static final ImmutableList A00(ThreadSummary threadSummary) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ThreadKey threadKey = threadSummary.A0n;
        11T.A0A(threadKey);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (threadKey.A1K() || threadKey.A19()) {
            linkedHashSet.add(UserKey.A00(Long.valueOf(threadKey.A02)));
        }
        1Du it = threadSummary.A1L.iterator();
        while (it.hasNext()) {
            UserKey userKey = ((ThreadParticipant) it.next()).A05.A0F;
            11T.A09(userKey);
            linkedHashSet.add(userKey);
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            builder.m11011add(it2.next());
        }
        ImmutableList build = builder.build();
        11T.A0A(build);
        return build;
    }
}
