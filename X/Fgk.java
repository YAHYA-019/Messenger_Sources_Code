package X;

import com.facebook.account.recovery.common.protocol.AccountRecoveryActivationsParams;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.util.JSONUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fgk.class */
public final class Fgk implements 1Ro {
    public static final String __redex_internal_original_name = "AccountRecoveryActivationsMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        AccountRecoveryActivationsParams accountRecoveryActivationsParams = (AccountRecoveryActivationsParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("sfdid", accountRecoveryActivationsParams.A01));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("fdid", accountRecoveryActivationsParams.A00), A0s);
        AbF.A1Q(A0C, "fdrActivations");
        return AbN.A0F(A0C, "fdr/activations", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        return Boolean.valueOf(JSONUtil.A0J(AbH.A0w(anonymousClass439).A0C(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS), false));
    }
}
