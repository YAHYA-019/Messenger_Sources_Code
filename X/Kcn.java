package X;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Arrays;
import java.util.Set;

/* loaded from: Kcn.class */
public abstract class Kcn {
    public static Kim A00;
    public static L0n A01;
    public static Handler A02;
    public static Jsu A03;

    public static final void A00(Jsu jsu) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("subscribeToEvents. Config:\n            resolveCompRenderedThresholdMs=");
        A0k.append(jsu.A02);
        A0k.append("\n            maxEventCount=");
        A0k.append(jsu.A01);
        A0k.append("\n            targetEvents=");
        A0k.append(jsu.A03);
        A0k.append("\n            reportStacktrace=");
        boolean z = jsu.A04;
        A0k.append(z);
        A0k.append("\n            reportTimeline=");
        boolean z2 = jsu.A05;
        A0k.append(z2);
        0fH.A0j("RelLithoDebugEventStore", A0k.toString());
        A03 = jsu;
        HandlerThread A0E = GOo.A0E("RelLithoDebugEventStore", 10);
        A0E.start();
        Handler handler = new Handler(A0E.getLooper());
        A02 = handler;
        Kim kim = new Kim(handler, z);
        A00 = kim;
        Juy juy = new Juy(kim, new String[]{"Litho.TreeFuture.Wait", "Litho.TreeFuture.Resume", "Litho.TreeFuture.Get"});
        Set set = 1LZ.A00;
        set.add(juy);
        if (z2) {
            Handler handler2 = A02;
            if (handler2 == null) {
                11T.A0L("backgroundHandler");
                throw 0Q8.createAndThrow();
            }
            L0n l0n = new L0n(handler2, jsu);
            A01 = l0n;
            String str = l0n.A01.A03;
            String[] A0n = C3o5.A0n(str.length() == 0 ? C0s8.A14("Litho.Resolve.ComponentRendered", "Litho.ComponentTree.Resolve", "Litho.TreeFuture.Interrupt", "Litho.TreeFuture.Resume", "Litho.TreeFuture.Run", "Litho.TreeFuture.Wait", "Litho.TreeFuture.Get", "Litho.TreeFuture.GetPartial") : 4YU.A19(str, InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, 0));
            set.add(new Juz(l0n, Arrays.copyOf(A0n, A0n.length)));
        }
    }
}
