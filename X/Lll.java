package X;

/* loaded from: Lll.class */
public final class Lll implements Runnable {
    public static final String __redex_internal_original_name = "ECPViewModel$startFullScreenLoadingTimer$1";
    public final /* synthetic */ C3033Jgw A00;

    public Lll(C3033Jgw c3033Jgw) {
        this.A00 = c3033Jgw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3033Jgw c3033Jgw = this.A00;
        if (FJC.A0B(c3033Jgw.A0M)) {
            Object value = c3033Jgw.A0v.getValue();
            Boolean A0K = AnonymousClass001.A0K();
            if (11T.A0O(value, A0K)) {
                return;
            }
            c3033Jgw.A0u.setValue(A0K);
        }
    }
}
