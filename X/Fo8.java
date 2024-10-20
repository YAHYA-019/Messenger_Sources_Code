package X;

import com.facebook.payments.picker.model.PickerRunTimeData;
import com.facebook.payments.picker.model.PickerScreenConfig;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;
import com.facebook.payments.picker.option.PaymentsPickerOption;
import com.facebook.payments.picker.option.PaymentsPickerOptionPickerScreenConfig;
import com.google.common.collect.ImmutableList;

/* loaded from: Fo8.class */
public final class Fo8 implements GFr {
    @Override // X.GFr
    public /* bridge */ /* synthetic */ ImmutableList B8M(PickerRunTimeData pickerRunTimeData, ImmutableList immutableList) {
        SimplePickerRunTimeData simplePickerRunTimeData = (SimplePickerRunTimeData) pickerRunTimeData;
        ImmutableList.Builder A0h = 4YU.A0h();
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            Quw quw = (Quw) it.next();
            if (quw.ordinal() != 0) {
                throw AnonymousClass002.A0C(quw, "Unhandled section type ", AnonymousClass001.A0k());
            }
            PaymentsPickerOptionPickerScreenConfig paymentsPickerOptionPickerScreenConfig = simplePickerRunTimeData.A01;
            PaymentsPickerOptionPickerScreenConfig paymentsPickerOptionPickerScreenConfig2 = paymentsPickerOptionPickerScreenConfig;
            1Du it2 = paymentsPickerOptionPickerScreenConfig2.A01.iterator();
            while (it2.hasNext()) {
                PaymentsPickerOption paymentsPickerOption = (PaymentsPickerOption) it2.next();
                String str = paymentsPickerOption.A00;
                boolean equals = str.equals(simplePickerRunTimeData.A03.get(Quw.A01));
                A0h.m11011add((Object) new Rv7(PickerScreenConfig.A00(paymentsPickerOptionPickerScreenConfig), paymentsPickerOptionPickerScreenConfig2.A02, str, paymentsPickerOption.A01, equals));
            }
            A0h.m11011add((Object) new Ruw());
        }
        return A0h.build();
    }
}
