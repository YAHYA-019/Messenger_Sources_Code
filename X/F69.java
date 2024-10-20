package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: F69.class */
public final class F69 {
    public final 1Br A02 = 1Bu.A00(99656);
    public final 1Br A01 = 1Bu.A00(99655);
    public final 1Br A00 = 1Bq.A00(84493);
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final ConcurrentHashMap A03 = new ConcurrentHashMap();

    public static final void A00(F69 f69, DqB dqB, int i) {
        if (dqB != null) {
            Set set = dqB.A07;
            Collection values = f69.A03.values();
            11T.A0A(values);
            set.addAll(values);
            F7G f7g = (F7G) 1Br.A0B(f69.A01);
            int i2 = dqB.A01;
            1Br r0 = f7g.A00;
            7zP.A0e(r0).markerStart(i2, i);
            if (7zP.A0e(r0).isMarkerOn(i2, i)) {
                7zP.A0e(r0).markerAnnotate(i2, i, "sub_sampling_rate", dqB.A02 * 7zP.A0e(r0).sampleRateForMarker(i2));
                String str = dqB.A03;
                if (str != null) {
                    7zP.A0e(r0).markerAnnotate(i2, i, "implementation_name", str);
                }
                String str2 = dqB.A05;
                if (str2 != null) {
                    7zP.A0e(r0).markerAnnotate(i2, i, "interface_name", str2);
                }
                String str3 = dqB.A06;
                if (str3 != null) {
                    7zP.A0e(r0).markerAnnotate(i2, i, "kill_switch_name", str3);
                }
                String str4 = dqB.A04;
                if (str4 != null) {
                    7zP.A0e(r0).markerAnnotate(i2, i, "interface_method_name", str4);
                }
                F7G.A00(f7g, dqB, i2, i);
            }
            f69.A04.put(Integer.valueOf(i), dqB);
            dqB.A00 = ((AwakeTimeSinceBootClock) 1Br.A0B(f69.A00)).nowNanos();
        }
    }
}
