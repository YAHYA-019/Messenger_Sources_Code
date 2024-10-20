package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.6hy, reason: invalid class name */
/* loaded from: 6hy.class */
public final class C6hy {
    public final C00i A00 = new 1BQ(16634);

    public void A00(String str, String str2, boolean z) {
        if (str == null || str2 == null) {
            return;
        }
        1UG A08 = 1BK.A08(1BK.A07(this.A00), 1BJ.A00(1223));
        if (A08.isSampled()) {
            0DA r0 = new 0DA();
            r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
            A08.A7T(r0, "page");
            0DA r02 = new 0DA();
            r02.A07("form_id", str2);
            int i = 34;
            if (z) {
                i = 70;
            }
            r02.A05("end_mode", Integer.valueOf(i));
            A08.A7T(r02, "feedback");
            A08.BZL();
        }
    }
}
