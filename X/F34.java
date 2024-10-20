package X;

/* loaded from: F34.class */
public abstract class F34 {
    public static final 1Br A00 = 1BK.A0D();

    public static final void A00(String str, String str2, String str3, String str4, Throwable th) {
        11T.A0F(str, 0);
        2R2 A08 = AbF.A08(1BK.A08(1Br.A02(A00), "composer_telemetry"), 128);
        if (4YU.A1X(A08)) {
            A08.A0E(AbstractC00603o4.A00(55), str);
            A08.A0E("call_site", str2);
            A08.A0E("event", str3);
            A08.A0E("debug_info", str4);
            A08.A0E("exception_trace", th != null ? 0G8.A01(th) : null);
            A08.BZL();
        }
    }
}
