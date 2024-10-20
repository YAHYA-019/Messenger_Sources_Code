package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* loaded from: C19.class */
public final class C19 {
    public final C00i A00 = AbH.A0N();

    public void A00(String str, String str2) {
        1UG A08 = 1BK.A08(1BK.A07(this.A00), 1BJ.A00(1669));
        if (A08.isSampled()) {
            A08.A7R("sender_id", str);
            A08.A7R("target_uid", str2);
            A08.A5c(BNp.valueOf("SOAP"), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            A08.BZL();
        }
    }
}
