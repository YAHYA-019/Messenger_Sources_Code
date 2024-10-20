package X;

import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhp.class */
public final class Fhp implements 1Ro {
    public static final String __redex_internal_original_name = "AlohaAuthenticateSsoMethod";
    public 1BY A00;
    public final C0es A03 = (C0es) 1Bn.A0B(83607);
    public final EuM A02 = (EuM) 1Bn.A0B(100127);
    public final Etp A05 = (Etp) 1Bn.A0B(99584);
    public final 1H2 A04 = DKE.A0R();
    public final C08344mm A01 = (C08344mm) 1Bn.A0B(49243);

    public Fhp(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        EqG eqG = (EqG) obj;
        String str2 = eqG.A00;
        String str3 = str2;
        if (str2 == null) {
            str3 = this.A03.AXB();
        }
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("meta_inf_fbmeta", C08344mm.A02(this.A01, "META-INF/FBMETA", false)));
        A0s.add(new BasicNameValuePair("adid", this.A05.A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("device_id", this.A04.A02()));
        A0s.add(new BasicNameValuePair("access_token", eqG.A04));
        A0s.add(new BasicNameValuePair("new_app_id", str3));
        A0s.add(new BasicNameValuePair("proxy_user_id", eqG.A06));
        A0s.add(new BasicNameValuePair("proxy_signed_proxy_user_id", eqG.A05));
        boolean z = eqG.A07;
        String str4 = ConstantsKt.CAMERA_ID_BACK;
        if (z) {
            A0s.add(new BasicNameValuePair("generate_session_cookies", str4));
        }
        String str5 = eqG.A03;
        if (str5 != null) {
            str4 = str5;
            str = "machine_id";
        } else {
            str = "generate_machine_id";
        }
        A0s.add(new BasicNameValuePair(str, str4));
        String str6 = eqG.A02;
        if (str6 != null) {
            A0s.add(new BasicNameValuePair("software_device_access_token", str6));
        }
        C04083zw A0L = DKF.A0L(new BasicNameValuePair("currently_logged_in_userid", 1Fw.A05(this.A00).A02), A0s);
        A0L.A0F = "auth/create_session_for_app";
        A0L.A0A = str2;
        A0L.A0B = eqG.A01;
        A0L.A0L = true;
        A0L.A0J = A0s;
        A0L.A06 = 0S2.A01;
        A0L.A02();
        return A0L.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return this.A02.A00(anonymousClass439.A01(), (String) null, AnonymousClass001.A0X(this), ((EqG) obj).A07);
    }
}
