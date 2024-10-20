package X;

import com.facebook.auth.credentials.BrowserToNativeSSOCredentials;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.mapbox.mapboxsdk.style.layers.Property;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhe.class */
public final class Fhe implements 1Ro {
    public static final String __redex_internal_original_name = "AuthenticateNativeSSOMethod";
    public final C00i A01 = 1BV.A00(100127);
    public final C00i A02 = AbH.A0T();
    public final C00i A00 = 1BV.A00(83607);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        EnD enD = (EnD) obj;
        BrowserToNativeSSOCredentials browserToNativeSSOCredentials = enD.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("format", "json"));
        A0s.add(new BasicNameValuePair("email", browserToNativeSSOCredentials.A02));
        A0s.add(new BasicNameValuePair("password", browserToNativeSSOCredentials.A01));
        C00i c00i = this.A02;
        if (AbJ.A0z(c00i) != null) {
            A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(c00i)));
        }
        String str = browserToNativeSSOCredentials.A00.mServerValue;
        if (str != null) {
            A0s.add(new BasicNameValuePair("credentials_type", str));
        }
        C00i c00i2 = this.A00;
        ((C0es) c00i2.get()).AXB();
        A0s.add(new BasicNameValuePair("app_id", ((C0es) c00i2.get()).AXB()));
        A0s.add(new BasicNameValuePair(Property.SYMBOL_Z_ORDER_SOURCE, enD.A02));
        if (enD.A03) {
            A0s.add(new BasicNameValuePair("generate_session_cookies", ConstantsKt.CAMERA_ID_BACK));
        }
        String str2 = enD.A01;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("auth_secure_device_id", str2));
        }
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "authenticate");
        A0T.A0C = "graph.facebook.com/";
        return AbN.A0F(A0T, "auth/login", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return ((EuM) this.A01.get()).A00(anonymousClass439.A01(), (String) null, AnonymousClass001.A0X(this), ((EnD) obj).A03);
    }
}
