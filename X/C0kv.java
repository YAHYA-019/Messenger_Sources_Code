package X;

/* renamed from: X.0kv, reason: invalid class name */
/* loaded from: 0kv.class */
public final class C0kv {
    public final 18Q A00;
    public final boolean A01;
    public final /* synthetic */ C17n A02;

    public C0kv(C17n c17n, 18Q r303, boolean z) {
        this.A02 = c17n;
        this.A00 = r303;
        this.A01 = z;
    }

    public static void A00(C0kv c0kv) {
        C17n c17n = c0kv.A02;
        if (c17n.A15 == c0kv.A00) {
            0fH.A0n(c17n.A0Y, "Preemptive connection succeeded, switch to new connection");
            c17n.A0F(c17n.A14, C18e.A0B, C18f.PREEMPTIVE_RECONNECT_SUCCESS);
            C17n.A06(c17n);
        }
    }
}
