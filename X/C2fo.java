package X;

import com.facebook.common.util.TriState;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* renamed from: X.2fo, reason: invalid class name */
/* loaded from: 2fo.class */
public final class C2fo {
    public volatile int A00;
    public volatile long A01;
    public volatile long A02;
    public volatile long A03;
    public volatile long A04;
    public volatile UserKey A06;
    public volatile boolean A08;
    public volatile boolean A09;
    public volatile TriState A05 = TriState.UNSET;
    public volatile ImmutableMap A07 = RegularImmutableMap.A03;

    public C2fo() {
        long j = -1;
        this.A03 = j;
        this.A04 = j;
    }

    public void A00(ThreadKey threadKey, C7sg c7sg) {
        synchronized (this) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
            builder.putAll(C1my.A03(new 3dX(threadKey, this, 1), this.A07));
            if (c7sg != null) {
                builder.put(threadKey, c7sg);
            }
            this.A07 = builder.build();
        }
    }
}
