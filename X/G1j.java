package X;

/* loaded from: G1j.class */
public final class G1j implements Runnable {
    public static final String __redex_internal_original_name = "MediaStoreDataModule$setUp$2";
    public final /* synthetic */ FxW A00;
    public final /* synthetic */ String A01;

    public G1j(FxW fxW, String str) {
        this.A01 = str;
        this.A00 = fxW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.A01;
        0fH.A0j("MediaStoreDataModule", 0Pz.A0W("cancelled variable_id = ", str));
        this.A00.A01.remove(str);
    }
}
