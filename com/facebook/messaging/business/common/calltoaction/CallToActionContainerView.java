package com.facebook.messaging.business.common.calltoaction;

import X.11T;
import X.1Bn;
import X.7zL;
import X.AnonymousClass001;
import X.BMF;
import X.C1oo;
import X.C2rp;
import X.C4Nc;
import X.CZD;
import X.DKF;
import X.DKG;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.fbui.widget.layout.SegmentedLinearLayout;
import com.facebook.messaging.business.common.calltoaction.model.CTAPaymentInfo;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: CallToActionContainerView.class */
public final class CallToActionContainerView extends XMALinearLayout {
    public int A00;
    public int A01;
    public BMF A02;
    public String A03;
    public String A04;
    public boolean A05;
    public List A06;
    public final LayoutInflater A07;
    public final View.OnClickListener A08;
    public final SegmentedLinearLayout A09;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallToActionContainerView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallToActionContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallToActionContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        setOrientation(1);
        setGravity(5);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0H, i, 0);
            11T.A0A(obtainStyledAttributes);
            this.A00 = obtainStyledAttributes.getColor(0, 0);
            this.A01 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
        }
        SegmentedLinearLayout segmentedLinearLayout = new SegmentedLinearLayout(context, attributeSet);
        this.A09 = segmentedLinearLayout;
        segmentedLinearLayout.A0H(7zL.A0D(getContext().getColor(2132213971)));
        segmentedLinearLayout.A0F(1);
        segmentedLinearLayout.setGravity(5);
        addView(segmentedLinearLayout);
        LayoutInflater from = LayoutInflater.from(context);
        11T.A0A(from);
        this.A07 = from;
        this.A08 = new CZD(this, 40);
    }

    public /* synthetic */ CallToActionContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public final void A0G(BMF bmf, String str, List list) {
        View inflate;
        CTAPaymentInfo cTAPaymentInfo;
        11T.A0F(str, 1);
        this.A06 = list;
        this.A04 = str;
        this.A02 = bmf;
        this.A05 = false;
        if (list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        SegmentedLinearLayout segmentedLinearLayout = this.A09;
        segmentedLinearLayout.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CallToAction callToAction = (CallToAction) it.next();
            boolean z = true;
            if (C4Nc.A0J != callToAction.A07 || (cTAPaymentInfo = callToAction.A04) == null) {
                inflate = this.A07.inflate(2132543125, (ViewGroup) this, false);
                11T.A0A(inflate);
            } else {
                this.A05 = true;
                inflate = this.A07.inflate(2132543126, (ViewGroup) this, false);
                11T.A0A(inflate);
                TextView A0E = DKF.A0E(inflate, 2131366554);
                A0E.setText(cTAPaymentInfo.A01);
                int i = this.A01;
                if (i != 0) {
                    A0E.setTextColor(i);
                }
            }
            boolean A1V = AnonymousClass001.A1V(1Bn.A0A(33058));
            TextView A0E2 = DKF.A0E(inflate, 2131366553);
            A0E2.setTag(callToAction);
            A0E2.setVisibility(0);
            A0E2.setText(callToAction.A00());
            A0E2.setOnClickListener(this.A08);
            if (callToAction.A0J || A1V) {
                z = false;
            }
            A0E2.setEnabled(z);
            int i2 = this.A00;
            if (i2 != 0) {
                A0E2.setTextColor(i2);
            }
            A0E2.setContentDescription(callToAction.A00());
            C2rp.A01(A0E2);
            segmentedLinearLayout.addView(inflate);
        }
    }

    @Override // com.facebook.widget.CustomLinearLayout, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z = true;
        if (!this.A05) {
            int size = View.MeasureSpec.getSize(i);
            SegmentedLinearLayout segmentedLinearLayout = this.A09;
            int childCount = segmentedLinearLayout.getChildCount();
            int i4 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = segmentedLinearLayout.getChildAt(i5);
                if (childAt.getVisibility() == 0) {
                    measureChild(childAt, i, i2);
                    i4 += childAt.getMeasuredWidth();
                }
            }
            if (i4 <= size) {
                z = false;
            }
        }
        SegmentedLinearLayout segmentedLinearLayout2 = this.A09;
        if (z) {
            segmentedLinearLayout2.A0G(2);
            i3 = 1;
        } else {
            i3 = 0;
            segmentedLinearLayout2.A0G(0);
        }
        segmentedLinearLayout2.setOrientation(i3);
        super.onMeasure(i, i2);
    }
}
