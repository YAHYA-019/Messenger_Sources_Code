package com.facebookpay.offsite.models.message;

import X.02L;
import X.0Pz;
import X.0QD;
import X.11T;
import X.1BL;
import X.AnonymousClass001;
import X.C0ty;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: MessageParamsKt.class */
public abstract class MessageParamsKt {
    public static final String formatCurrency(PaymentCurrencyAmount paymentCurrencyAmount) {
        11T.A0F(paymentCurrencyAmount, 0);
        return 0Pz.A0W(Currency.getInstance(paymentCurrencyAmount.currency).getSymbol(), paymentCurrencyAmount.value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r302v1 */
    /* JADX WARN: Type inference failed for: r302v3 */
    /* JADX WARN: Type inference failed for: r302v5 */
    /* JADX WARN: Type inference failed for: r302v6, types: [java.util.AbstractCollection] */
    public static final List getErrors(PaymentDetailsUpdate paymentDetailsUpdate) {
        List mapKeyToErrorField;
        11T.A0F(paymentDetailsUpdate, 0);
        List<PaymentDataError> list = paymentDetailsUpdate.errors;
        if (list != null) {
            mapKeyToErrorField = 1BL.A0z(list);
            for (PaymentDataError paymentDataError : list) {
                if (!02L.A0C(paymentDataError.reason, PaymentDataErrorReason.values())) {
                    paymentDataError = new PaymentDataError(PaymentDataErrorReason.OTHER_ERROR, paymentDataError.field, paymentDataError.message);
                }
                mapKeyToErrorField.add(paymentDataError);
            }
        } else {
            List mapKeyToErrorField2 = mapKeyToErrorField(paymentDetailsUpdate.shippingAddressErrors);
            mapKeyToErrorField = mapKeyToErrorField(paymentDetailsUpdate.offerCodeErrors);
            if (mapKeyToErrorField2 != null) {
                C0ty c0ty = mapKeyToErrorField;
                if (mapKeyToErrorField == 0) {
                    c0ty = C0ty.A00;
                }
                mapKeyToErrorField = 0QD.A0O(c0ty, mapKeyToErrorField2);
            }
        }
        return mapKeyToErrorField;
    }

    public static final List mapKeyToErrorField(PaymentDetailsUpdatedError paymentDetailsUpdatedError) {
        PaymentDataErrorField paymentDataErrorField;
        List list = null;
        if (paymentDetailsUpdatedError != null) {
            ArrayList A0t = AnonymousClass001.A0t(paymentDetailsUpdatedError.size());
            Iterator A0x = AnonymousClass001.A0x(paymentDetailsUpdatedError);
            while (A0x.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(A0x);
                PaymentDataErrorReason paymentDataErrorReason = 02L.A0C(((PaymentDataError) A0z.getValue()).reason, PaymentDataErrorReason.values()) ? ((PaymentDataError) A0z.getValue()).reason : PaymentDataErrorReason.OTHER_ERROR;
                PaymentDataErrorField[] values = PaymentDataErrorField.values();
                int i = 0;
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        paymentDataErrorField = PaymentDataErrorField.unknown;
                        break;
                    }
                    paymentDataErrorField = values[i];
                    if (!11T.A0O(paymentDataErrorField.name(), A0z.getKey())) {
                        i++;
                    }
                }
                A0t.add(new PaymentDataError(paymentDataErrorReason, paymentDataErrorField, ((PaymentDataError) A0z.getValue()).message));
            }
            list = 0QD.A0V(A0t);
        }
        return list;
    }
}
