package X;

/* loaded from: Lo7.class */
public final class Lo7 implements Runnable {
    public static final String __redex_internal_original_name = "ECPBottomSheetContentFragment$payButtonOnDrawListener$1$onDraw$1";
    public final /* synthetic */ LKi A00;
    public final /* synthetic */ JxS A01;

    public Lo7(LKi lKi, JxS jxS) {
        this.A01 = jxS;
        this.A00 = lKi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JxS jxS = this.A01;
        Q37 q37 = jxS.A07;
        if (q37 != null) {
            if (!q37.A00.getViewTreeObserver().isAlive()) {
                return;
            }
            Q37 q372 = jxS.A07;
            if (q372 != null) {
                q372.A00.getViewTreeObserver().removeOnDrawListener(this.A00);
                return;
            }
        }
        11T.A0L("payButtonViewHolder");
        throw 0Q8.createAndThrow();
    }
}
