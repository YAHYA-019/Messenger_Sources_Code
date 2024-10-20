package X;

/* loaded from: G00.class */
public final class G00 implements Runnable {
    public static final String __redex_internal_original_name = "FDSTooltipView$onAttachedToWindow$1";
    public final /* synthetic */ DPx A00;

    public G00(DPx dPx) {
        this.A00 = dPx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DPx dPx = this.A00;
        dPx.requestLayout();
        dPx.invalidate();
    }
}
