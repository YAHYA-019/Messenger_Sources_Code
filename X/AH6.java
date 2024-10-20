package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: AH6.class */
public final class AH6 implements Runnable {
    public static final String __redex_internal_original_name = "SubscriptionManager$onChange$1$3";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C9m3 A01;
    public final /* synthetic */ 8LW A02;
    public final /* synthetic */ List A03;
    public final /* synthetic */ Set A04;

    public AH6(C9m3 c9m3, 8LW r303, List list, Set set, int i) {
        this.A01 = c9m3;
        this.A00 = i;
        this.A03 = list;
        this.A04 = set;
        this.A02 = r303;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbA abA;
        9PW r0 = this.A01.A00;
        if (r0 != null) {
            r0.A00.markerPoint(16267571, this.A00, "on_change_subscriber_callbacks_start");
        }
        List list = this.A03;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            7zL.A1R(it.next());
        }
        Set<AXA> set = this.A04;
        8LW r02 = this.A02;
        for (AXA axa : set) {
            if (axa instanceof AbA) {
                abA = (AbA) axa;
            } else if (axa instanceof A31) {
                abA = ((A31) axa).A00;
                if (abA != null) {
                }
            } else if ((axa instanceof Ab8) || (axa instanceof Ab9)) {
                throw AnonymousClass001.A0N("Granular subscribers should not be added to subscribersWithDiffs - must be wrapped as ()-> Unit & added to granularSubscriberCallbacks");
            }
            abA.BQ5(r02);
        }
        if (r0 != null) {
            int i = this.A00;
            int size = list.size() + set.size();
            QuickPerformanceLogger quickPerformanceLogger = r0.A00;
            quickPerformanceLogger.markerPoint(16267571, i, "on_change_subscriber_callbacks_start", String.valueOf(size));
            quickPerformanceLogger.markerEnd(16267571, i, (short) 2);
        }
    }
}
