package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Ma2, reason: case insensitive filesystem */
/* loaded from: Ma2.class */
public final class C3343Ma2 extends C23s implements MPx {
    public C3343Ma2() {
        super(-313213073);
    }

    public C3343Ma2(int i) {
        super(i);
    }

    @Override // X.MPx
    public String AkR() {
        return A0C("error_message");
    }

    @Override // X.MPx
    public QtN BHZ() {
        return A0A(QtN.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 1);
    }

    @Override // X.MPx
    public String getValue() {
        return A0B(2, "value");
    }

    @Override // X.C23s
    public AnonymousClass313 modelSelectionSet() {
        return MRr.A04();
    }
}
