package com.facebook.addresstypeahead.simpleaddresstypeahead;

import X.0Em;
import X.1Bn;
import X.1Hv;
import X.7zL;
import X.AnonymousClass001;
import X.BjY;
import X.C00i;
import X.DKG;
import X.DKH;
import X.DPT;
import X.DPX;
import X.Efa;
import X.FYO;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import com.facebook.resources.ui.FbAutoCompleteTextView;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: AddressTypeAheadTextView.class */
public class AddressTypeAheadTextView extends TextInputLayout {
    public Handler A00;
    public BjY A01;
    public AddressTypeAheadInput A02;
    public DPT A03;
    public C00i A04;
    public Efa A05;
    public FbAutoCompleteTextView A06;
    public Runnable A07;
    public String A08;
    public boolean A09;
    public InputMethodManager A0A;

    public AddressTypeAheadTextView(Context context) {
        super(context, null);
        this.A09 = false;
        A00();
    }

    public AddressTypeAheadTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = false;
        A00();
    }

    public AddressTypeAheadTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = false;
        A00();
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.resources.ui.FbAutoCompleteTextView, android.widget.AutoCompleteTextView] */
    private void A00() {
        this.A04 = DKG.A0T();
        this.A01 = (BjY) 1Bn.A0A(82782);
        Context context = getContext();
        this.A0A = (InputMethodManager) 1Hv.A02(context, 100189);
        setOrientation(1);
        this.A00 = new Handler();
        this.A03 = new DPT(context, AnonymousClass001.A0s());
        ?? autoCompleteTextView = new AutoCompleteTextView(context);
        this.A06 = autoCompleteTextView;
        autoCompleteTextView.setAdapter(this.A03);
        DPX dpx = this.A06;
        Resources resources = getResources();
        dpx.setHint(resources.getString(2131952421));
        this.A06.setImeOptions(268435462);
        this.A06.setSingleLine(true);
        this.A06.setTextSize(0, 7zL.A01(resources, 2132279323));
        this.A06.setTextColor(0Em.A02(context, 2132214588));
        this.A06.setTextAlignment(5);
        DKH.A16(this);
        A0X(2132608031);
        this.A0m = true;
        this.A06.setOnItemClickListener(new FYO(this, 0));
        addView(this.A06);
        this.A06.setEnabled(isEnabled());
    }

    @Override // com.google.android.material.textfield.TextInputLayout, android.view.View
    public void setEnabled(boolean z) {
        DPX dpx = this.A06;
        if (dpx != null) {
            dpx.setEnabled(z);
        }
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.A06.setOnFocusChangeListener(onFocusChangeListener);
    }
}
