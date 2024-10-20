package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0hb, reason: invalid class name */
/* loaded from: 0hb.class */
public final /* synthetic */ class C0hb implements Runnable {
    public static final String __redex_internal_original_name = "LacrimaConfig$$ExternalSyntheticLambda0";
    public final /* synthetic */ C0hg A00;

    @Override // java.lang.Runnable
    public final void run() {
        final C0hg c0hg = this.A00;
        c0hg.A08();
        0hE.A04.schedule(new Runnable() { // from class: X.0hc
            public static final String __redex_internal_original_name = "LacrimaConfig$$ExternalSyntheticLambda2";

            @Override // java.lang.Runnable
            public final void run() {
                C0hg.this.A08();
            }
        }, 5000L, TimeUnit.MILLISECONDS);
    }
}
