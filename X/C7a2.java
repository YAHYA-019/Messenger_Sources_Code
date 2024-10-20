package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.params.ThreadViewParams;

/* renamed from: X.7a2, reason: invalid class name */
/* loaded from: 7a2.class */
public final class C7a2 {
    public final 1Br A01 = 1BK.A0D();
    public final 1Br A00 = 1BK.A0C();

    public static final void A00(7NO r301, C7a2 c7a2, ThreadKey threadKey) {
        1UG A08 = 1BK.A08(1Br.A02(c7a2.A01), "ls_1lc_feature_collapse");
        if (A08.isSampled()) {
            0DA r308 = null;
            if (threadKey != null) {
                r308 = new 0DA();
                4YV.A19(r308, threadKey);
                r308.A01(C7ks.A00(threadKey, true), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }
            A08.A5c(r301, "feature");
            A08.A7T(r308, "thread");
            A08.BZL();
        }
    }

    public static final void A01(7NO r301, C7a2 c7a2, ThreadKey threadKey, ThreadViewParams threadViewParams, int i, int i2) {
        0DA r313;
        5SW r0;
        1UG A08 = 1BK.A08(1Br.A02(c7a2.A01), "ls_1lc_feature_open");
        if (A08.isSampled()) {
            int i3 = 2;
            String str = null;
            if (threadKey != null) {
                r313 = new 0DA();
                4YV.A19(r313, threadKey);
                r313.A01(C7ks.A00(threadKey, true), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            } else {
                r313 = null;
            }
            if (1Br.A07(c7a2.A00).AZk(36324930719076569L) && threadViewParams != null && (r0 = threadViewParams.A0C) != null) {
                str = r0.name();
            }
            A08.A5c(r301, "feature");
            A08.A7T(r313, "thread");
            if (i2 != ((-1) << (-1))) {
                4YU.A1I(A08, "stage", i2);
            } else {
                A08.A7R("stage", (String) null);
            }
            A08.A7R("feature_sessionid", 1BK.A0t());
            if (i == 2) {
                i3 = 1;
            }
            4YU.A1I(A08, "screen_orientation", i3);
            A08.A7R("extra", "tap_in_thread");
            A08.A7R("entry_point", str);
            A08.BZL();
        }
    }
}
