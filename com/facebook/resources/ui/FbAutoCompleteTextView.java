package com.facebook.resources.ui;

import X.1BQ;
import X.AbF;
import X.C00i;
import X.DPX;
import X.GIe;
import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;

/* loaded from: FbAutoCompleteTextView.class */
public class FbAutoCompleteTextView extends DPX {
    public C00i A00;
    public GIe A01;

    public FbAutoCompleteTextView(Context context) {
        super(context);
    }

    public FbAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        DPX.A00(context, attributeSet, this);
        A0B();
    }

    public FbAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        DPX.A00(context, attributeSet, this);
        A0B();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0B() {
        1BQ A02 = 1BQ.A02(32845);
        this.A00 = AbF.A0Q(getContext(), 99810);
        addTextChangedListener((TextWatcher) A02.get());
    }

    public boolean A0C() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void showDropDown() {
        GIe gIe;
        boolean isPopupShowing = isPopupShowing();
        if (!A0C()) {
            super/*android.widget.AutoCompleteTextView*/.showDropDown();
        }
        if (isPopupShowing || (gIe = this.A01) == null) {
            return;
        }
        gIe.CLS();
    }
}
