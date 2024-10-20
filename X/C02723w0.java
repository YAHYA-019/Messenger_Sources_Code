package X;

import java.util.Collection;

/* renamed from: X.3w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: 3w0.class */
public final class C02723w0 implements 0Cq {
    public long A00;
    public C0dr A01;
    public Collection A02;
    public final 0Cq A03;

    public C02723w0(C0dr c0dr, 0Cq r303) {
        this.A03 = r303;
        this.A01 = c0dr;
    }

    public Collection getDataPoints() {
        Collection collection;
        synchronized (this) {
            if (this.A02 == null || this.A01.now() >= this.A00 + 500) {
                this.A02 = this.A03.getDataPoints();
                this.A00 = this.A01.now();
            }
            collection = this.A02;
        }
        return collection;
    }

    public /* synthetic */ java.util.Map getIndexedDataPoints() {
        return null;
    }

    public boolean shouldCollectMetrics(int i) {
        return this.A03.shouldCollectMetrics(i);
    }

    public /* synthetic */ boolean shouldCollectMetrics(int i, 0M7 r303) {
        return 0M8.A00(r303, this, i);
    }

    public /* synthetic */ boolean supportsIndexedDataPoints() {
        return false;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("RateLimited{");
        A0k.append(this.A03);
        return AnonymousClass001.A0f(A0k);
    }
}
