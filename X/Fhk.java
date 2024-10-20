package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.auth.credentials.FacebookCredentials;
import com.facebook.auth.credentials.RoomGuestCredentials;
import com.facebook.auth.protocol.AuthenticationResultImpl;
import com.facebook.common.util.JSONUtil;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Fhk.class */
public final class Fhk implements 1Ro {
    public static final String __redex_internal_original_name = "RoomGuestUserAuthenticateMethod";
    public final C00i A02 = 1BV.A00(98514);
    public final C00i A01 = 1BV.A00(99584);
    public final C00i A03 = AbH.A0T();
    public final C00i A00 = 1BQ.A02(16617);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        RKc rKc = (RKc) obj;
        RoomGuestCredentials roomGuestCredentials = rKc.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("adid", ((Etp) this.A01.get()).A00()));
        A0s.add(new BasicNameValuePair("format", "json"));
        C00i c00i = this.A03;
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(c00i)));
        A0s.add(new BasicNameValuePair("email", roomGuestCredentials.A02));
        A0s.add(new BasicNameValuePair("password", roomGuestCredentials.A03));
        A0s.add(new BasicNameValuePair("generate_analytics_claim", ConstantsKt.CAMERA_ID_BACK));
        A0s.add(new BasicNameValuePair("cpl", String.valueOf(true)));
        String A04 = ((1Oe) this.A00.get()).A04(C1fe.A2g);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        A0s.add(new BasicNameValuePair("guest_name", roomGuestCredentials.A00));
        A0s.add(new BasicNameValuePair("room_link_uri", roomGuestCredentials.A01));
        A0s.add(new BasicNameValuePair("credentials_type", roomGuestCredentials.A01.mServerValue));
        String str = rKc.A02;
        A0s.add(str != null ? new BasicNameValuePair("machine_id", str) : new BasicNameValuePair("generate_machine_id", ConstantsKt.CAMERA_ID_BACK));
        String str2 = rKc.A01;
        if (str2 != null) {
            A0s.add(new BasicNameValuePair("auth_secure_device_id", str2));
        }
        ((EtV) this.A02.get()).A00(AbJ.A0z(c00i), A0s);
        C04083zw A0T = DKC.A0T();
        AbF.A1Q(A0T, "authenticate");
        return AbN.A0F(A0T, "auth/login", A0s);
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        String str = ((RKc) obj).A00.A02;
        24X A01 = anonymousClass439.A01();
        String A0H = JSONUtil.A0H(A01.A0D(ErrorReportingConstants.USER_ID_KEY), null);
        String A0P = C3o5.A0P(A01, "access_token", null);
        String A0H2 = JSONUtil.A0H(A01.A0D("user_storage_key"), "");
        String A0P2 = C3o5.A0P(A01, "user_storage_key_prev", "");
        String A0P3 = C3o5.A0P(A01, "machine_id", null);
        String A0P4 = C3o5.A0P(A01, "secret", null);
        String A0P5 = C3o5.A0P(A01, "session_key", null);
        return new AuthenticationResultImpl(new FacebookCredentials(A0H, A0P, null, null, null, A0P4, A0P5, str, C3o5.A0P(A01, "analytics_claim", null), true), JSONUtil.A04(A01.A0D("confirmed")), A0H, A0P3, A0H2, A0P2);
    }
}
