package X;

import com.facebook.common.locale.Country;
import com.facebook.payments.paymentmethods.model.FbPaymentCardType;

/* loaded from: Eqo.class */
public final class Eqo {
    public final int A00;
    public final int A01;
    public final Country A02;
    public final FbPaymentCardType A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public Eqo(Country country, FbPaymentCardType fbPaymentCardType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, boolean z) {
        this.A08 = str5;
        if (fbPaymentCardType == null && !1JF.A0B(str5)) {
            fbPaymentCardType = Rh1.A02(str5);
        }
        this.A03 = fbPaymentCardType;
        if (1JF.A0B(str7)) {
            this.A00 = i;
        } else {
            String[] split = str7.split("/");
            this.A00 = Integer.parseInt(split[0]);
            i2 = Integer.parseInt(split[1]);
        }
        this.A01 = i2;
        this.A0A = str8;
        this.A07 = str4;
        this.A06 = str3;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = country;
        this.A09 = str6;
        this.A0B = z;
    }
}
