package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.4Ez, reason: invalid class name */
/* loaded from: 4Ez.class */
public final class C4Ez {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public final C4F0 A03;
    public final Object A04;
    public volatile boolean A05;

    public C4Ez() {
        this.A04 = new Object();
        this.A03 = new C4F0();
    }

    public C4Ez(int i) {
    }

    private final void A00() {
        if (this.A02) {
            if (!A0D()) {
                throw AnonymousClass001.A0N("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception A04 = A04();
            throw new IllegalStateException("Complete with: ".concat(A04 != null ? OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE : A0E() ? "result ".concat(String.valueOf(String.valueOf(A05()))) : this.A05 ? DKB.A00(82) : "unknown issue"), A04);
        }
    }

    public static final void A01(C4Ez c4Ez) {
        synchronized (c4Ez.A04) {
            if (c4Ez.A02) {
                c4Ez.A03.A01(c4Ez);
            }
        }
    }

    public final C4Ez A02(MGM mgm, Executor executor) {
        C4Ez c4Ez = new C4Ez();
        this.A03.A00(new JRX(mgm, c4Ez, executor));
        A01(this);
        return c4Ez;
    }

    public final C4Ez A03(C4F3 c4f3, Executor executor) {
        this.A03.A00(new 4FB(c4f3, executor));
        A01(this);
        return this;
    }

    public final Exception A04() {
        Exception exc;
        synchronized (this.A04) {
            exc = this.A00;
        }
        return exc;
    }

    public final Object A05() {
        Throwable th;
        Object obj;
        synchronized (this.A04) {
            AbstractC00481b7.A09(this.A02, "Task is not yet complete");
            if (this.A05) {
                new CancellationException(1BJ.A00(874));
            } else {
                Exception exc = this.A00;
                if (exc == null) {
                    obj = this.A01;
                } else {
                    new RuntimeException(exc);
                }
            }
            throw th;
        }
        return obj;
    }

    public final void A06() {
        synchronized (this.A04) {
            if (this.A02) {
                return;
            }
            this.A02 = true;
            this.A05 = true;
            this.A03.A01(this);
        }
    }

    public final void A07(C4F1 c4f1, Executor executor) {
        this.A03.A00(new 4FD(c4f1, executor));
        A01(this);
    }

    public final void A08(C51o c51o) {
        this.A03.A00(new C51p(c51o, C4F7.A00));
        A01(this);
    }

    public final void A09(C51o c51o, Executor executor) {
        this.A03.A00(new C51p(c51o, executor));
        A01(this);
    }

    public final void A0A(C4F2 c4f2, Executor executor) {
        this.A03.A00(new 4FC(c4f2, executor));
        A01(this);
    }

    public final void A0B(Exception exc) {
        AbstractC00481b7.A03(exc, "Exception must not be null");
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A01(this);
    }

    public final void A0C(Object obj) {
        synchronized (this.A04) {
            A00();
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A01(this);
    }

    public final boolean A0D() {
        boolean z;
        synchronized (this.A04) {
            z = this.A02;
        }
        return z;
    }

    public final boolean A0E() {
        boolean z;
        synchronized (this.A04) {
            z = false;
            if (this.A02 && !this.A05 && this.A00 == null) {
                z = true;
            }
        }
        return z;
    }
}
