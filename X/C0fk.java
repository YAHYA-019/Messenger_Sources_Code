package X;

import android.os.SystemClock;

/* renamed from: X.0fk, reason: invalid class name */
/* loaded from: 0fk.class */
public final class C0fk {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public 0iF A07;
    public boolean A08;
    public boolean A09;
    public final Object A0A;

    public C0fk() {
        this(0L);
    }

    public C0fk(long j) {
        this.A05 = 0L;
        this.A0A = AnonymousClass001.A0R();
        this.A09 = true;
    }

    public long A00() {
        long j;
        synchronized (this) {
            j = 0;
            if (!this.A09 && !this.A08) {
                j = SystemClock.uptimeMillis() - this.A01;
            }
        }
        return j;
    }

    public long A01() {
        long A00;
        synchronized (this) {
            A00 = this.A05 + A00();
        }
        return A00;
    }
}
