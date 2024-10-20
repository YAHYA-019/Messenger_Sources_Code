package X;

/* loaded from: J1a.class */
public final class J1a implements Runnable {
    public static final String __redex_internal_original_name = "GrootFallbackImpl$play$1";
    public final /* synthetic */ int A00;
    public final /* synthetic */ C52j A01;
    public final /* synthetic */ 6cV A02;

    public J1a(C52j c52j, 6cV r303, int i) {
        this.A02 = r303;
        this.A01 = c52j;
        this.A00 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        6U2 A07;
        6cV r0 = this.A02;
        C52j c52j = this.A01;
        int i = this.A00;
        GRD A00 = 6cV.A00(r0);
        if (A00 == null || (A07 = A00.A07()) == null || A07 != r0.A04) {
            return;
        }
        GOo.A1M(c52j, A07, i);
    }
}
