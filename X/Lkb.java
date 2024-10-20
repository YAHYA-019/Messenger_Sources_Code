package X;

/* loaded from: Lkb.class */
public final class Lkb implements Runnable {
    public static final String __redex_internal_original_name = "FloatingChatWindow$1";
    public final /* synthetic */ KTe A00;

    public Lkb(KTe kTe) {
        this.A00 = kTe;
    }

    @Override // java.lang.Runnable
    public void run() {
        KTe kTe = this.A00;
        kTe.setLayoutParams(kTe.getLayoutParams());
    }
}
