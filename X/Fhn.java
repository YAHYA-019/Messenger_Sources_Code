package X;

import com.facebook.account.recovery.common.protocol.AccountRecoverySendConfirmationCodeMethod$Params;
import com.facebook.account.recovery.common.protocol.AccountRecoverySendConfirmationCodeMethod$Result;
import com.facebook.http.interfaces.RequestPriority;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;

/* loaded from: Fhn.class */
public final class Fhn implements 1Ro {
    public static final String __redex_internal_original_name = "AccountRecoverySendConfirmationCodeMethod";
    public 1BY A00;
    public final C00i A02 = 7zN.A0D(99448);
    public final C00i A04 = 1BQ.A02(67262);
    public final C00i A03 = 1BQ.A02(16617);
    public final 1H2 A01 = DKE.A0R();

    public Fhn(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        AccountRecoverySendConfirmationCodeMethod$Params accountRecoverySendConfirmationCodeMethod$Params = (AccountRecoverySendConfirmationCodeMethod$Params) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        String str = accountRecoverySendConfirmationCodeMethod$Params.A09;
        ImmutableList A0f = DKH.A0f(accountRecoverySendConfirmationCodeMethod$Params.A0B);
        if (!A0f.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = A0f.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            A0s.add(new BasicNameValuePair(JQw.A00(80), jSONArray.toString()));
        }
        A0s.add(new BasicNameValuePair("device_id", this.A01.A02()));
        A0s.add(new BasicNameValuePair("src", accountRecoverySendConfirmationCodeMethod$Params.A0A));
        String str2 = accountRecoverySendConfirmationCodeMethod$Params.A08;
        if (!1JF.A0B(str2)) {
            A0s.add(new BasicNameValuePair("content_version", str2));
        }
        A0s.add(new BasicNameValuePair("use_google_sms_retriever_content", String.valueOf(accountRecoverySendConfirmationCodeMethod$Params.A01)));
        A0s.add(new BasicNameValuePair("client_rate_limiting_rejected_nonce", String.valueOf(accountRecoverySendConfirmationCodeMethod$Params.A03)));
        A0s.add(new BasicNameValuePair("client_has_permission", String.valueOf(((1Rv) this.A04.get()).A08("android.permission.READ_PHONE_STATE"))));
        F9J f9j = (F9J) this.A02.get();
        ArrayList A0s2 = AnonymousClass001.A0s();
        int i = 0;
        do {
            DKE.A1T(((4Yk) f9j.A03.get()).A0F(3EK.A01, i), A0s2);
            i++;
        } while (i < 2);
        if (!A0s2.isEmpty()) {
            A0s.add(new BasicNameValuePair("sim_phones", DKD.A0w(A0s2)));
        }
        String str3 = accountRecoverySendConfirmationCodeMethod$Params.A07;
        if (!1JF.A0B(str3)) {
            A0s.add(new BasicNameValuePair("shared_phone_number", str3));
        }
        if (accountRecoverySendConfirmationCodeMethod$Params.A02.booleanValue()) {
            A0s.add(new BasicNameValuePair("password_reset_cp_nonce_recovery_flow", "shared_phone_no_signal_account_recovery"));
        }
        A0s.add(new BasicNameValuePair("should_use_flash_call", String.valueOf(accountRecoverySendConfirmationCodeMethod$Params.A04)));
        String str4 = accountRecoverySendConfirmationCodeMethod$Params.A05;
        if (!1JF.A0B(str4)) {
            A0s.add(new BasicNameValuePair("auto_conf_client_start_message", str4));
        }
        A0s.add(new BasicNameValuePair("auto_conf_flow_type", accountRecoverySendConfirmationCodeMethod$Params.A06));
        1Ka A01 = ((1Oe) this.A03.get()).A01(C1fe.A0D);
        String str5 = A01 != null ? A01.A01 : null;
        if (!1JF.A0B(str5)) {
            A0s.add(new BasicNameValuePair("family_device_id", str5));
        }
        int i2 = accountRecoverySendConfirmationCodeMethod$Params.A00;
        if (i2 != -1) {
            A0s.add(new BasicNameValuePair("user_submitted_phone_index", String.valueOf(i2)));
        }
        return new C04103zy(RequestPriority.INTERACTIVE, 0S2.A0C, "accountRecoverySendConfirmationCode", "POST", 0Pz.A0W(str, "/recovery_codes"), A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(AccountRecoverySendConfirmationCodeMethod$Result.class);
    }
}
