package com.facebook.payments.transactionhub.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: HubBrandingPromiseInfoSectionView.class */
public class HubBrandingPromiseInfoSectionView extends ConstraintLayout {
    public HubBrandingPromiseInfoSectionRowView A00;
    public HubBrandingPromiseInfoSectionRowView A01;
    public HubBrandingPromiseInfoSectionRowView A02;

    public HubBrandingPromiseInfoSectionView(Context context) {
        super(context);
        A00(context);
    }

    public HubBrandingPromiseInfoSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public HubBrandingPromiseInfoSectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        View.inflate(context, 2132542123, this);
        this.A00 = (HubBrandingPromiseInfoSectionRowView) requireViewById(2131367031);
        this.A01 = (HubBrandingPromiseInfoSectionRowView) requireViewById(2131367032);
        this.A02 = (HubBrandingPromiseInfoSectionRowView) requireViewById(2131367033);
        HubBrandingPromiseInfoSectionRowView hubBrandingPromiseInfoSectionRowView = this.A00;
        Context context2 = getContext();
        hubBrandingPromiseInfoSectionRowView.A00.setText(context2.getResources().getString(2131953498));
        HubBrandingPromiseInfoSectionRowView hubBrandingPromiseInfoSectionRowView2 = this.A01;
        hubBrandingPromiseInfoSectionRowView2.A00.setText(context2.getResources().getString(2131953499));
        HubBrandingPromiseInfoSectionRowView hubBrandingPromiseInfoSectionRowView3 = this.A02;
        hubBrandingPromiseInfoSectionRowView3.A00.setText(context2.getResources().getString(2131953500));
    }
}
