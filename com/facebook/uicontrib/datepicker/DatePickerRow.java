package com.facebook.uicontrib.datepicker;

import X.2MR;
import X.2Me;
import X.2Mg;
import X.AbH;
import X.LKO;
import X.LLC;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import com.facebook.resources.ui.FbTextView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: DatePickerRow.class */
public class DatePickerRow extends CustomFrameLayout {
    public ImageView A00;
    public Spinner A01;
    public FbTextView A02;
    public FbTextView A03;
    public boolean A04;

    public DatePickerRow(Context context) {
        this(context, null);
    }

    public DatePickerRow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DatePickerRow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0U(2132541813);
        this.A03 = (FbTextView) findViewById(2131365147);
        View findViewById = findViewById(2131367513);
        findViewById.getClass();
        this.A01 = (Spinner) findViewById;
        View findViewById2 = findViewById(2131363029);
        findViewById2.getClass();
        this.A00 = (ImageView) findViewById2;
        this.A02 = (FbTextView) findViewById(2131361935);
        this.A01.setOnItemSelectedListener(new LLC(this, 5));
        Spinner spinner = this.A01;
        Context context2 = getContext();
        2Mg r0 = 2Me.A02;
        AbH.A1K(spinner, r0.A00(context2));
        LKO.A01(this.A00, this, 87);
        this.A00.setColorFilter(r0.A03(context2, 2MR.A22));
        setOnClickListener(LKO.A00(this, 88));
        this.A04 = false;
        this.A03.setVisibility(8);
        this.A01.setVisibility(8);
        this.A00.setVisibility(8);
        this.A02.setVisibility(0);
    }
}
