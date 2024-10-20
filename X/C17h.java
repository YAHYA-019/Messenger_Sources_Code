package X;

/* renamed from: X.17h, reason: invalid class name */
/* loaded from: 17h.class */
public final class C17h implements Runnable {
    public static final String __redex_internal_original_name = "FbnsConnectionManager$CallbackHandler$4";
    public final /* synthetic */ C0kv A00;

    public C17h(C0kv c0kv) {
        this.A00 = c0kv;
    }

    @Override // java.lang.Runnable
    public void run() {
        C0kv c0kv = this.A00;
        C17n c17n = c0kv.A02;
        18Q r0 = c17n.A14;
        18Q r02 = c0kv.A00;
        if (r0 == r02) {
            C17n.A04(0Go.A00, c17n, C18f.CONNECTION_LOST);
        } else if (c17n.A15 == r02) {
            C17n.A05(c17n);
        }
    }
}
