package X;

import android.text.TextUtils;
import com.facebook.auth.credentials.NonceCredentials;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhs.class */
public final class Fhs implements 1Ro {
    public static final String __redex_internal_original_name = "AuthenticateNonceMethod";
    public 1BY A00;
    public final 5DO A06 = (5DO) 1Bn.A0B(85192);
    public final EuM A02 = (EuM) 1Bn.A0B(100127);
    public final C08344mm A01 = (C08344mm) 1Bn.A0B(49243);
    public final Etp A04 = (Etp) 1Bn.A0B(99584);
    public final C00i A05 = AbH.A0T();
    public final 1Oe A03 = DKD.A0J();

    public Fhs(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        RMH rmh = (RMH) obj;
        NonceCredentials nonceCredentials = rmh.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("meta_inf_fbmeta", C08344mm.A02(this.A01, "META-INF/FBMETA", false)));
        A0s.add(new BasicNameValuePair("adid", this.A04.A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(this.A05)));
        A0s.add(new BasicNameValuePair("email", nonceCredentials.A04));
        A0s.add(new BasicNameValuePair("password", nonceCredentials.A06));
        String A04 = this.A03.A04(C1fe.A0N);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        A0s.add(new BasicNameValuePair("pin", nonceCredentials.A07));
        String str2 = nonceCredentials.A00.mServerValue;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("credentials_type", str2));
        }
        boolean z = rmh.A03;
        String str3 = ConstantsKt.CAMERA_ID_BACK;
        if (z) {
            A0s.add(new BasicNameValuePair("generate_session_cookies", str3));
        }
        String str4 = rmh.A02;
        if (str4 != null) {
            str3 = str4;
            str = "machine_id";
        } else {
            str = "generate_machine_id";
        }
        A0s.add(new BasicNameValuePair(str, str3));
        String str5 = rmh.A01;
        if (str5 != null) {
            A0s.add(new BasicNameValuePair("auth_secure_device_id", str5));
        }
        String str6 = nonceCredentials.A02;
        if (str6 != null) {
            A0s.add(new BasicNameValuePair("device_guid", str6));
        }
        String str7 = nonceCredentials.A09;
        if (str7 != null) {
            A0s.add(new BasicNameValuePair("signed_nonce", str7));
        }
        String str8 = nonceCredentials.A05;
        if (str8 != null) {
            A0s.add(new BasicNameValuePair("key_certs", str8));
        }
        String str9 = nonceCredentials.A08;
        if (str9 != null) {
            A0s.add(new BasicNameValuePair("proxy_name", str9));
        }
        String str10 = nonceCredentials.A03;
        if (str10 != null) {
            A0s.add(new BasicNameValuePair("signed_device_data", str10));
        }
        5DO r0 = this.A06;
        if (!TextUtils.isEmpty(r0.A00())) {
            A0s.add(new BasicNameValuePair("advertiser_id", r0.A00()));
        }
        C04083zw A0L = DKF.A0L(new BasicNameValuePair("currently_logged_in_userid", 1Fw.A05(this.A00).A02), A0s);
        A0L.A0C = "graph.facebook.com/";
        return AbN.A0F(A0L, "auth/login", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        RMH rmh = (RMH) obj;
        anonymousClass439.A03();
        String str = rmh.A00.A04;
        return this.A02.A00(anonymousClass439.A01(), str, AnonymousClass001.A0X(this), rmh.A03);
    }
}
