package X;

import java.util.concurrent.Executor;

/* renamed from: X.51p, reason: invalid class name */
/* loaded from: 51p.class */
public final class C51p implements C4F4 {
    public C51o A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C51p(C51o c51o, Executor executor) {
        this.A02 = executor;
        this.A00 = c51o;
    }

    @Override // X.C4F4
    public final void DCZ(C4Ez c4Ez) {
        synchronized (this.A01) {
        }
        this.A02.execute(new 52Q(this, c4Ez));
    }
}
