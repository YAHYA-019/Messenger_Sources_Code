package com.facebook.messaging.composer.triggers.mentions;

import X.1BY;
import X.1Bn;
import X.C09s;
import X.GWS;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.AutoMeasureLinearLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.recyclerview.BetterLinearLayoutManager;

/* loaded from: MentionsSearchResultsView.class */
public class MentionsSearchResultsView extends CustomFrameLayout {
    public GWS A00;
    public LinearLayoutManager A01;
    public RecyclerView A02;

    public MentionsSearchResultsView(Context context) {
        super(context);
        A00(context);
    }

    public MentionsSearchResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public MentionsSearchResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        this.A00 = (GWS) 1Bn.A0E(context, (1BY) null, 116074);
        A0U(2132542546);
        this.A02 = (RecyclerView) C09s.A01(this, 2131366942);
        BetterLinearLayoutManager betterLinearLayoutManager = new BetterLinearLayoutManager(context);
        ((AutoMeasureLinearLayoutManager) betterLinearLayoutManager).A00 = true;
        this.A01 = betterLinearLayoutManager;
        betterLinearLayoutManager.A1p(1);
        this.A02.A1D(this.A01);
        RecyclerView recyclerView = this.A02;
        GWS gws = this.A00;
        gws.getClass();
        recyclerView.A16(gws);
    }
}
