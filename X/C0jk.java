package X;

import com.facebook.fury.context.ReqContext;

/* renamed from: X.0jk, reason: invalid class name */
/* loaded from: 0jk.class */
public final class C0jk {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final ReqContext A04;
    public final String A05;
    public final Throwable A06;

    public C0jk(ReqContext reqContext, String str, Throwable th, int i, int i2, long j, long j2) {
        this.A03 = j;
        this.A01 = i;
        this.A04 = reqContext;
        this.A00 = i2;
        this.A06 = th;
        this.A05 = str;
        this.A02 = j2;
    }

    public C0jk(ReqContext reqContext, Throwable th, int i, long j) {
        this.A03 = j;
        this.A01 = i;
        this.A04 = reqContext;
        this.A00 = 0;
        this.A06 = th;
        Thread currentThread = Thread.currentThread();
        this.A05 = currentThread.getName();
        this.A02 = currentThread.getId();
    }
}
