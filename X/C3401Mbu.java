package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Mbu, reason: case insensitive filesystem */
/* loaded from: Mbu.class */
public final class C3401Mbu extends C23s implements MQG {
    public C3401Mbu() {
        super(-1002700034);
    }

    public C3401Mbu(int i) {
        super(i);
    }

    public MPo AA6() {
        return (MPo) A06(C3399Mbs.class, "PAYOneTimePhone", 4);
    }

    public String AnH() {
        return A0B(3, DKB.A00(396));
    }

    public boolean As1() {
        return A0D(1, "is_default");
    }

    public String AzU() {
        return A0B(2, "normalized_phone_number");
    }

    public String getId() {
        return A0C(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        MRt mRt = MRt.A00;
        return MRl.A0B(new N9a[]{MRr.A02(mRt), MRr.A02(Rtc.A00), MRr.A02(mRt), MRr.A02(mRt), N8E.A00(-2131856075)});
    }
}
