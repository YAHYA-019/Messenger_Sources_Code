package X;

import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.perf.background.BackgroundStartupDetector;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1gn, reason: invalid class name */
/* loaded from: 1gn.class */
public final class C1gn {
    public TimerTask A00;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0H;
    public final 1Br A0I;
    public final C1gk A0J;
    public final C1gp A0K;
    public final Context A0L;
    public final 1Br A0M;
    public final Timer A0N;
    public final 1Br A0G = 1Bq.A00(16385);
    public final 1Br A0C = 1Bq.A00(16687);
    public AtomicReference A01 = new AtomicReference(null);

    public C1gn() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A0L = A00;
        this.A0B = 1HG.A00(A00, 65728);
        this.A0H = 1Bq.A00(66265);
        this.A0I = 1Bu.A00(16671);
        this.A0M = 1Bq.A00(16520);
        this.A0A = 1Bq.A00(16616);
        this.A0D = 1Bq.A00(33073);
        this.A0F = 1Bq.A00(66428);
        this.A0E = 1Bq.A00(66431);
        this.A0N = new Timer();
        this.A0J = new AnonymousClass316(this, 2);
        this.A0K = new C1gp() { // from class: X.1go
            @Override // X.C1gp
            public void BhA(long j, long j2, long j3, long j4) {
                synchronized (this) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("onACTPreviewNotification enabled=");
                    C1gn c1gn = C1gn.this;
                    sb.append(c1gn.A04);
                    sb.append(" isActive=");
                    sb.append(c1gn.A05);
                    sb.append(" totalCount=");
                    sb.append(j);
                    0fH.A0j("MPLDataFreshnessTracker", sb.toString());
                    if (c1gn.A05) {
                        C1gn.A00(c1gn).markerPoint(729359638, "on_act_preview_notification");
                        C1gn.A00(c1gn).markerAnnotate(729359638, "preview_total_count", j);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "preview_message_count", j2);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "preview_receipt_count", j3);
                        C1gn.A00(c1gn).markerAnnotate(729359638, "preview_notification_count", j4);
                    }
                }
            }

            @Override // X.C1gp
            public void BhB() {
                synchronized (this) {
                    C1gn c1gn = C1gn.this;
                    0fH.A0j("MPLDataFreshnessTracker", 0Pz.A1A("onACTSyncCompleted enabled=", " isActive=", c1gn.A04, c1gn.A05));
                    if (c1gn.A05) {
                        QuickPerformanceLogger A002 = C1gn.A00(c1gn);
                        C1gm c1gm = (C1gm) c1gn.A0F.A00.get();
                        A002.markerAnnotate(729359638, "time_since_last_secure_noti_recv_ms", c1gm.A01 == 0 ? -1 : ((C0dr) c1gm.A03.A00.get()).now() - c1gm.A01);
                        C1gn.A00(c1gn).markerPoint(729359638, "on_act_sync_completed");
                        0fH.A0j("MPLDataFreshnessTracker", 0Pz.A18("endMarker enabled=", " isActive=", " reason=success", c1gn.A04, c1gn.A05));
                        if (c1gn.A05) {
                            C1gn.A00(c1gn).markerEnd(729359638, (short) 2);
                            TimerTask timerTask = c1gn.A00;
                            if (timerTask != null) {
                                timerTask.cancel();
                            }
                            c1gn.A00 = null;
                            c1gn.A05 = false;
                        }
                    }
                }
            }

            @Override // X.C1gp
            public void C5S(int i, int i2) {
            }

            @Override // X.C1gp
            public void C5T(boolean z, int i) {
            }

            @Override // X.C1gp
            public void C9Z(int i) {
            }
        };
    }

    public static final QuickPerformanceLogger A00(C1gn c1gn) {
        return (QuickPerformanceLogger) c1gn.A0M.A00.get();
    }

    public static void A01(C1gn c1gn, String str) {
        0fH.A0j("MPLDataFreshnessTracker", 0Pz.A1A(str, " isActive=", c1gn.A04, c1gn.A05));
    }

    public static final void A02(C1gn c1gn, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("cancelMarker enabled=");
        sb.append(c1gn.A04);
        sb.append(" isActive=");
        sb.append(c1gn.A05);
        sb.append(" reason=");
        sb.append(str);
        0fH.A0j("MPLDataFreshnessTracker", sb.toString());
        if (c1gn.A05) {
            A00(c1gn).markerAnnotate(729359638, "end_reason", str);
            A00(c1gn).markerEnd(729359638, (short) 4);
            TimerTask timerTask = c1gn.A00;
            if (timerTask != null) {
                timerTask.cancel();
            }
            c1gn.A00 = null;
            c1gn.A05 = false;
        }
    }

    public static final void A03(C1gn c1gn, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("startMarker enabled=");
        sb.append(c1gn.A04);
        sb.append(" isActive=");
        sb.append(c1gn.A05);
        sb.append(" reason=");
        sb.append(str);
        0fH.A0j("MPLDataFreshnessTracker", sb.toString());
        if (c1gn.A05) {
            A00(c1gn).markerAnnotate(729359638, "overlap_reason", str);
            A00(c1gn).markerPoint(729359638, 0Pz.A0W("on_overlap_", str));
            return;
        }
        A00(c1gn).markerStartWithCancelPolicy(729359638, false, 0, -1, TimeUnit.NANOSECONDS);
        A00(c1gn).markerAnnotate(729359638, "start_reason", str);
        A00(c1gn).markerAnnotate(729359638, "is_dolphin", c1gn.A09);
        A00(c1gn).markerAnnotate(729359638, "is_armadillo", c1gn.A07);
        A00(c1gn).markerAnnotate(729359638, "start_network_state", c1gn.A03);
        A00(c1gn).markerAnnotate(729359638, "start_chatd_state", c1gn.A08);
        A00(c1gn).markerAnnotate(729359638, "is_armadillo_cutover_enabled", c1gn.A06);
        QuickPerformanceLogger A00 = A00(c1gn);
        0lP r0 = BackgroundStartupDetector.A0D;
        A00.markerAnnotate(729359638, "bsd_cold_start_mode", BackgroundStartupDetector.A0F);
        A00(c1gn).markerAnnotate(729359638, "bsd_is_background", r0.A04());
        QuickPerformanceLogger A002 = A00(c1gn);
        C00i c00i = c1gn.A0A.A00;
        A002.markerAnnotate(729359638, "is_background", ((1Od) c00i.get()).A0E());
        A00(c1gn).markerAnnotate(729359638, "app_run_state", ((1Od) c00i.get()).A0o ? "run_on_install" : ((1Od) c00i.get()).A0p ? "run_on_upgrade" : "run_on_normal");
        C2t7.A01(A00(c1gn), 729359638, 0);
        TimerTask timerTask = new 2LO(c1gn);
        c1gn.A00 = timerTask;
        c1gn.A0N.schedule(timerTask, 180000L);
        c1gn.A05 = true;
    }
}
