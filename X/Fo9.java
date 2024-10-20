package X;

import com.facebook.payments.paymentmethods.model.NewPaymentOption;
import com.facebook.payments.paymentmethods.model.PaymentMethodsInfo;
import com.facebook.payments.paymentmethods.picker.PaymentMethodsPickerScreenConfig;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsCoreClientData;
import com.facebook.payments.paymentmethods.picker.model.PaymentMethodsPickerRunTimeData;
import com.facebook.payments.picker.model.CoreClientData;
import com.facebook.payments.picker.model.PickerRunTimeData;
import com.google.common.collect.ImmutableList;

/* loaded from: Fo9.class */
public final class Fo9 implements GFr {
    public final FoC A00 = (FoC) 1Bn.A0B(98942);

    @Override // X.GFr
    public /* bridge */ /* synthetic */ ImmutableList B8M(PickerRunTimeData pickerRunTimeData, ImmutableList immutableList) {
        PaymentMethodsPickerRunTimeData paymentMethodsPickerRunTimeData = (PaymentMethodsPickerRunTimeData) pickerRunTimeData;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Qv0 qv0 = (Qv0) it.next();
            if (qv0.ordinal() != 4) {
                this.A00.A02(paymentMethodsPickerRunTimeData, qv0, A0h);
            } else {
                CoreClientData coreClientData = paymentMethodsPickerRunTimeData.A00;
                if (coreClientData != null) {
                    PaymentMethodsInfo paymentMethodsInfo = ((PaymentMethodsCoreClientData) coreClientData).A00;
                    PaymentMethodsPickerScreenConfig paymentMethodsPickerScreenConfig = (PaymentMethodsPickerScreenConfig) paymentMethodsPickerRunTimeData.A01;
                    1Du it2 = paymentMethodsInfo.A02.iterator();
                    while (it2.hasNext()) {
                        NewPaymentOption newPaymentOption = (NewPaymentOption) it2.next();
                        if (!paymentMethodsPickerScreenConfig.A01.contains(newPaymentOption.A01())) {
                            this.A00.A01(newPaymentOption, paymentMethodsInfo, paymentMethodsPickerScreenConfig.A00, A0h);
                        }
                    }
                }
            }
        }
        return A0h.build();
    }
}
