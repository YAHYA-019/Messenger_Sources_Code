package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Mbv, reason: case insensitive filesystem */
/* loaded from: Mbv.class */
public final class C3402Mbv extends C23s implements NBH {
    public C3402Mbv() {
        super(-331946428);
    }

    public C3402Mbv(int i) {
        super(i);
    }

    @Override // X.NBH
    public String Apu() {
        return A0B(2, "image");
    }

    @Override // X.NBH
    public String getId() {
        return A0C("strong_id__");
    }

    @Override // X.NBH
    public String getName() {
        return A0B(1, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRr.A04();
    }
}
