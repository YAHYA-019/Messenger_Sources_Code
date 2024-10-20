package X;

import com.facebook.common.locale.Country;
import com.facebook.payments.paymentmethods.model.VerifyField;

/* loaded from: E6X.class */
public final class E6X extends FIk {
    public Fop A00;
    public Foq A01;
    public N8H A02;

    private boolean A00(Country country, String str) {
        if (!A0A(country, VerifyField.ADDRESS)) {
            return true;
        }
        N8H n8h = this.A02;
        n8h.A00 = country;
        if (1JF.A0B(str)) {
            return false;
        }
        if (Country.A01.equals(n8h.A00)) {
            return N8H.A02.contains(str);
        }
        return true;
    }

    public void A09(Integer num, String str) {
        DZd dZd;
        Integer num2;
        int intValue = num.intValue();
        if (intValue == 4) {
            ((FIk) this).A03.A1d();
            if (!1JF.A0B(str)) {
                ((FIk) this).A03.A1j(0S2.A0Y, (String) null, true);
            }
            ((FIk) this).A03.A1i(0S2.A0Y);
        } else if (intValue != 5) {
            if (intValue != 6) {
                super.A09(num, str);
                return;
            }
            ((FIk) this).A03.A1d();
            if (!1JF.A0B(str)) {
                ((FIk) this).A03.A1j(0S2.A0u, (String) null, true);
            }
            dZd = ((FIk) this).A03;
            num2 = 0S2.A0u;
            dZd.A1i(num2);
        }
        ((FIk) this).A03.A1d();
        if (!1JF.A0B(str)) {
            ((FIk) this).A03.A1j(0S2.A0j, (String) null, true);
        }
        dZd = ((FIk) this).A03;
        num2 = 0S2.A0j;
        dZd.A1i(num2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0035, code lost:
    
        if (r0.contains(com.facebook.payments.paymentmethods.model.VerifyField.ADDRESS) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0A(com.facebook.common.locale.Country r302, com.facebook.payments.paymentmethods.model.VerifyField r303) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            boolean r0 = super.A0A(r1, r2)
            r304 = r0
            r0 = r301
            com.facebook.payments.paymentmethods.cardform.CardFormCommonParams r0 = com.facebook.payments.paymentmethods.cardform.CardFormParams.A01(r0)
            com.facebook.payments.paymentmethods.model.FbPaymentCard r0 = r0.fbPaymentCard
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3d
            r0 = r305
            com.google.common.collect.ImmutableList r0 = r0.BJ9()
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L38
            com.facebook.payments.paymentmethods.model.VerifyField r0 = com.facebook.payments.paymentmethods.model.VerifyField.ADDRESS
            r305 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.contains(r1)
            r307 = r0
            r0 = 1
            r304 = r0
            r0 = r307
            if (r0 != 0) goto L3d
        L38:
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
        L3d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6X.A0A(com.facebook.common.locale.Country, com.facebook.payments.paymentmethods.model.VerifyField):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        if (A00(r302, r309) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C(com.facebook.common.locale.Country r302, java.lang.String r303, java.lang.String r304, java.lang.String r305, java.lang.String r306, java.lang.String r307, java.lang.String r308, java.lang.String r309, java.lang.String r310) {
        /*
            r301 = this;
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            r4 = r305
            r5 = r306
            r6 = r307
            r7 = r308
            r8 = r309
            r9 = r310
            boolean r0 = super.A0C(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L64
            com.facebook.payments.paymentmethods.model.VerifyField r0 = com.facebook.payments.paymentmethods.model.VerifyField.ADDRESS
            r312 = r0
            r0 = r301
            r1 = r302
            r2 = r312
            boolean r0 = r0.A0A(r1, r2)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L39
            r0 = r307
            boolean r0 = X.DKC.A1Y(r0)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L64
        L39:
            r0 = r301
            r1 = r302
            r2 = r312
            boolean r0 = r0.A0A(r1, r2)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L53
            r0 = r308
            boolean r0 = X.DKC.A1Y(r0)
            r311 = r0
            r0 = r311
            if (r0 == 0) goto L64
        L53:
            r0 = r301
            r1 = r302
            r2 = r309
            boolean r0 = r0.A00(r1, r2)
            r313 = r0
            r0 = 1
            r311 = r0
            r0 = r313
            if (r0 != 0) goto L67
        L64:
            r0 = 0
            r311 = r0
        L67:
            r0 = r311
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.E6X.A0C(com.facebook.common.locale.Country, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public boolean A0D(Country country, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Integer num;
        String str9;
        DZd dZd;
        boolean z;
        if (!super.A0D(country, str, str2, str3, str4, str5, str6, str7, str8)) {
            return false;
        }
        VerifyField verifyField = VerifyField.ADDRESS;
        if (A0A(country, verifyField) && !DKC.A1Y(str5)) {
            DZd dZd2 = ((FIk) this).A03;
            num = 0S2.A0Y;
            dZd2.A1g(num);
            boolean A1Y = !A0A(country, verifyField) ? true : DKC.A1Y(str5);
            str9 = null;
            dZd = ((FIk) this).A03;
            if (!A1Y) {
                z = false;
                str9 = this.A01.AkS(null);
            }
            z = true;
        } else if (A0A(country, verifyField) && !DKC.A1Y(str6)) {
            DZd dZd3 = ((FIk) this).A03;
            num = 0S2.A0j;
            dZd3.A1g(num);
            boolean A1Y2 = !A0A(country, verifyField) ? true : DKC.A1Y(str6);
            str9 = null;
            dZd = ((FIk) this).A03;
            if (!A1Y2) {
                z = false;
                str9 = this.A00.AkS(null);
            }
            z = true;
        } else {
            if (A00(country, str7)) {
                return true;
            }
            DZd dZd4 = ((FIk) this).A03;
            num = 0S2.A0u;
            dZd4.A1g(num);
            boolean A00 = A00(country, str7);
            str9 = null;
            dZd = ((FIk) this).A03;
            if (!A00) {
                z = false;
                str9 = this.A02.AkS((GFy) null);
            }
            z = true;
        }
        dZd.A1j(num, str9, z);
        return false;
    }
}
