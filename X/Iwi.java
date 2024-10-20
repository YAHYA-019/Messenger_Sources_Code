package X;

/* loaded from: Iwi.class */
public final class Iwi implements Runnable {
    public static final String __redex_internal_original_name = "PollMutationTamImplementation$executeCallbackInUiThread$1";
    public final /* synthetic */ JKC A00;
    public final /* synthetic */ boolean A01;

    public Iwi(JKC jkc, boolean z) {
        this.A01 = z;
        this.A00 = jkc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        JKC jkc = this.A00;
        if (z) {
            jkc.onSuccess();
        } else {
            jkc.onFailure((Throwable) null);
        }
    }
}
