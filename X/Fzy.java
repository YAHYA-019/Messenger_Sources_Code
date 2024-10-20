package X;

/* loaded from: Fzy.class */
public final class Fzy implements Runnable {
    public static final String __redex_internal_original_name = "FDSBottomSheet$1";
    public final /* synthetic */ EAX A00;

    public Fzy(EAX eax) {
        this.A00 = eax;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A00.dismiss();
    }
}
