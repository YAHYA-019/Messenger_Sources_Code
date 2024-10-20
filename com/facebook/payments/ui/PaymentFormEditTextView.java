package com.facebook.payments.ui;

import X.0S2;
import X.1Bn;
import X.2KU;
import X.7zL;
import X.AbN;
import X.AnonymousClass001;
import X.C00i;
import X.C1oo;
import X.DKC;
import X.DKF;
import X.DKH;
import X.DPX;
import X.E8y;
import X.FIR;
import X.R33;
import X.RGj;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.resources.ui.FbAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: PaymentFormEditTextView.class */
public class PaymentFormEditTextView extends TextInputLayout {
    public C00i A00;
    public RGj A01;
    public FIR A02;
    public FbAutoCompleteTextView A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;

    public PaymentFormEditTextView(Context context) {
        this(context, null);
    }

    public PaymentFormEditTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [com.facebook.resources.ui.FbAutoCompleteTextView, android.view.View, X.E8y] */
    /* JADX WARN: Type inference failed for: r0v58, types: [int[], int[][]] */
    public PaymentFormEditTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A05 = false;
        this.A00 = 7zL.A0R(context, 442);
        this.A04 = (Integer) 1Bn.A0A(100182);
        this.A02 = DKC.A0V(this.A00).A13(context);
        DKH.A16(this);
        A0X(2132608031);
        FIR fir = this.A02;
        fir.getClass();
        A0Z(ColorStateList.valueOf(fir.A08()));
        this.A0m = true;
        ?? e8y = new E8y(context, this);
        this.A03 = e8y;
        e8y.setTextAlignment(5);
        this.A03.setImeOptions(268435462);
        this.A03.setSingleLine(true);
        DPX dpx = this.A03;
        Resources resources = getResources();
        dpx.setTextSize(0, 7zL.A01(resources, 2132279592));
        Context context2 = getContext();
        context2.getClass();
        FIR fir2 = this.A02;
        fir2.getClass();
        this.A03.setTextColor(new ColorStateList(new int[]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{fir2.A09(), fir2.A06()}));
        R33.A00(this.A03, fir2, false);
        A0Z(ColorStateList.valueOf(DKC.A0V(this.A00).A13(context2).A08()));
        DPX dpx2 = this.A03;
        2KU.A02(dpx2.getTypeface(), dpx2, 0S2.A00, 0S2.A01);
        addView(this.A03);
        if (this.A03.getBackground() != null) {
            Drawable newDrawable = this.A03.getBackground().getConstantState().newDrawable();
            int intValue = this.A04.intValue();
            DPX dpx3 = this.A03;
            if (intValue >= 16) {
                dpx3.setBackground(newDrawable);
            } else {
                dpx3.setBackgroundDrawable(newDrawable);
            }
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A23, i, 0);
        int integer = obtainStyledAttributes.getInteger(3, 0);
        if (integer > 0) {
            AbN.A0v(this.A03, integer);
        }
        int resourceId = obtainStyledAttributes.getResourceId(2, 0);
        if (resourceId > 0) {
            DKF.A18(resources, this, resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId2 > 0) {
            A0j(true);
            A0d(resources.getString(resourceId2));
        }
        if (obtainStyledAttributes.getBoolean(1, false)) {
            this.A03.setImeOptions(5);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.google.android.material.textfield.TextInputLayout
    public void A0j(boolean z) {
        DPX dpx;
        super.A0j(z);
        FIR fir = this.A02;
        if (fir == null || (dpx = this.A03) == null) {
            return;
        }
        R33.A00(dpx, fir, z);
    }

    public void A0l() {
        this.A05 = true;
        setBackgroundResource(2132410551);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.mapbox.mapboxsdk.R.dimen.mapbox_eight_dp);
        setPadding(dimensionPixelSize, DKC.A04(resources), dimensionPixelSize, dimensionPixelSize);
        DPX dpx = this.A03;
        dpx.setTextSize(0, 7zL.A01(resources, 2132279381));
        dpx.setBackground(null);
        this.A0m = true;
    }

    public void A0m() {
        this.A03.setBackgroundTintList(ColorStateList.valueOf(DKC.A0V(this.A00).A13(getContext()).A07()));
    }

    public void A0n() {
        this.A03.setBackgroundTintList(ColorStateList.valueOf(DKC.A0V(this.A00).A13(getContext()).A08()));
    }

    public void A0o(CharSequence charSequence) {
        if (charSequence != null) {
            this.A03.setText(charSequence);
        }
    }

    public void A0p(String str) {
        if (this.A05) {
            return;
        }
        A0d(str);
        A0j(AnonymousClass001.A1T(str));
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean z) {
        DPX dpx;
        if (this.A06 || (dpx = this.A03) == null) {
            return;
        }
        dpx.setEnabled(z);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        DPX dpx = this.A03;
        if (dpx != null) {
            dpx.setKeyListener(null);
            dpx.setFocusable(false);
            dpx.setOnClickListener(onClickListener);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        DPX dpx = this.A03;
        if (dpx != null) {
            dpx.setOnFocusChangeListener(onFocusChangeListener);
        }
    }
}
