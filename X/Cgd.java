package X;

import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.openidconnect.model.OpenIDCredential;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgd.class */
public final class Cgd implements 1Ro {
    public static final String __redex_internal_original_name = "AuthenticateCredentialCheckMethod";
    public final C00i A01 = AbH.A0T();
    public final C00i A00 = 1BQ.A02(16617);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Bjd bjd = (Bjd) obj;
        PasswordCredentials passwordCredentials = bjd.A00;
        OpenIDCredential openIDCredential = bjd.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("contact_point", passwordCredentials.A02));
        A0s.add(new BasicNameValuePair("password", passwordCredentials.A03));
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(this.A01)));
        if (openIDCredential != null) {
            A0s.add(new BasicNameValuePair("openid_flow", "messenger_android_login"));
            A0s.add(new BasicNameValuePair("openid_provider", "google"));
            A0s.add(new BasicNameValuePair("openid_token", openIDCredential.A01));
        }
        String A04 = ((1Oe) this.A00.get()).A04(C1fe.A0K);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "auth_credential_check");
        return AbN.A0F(c04083zw, "auth_credential_check", A0s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        if (r0.A0O() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r0.A0O() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0063, code lost:
    
        if (r0.A0O() == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object B7m(X.AnonymousClass439 r302, java.lang.Object r303) {
        /*
            r301 = this;
            r0 = r302
            X.24X r0 = X.AbH.A0w(r0)
            r304 = r0
            r0 = r304
            java.lang.String r1 = "one_click_smartlock_enabled"
            X.24X r0 = r0.A0D(r1)
            r305 = r0
            r0 = r304
            java.lang.String r1 = "password_check_result"
            X.24X r0 = r0.A0D(r1)
            r306 = r0
            r0 = r304
            java.lang.String r1 = "openid_check_result"
            X.24X r0 = r0.A0D(r1)
            r307 = r0
            r0 = r304
            java.lang.String r1 = "id"
            X.24X r0 = r0.A0D(r1)
            r308 = r0
            r0 = r304
            java.lang.String r1 = "name"
            X.24X r0 = r0.A0D(r1)
            r309 = r0
            java.lang.String r0 = "firstName"
            r310 = r0
            r0 = r304
            r1 = r310
            X.24X r0 = r0.A0D(r1)
            r304 = r0
            r0 = r305
            if (r0 == 0) goto L4c
            r0 = r305
            boolean r0 = r0.A0O()
            r311 = r0
            r0 = 1
            r312 = r0
            r0 = r311
            if (r0 != 0) goto L52
        L4c:
            r0 = 0
            r312 = r0
            r0 = 0
            r305 = r0
        L52:
            r0 = r306
            if (r0 == 0) goto L66
            r0 = r306
            boolean r0 = r0.A0O()
            r311 = r0
            r0 = 1
            r313 = r0
            r0 = r311
            if (r0 != 0) goto L69
        L66:
            r0 = 0
            r313 = r0
        L69:
            r0 = r307
            if (r0 == 0) goto L7d
            r0 = r307
            boolean r0 = r0.A0O()
            r311 = r0
            r0 = 1
            r314 = r0
            r0 = r311
            if (r0 != 0) goto L80
        L7d:
            r0 = 0
            r314 = r0
        L80:
            r0 = 0
            r306 = r0
            r0 = r308
            if (r0 == 0) goto Lc4
            r0 = r308
            java.lang.String r0 = r0.A0H()
            r308 = r0
        L8f:
            r0 = r309
            if (r0 == 0) goto Lbe
            r0 = r309
            java.lang.String r0 = r0.A0H()
            r307 = r0
        L9b:
            r0 = r304
            if (r0 == 0) goto La5
            r0 = r304
            java.lang.String r0 = r0.A0H()
            r306 = r0
        La5:
            com.facebook.auth.protocol.AuthCredentialCheckResult r0 = new com.facebook.auth.protocol.AuthCredentialCheckResult
            r309 = r0
            r0 = r309
            r1 = r308
            r2 = r307
            r3 = r306
            r4 = r312
            r5 = r313
            r6 = r314
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r309
            return r0
        Lbe:
            r0 = 0
            r307 = r0
            goto L9b
        Lc4:
            r0 = 0
            r308 = r0
            goto L8f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cgd.B7m(X.439, java.lang.Object):java.lang.Object");
    }
}
