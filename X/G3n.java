package X;

/* loaded from: G3n.class */
public final class G3n implements Runnable {
    public static final String __redex_internal_original_name = "HorizontalScrollSpec$1";
    public final /* synthetic */ ESs A00;
    public final /* synthetic */ DQA A01;
    public final /* synthetic */ AnonymousClass255 A02;

    public G3n(ESs eSs, DQA dqa, AnonymousClass255 anonymousClass255) {
        this.A00 = eSs;
        this.A02 = anonymousClass255;
        this.A01 = dqa;
    }

    @Override // java.lang.Runnable
    public void run() {
        ESs eSs = this.A00;
        int i = eSs.A00;
        if (i != -1) {
            this.A01.setScrollX(i);
            return;
        }
        if (this.A02 == AnonymousClass255.RTL) {
            this.A01.fullScroll(66);
        }
        eSs.A00 = this.A01.getScrollX();
    }
}
