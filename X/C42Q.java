package X;

import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import com.facebook.inject.FbInjector;
import com.google.common.base.Preconditions;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.42Q, reason: invalid class name */
/* loaded from: 42Q.class */
public final class C42Q {
    public static final String A08;
    public static final String A09;
    public long A00;
    public Future A01;
    public Future A02;
    public final Context A03;
    public final ScheduledExecutorService A06;
    public final Object A04 = new Object();
    public final Runnable A05 = new AbstractRunnableC00191ad() { // from class: X.42R
        public static final String __redex_internal_original_name = "NetworkActivityBroadcastManager$1";

        {
            super(C42Q.class, "ActiveRadioRunner");
        }

        @Override // java.lang.Runnable
        public void run() {
            C42Q c42q = C42Q.this;
            synchronized (c42q.A04) {
                Future future = c42q.A01;
                if (future != null && !future.isCancelled()) {
                    Intent intent = new Intent(C42Q.A08);
                    intent.putExtra("pid", Binder.getCallingPid());
                    c42q.A03.sendBroadcast(intent);
                    c42q.A01 = c42q.A06.schedule(this, 60000L, TimeUnit.MILLISECONDS);
                }
            }
        }
    };
    public final Runnable A07 = new AbstractRunnableC00191ad() { // from class: X.42S
        public static final String __redex_internal_original_name = "NetworkActivityBroadcastManager$2";

        {
            super(C42Q.class, "InactiveRadioRunner");
        }

        @Override // java.lang.Runnable
        public void run() {
            C42Q c42q = C42Q.this;
            synchronized (c42q.A04) {
                Future future = c42q.A02;
                if (future != null && !future.isCancelled()) {
                    Intent intent = new Intent(C42Q.A09);
                    intent.putExtra("pid", Binder.getCallingPid());
                    c42q.A03.sendBroadcast(intent);
                    c42q.A02 = null;
                    Preconditions.checkNotNull(c42q.A01, "Internal inconsistency managing intent futures");
                    c42q.A01.cancel(false);
                    c42q.A01 = null;
                }
            }
        }
    };

    static {
        String name = C42Q.class.getName();
        A08 = 0Pz.A0W(name, ".NETWORKING_ACTIVE");
        A09 = 0Pz.A0W(name, ".NETWORKING_INACTIVE");
    }

    public C42Q() {
        Context A00 = FbInjector.A00();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) 1Bn.A0A(16452);
        this.A03 = A00;
        this.A06 = scheduledExecutorService;
    }

    public void A00() {
        synchronized (this.A04) {
            boolean z = false;
            if (this.A02 == null) {
                z = true;
            }
            Preconditions.checkState(z, "Internal inconsistency managing intent futures");
            long j = this.A00 - 1;
            this.A00 = j;
            if (j == 0) {
                this.A02 = this.A06.schedule(this.A07, 2000L, TimeUnit.MILLISECONDS);
            }
        }
    }
}
