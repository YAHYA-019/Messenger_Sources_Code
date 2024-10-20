package X;

/* loaded from: Iuf.class */
public final class Iuf implements Runnable {
    public static final String __redex_internal_original_name = "ConversionKt$toHeraCore$1";
    public final /* synthetic */ J6b A00;

    public Iuf(J6b j6b) {
        this.A00 = j6b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.release();
    }
}
