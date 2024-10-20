package X;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: X.3Nt, reason: invalid class name */
/* loaded from: 3Nt.class */
public final class C3Nt {
    public 1BY A00;
    public final C00i A01 = 1BQ.A02(16461);

    public C3Nt(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public 47I A00(long j) {
        1hM A09;
        if (((C1m1) 1Bi.A03(16782)).A04()) {
            A09 = new 1hM(AnonymousClass001.A0K());
        } else {
            ?? obj = new Object();
            1PA A01 = 1P9.A01(new 1P9((1I7) 1Hv.A02((Context) 1Bn.A0E((Context) null, this.A00, 83719), 65728)), new 3cN(this, (Object) obj, 3), "com.facebook.push.mqtt.ACTION_CHANNEL_STATE_CHANGED");
            A01.A00();
            ((C00171ab) 1Bi.A03(16713)).A08();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            C00i c00i = this.A01;
            A09 = 1Kd.A09((ListenableFuture) obj, (ScheduledExecutorService) c00i.get(), timeUnit, j);
            1Kd.A0D(c00i, new ABp(A01, this, 25), A09);
        }
        return 47H.A00(new ABe(this, 17), A09, TimeoutException.class, 1JU.A01);
    }
}
