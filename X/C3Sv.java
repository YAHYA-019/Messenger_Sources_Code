package X;

import android.os.Handler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: X.3Sv, reason: invalid class name */
/* loaded from: 3Sv.class */
public final class C3Sv {
    public static int A05 = 255;
    public static Integer A06;
    public static final Handler A07 = AnonymousClass001.A07();
    public Runnable A00 = null;
    public ScheduledExecutorService A01;
    public ScheduledFuture A02;
    public final int A03;
    public final int A04;

    public C3Sv(int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
    }

    public C3Sv(ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.A03 = i;
        this.A04 = i2;
        this.A01 = scheduledExecutorService;
    }
}
