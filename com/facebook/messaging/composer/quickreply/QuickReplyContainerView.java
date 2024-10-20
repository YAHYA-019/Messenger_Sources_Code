package com.facebook.messaging.composer.quickreply;

import X.11T;
import X.1BK;
import X.1CO;
import X.2K3;
import X.2KD;
import X.7zL;
import X.7zR;
import X.C09s;
import X.C1p8;
import X.C1u7;
import X.DKC;
import X.DKF;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.resources.ui.FbLinearLayout;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: QuickReplyContainerView.class */
public final class QuickReplyContainerView extends CustomFrameLayout {
    public RecyclerView A00;
    public LithoView A01;
    public FbLinearLayout A02;
    public BetterTextView A03;
    public final 1CO A04;
    public final MigColorScheme A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickReplyContainerView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A04 = 7zR.A0i();
        this.A05 = DKF.A0V(this);
        A01(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickReplyContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A04 = 7zR.A0i();
        this.A05 = DKF.A0V(this);
        A01(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickReplyContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A04 = 7zR.A0i();
        this.A05 = DKF.A0V(this);
        A01(context);
    }

    public static final 2K3 A00(QuickReplyContainerView quickReplyContainerView, C1p8 c1p8, String str) {
        11T.A0F(str, 0);
        2KD A01 = 2K3.A01(7zL.A0W(quickReplyContainerView.getContext()), 0);
        A01.A2z(str);
        A01.A2n();
        A01.A2x(quickReplyContainerView.A05);
        A01.A2w(c1p8);
        return A01.A2W();
    }

    private final void A01(Context context) {
        ViewGroup.LayoutParams layoutParams;
        A0U(2132543193);
        this.A02 = (FbLinearLayout) C09s.A01(this, 2131366784);
        this.A00 = (RecyclerView) C09s.A01(this, 2131362567);
        this.A03 = DKC.A0g(this, 2131363376);
        this.A01 = (LithoView) C09s.A01(this, 2131362566);
        if (this.A04.AZk(72340464879013613L)) {
            View A01 = C09s.A01(this, 2131364472);
            11T.A0I(A01, "null cannot be cast to non-null type com.facebook.resources.ui.FbLinearLayout");
            View A012 = C09s.A01(this, 2131364471);
            11T.A0I(A012, "null cannot be cast to non-null type com.facebook.litho.LithoView");
            ((LithoView) A012).A0x(A00(this, C1u7.A0A, 1BK.A0u(context, 2131964057)));
            A01.setVisibility(0);
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            RecyclerView recyclerView2 = this.A00;
            if (recyclerView2 != null && (layoutParams = recyclerView2.getLayoutParams()) != null) {
                layoutParams.height = -1;
            }
            MigColorScheme.A00(this, this.A05);
        }
    }
}
