package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.Gb4, reason: case insensitive filesystem */
/* loaded from: Gb4.class */
public final class C2368Gb4 extends 0DA {
    public static void A00(C07n c07n, 0DA r302, 1UG r303, String str) {
        r302.A01(c07n, "entry_point");
        r303.A7T(r302, "surface");
        0DA r0 = new 0DA();
        r0.A01(3yQ.A01, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        0DA r02 = new 0DA();
        r02.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        r0.A02(r02, "asset");
        r303.A7T(r0, "target");
        r303.A09("ai_ready_made_content");
        r303.BZL();
    }
}
