package X;

/* loaded from: G28.class */
public final class G28 implements Runnable {
    public static final String __redex_internal_original_name = "FigBottomSheetDeprecated$Builder$1";
    public final /* synthetic */ EuX A00;
    public final /* synthetic */ FF7 A01;

    public G28(EuX euX, FF7 ff7) {
        this.A00 = euX;
        this.A01 = ff7;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A00.dismiss();
    }
}
