package com.facebook.messaging.contacts.picker.common;

import X.2Wo;
import X.3JE;
import X.C09s;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.ImageView;
import com.facebook.widget.CustomRelativeLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: ContactPickerSectionUpsellView.class */
public class ContactPickerSectionUpsellView extends CustomRelativeLayout {
    public final ImageView A00;
    public final Button A01;
    public final 2Wo A02;
    public final BetterTextView A03;
    public final BetterTextView A04;

    public ContactPickerSectionUpsellView(Context context) {
        this(context, null, 0);
    }

    public ContactPickerSectionUpsellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContactPickerSectionUpsellView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0C(2132542904);
        this.A04 = (BetterTextView) C09s.A01(this, 2131363313);
        this.A03 = (BetterTextView) C09s.A01(this, 2131363312);
        this.A01 = (Button) C09s.A01(this, 2131363311);
        this.A00 = (ImageView) C09s.A01(this, 2131363310);
        this.A02 = 2Wo.A00((ViewStub) C09s.A01(this, 2131366410));
        super.A00 = new 3JE(this);
    }
}
