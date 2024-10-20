package X;

import android.content.Intent;
import com.facebook.payments.paymentmethods.model.PaymentMethod;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerRunTimeData;
import com.facebook.payments.picker.model.PickerRunTimeData;

/* loaded from: Fny.class */
public final class Fny implements GII {
    public final Fo0 A00 = (Fo0) 1Bn.A0B(98952);

    public void AC1(Exy exy, ETu eTu) {
        this.A00.AC1(exy, eTu);
    }

    public /* bridge */ /* synthetic */ void Bhp(Intent intent, PickerRunTimeData pickerRunTimeData, int i, int i2) {
        PaymentMethod paymentMethod;
        PaymentMethodsPickerRunTimeData paymentMethodsPickerRunTimeData = (PaymentMethodsPickerRunTimeData) pickerRunTimeData;
        if (i != 201) {
            this.A00.Bhp(intent, paymentMethodsPickerRunTimeData, i, i2);
        } else {
            if (i2 != -1 || intent == null || (paymentMethod = (PaymentMethod) intent.getParcelableExtra("selected_payment_method")) == null) {
                return;
            }
            this.A00.A02(paymentMethod);
        }
    }
}
