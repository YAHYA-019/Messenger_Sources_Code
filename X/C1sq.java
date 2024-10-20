package X;

import com.facebook.litho.ComponentsSystrace;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1sq, reason: invalid class name */
/* loaded from: 1sq.class */
public abstract class C1sq {
    public final RunnableFuture A00;
    public final AtomicInteger A01;
    public final AtomicInteger A02;
    public final AtomicInteger A03 = new AtomicInteger(-1);
    public final boolean A04;
    public final int A05;
    public volatile Object A06;
    public volatile Object A07;
    public volatile boolean A08;

    public C1sq(int i, boolean z) {
        this.A05 = i;
        this.A04 = z;
        this.A01 = z ? new AtomicInteger(0) : new AtomicInteger(2);
        this.A02 = new AtomicInteger(0);
        this.A00 = 1NB.A00("TreeFuture_calculateResult", new FutureTask(new C3ix(this, 1)));
    }

    public static final void A01(C1sq c1sq, String str) {
        1kJ A00 = ComponentsSystrace.A00(0Pz.A0v("<cls>", c1sq.getClass().getName(), "</cls>.", str));
        A00.A9E("runningThreadId", c1sq.A03.get());
        A00.flush();
    }

    public int A02() {
        return this.A05;
    }

    public abstract C1ty A03();

    public C1ty A04(C1ty c1ty) {
        throw new UnsupportedOperationException("LayoutTreeFuture cannot be resumed.");
    }

    public abstract String A05();

    public final void A06() {
        synchronized (this) {
            if (!this.A08) {
                this.A07 = null;
                this.A06 = null;
                this.A08 = true;
            }
        }
    }

    public abstract boolean A07(C1sq c1sq);

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r0 == android.os.Process.myTid()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A08(boolean r302) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1sq.A08(boolean):boolean");
    }
}
