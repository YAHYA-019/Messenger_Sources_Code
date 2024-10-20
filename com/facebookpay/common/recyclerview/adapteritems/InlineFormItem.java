package com.facebookpay.common.recyclerview.adapteritems;

import X.11T;
import X.1BL;
import X.KP0;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.fragment.model.FormParams;

/* loaded from: InlineFormItem.class */
public final class InlineFormItem implements BaseCheckoutItem {
    public static final Parcelable.Creator CREATOR = LGp.A00(5);
    public final FormParams A00;
    public final String A01;
    public final KP0 A02;

    public InlineFormItem(KP0 kp0, FormParams formParams, String str) {
        1BL.A1H(kp0, formParams, str);
        this.A02 = kp0;
        this.A00 = formParams;
        this.A01 = str;
    }

    @Override // com.facebookpay.common.recyclerview.adapteritems.BaseCheckoutItem
    public KP0 AsX() {
        return this.A02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }
}
