package X;

import com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethod$Result;
import com.facebook.account.recovery.common.protocol.AccountRecoverySearchAccountMethodParams;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhm.class */
public final class Fhm implements 1Ro {
    public static final String __redex_internal_original_name = "AccountRecoverySearchAccountMethod";
    public final 1H2 A00 = DKE.A0R();
    public final FFU A02 = (FFU) 1Bi.A03(100141);
    public final C08554nH A01 = (C08554nH) 1Bi.A03(49257);
    public final CLp A04 = (CLp) 1Bi.A03(85272);
    public final C01663sh A03 = (C01663sh) 1Bi.A03(32813);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        AccountRecoverySearchAccountMethodParams accountRecoverySearchAccountMethodParams = (AccountRecoverySearchAccountMethodParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("q", accountRecoverySearchAccountMethodParams.A0H));
        A0s.add(new BasicNameValuePair("friend_name", accountRecoverySearchAccountMethodParams.A08));
        A0s.add(new BasicNameValuePair("qs", accountRecoverySearchAccountMethodParams.A09));
        A0s.add(new BasicNameValuePair("summary", String.valueOf(true)));
        A0s.add(new BasicNameValuePair("device_id", this.A00.A02()));
        A0s.add(new BasicNameValuePair("src", accountRecoverySearchAccountMethodParams.A0F));
        A0s.add(new BasicNameValuePair("machine_id", this.A02.A02()));
        A0s.add(new BasicNameValuePair("sfdid", accountRecoverySearchAccountMethodParams.A0A));
        A0s.add(new BasicNameValuePair("fdid", accountRecoverySearchAccountMethodParams.A07));
        A0s.add(new BasicNameValuePair("sim_serials", DKD.A0w(DKH.A0f(accountRecoverySearchAccountMethodParams.A0I))));
        String str = accountRecoverySearchAccountMethodParams.A0G;
        if (str != null) {
            A0s.add(new BasicNameValuePair(ErrorReportingConstants.USER_ID_KEY, str));
        }
        ArrayList arrayList = accountRecoverySearchAccountMethodParams.A03;
        if (arrayList != null && !arrayList.isEmpty()) {
            A0s.add(new BasicNameValuePair("msgr_sso_uids", DKD.A0w(arrayList)));
        }
        A0s.add(new BasicNameValuePair(AbE.A00(731), String.valueOf(accountRecoverySearchAccountMethodParams.A0M)));
        A0s.add(new BasicNameValuePair("cds_experiment_group", String.valueOf(accountRecoverySearchAccountMethodParams.A06)));
        A0s.add(new BasicNameValuePair("shared_phone_test_group", String.valueOf(accountRecoverySearchAccountMethodParams.A0C)));
        A0s.add(new BasicNameValuePair("allowlist_email_exp_name", accountRecoverySearchAccountMethodParams.A00));
        A0s.add(new BasicNameValuePair("shared_phone_exp_name", accountRecoverySearchAccountMethodParams.A0B));
        A0s.add(new BasicNameValuePair("shared_phone_cp_nonce_code", accountRecoverySearchAccountMethodParams.A0D));
        A0s.add(new BasicNameValuePair("shared_phone_number", accountRecoverySearchAccountMethodParams.A0E));
        A0s.add(new BasicNameValuePair("is_auto_search", String.valueOf(accountRecoverySearchAccountMethodParams.A0J)));
        A0s.add(new BasicNameValuePair("is_feo2_api_level_enabled", String.valueOf(accountRecoverySearchAccountMethodParams.A0K)));
        A0s.add(new BasicNameValuePair("is_sso_like_oauth_search", String.valueOf(accountRecoverySearchAccountMethodParams.A0L)));
        ArrayList arrayList2 = accountRecoverySearchAccountMethodParams.A05;
        if (DKH.A0f(arrayList2) != null && !DKH.A0f(arrayList2).isEmpty()) {
            A0s.add(new BasicNameValuePair("openid_tokens", DKD.A0w(DKH.A0f(arrayList2))));
        }
        ArrayList arrayList3 = accountRecoverySearchAccountMethodParams.A04;
        if (DKH.A0f(arrayList3) != null && !DKH.A0f(arrayList3).isEmpty()) {
            A0s.add(new BasicNameValuePair("openid_emails", DKD.A0w(DKH.A0f(arrayList3))));
        }
        String str2 = accountRecoverySearchAccountMethodParams.A01;
        if (!1JF.A0A(str2)) {
            A0s.add(new BasicNameValuePair("first_name", str2));
        }
        String str3 = accountRecoverySearchAccountMethodParams.A02;
        if (!1JF.A0A(str3)) {
            A0s.add(new BasicNameValuePair("last_name", str3));
        }
        ETV A07 = this.A03.A07(4YV.A0C(FbInjector.A00()), "account_recovery_search");
        if (C08554nH.A00(this.A01)) {
            A0s.add(new BasicNameValuePair("encrypted_msisdn", A07 != null ? A07.A02 : ""));
        }
        return new C04103zy(RequestPriority.INTERACTIVE, 0S2.A0C, "accountRecoverySearch", "GET", "recover_accounts", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(AccountRecoverySearchAccountMethod$Result.class);
    }
}
