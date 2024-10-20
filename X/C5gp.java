package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.5gp, reason: invalid class name */
/* loaded from: 5gp.class */
public final class C5gp {
    public 1BY A00;
    public final C00i A06;
    public final C00i A07;
    public final C00i A09;
    public final C00i A0A;
    public final C00i A05 = new 1BQ(16385);
    public final C00i A01 = new 1BQ(33013);
    public final C00i A04 = new 1BV((1BY) null, 67104);
    public final C00i A03 = new 1BV((1BY) null, 67103);
    public final C00i A02 = new 1BV((1BY) null, 67102);
    public final C00i A0B = new 1BV((1BY) null, 131165);
    public final C00i A08 = new 1BV((1BY) null, 67101);

    public C5gp(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A09 = new 1MV(fbUserSession, (1BY) null, 131177);
        this.A0A = new 1MV(fbUserSession, (1BY) null, 49818);
        this.A06 = new 1MV(fbUserSession, (1BY) null, 49820);
        this.A07 = new 1MV(fbUserSession, (1BY) null, 49819);
    }

    /* JADX WARN: Type inference failed for: r0v27, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static void A00(C5gr c5gr, C5gp c5gp) {
        String name = c5gr.getName();
        C7od c7od = (C7od) c5gp.A07.get();
        synchronized (c7od) {
            int hashCode = name.hashCode();
            QuickPerformanceLogger quickPerformanceLogger = c7od.A00;
            quickPerformanceLogger.markerStart(188226264, hashCode, false);
            quickPerformanceLogger.markerAnnotate(188226264, hashCode, "population", "m4a");
            quickPerformanceLogger.markerAnnotate(188226264, hashCode, "executor_name", name);
        }
        5hT r0 = (5hT) c5gp.A0A.get();
        ?? obj = new Object();
        r0.A03.execute(new Lpe(c5gr, r0, obj));
        1Kd.A0F(new ABo(name, c5gp, 4), (ListenableFuture) obj, 1JU.A01);
    }

    public void A01() {
        5hT r0 = (5hT) this.A0A.get();
        5hY r02 = new 5hY(this);
        5hU r03 = r0.A01;
        synchronized (r03) {
            r03.A00 = r02;
        }
    }

    public void A02() {
        C00i c00i = this.A04;
        if (((C5gq) c00i.get()).BSI()) {
            if (((2yD) this.A05.get()).AZk(36317753832058670L)) {
                C00i c00i2 = this.A01;
                if (((FbSharedPreferences) c00i2.get()).Av1(1NK.A5J, 0L) >= ((FbSharedPreferences) c00i2.get()).Av1(1NK.A5I, 0L)) {
                    return;
                }
            }
            1Ql A0V = 1BL.A0V(this.A01);
            A0V.CaH(1NK.A5J, System.currentTimeMillis());
            A0V.commit();
            A00((C5gr) c00i.get(), this);
        }
    }
}
