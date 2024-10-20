package X;

/* loaded from: Ljd.class */
public final class Ljd implements Runnable {
    public static final String __redex_internal_original_name = "ListPopupWindow$ListSelectorHider";
    public final /* synthetic */ LLd A00;

    public Ljd(LLd lLd) {
        this.A00 = lLd;
    }

    @Override // java.lang.Runnable
    public void run() {
        JZO jzo = this.A00.A0A;
        if (jzo != null) {
            jzo.A08 = true;
            jzo.requestLayout();
        }
    }
}
