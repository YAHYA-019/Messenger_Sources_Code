package X;

import org.json.JSONException;

/* renamed from: X.0tq, reason: invalid class name */
/* loaded from: 0tq.class */
public final class C0tq implements 0Nu {
    public /* bridge */ /* synthetic */ void Cgc(C0B1 c0b1, 0OB r303) {
        try {
            r303.A56("healthstats", ((0uE) c0b1).A0B().toString());
        } catch (JSONException e) {
            0KH.A00("HealthStatsMetricsReporter", "Couldn't log healthstats metrics", e);
        }
    }
}
