package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.34X, reason: invalid class name */
/* loaded from: 34X.class */
public final class C34X extends 0DA {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0DA, X.34X] */
    public static C34X A00(String str, String str2) {
        ?? r0 = new 0DA();
        r0.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        r0.A07("deduplication_id", str2);
        r0.A07("jewel_session_id", C3TS.A00);
        return r0;
    }
}
