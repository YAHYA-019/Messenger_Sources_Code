package X;

import com.facebook.auth.credentials.WorkUserSwitchCredentials;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fho.class */
public final class Fho implements 1Ro {
    public static final String __redex_internal_original_name = "WorkAccountSwitchMethod";
    public 1BY A00;
    public final EuM A02 = (EuM) 1Bn.A0B(100127);
    public final Etp A03 = (Etp) 1Bn.A0B(99584);
    public final C00i A04 = AbH.A0T();
    public final C08344mm A01 = (C08344mm) 1Bn.A0B(49243);

    public Fho(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Ekh ekh = (Ekh) obj;
        WorkUserSwitchCredentials workUserSwitchCredentials = ekh.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("meta_inf_fbmeta", C08344mm.A02(this.A01, "META-INF/FBMETA", false)));
        A0s.add(new BasicNameValuePair("adid", this.A03.A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(this.A04)));
        A0s.add(new BasicNameValuePair("email", "X"));
        A0s.add(new BasicNameValuePair("password", "X"));
        A0s.add(new BasicNameValuePair("family_device_id", "X"));
        A0s.add(new BasicNameValuePair("credentials_type", "personal_to_work_switch"));
        A0s.add(new BasicNameValuePair("community_id", workUserSwitchCredentials.A01));
        A0s.add(new BasicNameValuePair("access_token", workUserSwitchCredentials.A00));
        A0s.add(new BasicNameValuePair("generate_session_cookies", ConstantsKt.CAMERA_ID_BACK));
        String str = ekh.A01;
        return AbN.A0F(DKF.A0L(str != null ? new BasicNameValuePair("machine_id", str) : new BasicNameValuePair("generate_machine_id", ConstantsKt.CAMERA_ID_BACK), A0s), "method/auth.login", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        Ekh ekh = (Ekh) obj;
        anonymousClass439.A03();
        String str = ekh.A00.A02;
        return this.A02.A00(anonymousClass439.A01(), str, AnonymousClass001.A0X(this), ekh.A02);
    }
}
