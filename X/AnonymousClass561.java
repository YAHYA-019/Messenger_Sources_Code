package X;

import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.List;

/* renamed from: X.561, reason: invalid class name */
/* loaded from: 561.class */
public final class AnonymousClass561 implements AnonymousClass544 {
    public final int A00;
    public final long A01;
    public final ThreadSummary A02;
    public final 9KY A03;
    public final List A04;

    public AnonymousClass561(ThreadSummary threadSummary, 9KY r303, List list, int i, long j) {
        this.A01 = j;
        this.A04 = list;
        this.A02 = threadSummary;
        this.A03 = r303;
        this.A00 = i;
    }

    @Override // X.AnonymousClass544
    public boolean BVd(AnonymousClass544 anonymousClass544) {
        boolean z = false;
        if (!11T.A0O(4YV.A0d(anonymousClass544, 0), AnonymousClass561.class)) {
            return false;
        }
        AnonymousClass561 anonymousClass561 = (AnonymousClass561) anonymousClass544;
        if (this.A01 == anonymousClass561.A01 && this.A00 == anonymousClass561.A00 && this.A04.size() == anonymousClass561.A04.size()) {
            z = true;
        }
        return z;
    }

    @Override // X.AnonymousClass544
    public long getId() {
        return this.A01;
    }
}
