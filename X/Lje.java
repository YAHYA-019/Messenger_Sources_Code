package X;

/* loaded from: Lje.class */
public final class Lje implements Runnable {
    public static final String __redex_internal_original_name = "ListPopupWindow$ResizePopupRunnable";
    public final /* synthetic */ LLd A00;

    public Lje(LLd lLd) {
        this.A00 = lLd;
    }

    @Override // java.lang.Runnable
    public void run() {
        LLd lLd = this.A00;
        JZO jzo = lLd.A0A;
        if (jzo == null || !jzo.isAttachedToWindow() || lLd.A0A.getCount() <= lLd.A0A.getChildCount()) {
            return;
        }
        lLd.A0A.getChildCount();
        lLd.A09.setInputMethodMode(2);
        lLd.CzI();
    }
}
