package com.facebook.payments.picker.option;

import X.AbF;
import X.FKd;
import X.Quw;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;

/* loaded from: PaymentsPickerOptionPickerRunTimeData.class */
public final class PaymentsPickerOptionPickerRunTimeData extends SimplePickerRunTimeData {
    public static final Parcelable.Creator CREATOR = FKd.A00(80);

    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public Intent B7x() {
        String A1C = AbF.A1C(this.A03, Quw.A01);
        if (A1C == null) {
            return null;
        }
        Intent A05 = AbF.A05();
        A05.putExtra("payments_picker_option_id", A1C);
        A05.putExtra("collected_data_key", this.A01.A02);
        return A05;
    }

    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public boolean BRb() {
        return false;
    }
}
