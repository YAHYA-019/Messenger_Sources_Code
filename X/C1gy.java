package X;

import android.content.Context;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.inject.FbInjector;
import com.facebook.quicklog.QuickPerformanceLogger;

/* renamed from: X.1gy, reason: invalid class name */
/* loaded from: 1gy.class */
public final class C1gy {
    public C1gz A00;
    public C1gz A01;
    public final long A02;
    public final Context A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0B;
    public final C1gk A0C;
    public final C1gp A0D;
    public final 1Ug A0E;
    public final 04P A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final Context A0J;
    public final 1Br A0A = 1Bq.A00(16385);
    public final 1Br A0K = 1Bq.A00(16520);

    /* JADX WARN: Type inference failed for: r0v64, types: [X.1gz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v75, types: [X.1gz, java.lang.Object] */
    public C1gy() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A0J = context;
        this.A05 = 1HG.A00(context, 100171);
        this.A03 = FbInjector.A00();
        this.A06 = 1Bq.A00(16616);
        this.A0I = ((2yD) this.A0A.A00.get()).AZk(36313609185860368L);
        this.A0H = ((2yD) this.A0A.A00.get()).AZk(36313609185925905L);
        this.A0G = ((2yD) this.A0A.A00.get()).AZk(36313609188219679L);
        this.A02 = ((2yD) this.A0A.A00.get()).Auy(36595084162304419L);
        this.A07 = 1Bq.A00(16687);
        this.A0B = 1Bq.A00(84488);
        this.A08 = 1Bq.A00(66431);
        this.A09 = 1Bq.A00(66428);
        this.A04 = 1Bq.A00(66425);
        ?? obj = new Object();
        obj.A00 = 1;
        obj.A01 = 0;
        obj.A05 = null;
        obj.A06 = null;
        obj.A02 = 0;
        obj.A07 = false;
        obj.A04 = 0L;
        obj.A03 = 0L;
        this.A01 = obj;
        ?? obj2 = new Object();
        obj2.A00 = 1;
        obj2.A01 = 0;
        obj2.A05 = null;
        obj2.A06 = null;
        obj2.A02 = 0;
        obj2.A07 = false;
        obj2.A04 = 0L;
        obj2.A03 = 0L;
        this.A00 = obj2;
        this.A0F = new 3cC(this, 1);
        this.A0E = new C3Z3(this, 1);
        this.A0C = new AnonymousClass316(this, 0);
        this.A0D = new C1gp() { // from class: X.1h1
            @Override // X.C1gp
            public void BhA(long j, long j2, long j3, long j4) {
                C1gy c1gy = C1gy.this;
                C1gy.A03(c1gy, new 3kM(c1gy, j, j2, j3, j4));
            }

            @Override // X.C1gp
            public void BhB() {
                C1gy c1gy = C1gy.this;
                C1gy.A03(c1gy, new C2xl(c1gy, 39));
            }

            @Override // X.C1gp
            public void C5S(int i, int i2) {
                C1gy c1gy = C1gy.this;
                C1gy.A03(c1gy, new C2xp(c1gy, i, i2, 0));
            }

            @Override // X.C1gp
            public void C5T(boolean z, int i) {
            }

            @Override // X.C1gp
            public void C9Z(int i) {
            }
        };
    }

    public static final QuickPerformanceLogger A00(C1gy c1gy) {
        return (QuickPerformanceLogger) c1gy.A0K.A00.get();
    }

    public static final void A01(C1gz c1gz, C1gy c1gy, int i) {
        A02(c1gz, c1gy, i);
        A00(c1gy).markerEnd(729351308, i, (short) 2);
        c1gz.A00 = 1;
        c1gz.A01 = 0;
        c1gz.A05 = null;
        c1gz.A06 = null;
    }

    public static final void A02(C1gz c1gz, C1gy c1gy, int i) {
        A00(c1gy).markerAnnotate(729351308, i, "connection_count", c1gz.A00);
        A00(c1gy).markerAnnotate(729351308, i, "end_connection_state", c1gz.A07);
        A00(c1gy).markerAnnotate(729351308, i, "notification_count", c1gz.A01);
        C2t7.A00((1Od) c1gy.A06.A00.get(), (FbNetworkManager) c1gy.A07.A00.get(), A00(c1gy), 729351308, i);
        if (c1gz.A05 != null) {
            A00(c1gy).markerAnnotate(729351308, i, "atid", c1gz.A05);
        }
        if (c1gz.A06 != null) {
            A00(c1gy).markerAnnotate(729351308, i, "connection_caller", c1gz.A06);
        }
    }

    public static final void A03(C1gy c1gy, C00m c00m) {
        if (c1gy.A0H || c1gy.A0I) {
            synchronized (c1gy) {
                c00m.invoke();
            }
        }
    }

    public static final void A04(C1gy c1gy, C00m c00m, int i) {
        if (i == 2) {
            if (!c1gy.A0H) {
                return;
            }
        } else if (!c1gy.A0I) {
            return;
        }
        synchronized (c1gy) {
            c00m.invoke();
        }
    }

    public static final boolean A05(C1gy c1gy, int i) {
        return A00(c1gy).isMarkerOn(729351308, i);
    }
}
