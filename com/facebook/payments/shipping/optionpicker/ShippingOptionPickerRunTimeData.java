package com.facebook.payments.shipping.optionpicker;

import X.AbF;
import X.FKW;
import X.Qux;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;

/* loaded from: ShippingOptionPickerRunTimeData.class */
public final class ShippingOptionPickerRunTimeData extends SimplePickerRunTimeData {
    public static final Parcelable.Creator CREATOR = FKW.A00(0);

    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public Intent B7x() {
        String A1C = AbF.A1C(this.A03, Qux.A01);
        if (A1C == null) {
            return null;
        }
        Intent A05 = AbF.A05();
        A05.putExtra("extra_shipping_option_id", A1C);
        return A05;
    }

    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public boolean BRb() {
        return false;
    }
}
