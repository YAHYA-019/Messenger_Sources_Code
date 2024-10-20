package X;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.payments.auth.AuthenticationActivity;
import com.facebook.payments.auth.AuthenticationParams;
import com.facebook.payments.logging.PaymentsFlowStep;

/* loaded from: E4y.class */
public final class E4y extends DeM {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public E4y(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        String str;
        ServiceException serviceException;
        if (this.A00 != 0) {
            OperationResult operationResult = (OperationResult) obj;
            if (!operationResult.success) {
                serviceException = new ServiceException(operationResult);
                A05(serviceException);
                return;
            }
            FIe fIe = (FIe) this.A01;
            FHO fho = fIe.A08;
            Epd epd = fIe.A01;
            fho.A06((PaymentsFlowStep) this.A02, epd.A03, epd.A04);
            if (!1JF.A0B(operationResult.resultDataString)) {
                fIe.A0D.A00(operationResult.resultDataString);
            }
            str = "AuthenticationManager";
            0fH.A0l(str, "Regenerated fingerprint nonce");
        }
        OperationResult operationResult2 = (OperationResult) obj;
        if (!operationResult2.success) {
            serviceException = new ServiceException(operationResult2);
            A05(serviceException);
            return;
        }
        AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.A01;
        FHO fho2 = authenticationActivity.A05;
        AuthenticationParams authenticationParams = authenticationActivity.A06;
        fho2.A05((PaymentsFlowStep) this.A02, authenticationParams.A03, authenticationParams.A04);
        if (!1JF.A0B(operationResult2.resultDataString)) {
            authenticationActivity.A09.A00(operationResult2.resultDataString);
        }
        str = "AuthenticationActivity";
        0fH.A0l(str, "Regenerated fingerprint nonce");
    }

    public void A05(ServiceException serviceException) {
        String str;
        if (this.A00 != 0) {
            FIe fIe = (FIe) this.A01;
            FHO fho = fIe.A08;
            Epd epd = fIe.A01;
            fho.A08((PaymentsFlowStep) this.A02, epd.A03, epd.A04, serviceException);
            str = "AuthenticationManager";
        } else {
            AuthenticationActivity authenticationActivity = (AuthenticationActivity) this.A01;
            FHO fho2 = authenticationActivity.A05;
            AuthenticationParams authenticationParams = authenticationActivity.A06;
            fho2.A08((PaymentsFlowStep) this.A02, authenticationParams.A03, authenticationParams.A04, serviceException);
            str = "AuthenticationActivity";
        }
        0fH.A0r(str, "Failed to create nonce", serviceException);
    }
}
