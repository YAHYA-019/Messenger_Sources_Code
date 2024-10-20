package com.facebook.payments.paymentmethods.picker.model;

import X.AbF;
import X.AnonymousClass001;
import X.FKd;
import X.Qv0;
import android.content.Intent;
import android.os.Parcelable;
import com.facebook.payments.picker.model.CoreClientData;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;

/* loaded from: PaymentMethodsPickerRunTimeData.class */
public final class PaymentMethodsPickerRunTimeData extends SimplePickerRunTimeData {
    public static final Parcelable.Creator CREATOR = FKd.A00(72);

    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public Intent B7x() {
        CoreClientData coreClientData = this.A00;
        Intent intent = null;
        if (coreClientData != null) {
            String A1C = AbF.A1C(this.A03, Qv0.A05);
            if (A1C != null) {
                intent = AbF.A05();
                intent.putExtra("selected_payment_method", ((PaymentMethodsCoreClientData) coreClientData).A00.A00(A1C));
            }
        }
        return intent;
    }

    @Override // com.facebook.payments.picker.model.PickerRunTimeData
    public boolean BRb() {
        return AnonymousClass001.A1U(this.A00);
    }
}
