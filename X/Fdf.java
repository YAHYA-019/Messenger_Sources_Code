package X;

import com.facebook.fbservice.service.OperationResult;
import com.facebook.payments.auth.pin.model.PaymentPin;

/* loaded from: Fdf.class */
public abstract class Fdf implements 1Tf {
    public final String A00;

    public Fdf(String str) {
        this.A00 = str;
    }

    public OperationResult BMR(1Tu r302, 1TC r303) {
        OperationResult BMQ;
        int i;
        C00j.A05(this.A00, -1896990316);
        try {
            String str = r303.A06;
            if ("fetch_payment_pin".equals(str)) {
                if (this instanceof E5J) {
                    E5J e5j = (E5J) this;
                    BMQ = OperationResult.A04(e5j.A00.A00(e5j.A04, null, null));
                } else {
                    E5I e5i = (E5I) this;
                    BMQ = r302.BMQ(r303);
                    e5i.A00.A00((PaymentPin) BMQ.A07());
                }
                i = 957326065;
            } else if ("delete_payment_pin".equals(str)) {
                if (this instanceof E5J) {
                    E5J e5j2 = (E5J) this;
                    e5j2.A00.A01(e5j2.A02, r303.A00.getParcelable("deletePaymentPinParams"));
                } else {
                    E5I e5i2 = (E5I) this;
                    r302.BMQ(r303);
                    e5i2.A00.A00(PaymentPin.A00);
                }
                BMQ = OperationResult.A00;
                i = 1509011565;
            } else if (1BJ.A00(415).equals(str)) {
                if (this instanceof E5J) {
                    E5J e5j3 = (E5J) this;
                    BMQ = OperationResult.A04(e5j3.A00.A00(e5j3.A05, null, null));
                } else {
                    BMQ = r302.BMQ(r303);
                }
                i = 1418587686;
            } else if (1BJ.A00(394).equals(str)) {
                if (this instanceof E5J) {
                    E5J e5j4 = (E5J) this;
                    new OperationResult((String) e5j4.A00.A00(e5j4.A01, null, r303.A00.getParcelable("createFingerprintNonceParams")), null);
                } else {
                    BMQ = r302.BMQ(r303);
                }
                i = -512989806;
            } else if (1BJ.A00(584).equals(str)) {
                if (this instanceof E5J) {
                    E5J e5j5 = (E5J) this;
                    e5j5.A00.A01(e5j5.A06, r303.A00.getParcelable("verifyFingerprintNonceParams"));
                    BMQ = OperationResult.A00;
                } else {
                    BMQ = r302.BMQ(r303);
                }
                i = 1429264832;
            } else if ("disable_fingerprint_nonce".equals(str)) {
                if (this instanceof E5J) {
                    E5J e5j6 = (E5J) this;
                    e5j6.A00.A01(e5j6.A03, null);
                    BMQ = OperationResult.A00;
                } else {
                    BMQ = r302.BMQ(r303);
                }
                i = 1475312903;
            } else {
                BMQ = r302.BMQ(r303);
                i = 1722489645;
            }
            C00j.A01(i);
            return BMQ;
        } catch (Throwable th) {
            C00j.A01(2125012604);
            throw th;
        }
    }
}
