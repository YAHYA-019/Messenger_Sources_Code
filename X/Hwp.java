package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.AbstractMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: Hwp.class */
public abstract class Hwp {
    public static final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public static final AwakeTimeSinceBootClock A01;

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        11T.A0A(awakeTimeSinceBootClock);
        A01 = awakeTimeSinceBootClock;
    }

    public static final void A00(HAK hak, String str) {
        long now = A01.now();
        ConcurrentHashMap concurrentHashMap = A00;
        if (!concurrentHashMap.containsKey(hak)) {
            concurrentHashMap.put(hak, new ConcurrentHashMap());
        }
        AbstractMap abstractMap = (AbstractMap) concurrentHashMap.get(hak);
        if (abstractMap != null) {
            Number A15 = GOn.A15(str, abstractMap);
            if (A15 == null || now <= A15.longValue()) {
                GOn.A1Y(str, abstractMap, now);
                if (abstractMap.size() > 200) {
                    Set keySet = abstractMap.keySet();
                    11T.A0A(keySet);
                    abstractMap.remove(0QD.A07(keySet));
                }
            }
        }
    }
}
