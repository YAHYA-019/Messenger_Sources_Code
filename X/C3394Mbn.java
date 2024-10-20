package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Mbn, reason: case insensitive filesystem */
/* loaded from: Mbn.class */
public final class C3394Mbn extends C23s implements MQA {
    public C3394Mbn() {
        super(-603050831);
    }

    public C3394Mbn(int i) {
        super(i);
    }

    public MPl AWW() {
        return (MPl) A04(C3393Mbm.class, "amount");
    }

    public String Asw() {
        return A0B(1, "label");
    }

    public QtF BCI() {
        return A0A(QtF.A01, "status", 4);
    }

    public KOe BHX() {
        return A0A(KOe.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 3);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        N9a A00 = MRw.A00();
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{A00, MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRr.A02(mRt), MRw.A00()});
    }
}
