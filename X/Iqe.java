package X;

import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.mapbox.mapboxsdk.R;

/* loaded from: Iqe.class */
public final class Iqe implements Runnable {
    public static final String __redex_internal_original_name = "BasketArtPicker$initRecyclerViewItemDecoration$1";
    public final /* synthetic */ IAL A00;

    public Iqe(IAL ial) {
        this.A00 = ial;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAL ial = this.A00;
        2kG r0 = ial.A00;
        if (r0 != null) {
            ial.A0J.A1C(r0);
        }
        2kG r02 = ial.A01;
        if (r02 != null) {
            ial.A0J.A1C(r02);
        }
        BetterRecyclerView betterRecyclerView = ial.A0J;
        int dimensionPixelSize = betterRecyclerView.getResources().getDimensionPixelSize(R.dimen.mapbox_eight_dp);
        GWx gWx = new GWx(dimensionPixelSize);
        ial.A01 = gWx;
        betterRecyclerView.A1B(gWx);
        2kF r03 = new 2kF(dimensionPixelSize, dimensionPixelSize, 0, false);
        ial.A00 = r03;
        betterRecyclerView.A1B(r03);
    }
}
