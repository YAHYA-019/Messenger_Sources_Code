package X;

import com.facebook.payments.logging.PaymentsFlowStep;
import com.facebook.payments.picker.model.CoreClientData;
import com.facebook.payments.picker.model.PickerRunTimeData;
import com.facebook.payments.picker.model.PickerScreenAnalyticsParams;
import com.facebook.payments.picker.model.SimplePickerRunTimeData;

/* loaded from: Fnr.class */
public final class Fnr implements GFp {
    public final /* synthetic */ C2048Da9 A00;

    public Fnr(C2048Da9 c2048Da9) {
        this.A00 = c2048Da9;
    }

    @Override // X.GFp
    public void Bsa(CoreClientData coreClientData) {
        String str;
        C2048Da9 c2048Da9 = this.A00;
        ETf eTf = c2048Da9.A08;
        SimplePickerRunTimeData simplePickerRunTimeData = (SimplePickerRunTimeData) c2048Da9.A0A;
        EfV efV = eTf.A00;
        PickerRunTimeData A00 = eTf.A00(coreClientData, simplePickerRunTimeData.A01, simplePickerRunTimeData.A02, simplePickerRunTimeData.A03);
        C2048Da9 c2048Da92 = efV.A00;
        c2048Da92.A0A = A00;
        C2048Da9.A04(c2048Da92);
        c2048Da9.A0B.B2r().analyticsParams.getClass();
        PickerScreenAnalyticsParams pickerScreenAnalyticsParams = c2048Da9.A0B.B2r().analyticsParams;
        PaymentsFlowStep paymentsFlowStep = pickerScreenAnalyticsParams.paymentsFlowStep;
        if (paymentsFlowStep != PaymentsFlowStep.A2B) {
            str = paymentsFlowStep == PaymentsFlowStep.A2A ? "client_load_stars_success" : "client_load_recurringpayments_success";
            c2048Da9.A0C = false;
        }
        if (c2048Da9.A0C) {
            DKD.A0e().BZT(str, F2B.A01(pickerScreenAnalyticsParams.paymentsLoggingSessionData));
        }
        c2048Da9.A0C = false;
    }
}
