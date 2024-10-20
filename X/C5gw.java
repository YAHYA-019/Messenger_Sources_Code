package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

/* renamed from: X.5gw, reason: invalid class name */
/* loaded from: 5gw.class */
public final class C5gw {
    public 1BY A00;
    public final C00i A07;
    public final C00i A09;
    public final C00i A06 = new 1BV((1BY) null, 49821);
    public final C00i A05 = new 1BV((1BY) null, 49822);
    public final C00i A0A = new 1BV((1BY) null, 83431);
    public final C00i A08 = new 1BV((1BY) null, 83593);
    public final C00i A03 = new 1BQ(16385);
    public final C00i A04 = new 1BQ(16387);
    public final C00i A0G = new 1BV((1BY) null, 67104);
    public final C00i A0F = new 1BV((1BY) null, 67103);
    public final C00i A0E = new 1BV((1BY) null, 67102);
    public final C00i A0H = new 1BV((1BY) null, 67101);
    public final C00i A0C = new 1BV((1BY) null, 1088);
    public final C00i A0D = new 1BV((1BY) null, 1089);
    public final C5gy A0B = new C5gy() { // from class: X.5gx
        @Override // X.C5gy
        public void Byg(Throwable th) {
            C5gz A00 = C5gw.A00(C5gw.this);
            if (th != null) {
                A00.A04(th);
            } else {
                A00.A01();
            }
        }

        @Override // X.C5gy
        public void CNg(String str, boolean z, boolean z2) {
            ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
            builder.put("device_idle", String.valueOf(z));
            builder.put("has_external_power", String.valueOf(z2));
            builder.put("connectivity_type", str);
            C5gw c5gw = C5gw.this;
            C5gw.A00(c5gw).A03("stop_state", builder.build().toString());
            ((QuickPerformanceLogger) C5gw.A00(c5gw).A01.get()).markerPoint(188224997, "JOB_STOPPED");
        }

        @Override // X.C5gy
        public void onDestroy() {
            C5gw c5gw = C5gw.this;
            ((QuickPerformanceLogger) C5gw.A00(c5gw).A01.get()).markerPoint(188224997, "JOB_DESTROYED");
            C5gz A00 = C5gw.A00(c5gw);
            synchronized (A00) {
                C5gz.A00(A00);
                ((QuickPerformanceLogger) A00.A01.get()).markerEnd(188224997, (short) 113);
            }
        }

        @Override // X.C5gy
        public void onLog(String str) {
            C5h1 A01 = C5gw.A01(C5gw.this);
            long now = ((C0dp) A01.A00.get()).now();
            long j = -1;
            A01.log(j, now, j, -1, "", -1, str);
        }

        @Override // X.C5gy
        public void onStart() {
            C5gw.A00(C5gw.this).A02();
        }
    };
    public C5gz A01 = null;
    public C5h1 A02 = null;

    public C5gw(1BO r302, FbUserSession fbUserSession) {
        this.A00 = new 1BY(r302);
        Integer num = 1Lo.A05;
        this.A09 = new 1MV(fbUserSession, (1BY) null, 49823);
        this.A07 = new 1MV(fbUserSession, (1BY) null, 49824);
    }

    public static C5gz A00(C5gw c5gw) {
        synchronized (c5gw) {
            if (c5gw.A01 == null) {
                c5gw.A01 = ((82O) c5gw.A0C.get()).A0R("m4a");
            }
        }
        return c5gw.A01;
    }

    public static C5h1 A01(C5gw c5gw) {
        synchronized (c5gw) {
            if (c5gw.A02 == null) {
                c5gw.A02 = ((82O) c5gw.A0D.get()).A0S("m4a");
            }
        }
        return c5gw.A02;
    }

    public ImmutableList A02() {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11012add((Object[]) new C5gr[]{(C5gr) this.A0G.get(), (C5gr) this.A0F.get(), (C5gr) this.A0E.get(), (C5gr) this.A0H.get()});
        return builder.build();
    }
}
