package X;

import com.facebook.common.classmarkers.ClassMarkerLoader;
import com.facebook.common.util.TriState;
import com.facebook.messaging.analytics.perf.MessagingInteractionStateManager;
import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.perf.startupstatemachine.StartupStateMachine;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.4e7, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4e7.class */
public final class RunnableC05524e7 implements Runnable {
    public static final String __redex_internal_original_name = "MessagingPerformanceLogger$endLogRunnable$1$queueIdle$1";
    public final /* synthetic */ 1MU A00;
    public final /* synthetic */ MessagingPerformanceLogger A01;
    public final /* synthetic */ boolean A02;

    public RunnableC05524e7(1MU r302, MessagingPerformanceLogger messagingPerformanceLogger, boolean z) {
        this.A01 = messagingPerformanceLogger;
        this.A00 = r302;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A03 = null;
        1MU r0 = this.A00;
        boolean z = this.A02;
        MessagingPerformanceLogger messagingPerformanceLogger = r0.A00;
        MessagingPerformanceLogger.A0K(messagingPerformanceLogger, "broadcast", (short) 12);
        MessagingPerformanceLogger.A0J(messagingPerformanceLogger, "broadcast", (short) 12);
        if (messagingPerformanceLogger.A0q() && ((1Od) 1Br.A0B(messagingPerformanceLogger.A0B)).A0A() == TriState.YES) {
            StartupStateMachine A07 = MessagingPerformanceLogger.A07(messagingPerformanceLogger);
            synchronized (A07) {
                A07.A00 = 2;
            }
            messagingPerformanceLogger.A0b = true;
            ((1Mg) 1Br.A0B(messagingPerformanceLogger.A0G)).A02(4YU.A0A("background_started"));
            1Ru A04 = MessagingPerformanceLogger.A04(messagingPerformanceLogger);
            ((UserFlowLogger) A04.A05.get()).flowEndCancel(A04.A00, CancelReason.USER_CANCELLED);
            ClassMarkerLoader.loadIsNotColdStartRunMarker();
            MessagingPerformanceLogger.A0L(messagingPerformanceLogger, (short) 216);
            MessagingPerformanceLogger.A08(messagingPerformanceLogger).markerDrop(5505027);
            MessagingPerformanceLogger.A05(messagingPerformanceLogger).A02("", MessagingPerformanceLogger.A01(messagingPerformanceLogger).now(), (short) 216);
            MessagingPerformanceLogger.A08(messagingPerformanceLogger).markerDrop(5537534);
            MessagingPerformanceLogger.A0E(messagingPerformanceLogger, 5505190);
            MessagingPerformanceLogger.A0D(messagingPerformanceLogger, 5505190);
            MessagingPerformanceLogger.A08(messagingPerformanceLogger).markerEnd(5505190, (short) 2);
        } else {
            messagingPerformanceLogger.A0o("broadcast", (short) 12);
        }
        MessagingPerformanceLogger.A08(messagingPerformanceLogger).endAllInstancesOfMarker(5505190, (short) 12);
        MessagingPerformanceLogger.A08(messagingPerformanceLogger).dropAllInstancesOfMarker(5505238);
        C08804o3 A02 = MessagingPerformanceLogger.A02(messagingPerformanceLogger);
        Set set = A02.A08;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C08804o3.A03(A02, (String) it.next());
        }
        C08804o3.A00(A02).endAllInstancesOfMarker(5505076, (short) 12);
        C08804o3.A00(A02).endAllInstancesOfMarker(231283540, (short) 12);
        set.clear();
        A02.A05.clear();
        A02.A03.A00.get();
        C08814o4.A00.clear();
        ((MessagingInteractionStateManager) messagingPerformanceLogger.A0H.A00.get()).A01(5505034, messagingPerformanceLogger.A00, (short) 12);
        int[] iArr = MessagingPerformanceLogger.A0j;
        int i = 0;
        do {
            MessagingPerformanceLogger.A08(messagingPerformanceLogger).endAllInstancesOfMarker(iArr[i], (short) 12);
            i++;
        } while (i < 2);
        if (!z) {
            MessagingPerformanceLogger.A03(messagingPerformanceLogger).A03();
        }
        MessagingPerformanceLogger.A08(messagingPerformanceLogger).markerEnd(5505186, (short) 12);
        1Ru A042 = MessagingPerformanceLogger.A04(messagingPerformanceLogger);
        if (A042.A04) {
            ((UserFlowLogger) A042.A05.get()).flowMarkPoint(A042.A00, "ui_idle");
            A042.A04 = false;
        }
        messagingPerformanceLogger.A02 = null;
    }
}
