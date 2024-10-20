package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.credentials.DeviceBasedLoginCredentials;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhu.class */
public final class Fhu implements 1Ro {
    public static final String __redex_internal_original_name = "AuthenticateDBLMethod";
    public 1BY A00;
    public final C08344mm A01;
    public final EuM A02;
    public final 1Oe A03;
    public final 1H2 A04;
    public final Etp A05;
    public final 5DO A08;
    public final C00i A07 = 1BV.A01((1BY) null, 98514);
    public final C00i A06 = 1BV.A01((1BY) null, 131260);

    public Fhu(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
        EuM euM = (EuM) 1Bn.A0E((Context) null, (1BY) null, 100127);
        Etp etp = (Etp) 1Bn.A0E((Context) null, (1BY) null, 99584);
        1H2 A0R = DKE.A0R();
        C08344mm c08344mm = (C08344mm) 1Bn.A0E((Context) null, (1BY) null, 49243);
        1Oe A0J = DKD.A0J();
        5DO r0 = (5DO) 1Bn.A0E((Context) null, (1BY) null, 85192);
        this.A02 = euM;
        this.A05 = etp;
        this.A04 = A0R;
        this.A01 = c08344mm;
        this.A03 = A0J;
        this.A08 = r0;
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        EoX eoX = (EoX) obj;
        DeviceBasedLoginCredentials deviceBasedLoginCredentials = eoX.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("meta_inf_fbmeta", C08344mm.A02(this.A01, "META-INF/FBMETA", false)));
        A0s.add(new BasicNameValuePair("adid", this.A05.A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        1H2 r0 = this.A04;
        A0s.add(new BasicNameValuePair("device_id", r0.A02()));
        A0s.add(new BasicNameValuePair("email", deviceBasedLoginCredentials.A01));
        A0s.add(new BasicNameValuePair("password", deviceBasedLoginCredentials.A02));
        A0s.add(new BasicNameValuePair("generate_analytics_claim", ConstantsKt.CAMERA_ID_BACK));
        String A04 = this.A03.A04(C1fe.A0L);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        A0s.add(new BasicNameValuePair("pin", deviceBasedLoginCredentials.A03));
        String str = deviceBasedLoginCredentials.A00.mServerValue;
        if (str != null) {
            A0s.add(new BasicNameValuePair("credentials_type", str));
        }
        String str2 = eoX.A01;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("auth_secure_device_id", str2));
        }
        if (eoX.A04) {
            A0s.add(new BasicNameValuePair("generate_session_cookies", ConstantsKt.CAMERA_ID_BACK));
        }
        String str3 = eoX.A02;
        if (str3 != null) {
            A0s.add(new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, str3));
        }
        String str4 = eoX.A03;
        A0s.add(str4 != null ? new BasicNameValuePair("machine_id", str4) : new BasicNameValuePair("generate_machine_id", ConstantsKt.CAMERA_ID_BACK));
        ((EtV) this.A07.get()).A00(r0.A02(), A0s);
        5DO r02 = this.A08;
        if (!TextUtils.isEmpty(r02.A00())) {
            A0s.add(new BasicNameValuePair("advertiser_id", r02.A00()));
        }
        return AbK.A0M(DKF.A0L(new BasicNameValuePair("currently_logged_in_userid", 1Fw.A05(this.A00).A02), A0s), ((1CQ) this.A06.get()).A09(ActionId.NEW_START_FOUND, false) ? "auth/login" : "method/auth.login", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        EoX eoX = (EoX) obj;
        anonymousClass439.A03();
        String str = eoX.A00.A01;
        return this.A02.A00(anonymousClass439.A01(), str, AnonymousClass001.A0X(this), eoX.A04);
    }
}
