package X;

/* renamed from: X.4UA, reason: invalid class name */
/* loaded from: 4UA.class */
public final class C4UA {
    public final 04J A00;
    public final 1CO A01;

    public C4UA(04J r302) {
        1CO r0 = (1CO) 1Bi.A03(16385);
        this.A00 = r302;
        this.A01 = r0;
    }

    public void A00(String str, String str2) {
        1UG A08 = 1BK.A08(this.A00, "async_tcp_probe_errors");
        if (A08.isSampled()) {
            if (str2 == null) {
                str2 = "";
            }
            A08.A7R("action", str);
            A08.A7R("exception_msg", str2);
            A08.BZL();
        }
    }
}
