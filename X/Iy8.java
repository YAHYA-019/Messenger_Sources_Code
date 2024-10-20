package X;

import com.facebook.messaging.analytics.perf.efficiency.MessagingStateChangePerformanceLogger;
import com.facebook.wearable.common.comms.hera.shared.snappmanager.SnAppManagerProtos;

/* loaded from: Iy8.class */
public final class Iy8 implements Runnable {
    public static final String __redex_internal_original_name = "WebrtcUiHandler$setupCall$1";
    public final /* synthetic */ IRF A00;
    public final /* synthetic */ String A01;

    public Iy8(IRF irf, String str) {
        this.A00 = irf;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IRF irf = this.A00;
        if (!((1Ex) 1Br.A0B(irf.A0y)).BTw()) {
            JOY.A03(irf).ARr("Trying to setup a call when the user is not logged in.");
            1Br.A04(irf.A0r).D0v("WebrtcUiHandler", "Trying to setup a call when the user is not logged in.");
            return;
        }
        I8S.A01(C0g8.A00, (I8S) 4YU.A0n(irf.A0P, irf.A0f, 114864), "123");
        String str = this.A01;
        if (str != null) {
            irf.A1e.A0A(str);
        }
        MessagingStateChangePerformanceLogger messagingStateChangePerformanceLogger = (MessagingStateChangePerformanceLogger) 1Br.A0B(irf.A10);
        messagingStateChangePerformanceLogger.A0Y = true;
        messagingStateChangePerformanceLogger.A0Z = true;
        MessagingStateChangePerformanceLogger.A0A(messagingStateChangePerformanceLogger, (short) 2);
        MessagingStateChangePerformanceLogger.A04(messagingStateChangePerformanceLogger, 1BJ.A00(SnAppManagerProtos.SNAPP_START_RESPONSE_MSGTYPE));
        5W1 r0 = (5W1) 1Br.A0B(irf.A0h);
        boolean z = irf.A1e.A0V;
        if (1BK.A0N(((C05624ed) r0.A05.get()).A00).AZk(36310856115357005L)) {
            1BK.A1E(r0.A07).execute(new IzO(r0, str, z));
        }
    }
}
