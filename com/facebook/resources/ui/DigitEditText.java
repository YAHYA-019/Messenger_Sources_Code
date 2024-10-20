package com.facebook.resources.ui;

import X.1Bi;
import X.6P9;
import X.C03903zR;
import X.DPF;
import X.EsX;
import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: DigitEditText.class */
public class DigitEditText extends 6P9 {
    public EsX A00;
    public C03903zR A01;

    public DigitEditText(Context context) {
        super(context);
        A00();
    }

    public DigitEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        6P9.A05(context, attributeSet, this);
        A00();
    }

    public DigitEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        6P9.A05(context, attributeSet, this);
        A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        C03903zR c03903zR = (C03903zR) 1Bi.A03(32845);
        this.A01 = c03903zR;
        this.A00 = null;
        c03903zR.getClass();
        addTextChangedListener(c03903zR);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        DPF dpf = new DPF(this, this);
        editorInfo.inputType = 3;
        return dpf;
    }
}
