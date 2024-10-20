package X;

/* loaded from: K0H.class */
public class K0H extends G8E {
    public final QtM errorFormFieldId;
    public final String extraData;
    public final int paymentErrorCode;
    public final String paymentErrorDescription;
    public final String paymentErrorTitle;
    public final Kfo primaryCta;
    public final Kfo secondaryCta;

    public K0H(Kfo kfo, Kfo kfo2, QtM qtM, String str, String str2, String str3, int i) {
        super(i, str, str2);
        this.paymentErrorCode = i;
        this.paymentErrorTitle = str;
        this.paymentErrorDescription = str2;
        this.primaryCta = kfo;
        this.secondaryCta = kfo2;
        this.errorFormFieldId = qtM;
        this.extraData = str3;
    }
}
