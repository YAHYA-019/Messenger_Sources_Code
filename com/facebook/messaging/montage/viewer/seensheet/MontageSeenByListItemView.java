package com.facebook.messaging.montage.viewer.seensheet;

import X.0FI;
import X.1LE;
import X.7zL;
import X.C00i;
import X.C09s;
import X.CbU;
import X.DKF;
import X.HeJ;
import X.IKE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.acra.constants.ActionId;
import com.facebook.messaging.montage.forked.viewer.footer.AnimatedReactionBar;
import com.facebook.messaging.montage.model.MontageUser;
import com.facebook.messaging.montage.viewer.reaction.MontageReactionBadgeUserTileView;

/* loaded from: MontageSeenByListItemView.class */
public class MontageSeenByListItemView extends LinearLayout {
    public View A00;
    public TextView A01;
    public TextView A02;
    public C00i A03;
    public C00i A04;
    public C00i A05;
    public AnimatedReactionBar A06;
    public MontageUser A07;
    public MontageReactionBadgeUserTileView A08;
    public HeJ A09;

    public MontageSeenByListItemView(Context context) {
        this(context, null);
    }

    public MontageSeenByListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageSeenByListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = 7zL.A0R(context, 83984);
        this.A03 = 7zL.A0R(context, 82143);
        this.A04 = 7zL.A0R(context, 114814);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int A06 = 0FI.A06(572553236);
        super.onFinishInflate();
        this.A08 = (MontageReactionBadgeUserTileView) C09s.A01(this, 2131368306);
        this.A01 = DKF.A0E(this, 2131366293);
        this.A00 = C09s.A01(this, 2131366205);
        this.A02 = DKF.A0E(this, 2131366139);
        this.A06 = (AnimatedReactionBar) C09s.A01(this, 2131366816);
        boolean equals = 1LE.A04.equals(((CbU) this.A03.get()).A01());
        View view = this.A00;
        if (equals) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            IKE.A01(this.A00, this, ActionId.RTMP_CONNECTION_RELEASE);
        }
        0FI.A0C(1781660053, A06);
    }
}
