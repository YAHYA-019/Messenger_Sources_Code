package com.facebook.messaging.montage.viewer.contextualreplies;

import X.11T;
import X.AZQ;
import X.C09s;
import X.DKF;
import X.DKG;
import X.HmQ;
import X.IKv;
import X.IXH;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.widget.CustomLinearLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MontageViewerContextualRepliesExpandedView.class */
public final class MontageViewerContextualRepliesExpandedView extends CustomLinearLayout {
    public MontageViewerContextualRepliesView A00;
    public MontageViewerContextualRepliesView A01;
    public HmQ A02;
    public final AZQ A03;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerContextualRepliesExpandedView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerContextualRepliesExpandedView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MontageViewerContextualRepliesExpandedView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A03 = new IXH(this);
        View inflate = View.inflate(context, 2132542736, this);
        setOrientation(1);
        setGravity(17);
        this.A00 = (MontageViewerContextualRepliesView) C09s.A01(inflate, 2131363360);
        this.A01 = (MontageViewerContextualRepliesView) C09s.A01(inflate, 2131363361);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new IKv(context, inflate, 0));
    }

    public /* synthetic */ MontageViewerContextualRepliesExpandedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }
}
