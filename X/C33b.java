package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.33b, reason: invalid class name */
/* loaded from: 33b.class */
public final class C33b extends 3OU {
    public final Object A00;

    public C33b(Object obj) {
        super(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        this.A00 = obj;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof C33b) {
            C33b c33b = (C33b) obj;
            if (((3OU) this).A00.equals(((3OU) c33b).A00) && C2qv.A01(this.A00, c33b.A00)) {
                z = true;
            }
        }
        return z;
    }
}
