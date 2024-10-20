package X;

/* renamed from: X.5hl, reason: invalid class name */
/* loaded from: 5hl.class */
public final class C5hl {
    public final C00i A00 = new 1BQ(16634);

    public void A00(L2j l2j) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), 1BJ.A00(2053));
        if (A08.isSampled()) {
            A08.A7R("event_uuid", 1BK.A0t());
            A08.A7R("cache_name", l2j.A0E);
            A08.A6J("process_values", l2j.A01());
            A08.A6J("metadata", l2j.A0G);
            A08.A7R("cache_key", (String) null);
            A08.A6J("actions", (java.util.Map) null);
            A08.BZL();
        }
    }
}
