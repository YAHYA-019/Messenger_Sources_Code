package X;

import com.facebook.payments.contactinfo.form.ContactInfoCommonFormParams;
import com.facebook.payments.contactinfo.model.ContactInfoFormInput;
import com.facebook.payments.logging.PaymentsLoggingSessionData;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.Dax, reason: case insensitive filesystem */
/* loaded from: Dax.class */
public final class C2072Dax extends 1RM {
    public final /* synthetic */ ContactInfoCommonFormParams A00;
    public final /* synthetic */ FmB A01;
    public final /* synthetic */ ContactInfoFormInput A02;
    public final /* synthetic */ boolean A03;

    public C2072Dax(ContactInfoCommonFormParams contactInfoCommonFormParams, FmB fmB, ContactInfoFormInput contactInfoFormInput, boolean z) {
        this.A01 = fmB;
        this.A00 = contactInfoCommonFormParams;
        this.A02 = contactInfoFormInput;
        this.A03 = z;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        2JX A0L;
        2JY r0 = (2JY) obj;
        if (r0 == null || (A0L = 1BL.A0L(r0, -1421741669, 459933768)) == null) {
            return;
        }
        2JX A0L2 = 1BL.A0L(A0L, -860066186, -1973844842);
        if (A0L2 == null) {
            A0L.A0r(1210412029).getClass();
            FmB fmB = this.A01;
            ContactInfoCommonFormParams contactInfoCommonFormParams = this.A00;
            fmB.A04.A00(contactInfoCommonFormParams, this.A02, contactInfoCommonFormParams.A01.getId(), this.A03, false);
            return;
        }
        FmB fmB2 = this.A01;
        FIQ fiq = fmB2.A05;
        ContactInfoCommonFormParams contactInfoCommonFormParams2 = this.A00;
        PaymentsLoggingSessionData paymentsLoggingSessionData = contactInfoCommonFormParams2.A05;
        fiq.A0A(paymentsLoggingSessionData, DKG.A13(A0L2, 1635686852), TraceFieldType.ErrorCode);
        String A0s = DKF.A0s(A0L2, -481040315);
        fiq.A0A(paymentsLoggingSessionData, A0s, "error_message");
        fiq.A07(RVR.A00(contactInfoCommonFormParams2), paymentsLoggingSessionData, "payflows_fail");
        FHd.A02(A0L2, contactInfoCommonFormParams2, fmB2, paymentsLoggingSessionData, A0s);
    }

    public void A03(Throwable th) {
        FmB fmB = this.A01;
        fmB.A01.getString(2131954832);
        fmB.A04.A01(this.A00, th, false);
    }
}
