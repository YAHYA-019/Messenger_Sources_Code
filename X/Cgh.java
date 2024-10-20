package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.util.JSONUtil;

/* loaded from: Cgh.class */
public final class Cgh implements 1Ro {
    public static final String __redex_internal_original_name = "StartResumableUploadMethod";
    public final C00i A01 = 1BQ.A02(84732);
    public final C00i A00 = 1BQ.A02(65755);

    /* JADX WARN: Removed duplicated region for block: B:35:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0363 A[LOOP:0: B:46:0x0355->B:48:0x0363, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0780  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x082e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ X.C04103zy B7F(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 2129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cgh.B7F(java.lang.Object):X.3zy");
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0w = AbH.A0w(anonymousClass439);
        String A0H = JSONUtil.A0H(A0w.A0D(PublicKeyCredentialControllerUtility.JSON_KEY_ID), "");
        String A0P = C3o5.A0P(A0w, ((BxW) obj).A02.mExpectedResponseDataKey, "");
        String A0H2 = JSONUtil.A0H(A0w.A0D("mac"), null);
        boolean A0J = JSONUtil.A0J(A0w.A0D("sent_by_server"), false);
        boolean A1Z = 4YU.A1Z(A0w, OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS);
        int A01 = 4YU.A01(A0w, "err_code", 0);
        return new Hjr(A0H, A0P, A0H2, C3o5.A0P(A0w, "err_str", null), C3o5.A0P(A0w, "message_id", null), A01, A0J, A1Z, 4YU.A1Z(A0w, "isRetryable"), 4YU.A1Z(A0w, "replaced_msg_success"));
    }
}
