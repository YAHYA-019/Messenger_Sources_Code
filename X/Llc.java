package X;

import com.facebook.widget.listview.BetterListView;

/* loaded from: Llc.class */
public final class Llc implements Runnable {
    public static final String __redex_internal_original_name = "BetterListView$2";
    public final /* synthetic */ BetterListView A00;

    public Llc(BetterListView betterListView) {
        this.A00 = betterListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        BetterListView betterListView = this.A00;
        long now = betterListView.A04.now();
        if (betterListView.A01 != 0) {
            long j = betterListView.A02 + 3000;
            if (now < j) {
                betterListView.postDelayed(betterListView.A07, j - now);
                return;
            }
            0fH.A0A(BetterListView.class, "Resetting to SCROLL_STATE_IDLE based on timeout hack.");
            if (0 != betterListView.A01) {
                betterListView.A01 = 0;
                ((1Fo) betterListView.A0E.get()).A01(betterListView);
            }
        }
    }
}
