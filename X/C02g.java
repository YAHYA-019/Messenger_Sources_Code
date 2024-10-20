package X;

import android.content.Context;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Pair;

/* renamed from: X.02g, reason: invalid class name */
/* loaded from: 02g.class */
public abstract class C02g {
    public static Pair A00;

    public static Pair A00(Context context, String str) {
        Pair pair = A00;
        if (pair != null) {
            return pair;
        }
        SystemHealthManager systemHealthManager = (SystemHealthManager) context.getSystemService(SystemHealthManager.class);
        if (systemHealthManager == null) {
            return null;
        }
        try {
            HealthStats takeMyUidSnapshot = systemHealthManager.takeMyUidSnapshot();
            if (takeMyUidSnapshot == null || !takeMyUidSnapshot.hasStats(10014)) {
                return null;
            }
            HealthStats healthStats = takeMyUidSnapshot.getStats(10014).get(str);
            if (healthStats == null) {
                return null;
            }
            long j = 0;
            long measurement = healthStats.hasMeasurement(30005) ? healthStats.getMeasurement(30005) : 0L;
            if (healthStats.hasMeasurement(30004)) {
                j = healthStats.getMeasurement(30004);
            }
            Pair pair2 = new Pair(Long.valueOf(measurement), Long.valueOf(j));
            A00 = pair2;
            return pair2;
        } catch (SecurityException e) {
            C0iy.A00().Bwu("OSSysHealthCollect", e, null);
            0fH.A0r("lacrima", "Unable to retrieve health stats", e);
            return null;
        }
    }
}
