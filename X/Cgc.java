package X;

import com.facebook.auth.credentials.PasswordCredentials;
import com.facebook.common.util.JSONUtil;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cgc.class */
public final class Cgc implements 1Ro {
    public static final String __redex_internal_original_name = "AuthIdentifyUserMethod";
    public final C00i A01 = AbH.A0T();
    public final C00i A00 = 1BQ.A02(16617);

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        Btd btd = (Btd) obj;
        PasswordCredentials passwordCredentials = btd.A00;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("case", btd.A01));
        A0s.add(new BasicNameValuePair("contact_point", passwordCredentials.A02));
        A0s.add(new BasicNameValuePair("password", passwordCredentials.A03));
        A0s.add(new BasicNameValuePair("device_id", AbJ.A0z(this.A01)));
        A0s.add(new BasicNameValuePair("openid_tokens", JSONUtil.A06(btd.A03).toString()));
        A0s.add(new BasicNameValuePair("emails", JSONUtil.A06(btd.A02).toString()));
        A0s.add(new BasicNameValuePair("uids", JSONUtil.A06(btd.A04).toString()));
        A0s.add(new BasicNameValuePair("openid_flow", "messenger_android_login"));
        A0s.add(new BasicNameValuePair("openid_provider", "google"));
        String A04 = ((1Oe) this.A00.get()).A04(C1fe.A0Q);
        if (A04 != null) {
            A0s.add(new BasicNameValuePair("family_device_id", A04));
        }
        C04083zw c04083zw = new C04083zw();
        AbF.A1Q(c04083zw, "auth_identify_user");
        return AbN.A0F(c04083zw, "auth_identify_user", A0s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0049, code lost:
    
        if (r0.A0O() == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0060, code lost:
    
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
            java.lang.String r1 = "sl_credentials_check_result"
            X.24X r0 = r0.A0D(r1)
            r305 = r0
            r0 = r304
            java.lang.String r1 = "oauth_check_result"
            X.24X r0 = r0.A0D(r1)
            r306 = r0
            r0 = r304
            java.lang.String r1 = "case"
            X.24X r0 = r0.A0D(r1)
            r307 = r0
            r0 = r304
            java.lang.String r1 = "name"
            X.24X r0 = r0.A0D(r1)
            r308 = r0
            r0 = r304
            java.lang.String r1 = "email"
            X.24X r0 = r0.A0D(r1)
            r309 = r0
            java.lang.String r0 = "uid"
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
            if (r0 != 0) goto L4f
        L4c:
            r0 = 0
            r312 = r0
        L4f:
            r0 = r306
            if (r0 == 0) goto L63
            r0 = r306
            boolean r0 = r0.A0O()
            r311 = r0
            r0 = 1
            r313 = r0
            r0 = r311
            if (r0 != 0) goto L66
        L63:
            r0 = 0
            r313 = r0
        L66:
            r0 = 0
            r314 = r0
            r0 = r307
            if (r0 == 0) goto Lbc
            r0 = r307
            java.lang.String r0 = r0.A0H()
            r307 = r0
        L75:
            r0 = r308
            if (r0 == 0) goto Lb6
            r0 = r308
            java.lang.String r0 = r0.A0H()
            r306 = r0
        L81:
            r0 = r309
            if (r0 == 0) goto Lb0
            r0 = r309
            java.lang.String r0 = r0.A0H()
            r305 = r0
        L8d:
            r0 = r304
            if (r0 == 0) goto L97
            r0 = r304
            java.lang.String r0 = r0.A0H()
            r314 = r0
        L97:
            com.facebook.auth.protocol.AuthIdentifyUserResult r0 = new com.facebook.auth.protocol.AuthIdentifyUserResult
            r308 = r0
            r0 = r308
            r1 = r307
            r2 = r306
            r3 = r305
            r4 = r314
            r5 = r312
            r6 = r313
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = r308
            return r0
        Lb0:
            r0 = 0
            r305 = r0
            goto L8d
        Lb6:
            r0 = 0
            r306 = r0
            goto L81
        Lbc:
            r0 = 0
            r307 = r0
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cgc.B7m(X.439, java.lang.Object):java.lang.Object");
    }
}
