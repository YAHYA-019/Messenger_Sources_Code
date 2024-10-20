package X;

/* loaded from: Iud.class */
public final class Iud implements Runnable {
    public static final String __redex_internal_original_name = "MediaUploader$cancel$1";
    public final /* synthetic */ IkH A00;

    public Iud(IkH ikH) {
        this.A00 = ikH;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JMY jmy = this.A00.A09;
        if (jmy != null) {
            jmy.cancel();
        }
    }
}
