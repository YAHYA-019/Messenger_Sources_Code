package X;

/* loaded from: G04.class */
public final class G04 implements Runnable {
    public static final String __redex_internal_original_name = "VinylStickerDrawable$redrawRunnable$1";
    public final /* synthetic */ Dpq A00;

    public G04(Dpq dpq) {
        this.A00 = dpq;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.Dpq, android.graphics.drawable.Drawable] */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r0 = this.A00;
        r0.A03 = false;
        float f = r0.A00 + 1.08f;
        r0.A00 = f;
        if (f >= 360.0f) {
            r0.A00 = f - 360.0f;
        }
        r0.invalidateSelf();
    }
}
