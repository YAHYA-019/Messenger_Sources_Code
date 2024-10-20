package X;

import com.facebook.litho.LithoView;

/* loaded from: D7b.class */
public final class D7b implements Runnable {
    public static final String __redex_internal_original_name = "SubThreadListFragment$maybeUpdateContent$1";
    public final /* synthetic */ 1LI A00;
    public final /* synthetic */ AmM A01;

    public D7b(1LI r302, AmM amM) {
        this.A01 = amM;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LithoView lithoView;
        AmM amM = this.A01;
        if (amM.getContext() == null || !amM.isAdded() || (lithoView = amM.A02) == null) {
            return;
        }
        lithoView.A0y(this.A00);
    }
}
