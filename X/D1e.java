package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.widget.recyclerview.BetterRecyclerView;
import com.mapbox.mapboxsdk.R;

/* loaded from: D1e.class */
public final class D1e implements 5W8 {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ CEC A01;
    public final /* synthetic */ boolean A02;

    public D1e(View.OnClickListener onClickListener, CEC cec, boolean z) {
        this.A01 = cec;
        this.A02 = z;
        this.A00 = onClickListener;
    }

    public /* bridge */ /* synthetic */ void C1Y(View view) {
        CEC cec = this.A01;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), 0, false);
        BetterRecyclerView betterRecyclerView = (BetterRecyclerView) view.findViewById(2131364389);
        cec.A02 = betterRecyclerView;
        betterRecyclerView.A16(cec.A01);
        cec.A02.A1D(linearLayoutManager);
        C00i c00i = cec.A04;
        view.setElevation(1BL.A0B(c00i).getDimension(R.dimen.mapbox_four_dp));
        if (this.A02) {
            View.OnClickListener onClickListener = this.A00;
            View findViewById = view.findViewById(2131363459);
            cec.A00 = findViewById;
            if (findViewById != null) {
                findViewById.setVisibility(0);
                cec.A00.setOnClickListener(onClickListener);
                cec.A02.A1B(new GX3(cec, 1BL.A0B(c00i).getDimensionPixelSize(2132279314), 1BL.A0B(c00i).getDimensionPixelSize(R.dimen.mapbox_four_dp), 0));
            }
        }
    }
}
