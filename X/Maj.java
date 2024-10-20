package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: Maj.class */
public final class Maj extends C23s implements MQQ {
    public Maj() {
        super(1544411220);
    }

    public Maj(int i) {
        super(i);
    }

    @Override // X.MQQ
    public MQP A9T() {
        return A06(C3351Maa.class, "PAYFBPayComponentContactInformation", 2);
    }

    @Override // X.MQQ
    public MPc A9Z() {
        return (MPc) A06(C3356Maf.class, "PAYFBPayComponentEmailOptin", 9);
    }

    @Override // X.MQQ
    public MQ7 AAH() {
        return (MQ7) A06(C3366Mau.class, "PAYFBPayComponentIncentives", 8);
    }

    @Override // X.MQQ
    public MQ1 AAP() {
        return (MQ1) A06(C3375Mb4.class, "PAYFBPayComponentOneTimeCheckoutOptionV2", 7);
    }

    @Override // X.MQQ
    public MOk AAU() {
        return (MOk) A06(C3377Mb6.class, "PAYFBPayComponentPayButton", 4);
    }

    @Override // X.MQQ
    public MQT AAY() {
        return A06(MbG.class, "PAYFBPayComponentPaymentMethod", 5);
    }

    @Override // X.MQQ
    public MQ2 AAd() {
        return (MQ2) A06(MbN.class, "PAYFBPayComponentShippingAddress", 1);
    }

    @Override // X.MQQ
    public MQO AAg() {
        return A06(MbW.class, "PAYFBPayComponentDisclaimerWithSheet", 3);
    }

    @Override // X.MQQ
    public KOy BHY() {
        return A0A(KOy.A0K, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRl.A0B(new N9a[]{MRr.A00(), N8E.A00(-386001874), N8E.A00(-14546548), N8E.A00(1999017307), N8E.A00(-703137565), N8E.A00(1980835226), N8E.A00(-2039859646), N8E.A00(-1153640861), N8E.A00(-830780045), N8E.A00(-570497560)});
    }
}
