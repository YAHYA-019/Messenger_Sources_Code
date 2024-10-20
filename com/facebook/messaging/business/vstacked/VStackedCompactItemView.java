package com.facebook.messaging.business.vstacked;

import X.1BY;
import X.1Bn;
import X.2Wo;
import X.AbK;
import X.DKC;
import X.FGG;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: VStackedCompactItemView.class */
public class VStackedCompactItemView extends XMALinearLayout implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A06(VStackedCompactItemView.class);
    public FbDraweeView A00;
    public 2Wo A01;
    public BetterTextView A02;
    public BetterTextView A03;
    public FGG A04;

    public VStackedCompactItemView(Context context) {
        this(context, null, 0);
    }

    public VStackedCompactItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VStackedCompactItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = (FGG) 1Bn.A0E(context, (1BY) null, 100032);
        A0D(2132543570);
        this.A00 = DKC.A0M(this, 2131364529);
        this.A03 = DKC.A0g(this, 2131363219);
        this.A02 = DKC.A0g(this, 2131363218);
        this.A01 = AbK.A0v(this, 2131363483);
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.A02.setMaxLines(4 - this.A03.getLineCount());
    }
}
