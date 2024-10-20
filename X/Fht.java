package X;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.facebook.auth.credentials.OpenIDLoginCredentials;
import com.facebook.openidconnect.model.OpenIDCredential;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fht.class */
public final class Fht implements 1Ro {
    public static final String __redex_internal_original_name = "AuthenticateOpenIDMethod";
    public 1BY A00;
    public final 5DO A06 = (5DO) 1Bn.A0E((Context) null, (1BY) null, 85192);
    public final EuM A01 = (EuM) 1Bn.A0E((Context) null, (1BY) null, 100127);
    public final Etp A03 = (Etp) 1Bn.A0E((Context) null, (1BY) null, 99584);
    public final C00i A05 = AbH.A0T();
    public final 1Oe A02 = DKD.A0J();
    public final C00i A04 = 1BV.A01((1BY) null, 98514);

    public Fht(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        String str;
        ROZ roz = (ROZ) obj;
        OpenIDLoginCredentials openIDLoginCredentials = roz.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("adid", this.A03.A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        C00i c00i = this.A05;
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(c00i)));
        A0s.add(new BasicNameValuePair("email", openIDLoginCredentials.A02));
        A0s.add(new BasicNameValuePair("password", "OPENID"));
        String A04 = this.A02.A04(C1fe.A0O);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        Integer num = roz.A02;
        if (num == null) {
            num = 0S2.A0C;
        }
        A0s.add(new BasicNameValuePair("openid_flow", CJm.A01(num)));
        OpenIDCredential openIDCredential = openIDLoginCredentials.A01;
        A0s.add(new BasicNameValuePair(AbE.A00(650), "google"));
        A0s.add(new BasicNameValuePair(AbE.A00(651), openIDCredential.A01));
        A0s.add(new BasicNameValuePair("openid_tokens", DKD.A0w(roz.A06)));
        String str2 = openIDLoginCredentials.A00.mServerValue;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("credentials_type", str2));
        }
        boolean z = roz.A07;
        String str3 = ConstantsKt.CAMERA_ID_BACK;
        if (z) {
            A0s.add(new BasicNameValuePair("generate_session_cookies", str3));
        }
        A0s.add(new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, roz.A04));
        String str4 = roz.A05;
        if (str4 != null) {
            str3 = str4;
            str = "machine_id";
        } else {
            str = "generate_machine_id";
        }
        A0s.add(new BasicNameValuePair(str, str3));
        String str5 = roz.A03;
        if (str5 != null) {
            A0s.add(new BasicNameValuePair("auth_secure_device_id", str5));
        }
        Location location = roz.A00;
        if (location != null) {
            A0s.add(new BasicNameValuePair("login_latitude", String.valueOf(location.getLatitude())));
            A0s.add(new BasicNameValuePair("login_longitude", String.valueOf(location.getLongitude())));
            A0s.add(new BasicNameValuePair("login_location_accuracy_m", String.valueOf(location.getAccuracy())));
            A0s.add(new BasicNameValuePair("login_location_timestamp_ms", String.valueOf(location.getTime())));
        }
        ((EtV) this.A04.get()).A00(AbJ.A0z(c00i), A0s);
        5DO r0 = this.A06;
        if (!TextUtils.isEmpty(r0.A00())) {
            A0s.add(new BasicNameValuePair("advertiser_id", r0.A00()));
        }
        return AbN.A0F(DKF.A0L(new BasicNameValuePair("currently_logged_in_userid", 1Fw.A05(this.A00).A02), A0s), "auth/login", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        ROZ roz = (ROZ) obj;
        anonymousClass439.A03();
        String str = roz.A01.A02;
        return this.A01.A00(anonymousClass439.A01(), str, AnonymousClass001.A0X(this), roz.A07);
    }
}
