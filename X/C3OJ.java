package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.3OJ, reason: invalid class name */
/* loaded from: 3OJ.class */
public final class C3OJ {
    public final int A00;
    public final int A01;

    public C3OJ(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public 2DM A00() {
        2DM r0 = new 2DM(C26T.A00);
        r0.A0i(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, this.A01);
        int i = this.A00;
        if (i > -2) {
            r0.A0i("index", i);
        }
        return r0;
    }

    public String toString() {
        return A00().toString();
    }
}
