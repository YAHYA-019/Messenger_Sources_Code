package com.facebook.messaging.rtc.incall.impl.coplay.views;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Fw;
import X.BOh;
import X.C6J;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.resources.ui.FbTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CoplayE2eeDisclaimerLabelView.class */
public final class CoplayE2eeDisclaimerLabelView extends FbTextView {
    public final 1Br A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayE2eeDisclaimerLabelView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoplayE2eeDisclaimerLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoplayE2eeDisclaimerLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A00 = 1Bu.A01(context, 85227);
    }

    public /* synthetic */ CoplayE2eeDisclaimerLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onVisibilityChanged(View view, int i) {
        11T.A0F(view, 0);
        super/*android.widget.TextView*/.onVisibilityChanged(view, i);
        if (i == 0 && (view instanceof CoplayE2eeDisclaimerLabelView)) {
            C6J A03 = DKG.A0Z(this.A00).A03(1Fw.A01(getContext()));
            A03.A00 = BOh.A03;
            A03.A00();
        }
    }
}
