package com.facebook.messaging.montage.viewer.seensheet;

import X.1BL;
import X.1BQ;
import X.1BY;
import X.1Bn;
import X.1Du;
import X.2Xd;
import X.AbR;
import X.C00i;
import X.C09s;
import X.GWY;
import X.HIJ;
import X.HW1;
import X.Hpp;
import X.IKE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.recyclerview.BetterLinearLayoutManager;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: MontageViewerSeenHeadsView.class */
public class MontageViewerSeenHeadsView extends CustomLinearLayout {
    public AbR A00;
    public Hpp A01;
    public final RecyclerView A02;
    public final GWY A03;
    public final View.OnClickListener A04;
    public final C00i A05;
    public final C00i A06;

    public MontageViewerSeenHeadsView(Context context) {
        this(context, null);
    }

    public MontageViewerSeenHeadsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageViewerSeenHeadsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        1BQ A02 = 1BQ.A02(116027);
        this.A06 = A02;
        1BQ A022 = 1BQ.A02(67927);
        this.A05 = A022;
        IKE A00 = IKE.A00(this, ActionId.NEW_START_FOUND);
        this.A04 = A00;
        this.A00 = (AbR) 1Bn.A0E(context, (1BY) null, 623);
        A0D(2132542758);
        2Xd gwy = new GWY((HIJ) A022.get(), (HW1) A02.get());
        this.A03 = gwy;
        RecyclerView recyclerView = (RecyclerView) C09s.A01(this, 2131367257);
        this.A02 = recyclerView;
        recyclerView.A16(gwy);
        recyclerView.A1D(new BetterLinearLayoutManager(context, 0));
        setOnClickListener(A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    public static List A00(ImmutableList immutableList) {
        ArrayList A10;
        if (immutableList == null) {
            A10 = Collections.emptyList();
        } else {
            A10 = 1BL.A10(immutableList);
            1Du it = immutableList.iterator();
            while (it.hasNext()) {
                A10.add(((MontageUser) it.next()).A01);
            }
        }
        return A10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setOnClickListener(z ? this.A04 : null);
        setClickable(z);
    }
}
