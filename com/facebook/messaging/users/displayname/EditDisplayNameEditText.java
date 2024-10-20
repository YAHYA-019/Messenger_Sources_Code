package com.facebook.messaging.users.displayname;

import X.3IP;
import X.C09s;
import X.C15h;
import X.C1oo;
import X.HWP;
import X.IJ7;
import X.J5u;
import X.LKR;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.EditText;
import com.facebook.widget.CustomLinearLayout;
import java.util.Locale;

/* loaded from: EditDisplayNameEditText.class */
public class EditDisplayNameEditText extends CustomLinearLayout {
    public EditText A00;
    public EditText A01;
    public HWP A02;
    public C15h A03;
    public boolean A04;

    public EditDisplayNameEditText(Context context) {
        super(context);
        this.A04 = false;
        A00(context, null);
    }

    public EditDisplayNameEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = false;
        A00(context, attributeSet);
    }

    public EditDisplayNameEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = false;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        this.A03 = J5u.A03(this, 68);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A0i);
        int i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int i2 = 2132541862;
        if (i == 1) {
            i2 = 2132541861;
        }
        A0D(i2);
        this.A01 = (EditText) C09s.A01(this, 2131366161);
        this.A00 = (EditText) C09s.A01(this, 2131366162);
        if (3IP.A01.contains(((Locale) this.A03.get()).getLanguage())) {
            this.A04 = true;
            this.A01.setHint(2131962695);
            this.A00.setHint(2131962694);
        }
        IJ7.A00(this.A01, this, 7);
        IJ7.A00(this.A00, this, 8);
        this.A00.setOnKeyListener(new LKR(this, 2));
    }
}
