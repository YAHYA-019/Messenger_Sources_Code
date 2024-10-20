package X;

import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.auth.credentials.TwoFactorCredentials;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhr.class */
public final class Fhr implements 1Ro {
    public static final String __redex_internal_original_name = "AlohaAuthenticateMethod";
    public 1BY A00;
    public final EuM A03 = (EuM) 1Bn.A0B(100127);
    public final Etp A06 = (Etp) 1Bn.A0B(99584);
    public final 1H2 A05 = DKE.A0R();
    public final C08344mm A02 = (C08344mm) 1Bn.A0B(49243);
    public final 1Oe A04 = DKD.A0J();
    public final F9J A01 = (F9J) 1Bn.A0B(99448);

    public Fhr(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        EqF eqF = (EqF) obj;
        PasswordCredentials passwordCredentials = eqF.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("meta_inf_fbmeta", C08344mm.A02(this.A02, "META-INF/FBMETA", false)));
        A0s.add(new BasicNameValuePair("adid", this.A06.A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("device_id", this.A05.A02()));
        A0s.add(new BasicNameValuePair("email", passwordCredentials.A02));
        A0s.add(new BasicNameValuePair("password", passwordCredentials.A03));
        A0s.add(new BasicNameValuePair("cpl", String.valueOf(true)));
        A0s.add(new BasicNameValuePair("proxy_user_id", eqF.A05));
        A0s.add(new BasicNameValuePair("proxy_signed_proxy_user_id", eqF.A04));
        String str2 = eqF.A03;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("software_device_access_token", str2));
        }
        String A04 = this.A04.A04(C1fe.A0G);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        F9J f9j = this.A01;
        ArrayList A0s2 = AnonymousClass001.A0s();
        int i = 0;
        do {
            DKE.A1T(((4Yk) f9j.A03.get()).A0C(i), A0s2);
            i++;
        } while (i < 2);
        if (!A0s2.isEmpty()) {
            A0s.add(new BasicNameValuePair("sim_serials", DKD.A0w(A0s2)));
        }
        EPM epm = passwordCredentials.A01;
        String str3 = epm.mServerValue;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair("credentials_type", str3));
        }
        boolean z = eqF.A07;
        String str4 = ConstantsKt.CAMERA_ID_BACK;
        if (z) {
            A0s.add(new BasicNameValuePair("generate_session_cookies", str4));
        }
        String str5 = eqF.A06;
        if (str5 != null) {
            str4 = str5;
            str = "machine_id";
        } else {
            str = "generate_machine_id";
        }
        A0s.add(new BasicNameValuePair(str, str4));
        if ((epm == EPM.A0Q || epm == EPM.A03 || epm == EPM.A0S || epm == EPM.A0W) && (passwordCredentials instanceof TwoFactorCredentials)) {
            TwoFactorCredentials twoFactorCredentials = (TwoFactorCredentials) passwordCredentials;
            A0s.add(new BasicNameValuePair("twofactor_code", twoFactorCredentials.A01));
            A0s.add(new BasicNameValuePair("userid", twoFactorCredentials.A02));
            A0s.add(new BasicNameValuePair("first_factor", twoFactorCredentials.A00));
        }
        C04083zw A0L = DKF.A0L(new BasicNameValuePair("currently_logged_in_userid", 1Fw.A05(this.A00).A02), A0s);
        A0L.A0F = "method/auth.login";
        A0L.A0A = eqF.A01;
        A0L.A0B = eqF.A02;
        A0L.A0J = A0s;
        A0L.A06 = 0S2.A01;
        A0L.A02();
        return A0L.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        EqF eqF = (EqF) obj;
        anonymousClass439.A03();
        String str = eqF.A00.A02;
        return this.A03.A00(anonymousClass439.A01(), str, AnonymousClass001.A0X(this), eqF.A07);
    }
}
