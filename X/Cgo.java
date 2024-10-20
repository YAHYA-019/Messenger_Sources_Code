package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.common.util.JSONUtil;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.push.fbpushtoken.RegisterPushTokenNoUserParams;
import com.facebook.push.fbpushtoken.RegisterPushTokenResult;
import com.google.common.collect.ImmutableList;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgo.class */
public final class Cgo implements 1Ro {
    public static final String __redex_internal_original_name = "RegisterPushTokenNoUserMethod";
    public final C00i A01 = AbH.A0a();
    public final C0qy A00 = AbI.A0D();

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        RegisterPushTokenNoUserParams registerPushTokenNoUserParams = (RegisterPushTokenNoUserParams) obj;
        ImmutableList of = ImmutableList.of((Object) new BasicNameValuePair("push_url", registerPushTokenNoUserParams.A04), (Object) new BasicNameValuePair("token", registerPushTokenNoUserParams.A03), (Object) new BasicNameValuePair("access_token", registerPushTokenNoUserParams.A00), (Object) new BasicNameValuePair("locale", Locale.US.toString()), (Object) new BasicNameValuePair("device_id", registerPushTokenNoUserParams.A01), (Object) new BasicNameValuePair("family_device_id", registerPushTokenNoUserParams.A02));
        String A0W = 0Pz.A0W("256002347743983", "/nonuserpushtokens");
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "registerPushNoUser");
        c04083zw.A0F = A0W;
        c04083zw.A0J = of;
        c04083zw.A03(RequestPriority.NON_INTERACTIVE);
        c04083zw.A06 = 0S2.A01;
        return c04083zw.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        24X A0w = AbH.A0w(anonymousClass439);
        return new RegisterPushTokenResult(4YU.A01(A0w, "disabled_source", 0), 1BL.A08(this.A01), JSONUtil.A0J(A0w.A0D(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_SUCCESS), false), false);
    }
}
