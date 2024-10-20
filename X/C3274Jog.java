package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.Jog, reason: case insensitive filesystem */
/* loaded from: Jog.class */
public final class C3274Jog extends C3e6 {
    public BroadcastReceiver A00;
    public C41s A01;
    public RQl A02;
    public ScheduledFuture A03;
    public boolean A04;
    public final Context A05;
    public final C0dp A06;
    public final C0dr A07;
    public final C41o A08;
    public final C41q A09;
    public final ScheduledExecutorService A0A;

    public C3274Jog(Context context, C0dp c0dp, C0dr c0dr, C41s c41s, C41o c41o, C41q c41q, ScheduledExecutorService scheduledExecutorService) {
        this.A01 = c41s;
        this.A05 = context;
        this.A08 = c41o;
        this.A06 = c0dp;
        this.A09 = c41q;
        this.A07 = c0dr;
        this.A0A = scheduledExecutorService;
    }

    public static void A00(C3274Jog c3274Jog) {
        c3274Jog.A04 = false;
        c3274Jog.A02 = null;
        BroadcastReceiver broadcastReceiver = c3274Jog.A00;
        if (broadcastReceiver != null) {
            c3274Jog.A05.unregisterReceiver(broadcastReceiver);
            c3274Jog.A00 = null;
        }
        ScheduledFuture scheduledFuture = c3274Jog.A03;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            c3274Jog.A03 = null;
        }
    }
}
