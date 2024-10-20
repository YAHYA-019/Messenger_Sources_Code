package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableList;

/* loaded from: C0j.class */
public final class C0j {
    public final ImmutableList A00;

    public C0j(ImmutableList immutableList) {
        this.A00 = immutableList;
    }

    public ThreadKey A00() {
        ImmutableList immutableList = this.A00;
        if (immutableList.isEmpty()) {
            return null;
        }
        return ((ThreadSummary) 1BK.A0r(immutableList)).A0n;
    }
}
