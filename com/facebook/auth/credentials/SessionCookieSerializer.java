package com.facebook.auth.credentials;

import X.28Q;
import X.4iJ;
import X.C26c;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: SessionCookieSerializer.class */
public class SessionCookieSerializer extends JsonSerializer {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.JsonSerializer, java.lang.Object] */
    static {
        4iJ.A03((JsonSerializer) new Object(), SessionCookie.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
        SessionCookie sessionCookie = (SessionCookie) obj;
        r302.A0b();
        String str = sessionCookie.mName;
        if (str != null) {
            r302.A0o(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            r302.A0r(str);
        }
        String str2 = sessionCookie.mValue;
        if (str2 != null) {
            r302.A0o("value");
            r302.A0r(str2);
        }
        String str3 = sessionCookie.mExpires;
        if (str3 != null) {
            r302.A0o("expires");
            r302.A0r(str3);
        }
        String str4 = sessionCookie.mDomain;
        if (str4 != null) {
            r302.A0o("domain");
            r302.A0r(str4);
        }
        boolean z = sessionCookie.mSecure;
        r302.A0o("secure");
        r302.A0v(z);
        String str5 = sessionCookie.mPath;
        if (str5 != null) {
            r302.A0o("path");
            r302.A0r(str5);
        }
        boolean z2 = sessionCookie.mHttpOnly;
        r302.A0o("HttpOnly");
        r302.A0v(z2);
        String str6 = sessionCookie.mSameSite;
        if (str6 != null) {
            r302.A0o("SameSite");
            r302.A0r(str6);
        }
        r302.A0Y();
    }
}
